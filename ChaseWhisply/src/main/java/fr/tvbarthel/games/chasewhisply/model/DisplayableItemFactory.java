package fr.tvbarthel.games.chasewhisply.model;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

import fr.tvbarthel.games.chasewhisply.model.inventory.DroppedByList;
import fr.tvbarthel.games.chasewhisply.model.inventory.InventoryItemInformation;

public class DisplayableItemFactory {
    // Type
    public final static int TYPE_EASY_GHOST = 0x00000001;
    public final static int TYPE_BULLET_HOLE = 0x00000002;
    public final static int TYPE_BABY_GHOST = 0x00000003;
    public final static int TYPE_GHOST_WITH_HELMET = 0x00000004;
    public final static int TYPE_HIDDEN_GHOST = 0x00000005;
    public final static int TYPE_KING_GHOST = 0x00000006;
    public final static int TYPE_BLOND_GHOST = 0x00000007;
    public final static int TYPE_CAS_BOW = 0x00000008;
    public final static int TYPE_CAS_BABY = 0x00000009;
    public final static int TYPE_CAS_ANGEL = 0x00000010;
    public final static int TYPE_CAS_BIG = 0x00000011;
    public final static int TYPE_CAS_BAY = 0x00000012;
    public final static int TYPE_CAS_CASE = 0x00000013;
    public final static int TYPE_CAS_CHEESE = 0x00000014;
    public final static int TYPE_CAS_COKE = 0x00000015;
    public final static int TYPE_CAS_HE = 0x00000016;
    public final static int TYPE_CAS_HIGH = 0x00000017;
    public final static int TYPE_CAS_JAR = 0x00000018;
    public final static int TYPE_CAS_ME = 0x00000019;
    public final static int TYPE_CAS_MAP = 0x00000020;
    public final static int TYPE_MEDIUM_BUTTON = 0x00000021;
    public final static int TYPE_MEDIUM_CHEER = 0x00000022;
    public final static int TYPE_MEDIUM_BADDY = 0x00000023;
    public final static int TYPE_MEDIUM_DADDY = 0x00000024;
    public final static int TYPE_MEDIUM_KETTLE = 0x00000025;
    public final static int TYPE_MEDIUM_LADDER = 0x00000026;
    public final static int TYPE_MEDIUM_MOUSE = 0x00000027;
    public final static int TYPE_MEDIUM_PEOPLE = 0x00000028;
    public final static int TYPE_MEDIUM_PETAL = 0x00000029;
    public final static int TYPE_MEDIUM_PEPPER = 0x00000030;





    //World Boundaries
    private static final int MAX_X_IN_DEGREE = 175;
    private static final int MIN_X_IN_DEGREE = -175;
    private static final int MAX_Y_IN_DEGREE = -45;
    private static final int MIN_Y_IN_DEGREE = -105;

    private static final int DEFAULT_X_MIN_IN_DEGREE = -170;
    private static final int DEFAULT_X_MAX_IN_DEGREE = 170;
    private static final int DEFAULT_Y_MIN_IN_DEGREE = -80;
    private static final int DEFAULT_Y_MAX_IN_DEGREE = -50;

    //Health
    public final static int HEALTH_EASY_GHOST = 1;
    public final static int HEALTH_BABY_GHOST = 1;
    public final static int HEALTH_GHOST_WITH_HELMET = 5;
    public final static int HEALTH_HIDDEN_GHOST = 1;
    public final static int HEALTH_KING_GHOST = 1;
    public final static int HEALTH_BLOND_GHOST = 1;
    public final static int HEALTH_BOW = 1;
    public final static int HEALTH_BABY = 1;
    public final static int HEALTH_ANGEL = 1;
    public final static int HEALTH_BIG = 1;
    public final static int HEALTH_BAY = 1;
    public final static int HEALTH_CASE = 1;
    public final static int HEALTH_CHEESE = 1;
    public final static int HEALTH_COKE = 1;
    public final static int HEALTH_HE = 1;
    public final static int HEALTH_HIGH = 1;
    public final static int HEALTH_JAR = 1;
    public final static int HEALTH_ME = 1;
    public final static int HEALTH_MAP = 1;
    public final static int HEALTH_MEDIUM_BUTTON = 1;
    public final static int HEALTH_MEDIUM_CHEER = 1;
    public final static int HEALTH_MEDIUM_BADDY = 1;
    public final static int HEALTH_MEDIUM_DADDY = 1;
    public final static int HEALTH_MEDIUM_KETTLE = 1;
    public final static int HEALTH_MEDIUM_LADDER = 1;
    public final static int HEALTH_MEDIUM_MOUSE = 1;
    public final static int HEALTH_MEDIUM_PEOPLE = 1;
    public final static int HEALTH_MEDIUM_PETAL = 1;
    public final static int HEALTH_MEDIUM_PEPPER = 1;



    //Base Point
    public final static int BASE_POINT_EAST_GHOST = 1;
    public final static int BASE_POINT_BABY_GHOST = 2;
    public final static int BASE_POINT_GHOST_WITH_HELMET = 10;
    public final static int BASE_POINT_HIDDEN_GHOST = 2;
    public final static int BASE_POINT_KING_GHOST = 1;
    public final static int BASE_POINT_BLOND_GHOST = 2;
    public final static int BASE_POINT_BOW = 1;
    public final static int BASE_POINT_BABY = 1;
    public final static int BASE_POINT_ANGEL = 1;
    public final static int BASE_POINT_BIG = 1;
    public final static int BASE_POINT_BAY = 1;
    public final static int BASE_POINT_CASE = 1;
    public final static int BASE_POINT_CHEESE = 1;
    public final static int BASE_POINT_COKE = 1;
    public final static int BASE_POINT_HE = 1;
    public final static int BASE_POINT_HIGH = 1;
    public final static int BASE_POINT_JAR = 1;
    public final static int BASE_POINT_ME = 1;
    public final static int BASE_POINT_MAP = 1;
    public final static int BASE_POINT_MEDIUM_BUTTON = 1;
    public final static int BASE_POINT_MEDIUM_CHEER = 1;
    public final static int BASE_POINT_MEDIUM_BADDY = 1;
    public final static int BASE_POINT_MEDIUM_DADDY = 1;
    public final static int BASE_POINT_MEDIUM_KETTLE = 1;
    public final static int BASE_POINT_MEDIUM_LADDER = 1;
    public final static int BASE_POINT_MEDIUM_MOUSE = 1;
    public final static int BASE_POINT_MEDIUM_PEOPLE = 1;
    public final static int BASE_POINT_MEDIUM_PETAL = 1;
    public final static int BASE_POINT_MEDIUM_PEPPER = 1;


    //Exp Point
    public final static int EXP_POINT_EASY_GHOST = 2;
    public final static int EXP_POINT_BABY_GHOST = 4;
    public final static int EXP_POINT_GHOST_WITH_HELMET = 10;
    public final static int EXP_POINT_HIDDEN_GHOST = 5;
    public final static int EXP_POINT_KING_GHOST = 100;
    public final static int EXP_POINT_BLOND_GHOST = 4;
    public final static int EXP_POINT_BOW = 2;
    public final static int EXP_POINT_BABY = 2;
    public final static int EXP_POINT_ANGEL = 2;
    public final static int EXP_POINT_BIG = 2;
    public final static int EXP_POINT_BAY = 2;
    public final static int EXP_POINT_CASE = 2;
    public final static int EXP_POINT_CHEESE = 2;
    public final static int EXP_POINT_COKE = 2;
    public final static int EXP_POINT_HE = 2;
    public final static int EXP_POINT_HIGH = 2;
    public final static int EXP_POINT_JAR = 2;
    public final static int EXP_POINT_ME = 2;
    public final static int EXP_POINT_MAP = 2;
    public final static int EXP_POINT_MEDIUM_BUTTON = 2;
    public final static int EXP_POINT_MEDIUM_CHEER = 2;
    public final static int EXP_POINT_MEDIUM_BADDY = 2;
    public final static int EXP_POINT_MEDIUM_DADDY = 2;
    public final static int EXP_POINT_MEDIUM_KETTLE = 2;
    public final static int EXP_POINT_MEDIUM_LADDER = 2;
    public final static int EXP_POINT_MEDIUM_MOUSE = 2;
    public final static int EXP_POINT_MEDIUM_PEOPLE = 2;
    public final static int EXP_POINT_MEDIUM_PETAL = 2;
    public final static int EXP_POINT_MEDIUM_PEPPER = 2;


    public static TargetableItem createGhostWithRandomCoordinates(int ghostType) {
        return createGhostWithRandomCoordinates(ghostType, DEFAULT_X_MIN_IN_DEGREE,
                DEFAULT_X_MAX_IN_DEGREE, DEFAULT_Y_MIN_IN_DEGREE, DEFAULT_Y_MAX_IN_DEGREE);
    }

    public static TargetableItem createGhostWithRandomCoordinates(int ghostType, int xMin, int xMax, int yMin, int yMax) {
        TargetableItem targetableItem = createEasyGhost();
        switch (ghostType) {

            case TYPE_BABY_GHOST:
                targetableItem = createBabyGhost();
                break;

            case TYPE_GHOST_WITH_HELMET:
                targetableItem = createGhostWithHelmet();
                break;

            case TYPE_HIDDEN_GHOST:
                targetableItem = createHiddenGhost();
                break;

            case TYPE_KING_GHOST:
                targetableItem = createKingGhost();
                break;

            case TYPE_BLOND_GHOST:
                targetableItem = createBlondGhost();
                break;

            case TYPE_CAS_BOW:
                targetableItem = createBow();
                break;

            case TYPE_CAS_BABY:
                targetableItem = createBaby();
                break;

            case TYPE_CAS_ANGEL:
                targetableItem = createAngel();
                break;

            case TYPE_CAS_BIG:
                targetableItem = createBig();
                break;

            case TYPE_CAS_BAY:
                targetableItem = createBay();
                break;

            case TYPE_CAS_CASE:
                targetableItem = createCase();
                break;

            case TYPE_CAS_CHEESE:
                targetableItem = createCheese();
                break;

            case TYPE_CAS_COKE:
                targetableItem = createCoke();
                break;

            case TYPE_CAS_HE:
                targetableItem = createHe();
                break;

            case TYPE_CAS_HIGH:
                targetableItem = createHigh();
                break;

            case TYPE_CAS_JAR:
                targetableItem = createJar();
                break;

            case TYPE_CAS_ME:
                targetableItem = createMe();
                break;

            case TYPE_CAS_MAP:
                targetableItem = createMap();
                break;

            case TYPE_MEDIUM_BUTTON:
                targetableItem = createMediumButton();
                break;

            case TYPE_MEDIUM_BADDY:
                targetableItem = createMediumBaddy();
                break;

            case TYPE_MEDIUM_CHEER:
                targetableItem = createMediumCheer();
                break;

            case TYPE_MEDIUM_DADDY:
                targetableItem = createMediumDaddy();
                break;

            case TYPE_MEDIUM_KETTLE:
                targetableItem = createMediumKettle();
                break;

            case TYPE_MEDIUM_LADDER:
                targetableItem = createMediumLadder();
                break;

            case TYPE_MEDIUM_MOUSE:
                targetableItem = createMediumMouse();
                break;

            case TYPE_MEDIUM_PEOPLE:
                targetableItem = createMediumPeople();
                break;

            case TYPE_MEDIUM_PETAL:
                targetableItem = createMediumPetal();
                break;

            case TYPE_MEDIUM_PEPPER:
                targetableItem = createMediumPepper();
                break;

        }
        targetableItem.setRandomCoordinates(
                Math.max(MIN_X_IN_DEGREE, xMin),
                Math.min(MAX_X_IN_DEGREE, xMax),
                Math.max(MIN_Y_IN_DEGREE, yMin),
                Math.min(MAX_Y_IN_DEGREE, yMax));
        return targetableItem;
    }


    public static TargetableItem createGhostWithHelmet() {
        final int dropDraft = MathUtils.randomize(0, 100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem ghostWithHelmet = createTargetableItem(TYPE_GHOST_WITH_HELMET,
                HEALTH_GHOST_WITH_HELMET,
                BASE_POINT_GHOST_WITH_HELMET,
                EXP_POINT_GHOST_WITH_HELMET);

        if (dropDraft < DroppedByList.DROP_RATE_BROKEN_HELMET_HORN) {
            drops.add(InventoryItemInformation.TYPE_BROKEN_HELMET_HORN);
        }

        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        ghostWithHelmet.setDrop(drops);
        return ghostWithHelmet;
    }

    public static TargetableItem createEasyGhost() {
        final int dropDraft = MathUtils.randomize(0, 100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem easyGhost = createTargetableItem(TYPE_EASY_GHOST,
                HEALTH_EASY_GHOST,
                BASE_POINT_EAST_GHOST,
                EXP_POINT_EASY_GHOST);

        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        easyGhost.setDrop(drops);
        return easyGhost;
    }


    public static TargetableItem createBlondGhost() {
        final int dropDraft = MathUtils.randomize(0, 100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem blondGhost = createTargetableItem(TYPE_BLOND_GHOST,
                HEALTH_BLOND_GHOST,
                BASE_POINT_BLOND_GHOST,
                EXP_POINT_BLOND_GHOST);

        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        if (dropDraft < DroppedByList.DROP_RATE_GHOST_TEAR) {
            drops.add(InventoryItemInformation.TYPE_GHOST_TEAR);
        }

        blondGhost.setDrop(drops);
        return blondGhost;
    }

    public static TargetableItem createBabyGhost() {
        final int dropDraft = MathUtils.randomize(0, 100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem babyGhost = createTargetableItem(TYPE_BABY_GHOST,
                HEALTH_BABY_GHOST,
                BASE_POINT_BABY_GHOST,
                EXP_POINT_BABY_GHOST);

        if (dropDraft < DroppedByList.DROP_RATE_BABY_DROOL) {
            drops.add(InventoryItemInformation.TYPE_BABY_DROOL);
        }

        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        babyGhost.setDrop(drops);
        return babyGhost;
    }

    public static TargetableItem createHiddenGhost() {
        final int dropDraft = MathUtils.randomize(0, 100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem hiddenGhost = createTargetableItem(TYPE_HIDDEN_GHOST,
                HEALTH_HIDDEN_GHOST,
                BASE_POINT_HIDDEN_GHOST,
                EXP_POINT_HIDDEN_GHOST);

        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        hiddenGhost.setDrop(drops);
        return hiddenGhost;
    }

    public static TargetableItem createKingGhostForDeathToTheKing() {
        final TargetableItem kingGhost = createGhostWithRandomCoordinates(DisplayableItemFactory.TYPE_KING_GHOST);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        drops.add(InventoryItemInformation.TYPE_COIN);
        drops.add(InventoryItemInformation.TYPE_COIN);
        drops.add(InventoryItemInformation.TYPE_COIN);
        drops.add(InventoryItemInformation.TYPE_COIN);
        drops.add(InventoryItemInformation.TYPE_COIN);
        kingGhost.setDrop(drops);
        return kingGhost;
    }

    public static TargetableItem createKingGhost() {
        final int dropDraft = MathUtils.randomize(0, 100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem kingGhost = createTargetableItem(TYPE_KING_GHOST,
                HEALTH_KING_GHOST,
                BASE_POINT_KING_GHOST,
                EXP_POINT_KING_GHOST);

        if (dropDraft < DroppedByList.DROP_RATE_KING_CROWN) {
            drops.add(InventoryItemInformation.TYPE_KING_CROWN);
        }

        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        kingGhost.setDrop(drops);
        return kingGhost;
    }

    public static TargetableItem createBow() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casBow = createTargetableItem(TYPE_CAS_BOW,
                HEALTH_BOW,
                BASE_POINT_BOW,
                EXP_POINT_BOW);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casBow.setDrop(drops);
        return casBow;
    }

    public static TargetableItem createBaby() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casBaby = createTargetableItem(TYPE_CAS_BABY,
                HEALTH_BABY,
                BASE_POINT_BABY,
                EXP_POINT_BABY);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casBaby.setDrop(drops);
        return casBaby;
    }

    public static TargetableItem createAngel() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casAngel = createTargetableItem(TYPE_CAS_ANGEL,
                HEALTH_ANGEL,
                BASE_POINT_ANGEL,
                EXP_POINT_ANGEL);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casAngel.setDrop(drops);
        return casAngel;
    }

    public static TargetableItem createBig() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casBig = createTargetableItem(TYPE_CAS_BIG,
                HEALTH_BIG,
                BASE_POINT_BIG,
                EXP_POINT_BIG);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casBig.setDrop(drops);
        return casBig;
    }

    public static TargetableItem createBay() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casBay = createTargetableItem(TYPE_CAS_BAY,
                HEALTH_BAY,
                BASE_POINT_BAY,
                EXP_POINT_BAY);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casBay.setDrop(drops);
        return casBay;
    }

    public static TargetableItem createCase() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casCase = createTargetableItem(TYPE_CAS_CASE,
                HEALTH_CASE,
                BASE_POINT_CASE,
                EXP_POINT_CASE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casCase.setDrop(drops);
        return casCase;
    }

    public static TargetableItem createCheese() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casCheese = createTargetableItem(TYPE_CAS_CHEESE,
                HEALTH_CHEESE,
                BASE_POINT_CHEESE,
                EXP_POINT_CHEESE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casCheese.setDrop(drops);
        return casCheese;
    }

    public static TargetableItem createCoke() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casCoke = createTargetableItem(TYPE_CAS_COKE,
                HEALTH_COKE,
                BASE_POINT_COKE,
                EXP_POINT_COKE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casCoke.setDrop(drops);
        return casCoke;
    }

    public static TargetableItem createHe() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casHe = createTargetableItem(TYPE_CAS_HE,
                HEALTH_HE,
                BASE_POINT_HE,
                EXP_POINT_HE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casHe.setDrop(drops);
        return casHe;
    }

    public static TargetableItem createHigh() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casHigh = createTargetableItem(TYPE_CAS_HIGH,
                HEALTH_HIGH,
                BASE_POINT_HIGH,
                EXP_POINT_HIGH);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casHigh.setDrop(drops);
        return casHigh;
    }

    public static TargetableItem createJar() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casJar = createTargetableItem(TYPE_CAS_JAR,
                HEALTH_JAR,
                BASE_POINT_JAR,
                EXP_POINT_JAR);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casJar.setDrop(drops);
        return casJar;
    }

    public static TargetableItem createMe() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casMe = createTargetableItem(TYPE_CAS_ME,
                HEALTH_ME,
                BASE_POINT_ME,
                EXP_POINT_ME);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casMe.setDrop(drops);
        return casMe;
    }

    public static TargetableItem createMap() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem casMap = createTargetableItem(TYPE_CAS_MAP,
                HEALTH_MAP,
                BASE_POINT_MAP,
                EXP_POINT_MAP);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        casMap.setDrop(drops);
        return casMap;
    }

    public static TargetableItem createMediumButton() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumButton = createTargetableItem(TYPE_MEDIUM_BUTTON,
                HEALTH_MEDIUM_BUTTON,
                BASE_POINT_MEDIUM_BUTTON,
                EXP_POINT_MEDIUM_BUTTON);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumButton.setDrop(drops);
        return MediumButton;
    }

    public static TargetableItem createMediumBaddy() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumBaddy = createTargetableItem(TYPE_MEDIUM_BUTTON,
                HEALTH_MEDIUM_BADDY,
                BASE_POINT_MEDIUM_BADDY,
                EXP_POINT_MEDIUM_BADDY);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumBaddy.setDrop(drops);
        return MediumBaddy;
    }

    public static TargetableItem createMediumCheer() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumCheer = createTargetableItem(TYPE_MEDIUM_CHEER,
                HEALTH_MEDIUM_CHEER,
                BASE_POINT_MEDIUM_CHEER,
                EXP_POINT_MEDIUM_CHEER);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumCheer.setDrop(drops);
        return MediumCheer;
    }

    public static TargetableItem createMediumDaddy() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumDaddy = createTargetableItem(TYPE_MEDIUM_DADDY,
                HEALTH_MEDIUM_DADDY,
                BASE_POINT_MEDIUM_DADDY,
                EXP_POINT_MEDIUM_DADDY);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumDaddy.setDrop(drops);
        return MediumDaddy;
    }

    public static TargetableItem createMediumKettle() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumKettle = createTargetableItem(TYPE_MEDIUM_KETTLE,
                HEALTH_MEDIUM_KETTLE,
                BASE_POINT_MEDIUM_KETTLE,
                EXP_POINT_MEDIUM_KETTLE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumKettle.setDrop(drops);
        return MediumKettle;
    }

    public static TargetableItem createMediumLadder() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumLadder = createTargetableItem(TYPE_MEDIUM_LADDER,
                HEALTH_MEDIUM_LADDER,
                BASE_POINT_MEDIUM_LADDER,
                EXP_POINT_MEDIUM_LADDER);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumLadder.setDrop(drops);
        return MediumLadder;
    }

    public static TargetableItem createMediumMouse() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumMouse = createTargetableItem(TYPE_MEDIUM_MOUSE,
                HEALTH_MEDIUM_MOUSE,
                BASE_POINT_MEDIUM_MOUSE,
                EXP_POINT_MEDIUM_MOUSE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumMouse.setDrop(drops);
        return MediumMouse;
    }

    public static TargetableItem createMediumPeople() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumPeople = createTargetableItem(TYPE_MEDIUM_PEOPLE,
                HEALTH_MEDIUM_PEOPLE,
                BASE_POINT_MEDIUM_PEOPLE,
                EXP_POINT_MEDIUM_PEOPLE);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumPeople.setDrop(drops);
        return MediumPeople;
    }

    public static TargetableItem createMediumPetal() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumPetal = createTargetableItem(TYPE_MEDIUM_PETAL,
                HEALTH_MEDIUM_PETAL,
                BASE_POINT_MEDIUM_PETAL,
                EXP_POINT_MEDIUM_PETAL);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumPetal.setDrop(drops);
        return MediumPetal;
    }

    public static TargetableItem createMediumPepper() {
        final int dropDraft = MathUtils.randomize(0,100);
        final ArrayList<Integer> drops = new ArrayList<Integer>();
        final TargetableItem MediumPepper = createTargetableItem(TYPE_MEDIUM_PEPPER,
                HEALTH_MEDIUM_PEPPER,
                BASE_POINT_MEDIUM_PEPPER,
                EXP_POINT_MEDIUM_PEPPER);
        if (dropDraft < DroppedByList.DROP_RATE_COIN) {
            drops.add(InventoryItemInformation.TYPE_COIN);
        }

        MediumPepper.setDrop(drops);
        return MediumPepper;
    }

    private static TargetableItem createTargetableItem(int type, int health, int basePoint, int expPoint) {
        TargetableItem targetableItem = new TargetableItem();
        targetableItem.setType(type);
        targetableItem.setHealth(health);
        targetableItem.setBasePoint(basePoint);
        targetableItem.setExpPoint(expPoint);
        return targetableItem;
    }

    public static DisplayableItem createBulletHole() {
        DisplayableItem hole = new DisplayableItem();
        hole.setType(TYPE_BULLET_HOLE);
        return hole;
    }
}
