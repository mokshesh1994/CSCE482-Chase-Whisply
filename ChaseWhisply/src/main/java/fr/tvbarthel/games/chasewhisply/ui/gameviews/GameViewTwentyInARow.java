/*package fr.tvbarthel.games.chasewhisply.ui.gameviews;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;

import fr.tvbarthel.games.chasewhisply.mechanics.engine.GameEngineTime;
import fr.tvbarthel.games.chasewhisply.mechanics.engine.GameEngineTwentyInARow;

public class GameViewTwentyInARow extends GameViewTime {

    public GameViewTwentyInARow(Context c, GameEngineTime gameEngine) {
        super(c, gameEngine);
    }

    @Override
    public void onDrawing(Canvas c) {
        super.onDrawing(c);
        drawCurrentStack(c);
    }

    @Override
    protected void drawScore(Canvas canvas) {
        //don't draw score  
    }

    protected void drawCurrentStack(Canvas canvas) {
        final int currentStack = ((GameEngineTwentyInARow) mGameEngine).getCurrentStack();
        final String currentStackStr = String.valueOf(currentStack);
        final int stackLength = currentStackStr.length();
        final int radius = Math.max(mScreenWidth / (12 - stackLength), mScreenHeight / (12 - stackLength));

        //draw transparent overlay
        useTransparentBlackPainter();
        canvas.drawOval(new RectF(-radius, mScreenHeight - radius, radius, mScreenHeight + radius), mPaint);

        //draw Score
        useWhitePainter();
        mPaint.getTextBounds(currentStackStr, 0, currentStackStr.length(), mBounds);
        canvas.drawText(currentStackStr
                , mBounds.width() / 2 + radius / 4
                , mScreenHeight - radius / 4
                , mPaint);

    }

}
*/

package fr.tvbarthel.games.chasewhisply.ui.gameviews;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import android.widget.TextView;

import fr.tvbarthel.games.chasewhisply.R;
import fr.tvbarthel.games.chasewhisply.mechanics.engine.GameEngineTime;
import fr.tvbarthel.games.chasewhisply.mechanics.engine.GameEngineTwentyInARow;

public class GameViewTwentyInARow extends GameViewTime {

    protected TextView mRedCountDownTextView;
    protected RelativeLayout.LayoutParams mRedCountDownLayoutParam;

    public GameViewTwentyInARow(Context c, GameEngineTime gameEngine) {
        super(c, gameEngine);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        if (mRedCountDownLayoutParam == null) {
            mRedCountDownTextView = new TextView(getContext());
            mRedCountDownTextView.setGravity(Gravity.CENTER_HORIZONTAL);
            mRedCountDownTextView.setTypeface(null, Typeface.BOLD);
            mRedCountDownTextView.setTextSize((int) (mFontSize * 1.25));
            mRedCountDownTextView.setTextColor(getResources().getColor(R.color.holo_red));
        }

        mAnimationLayer.addView(mRedCountDownTextView);
    }

    @Override
    protected void onDetachedFromWindow() {
        mAnimationLayer.removeView(mRedCountDownTextView);
        super.onDetachedFromWindow();
    }


    /**
     * draw time, in red if time < 10 sec else in green
     *
     * @param canvas canvas from View.onDraw method
     */
    protected void drawTimer(Canvas canvas) {
        final long millis = mGameEngine.getCurrentTime();
        final int seconds = (int) (millis / 1000) - 1;
        final String remainingTime = String.format(mTimeString, seconds);
        resetPainter();
        if (seconds > 5) {
            if (!mRedCountDownTextView.getText().equals("")) mRedCountDownTextView.setText("");
            super.drawTimer(canvas);
        } else if (seconds >= 0) {
            final Animation currentAnimation = mRedCountDownTextView.getAnimation();
            final String mayBeANewValue = String.valueOf(seconds);
            final String currentValue = String.valueOf(mRedCountDownTextView.getText());
            if (currentValue != null && !currentValue.equals(mayBeANewValue) && (currentAnimation == null || currentAnimation.hasEnded())) {
                if (mRedCountDownLayoutParam == null) {
                    mRedCountDownLayoutParam = new RelativeLayout.LayoutParams(
                            RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
                    mRedCountDownLayoutParam.addRule(RelativeLayout.CENTER_HORIZONTAL);
                    mRedCountDownLayoutParam.setMargins(0,
                            mScreenHeight / 2 - mRedCountDownTextView.getHeight() - mCrossHairs.getHeight() / 2, 0, 0);
                    mRedCountDownTextView.setLayoutParams(mRedCountDownLayoutParam);
                }
                mAnimationLayer.changeTextView(mRedCountDownTextView, mayBeANewValue);
            }
        }
    }
}
