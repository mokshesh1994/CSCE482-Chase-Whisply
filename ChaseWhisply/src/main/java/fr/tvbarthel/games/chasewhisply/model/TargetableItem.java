package fr.tvbarthel.games.chasewhisply.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class TargetableItem extends DisplayableItem {
    //health of the item
    protected int mHealth;
    protected int mBasePoint;
    protected int mExpPoint;
    protected ArrayList<Integer> mDrop;


    public TargetableItem() {
        super();
        mBasePoint = 1;
        mHealth = 1;
        mExpPoint = 0;
        mDrop = new ArrayList<Integer>();
    }

    public TargetableItem(int x, int y, int type) {
        super(x, y, type);
        mBasePoint = 1;
        mHealth = 1;
        mExpPoint = 0;
        mDrop = new ArrayList<Integer>();
    }

    protected TargetableItem(Parcel in) {
        super(in);
    }

    /**
     * Hit the item with damage
     *
     * @param damage
     */
    public void hit(int damage) {
        mHealth = Math.max(0, mHealth - damage);
    }

    @Override
    public void writeToParcel(Parcel out, int i) {
        super.writeToParcel(out, i);
        out.writeInt(mHealth);
        out.writeInt(mBasePoint);
        out.writeInt(mExpPoint);
        out.writeList(mDrop);
    }

    @Override
    public void readFromParcel(Parcel in) {
        super.readFromParcel(in);
        mHealth = in.readInt();
        mBasePoint = in.readInt();
        mExpPoint = in.readInt();
        mDrop = new ArrayList<Integer>();
        in.readList(mDrop, Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<TargetableItem> CREATOR = new Parcelable.Creator<TargetableItem>() {
        public TargetableItem createFromParcel(Parcel in) {
            return new TargetableItem(in);
        }

        public TargetableItem[] newArray(int size) {
            return new TargetableItem[size];
        }
    };

    /**
     * used to know if this targetable is alive
     *
     * @return true if alive
     */
    public boolean isAlive() {
        if (mHealth == 0) return false;
        return true;
    }

    /**
     * Getters and Setters
     */
    public int getHealth() {
        return mHealth;
    }

    public void setHealth(int health) {
        mHealth = health;
    }

    public int getBasePoint() {
        return mBasePoint;
    }

    public void setBasePoint(int basePoint) {
        mBasePoint = basePoint;
    }

    public void setExpPoint(int expPoint) {
        mExpPoint = expPoint;
    }

    public int getExpPoint() {
        return mExpPoint;
    }

    public ArrayList<Integer> getDrop() {
        return mDrop;
    }

    public void setDrop(ArrayList<Integer> drop) {
        mDrop = drop;
    }


    public static int randomGhostTypeEasy() {
        final int randomDraw = MathUtils.randomize(0, 100);
        if (randomDraw < 6) {
            //40%
            return DisplayableItemFactory.TYPE_EASY_GHOST;
        } else if (randomDraw < 12) {
            //40%
            return DisplayableItemFactory.TYPE_HIDDEN_GHOST;
        } else if (randomDraw < 18) {
            //19%
            return DisplayableItemFactory.TYPE_BLOND_GHOST;
        } else if (randomDraw < 24) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_BOW;
        }else if (randomDraw < 30) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_BABY;
        }else if (randomDraw < 36) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_ANGEL;
        }else if (randomDraw < 42) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_BIG;
        }else if (randomDraw < 48) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_BAY;
        }else if (randomDraw < 54) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_CASE;
        }else if (randomDraw < 60) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_CHEESE;
        }else if (randomDraw < 66) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_COKE;
        }else if (randomDraw < 72) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_HE;
        }else if (randomDraw < 78) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_HIGH;
        }else if (randomDraw < 84) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_JAR;
        }else if (randomDraw < 90) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_ME;
        }else if (randomDraw < 96) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_MAP;
        }else {
            //1%
            return DisplayableItemFactory.TYPE_KING_GHOST;
        }
    }

    public static int randomGhostType() {
        final int randomDraw = MathUtils.randomize(0, 100);
        if (randomDraw < 6) {
            //40%
            return DisplayableItemFactory.TYPE_EASY_GHOST;
        } else if (randomDraw < 12) {
            //20%
            return DisplayableItemFactory.TYPE_HIDDEN_GHOST;
        } else if (randomDraw < 18) {
            //15%
            return DisplayableItemFactory.TYPE_BLOND_GHOST;
        } else if (randomDraw < 24) {
            //15%
            return DisplayableItemFactory.TYPE_BABY_GHOST;
        } else if (randomDraw < 30) {
            //9%
            return DisplayableItemFactory.TYPE_CAS_BOW;
        } else if (randomDraw < 36) {
            //9%
            return DisplayableItemFactory.TYPE_CAS_BABY;
        }else if (randomDraw < 40) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_ANGEL;
        }else if (randomDraw < 42) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_BIG;
        }else if (randomDraw < 48) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_BAY;
        }else if (randomDraw < 54) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_CASE;
        }else if (randomDraw < 60) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_CHEESE;
        }else if (randomDraw < 66) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_COKE;
        }else if (randomDraw < 72) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_HE;
        }else if (randomDraw < 78) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_HIGH;
        }else if (randomDraw < 84) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_JAR;
        }else if (randomDraw < 90) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_ME;
        }else if (randomDraw < 96) {
            //19%
            return DisplayableItemFactory.TYPE_CAS_MAP;
        } else if (randomDraw < 98) {
            //9%
            return DisplayableItemFactory.TYPE_GHOST_WITH_HELMET;
        }else {
            //1%
            return DisplayableItemFactory.TYPE_KING_GHOST;
        }
    }

    public static int randomGhostTypeHard() {
        final int randomDraw = MathUtils.randomize(0, 100);
        if (randomDraw < 20) {
            //10%
            return DisplayableItemFactory.TYPE_MEDIUM_BUTTON;
        } else if (randomDraw < 40) {
            //15%
            return DisplayableItemFactory.TYPE_MEDIUM_BADDY;
        } else if (randomDraw < 60) {
            //25%
            return DisplayableItemFactory.TYPE_MEDIUM_CHEER;
        } else if (randomDraw < 70) {
            //30%
            return DisplayableItemFactory.TYPE_MEDIUM_DADDY;
        } else if (randomDraw < 80) {
            //19%
            return DisplayableItemFactory.TYPE_MEDIUM_KETTLE;
        } else {
            //1%
            return DisplayableItemFactory.TYPE_MEDIUM_MOUSE;
        }
    }

    public static int randomGhostTypeHarder() {
        final int randomDraw = MathUtils.randomize(0, 100);
        if (randomDraw < 10) {
            //10%
            return DisplayableItemFactory.TYPE_EASY_GHOST;
        } else if (randomDraw < 25) {
            //15%
            return DisplayableItemFactory.TYPE_HIDDEN_GHOST;
        } else if (randomDraw < 40) {
            //20%
            return DisplayableItemFactory.TYPE_BLOND_GHOST;
        } else if (randomDraw < 70) {
            //25%
            return DisplayableItemFactory.TYPE_BABY_GHOST;
        } else if (randomDraw < 99) {
            //29%
            return DisplayableItemFactory.TYPE_GHOST_WITH_HELMET;
        } else {
            //1%
            return DisplayableItemFactory.TYPE_KING_GHOST;
        }
    }

    public static int randomGhostTypeHardest() {
        final int randomDraw = MathUtils.randomize(0, 100);
        if (randomDraw < 19) {
            //19%
            return DisplayableItemFactory.TYPE_BLOND_GHOST;
        } else if (randomDraw < 59) {
            //40%
            return DisplayableItemFactory.TYPE_BABY_GHOST;
        } else if (randomDraw < 99) {
            //40%
            return DisplayableItemFactory.TYPE_GHOST_WITH_HELMET;
        } else {
            //1%
            return DisplayableItemFactory.TYPE_KING_GHOST;
        }
    }

    /**
     * spawn rules for all mobs exept king
     *
     * @return
     */
    public static int randomGhostTypeWithoutKing() {
        final int randomDraw = MathUtils.randomize(0, 100);
        if (randomDraw < 60) {
            return DisplayableItemFactory.TYPE_EASY_GHOST;
        } else if (randomDraw < 75) {
            return DisplayableItemFactory.TYPE_HIDDEN_GHOST;
        } else if (randomDraw < 90) {
            return DisplayableItemFactory.TYPE_BABY_GHOST;
        } else {
            return DisplayableItemFactory.TYPE_GHOST_WITH_HELMET;
        }

    }
}
