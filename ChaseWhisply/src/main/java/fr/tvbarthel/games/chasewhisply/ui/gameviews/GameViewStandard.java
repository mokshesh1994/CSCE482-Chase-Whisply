//
package fr.tvbarthel.games.chasewhisply.ui.gameviews;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;

import fr.tvbarthel.games.chasewhisply.R;
import fr.tvbarthel.games.chasewhisply.mechanics.engine.GameEngineStandard;
import fr.tvbarthel.games.chasewhisply.model.DisplayableItem;
import fr.tvbarthel.games.chasewhisply.model.DisplayableItemFactory;
import fr.tvbarthel.games.chasewhisply.model.TargetableItem;
import fr.tvbarthel.games.chasewhisply.ui.RenderInformation;


public class GameViewStandard extends GameView {

    private GameEngineStandard mGameEngine;

    protected final Bitmap mCrossHairs;
    protected final Bitmap mGhostBitmap;
    protected final Bitmap mGhostTargetedBitmap;
    protected final Bitmap[] mBlondGhostBitmap;
    protected final Bitmap[] mBlondTargetedBitmap;
    protected final Bitmap mAmmoBitmap;
    protected final Bitmap mTimerBitmap;
    protected final Bitmap mScoreBitmap;
    protected final Bitmap mBulletHoleBitmap;
    protected final Bitmap mBabyGhostBitmap;
    protected final Bitmap mTargetedBabyGhostBitmap;
    protected final Bitmap[] mGhostWithHelmetBitmaps;
    protected final Bitmap[] mGhostWithHelmetTargetedBitmaps;
    protected final Bitmap mKingGhost;
    protected final Bitmap mTargetedKingGhost;
    protected final Bitmap mHiddenGhost;
    protected final String mComboString;
    protected final String mScoreString;
    protected final String mTimeString;

    protected final Bitmap mBatBitmap;
    protected final Bitmap mBedBitmap;
    protected final Bitmap mBinBitmap;
    protected final Bitmap mBoyBitmap;
    protected final Bitmap mBowBitmap;
    protected final Bitmap mBabyBitmap;
    protected final Bitmap mAngelBitmap;
    protected final Bitmap mBigBitmap;
    protected final Bitmap mBayBitmap;
    protected final Bitmap mCaseBitmap;
    protected final Bitmap mCheeseBitmap;
    protected final Bitmap mCokeBitmap;
    protected final Bitmap mHeBitmap;
    protected final Bitmap mHighBitmap;
    protected final Bitmap mJarBitmap;
    protected final Bitmap mMeBitmap;
    protected final Bitmap mMapBitmap;
    protected final Bitmap mMediumButtonBitmap;
    protected final Bitmap mMediumBaddyBitmap;
    protected final Bitmap mMediumCheerBitmap;
    protected final Bitmap mMediumDaddyBitmap;
    protected final Bitmap mMediumKettleBitmap;
    protected final Bitmap mMediumLadderBitmap;
    protected final Bitmap mMediumMouseBitmap;
    protected final Bitmap mMediumPetalBitmap;
    protected final Bitmap mMediumPeopleBitmap;
    protected final Bitmap mMediumPepperBitmap;

    public GameViewStandard(Context c, GameEngineStandard gameEngine) {
        super(c, gameEngine);
        mGameEngine = gameEngine;

        final Resources res = getResources();

        //initialize bitmap drawn after
        //--------------------

        mBatBitmap = BitmapFactory.decodeResource(res, R.drawable.bat);
        mBedBitmap = BitmapFactory.decodeResource(res, R.drawable.bed);
        mBinBitmap = BitmapFactory.decodeResource(res, R.drawable.bin);
        mBoyBitmap = BitmapFactory.decodeResource(res, R.drawable.boy);
        mBowBitmap = BitmapFactory.decodeResource(res, R.drawable.bow);
        mBabyBitmap = BitmapFactory.decodeResource(res, R.drawable.baby);
        mAngelBitmap = BitmapFactory.decodeResource(res, R.drawable.angel);
        mBigBitmap = BitmapFactory.decodeResource(res, R.drawable.big);
        mBayBitmap = BitmapFactory.decodeResource(res, R.drawable.bay);
        mCaseBitmap = BitmapFactory.decodeResource(res, R.drawable.suitcase);
        mCheeseBitmap = BitmapFactory.decodeResource(res, R.drawable.cheese);
        mCokeBitmap = BitmapFactory.decodeResource(res, R.drawable.coke);
        mHeBitmap = BitmapFactory.decodeResource(res, R.drawable.he);
        mHighBitmap = BitmapFactory.decodeResource(res, R.drawable.high);
        mJarBitmap = BitmapFactory.decodeResource(res, R.drawable.jar);
        mMeBitmap = BitmapFactory.decodeResource(res, R.drawable.me);
        mMapBitmap = BitmapFactory.decodeResource(res, R.drawable.map);

        //Initialize Medium Images

        mMediumButtonBitmap = BitmapFactory.decodeResource(res, R.drawable.button);
        mMediumBaddyBitmap = BitmapFactory.decodeResource(res, R.drawable.baddy);
        mMediumCheerBitmap = BitmapFactory.decodeResource(res, R.drawable.cheer);
        mMediumDaddyBitmap = BitmapFactory.decodeResource(res, R.drawable.daddy);
        mMediumKettleBitmap = BitmapFactory.decodeResource(res, R.drawable.kettle);
        mMediumLadderBitmap = BitmapFactory.decodeResource(res, R.drawable.ladder);
        mMediumMouseBitmap = BitmapFactory.decodeResource(res, R.drawable.mouse);
        mMediumPeopleBitmap = BitmapFactory.decodeResource(res, R.drawable.people);
        mMediumPetalBitmap = BitmapFactory.decodeResource(res, R.drawable.petal);
        mMediumPepperBitmap = BitmapFactory.decodeResource(res, R.drawable.pepper);

        //-----------------------
        mCrossHairs = BitmapFactory.decodeResource(res, R.drawable.crosshair_white);
        mGhostBitmap = BitmapFactory.decodeResource(res, R.drawable.ghost);
        mGhostTargetedBitmap = BitmapFactory.decodeResource(res, R.drawable.ghost_targeted);
        mBlondGhostBitmap = new Bitmap[]{
                BitmapFactory.decodeResource(res, R.drawable.blond_ghost_in_tears),
                BitmapFactory.decodeResource(res, R.drawable.blond_ghost),
        };
        mBlondTargetedBitmap = new Bitmap[]{
                BitmapFactory.decodeResource(res, R.drawable.blond_ghost_in_tears_targeted),
                BitmapFactory.decodeResource(res, R.drawable.blond_ghost_targeted),
        };

        mAmmoBitmap = BitmapFactory.decodeResource(res, R.drawable.ic_ammo);
        mTimerBitmap = BitmapFactory.decodeResource(res, R.drawable.ic_timer);
        mScoreBitmap = BitmapFactory.decodeResource(res, R.drawable.ic_score);
        mBulletHoleBitmap = BitmapFactory.decodeResource(res, R.drawable.bullethole);
        mBabyGhostBitmap = BitmapFactory.decodeResource(res, R.drawable.baby_ghost);
        mTargetedBabyGhostBitmap = BitmapFactory.decodeResource(res, R.drawable.baby_ghost_targeted);
        mGhostWithHelmetBitmaps = new Bitmap[]{
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_5),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_4),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_3),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_2),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet),
        };

        mGhostWithHelmetTargetedBitmaps = new Bitmap[]{
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_5_targeted),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_4_targeted),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_3_targeted),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_2_targeted),
                BitmapFactory.decodeResource(res, R.drawable.ghost_with_helmet_targeted),
        };

        mHiddenGhost = BitmapFactory.decodeResource(res, R.drawable.hidden_ghost);
        mKingGhost = BitmapFactory.decodeResource(res, R.drawable.king_ghost);
        mTargetedKingGhost = BitmapFactory.decodeResource(res, R.drawable.targeted_king_ghost);

        mComboString = res.getString(R.string.in_game_combo_counter);
        mScoreString = res.getString(R.string.in_game_score);
        mTimeString = res.getString(R.string.in_game_time);
    }

    /**
     * draw active items on the screen
     *
     * @param canvas canvas from View.onDraw method
     */
    protected void drawDisplayableItems(Canvas canvas) {
        final float[] currentPos = mGameEngine.getCurrentPosition();
        currentPos[0] *= mWidthRatioDegreeToPx;
        currentPos[1] *= mHeightRatioDegreeToPx;
        for (DisplayableItem i : mGameEngine.getItemsForDisplay()) {
            switch (i.getType()) {
                case DisplayableItemFactory.TYPE_EASY_GHOST:
                    renderEasyGhost(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_BABY_GHOST:
                    renderBabyGhost(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_GHOST_WITH_HELMET:
                    renderGhostWithHelmet(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_HIDDEN_GHOST:
                    renderHiddenGhost(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_KING_GHOST:
                    renderKingGhost(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_BLOND_GHOST:
                    renderBlondGhost(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_BULLET_HOLE:
                    renderBulletHole(canvas, i);
                    break;
                case DisplayableItemFactory.TYPE_CAS_BOW:
                    renderCasBow(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_BABY:
                    renderCasBaby(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_ANGEL:
                    renderCasAngel(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_BIG:
                    renderCasBig(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_BAY:
                    renderCasBay(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_CASE:
                    renderCasCase(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_CHEESE:
                    renderCasCheese(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_COKE:
                    renderCasCoke(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_HE:
                    renderCasHe(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_HIGH:
                    renderCasHigh(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_JAR:
                    renderCasJar(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_ME:
                    renderCasMe(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_CAS_MAP:
                    renderCasMap(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_BUTTON:
                    renderMediumButton(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_BADDY:
                    renderMediumBaddy(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_CHEER:
                    renderMediumCheer(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_DADDY:
                    renderMediumDaddy(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_KETTLE:
                    renderMediumkettle(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_LADDER:
                    renderMediumLadder(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_PEOPLE:
                    renderMediumPeople(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_PETAL:
                    renderMediumPetal(canvas, (TargetableItem) i, currentPos);
                    break;
                case DisplayableItemFactory.TYPE_MEDIUM_PEPPER:
                    renderMediumPepper(canvas, (TargetableItem) i, currentPos);
                    break;

            }
        }
    }
    //---------------------
/*
    protected void drawDisplayableItems(Canvas canvas) {
        final float[] currentPos = mGameEngine.getCurrentPosition();
        currentPos[0] *= mWidthRatioDegreeToPx;
        currentPos[1] *= mHeightRatioDegreeToPx;
        for (DisplayableItem i : mGameEngine.getItemsForDisplay()) {
            switch (i.getType()) {
                case DisplayableItemFactory.TYPE_BAT:
                    renderGhost(canvas, (TargetableItem) i, currentPos, mBatBitmap, mBatBitmap);
                    break;
                case DisplayableItemFactory.TYPE_BIN:
                    renderGhost(canvas, (TargetableItem) i, currentPos, mBinBitmap, mBinBitmap);
                    break;
                case DisplayableItemFactory.TYPE_BED:
                    renderGhost(canvas, (TargetableItem) i, currentPos, mBedBitmap, mBedBitmap);
                    break;
            }
        }
    }
*/
    //-------------------
    protected void renderGhostWithHelmet(Canvas canvas, TargetableItem ghostWithHelmet, float[] currentPos) {
        final int bitmapIndex = ghostWithHelmet.getHealth() - 1;
        renderGhost(canvas, ghostWithHelmet, currentPos, mBinBitmap, mBinBitmap);
    }

    protected void renderEasyGhost(Canvas canvas, TargetableItem easyGhost, float[] currentPos) {
        renderGhost(canvas, easyGhost, currentPos, mBatBitmap, mBatBitmap);
    }

    protected void renderBabyGhost(Canvas canvas, TargetableItem babyGhost, float[] currentPos) {
        renderGhost(canvas, babyGhost, currentPos, mBatBitmap, mBatBitmap);
    }

    protected void renderHiddenGhost(Canvas canvas, TargetableItem hiddenGhost, float[] currentPos) {
        renderGhost(canvas, hiddenGhost, currentPos, mBinBitmap, mBinBitmap);
    }

    protected void renderKingGhost(Canvas canvas, TargetableItem kingGhost, float[] currentPos) {
        renderGhost(canvas, kingGhost, currentPos, mBedBitmap, mBedBitmap);
    }

    protected void renderBlondGhost(Canvas canvas, TargetableItem blondGhost, float[] currentPos) {
        final int bitmapIndex = blondGhost.getHealth() - 1;
        renderGhost(canvas, blondGhost, currentPos, mBoyBitmap, mBoyBitmap);
    }
    protected void renderCasBow(Canvas canvas, TargetableItem casBow, float[] currentPos) {
        renderGhost(canvas, casBow, currentPos, mBowBitmap, mBowBitmap);
    }
    protected void renderCasBaby(Canvas canvas, TargetableItem casBaby, float[] currentPos) {
        renderGhost(canvas, casBaby, currentPos, mBabyBitmap, mBabyBitmap);
    }
    protected void renderCasAngel(Canvas canvas, TargetableItem casAngel, float[] currentPos) {
        renderGhost(canvas, casAngel, currentPos, mAngelBitmap, mAngelBitmap);
    }

    protected void renderCasBig(Canvas canvas, TargetableItem casBig, float[] currentPos) {
        renderGhost(canvas, casBig, currentPos, mBigBitmap, mBigBitmap);
    }

    protected void renderCasBay(Canvas canvas, TargetableItem casBay, float[] currentPos) {
        renderGhost(canvas, casBay, currentPos, mBayBitmap, mBayBitmap);
    }

    protected void renderCasCase(Canvas canvas, TargetableItem casCase, float[] currentPos) {
        renderGhost(canvas, casCase, currentPos, mCaseBitmap, mCaseBitmap);
    }

    protected void renderCasCheese(Canvas canvas, TargetableItem casCheese, float[] currentPos) {
        renderGhost(canvas, casCheese, currentPos, mCheeseBitmap, mCheeseBitmap);
    }

    protected void renderCasCoke(Canvas canvas, TargetableItem casCoke, float[] currentPos) {
        renderGhost(canvas, casCoke, currentPos, mCokeBitmap, mCokeBitmap);
    }

    protected void renderCasHe(Canvas canvas, TargetableItem casHe, float[] currentPos) {
        renderGhost(canvas, casHe, currentPos, mHeBitmap, mHeBitmap);
    }

    protected void renderCasHigh(Canvas canvas, TargetableItem casHigh, float[] currentPos) {
        renderGhost(canvas, casHigh, currentPos, mHighBitmap, mHighBitmap);
    }

    protected void renderCasJar(Canvas canvas, TargetableItem casJar, float[] currentPos) {
        renderGhost(canvas, casJar, currentPos, mJarBitmap, mJarBitmap);
    }

    protected void renderCasMe(Canvas canvas, TargetableItem casMe, float[] currentPos) {
        renderGhost(canvas, casMe, currentPos, mMeBitmap, mMeBitmap);
    }

    protected void renderCasMap(Canvas canvas, TargetableItem casMap, float[] currentPos) {
        renderGhost(canvas, casMap, currentPos, mMapBitmap, mMapBitmap);
    }

    protected void renderMediumButton(Canvas canvas, TargetableItem MediumButton, float[] currentPos) {
        renderGhost(canvas, MediumButton, currentPos, mMediumButtonBitmap, mMediumButtonBitmap);
    }

    protected void renderMediumBaddy(Canvas canvas, TargetableItem MediumBaddy, float[] currentPos) {
        renderGhost(canvas, MediumBaddy, currentPos, mMediumBaddyBitmap, mMediumBaddyBitmap);
    }

    protected void renderMediumCheer(Canvas canvas, TargetableItem MediumCheer, float[] currentPos) {
        renderGhost(canvas, MediumCheer, currentPos, mMediumCheerBitmap, mMediumCheerBitmap);
    }

    protected void renderMediumDaddy(Canvas canvas, TargetableItem MediumDaddy, float[] currentPos) {
        renderGhost(canvas, MediumDaddy, currentPos, mMediumDaddyBitmap, mMediumDaddyBitmap);
    }

    protected void renderMediumkettle(Canvas canvas, TargetableItem MediumKettle, float[] currentPos) {
        renderGhost(canvas, MediumKettle, currentPos, mMediumKettleBitmap, mMediumKettleBitmap);
    }

    protected void renderMediumLadder(Canvas canvas, TargetableItem MediumLadder, float[] currentPos) {
        renderGhost(canvas, MediumLadder, currentPos, mMediumLadderBitmap, mMediumLadderBitmap);
    }

    protected void renderMediumMouse(Canvas canvas, TargetableItem MediumMouse, float[] currentPos) {
        renderGhost(canvas, MediumMouse, currentPos, mMediumMouseBitmap, mMediumMouseBitmap);
    }

    protected void renderMediumPeople(Canvas canvas, TargetableItem MediumPeople, float[] currentPos) {
        renderGhost(canvas, MediumPeople, currentPos, mMediumPeopleBitmap, mMediumPeopleBitmap);
    }

    protected void renderMediumPetal(Canvas canvas, TargetableItem MediumPetal, float[] currentPos) {
        renderGhost(canvas, MediumPetal, currentPos, mMediumPetalBitmap, mMediumPetalBitmap);
    }

    protected void renderMediumPepper(Canvas canvas, TargetableItem MediumPepper, float[] currentPos) {
        renderGhost(canvas, MediumPepper, currentPos, mMediumPepperBitmap, mMediumPepperBitmap);
    }




    protected void renderGhost(Canvas canvas, TargetableItem ghost, float[] currentPos, Bitmap ghostBitmap, Bitmap targetedGhostBitmap) {
        if (!ghost.isAlive()) {
            //Ghost dead
        } else {
            //Ghost alive
            if (isTargeted(currentPos, ghost, ghostBitmap)) {
                //Ghost alive and targeted
                renderItem(canvas, targetedGhostBitmap, ghost);
                mGameEngine.setCurrentTarget(ghost);
            } else {
                //Ghost alive and not targeted
                final int oldAlpha = mPaint.getAlpha();
                mPaint.setAlpha(120);
                renderItem(canvas, ghostBitmap, ghost);
                mPaint.setAlpha(oldAlpha);
                if (ghost == mGameEngine.getCurrentTarget()) {
                    mGameEngine.removeTarget();
                }
            }
        }
    }

    protected void renderBulletHole(Canvas canvas, DisplayableItem bulletHole) {
        renderItem(canvas, mBulletHoleBitmap, bulletHole);
    }

    @Override
    public void onDrawing(Canvas c) {
        drawDisplayableItems(c);
        drawCrossHair(c);
        drawAmmo(c);
        drawCombo(c);
        drawScore(c);
    }

    /**
     * use to display a crossHair
     *
     * @param canvas
     */
    protected void drawCrossHair(Canvas canvas) {
        canvas.drawBitmap(mCrossHairs, (float) (mScreenWidth - mCrossHairs.getWidth()) / 2,
                (float) (mScreenHeight - mCrossHairs.getHeight()) / 2, mPaint);
    }

    /**
     * draw ammo on player screen, in green if ammo > 0 else in red
     *
     * @param canvas canvas from View.onDraw method
     */
    protected void drawAmmo(Canvas canvas) {
        final int currentAmmunition = mGameEngine.getCurrentAmmunition();
        final String ammo = String.valueOf(currentAmmunition);
        final int radius = Math.max(mAmmoBitmap.getWidth(), mAmmoBitmap.getHeight()) + (int) mPadding;
        resetPainter();

        //draw transparent overlay
        useTransparentBlackPainter();
        canvas.drawOval(new RectF(mScreenWidth - radius, mScreenHeight - radius, mScreenWidth + radius, mScreenHeight + radius), mPaint);

        if (currentAmmunition == 0) {
            useRedPainter();
            final String noAmmoMessage = getResources().getString(R.string.in_game_no_ammo_message);
            mPaint.getTextBounds(noAmmoMessage, 0, noAmmoMessage.length(), mBounds);
            canvas.drawText(noAmmoMessage,
                    mScreenWidth / 2,
                    (mScreenHeight + mCrossHairs.getHeight()) / 2 + mBounds.height(),
                    mPaint);
        } else {
            useWhitePainter();
        }

        canvas.drawBitmap(mAmmoBitmap, (float) (mScreenWidth - mAmmoBitmap.getWidth()),
                (float) (getHeight() - mAmmoBitmap.getHeight()), mPaint);

        mPaint.setTextSize(mAmmoBitmap.getHeight() / 2);
        mPaint.getTextBounds(ammo, 0, ammo.length(), mBounds);
        canvas.drawText(ammo
                , mScreenWidth - radius
                , mScreenHeight - radius + mBounds.height() / 2
                , mPaint);
    }

    /**
     * draw combo counter near crossHair
     *
     * @param canvas canvas from View.onDraw method
     */
    protected void drawCombo(Canvas canvas) {
        final int comboNumber = mGameEngine.getCurrentCombo();
        resetPainter();
        useGreenPainter();
        if (comboNumber > 1) {
            final String currentCombo = String.format(mComboString, mGameEngine.getCurrentCombo());
            mPaint.getTextBounds(currentCombo, 0, currentCombo.length(), mBounds);
            canvas.drawText(currentCombo
                    , mScreenWidth / 2 + mCrossHairs.getWidth() / 2 + mBounds.width() / 2
                    , mScreenHeight / 2 + mCrossHairs.getHeight() / 2
                    , mPaint);
        }
    }

    /**
     * draw score
     *
     * @param canvas canvas from View.onDraw method
     */
    protected void drawScore(Canvas canvas) {
        resetPainter();
        final String score = String.valueOf(mGameEngine.getCurrentScore());
        final int radius = Math.max(mScoreBitmap.getWidth(), mScoreBitmap.getHeight()) + (int) mPadding;

        //draw transparent overlay
        useTransparentBlackPainter();
        canvas.drawOval(new RectF(-radius, mScreenHeight - radius, radius, mScreenHeight + radius), mPaint);

        //draw score icon
        useWhitePainter();
        canvas.drawBitmap(mScoreBitmap, 0, mScreenHeight - mScoreBitmap.getHeight(), mPaint);

        //draw score
        mPaint.getTextBounds(score, 0, score.length(), mBounds);
        canvas.drawText(score
                , radius + mBounds.width() / 2
                , mScreenHeight - radius + mBounds.height() / 2
                , mPaint);

    }

    public void animateDyingGhost(TargetableItem ghost) {
        if (mAnimationLayer != null) {
            Bitmap bitmap;

            switch (ghost.getType()) {
                case DisplayableItemFactory.TYPE_BABY_GHOST:
                    bitmap = mBatBitmap;
                    break;
                case DisplayableItemFactory.TYPE_GHOST_WITH_HELMET:
                    bitmap = mBinBitmap;
                    break;
                case DisplayableItemFactory.TYPE_KING_GHOST:
                    bitmap = mBedBitmap;
                    break;
                case DisplayableItemFactory.TYPE_BLOND_GHOST:
                    bitmap = mBoyBitmap;
                    break;
                case DisplayableItemFactory.TYPE_CAS_BOW:
                    bitmap = mBowBitmap;
                case DisplayableItemFactory.TYPE_CAS_BABY:
                    bitmap = mBabyBitmap;
                case DisplayableItemFactory.TYPE_CAS_ANGEL:
                    bitmap = mAngelBitmap;
                case DisplayableItemFactory.TYPE_CAS_BAY:
                    bitmap = mBayBitmap;
                case DisplayableItemFactory.TYPE_CAS_BIG:
                    bitmap = mBigBitmap;
                case DisplayableItemFactory.TYPE_CAS_CASE:
                    bitmap = mCaseBitmap;
                case DisplayableItemFactory.TYPE_CAS_CHEESE:
                    bitmap = mCheeseBitmap;
                case DisplayableItemFactory.TYPE_CAS_COKE:
                    bitmap = mCokeBitmap;
                case DisplayableItemFactory.TYPE_CAS_HE:
                    bitmap = mHeBitmap;
                case DisplayableItemFactory.TYPE_CAS_HIGH:
                    bitmap = mHighBitmap;
                case DisplayableItemFactory.TYPE_CAS_JAR:
                    bitmap = mJarBitmap;
                case DisplayableItemFactory.TYPE_CAS_ME:
                    bitmap = mMeBitmap;
                case DisplayableItemFactory.TYPE_CAS_MAP:
                    bitmap = mMapBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_BUTTON:
                    bitmap = mMediumButtonBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_BADDY:
                    bitmap = mMediumBaddyBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_CHEER:
                    bitmap = mMediumCheerBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_DADDY:
                    bitmap = mMediumDaddyBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_KETTLE:
                    bitmap = mMediumKettleBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_LADDER:
                    bitmap = mMediumLadderBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_MOUSE:
                    bitmap = mMediumMouseBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_PEOPLE:
                    bitmap = mMediumPeopleBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_PETAL:
                    bitmap = mMediumPetalBitmap;
                case DisplayableItemFactory.TYPE_MEDIUM_PEPPER:
                    bitmap = mMediumPepperBitmap;
                default:
                    bitmap = mBulletHoleBitmap;
                    break;
            }

            final RenderInformation renderInformation = getRenderInformation(ghost, bitmap);
            mAnimationLayer.drawDyingGhost(
                    new BitmapDrawable(getResources(), bitmap),
                    mGameEngine.getLastScoreAdded(),
                    (int) mFontSize,
                    (int) (renderInformation.mPositionX), (int) (renderInformation.mPositionY));
        }
    }


}

