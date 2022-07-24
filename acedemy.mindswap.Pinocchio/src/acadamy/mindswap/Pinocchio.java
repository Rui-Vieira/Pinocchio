package acadamy.mindswap;

public class Pinocchio {

    private static final int HEAD_EXPLOSION_VALUE = 3;
    private int lies;
    private int goodDeeds;
    private int noseSize;
    private boolean isHeadOff;
    private boolean canBecomeRealBoy;
    private boolean isRealBoy;


    public Pinocchio() {
        noseSize = 1;
        isHeadOff = false;
        canBecomeRealBoy = true;
        isRealBoy = false;
    }

    public void lies() {

        if( isHeadOff) {
            System.out.println("Pinocchio is head off, he need a fix! ");
            return;
        }
        if(!isRealBoy) {
            noseSize++;
            lies ++;
            System.out.println(" Pinocchio tell lies again!");
            if(noseSize == HEAD_EXPLOSION_VALUE) {
                explodeHead();
            }
        }
        System.out.println("Pinocchio have a nose with " +noseSize +" inches\n");
    }

    public void doGoodDeed() {

        if(isHeadOff) {
            System.out.println("Pinocchio is head off, he need Gepetto to give him a fix!\n Unfortunately i cant become real boy anymore");
            return;
        }
        System.out.println("Pinocchio did a good dead! \n Already done " +goodDeeds+" good deeds!");
        if(!isRealBoy)  {
            if( noseSize > 1) {
                noseSize--;
                goodDeeds++;
                System.out.println("Pinocchio nose was " + noseSize +" inches now! ");
                return;
            }
            if(goodDeeds == 2 && canBecomeRealBoy && noseSize == 1) {
                becomeARealBoy();
            }
            goodDeeds++;
        }
    }


    public void fixPinocchioHead() {
        if (!isHeadOff) {
            System.out.println("Looks like pinocchio head is in the place!");
            return;
        }
        isHeadOff = false;
        System.out.println("Gepetto fix the is Pinocchio head, Pinocchio is fine now!");
    }

    private void becomeARealBoy() {
        isRealBoy = true;
        System.out.println("Pinocchio is realising is dream, now is a real boy!");
    }

    private void explodeHead() {
        canBecomeRealBoy = false;
        isHeadOff = true;
        System.out.println("Pinocchio can tell lies can blow his mind...BOOMM! Literary! ");

    }
    public void getNoseSize() {
        System.out.println(noseSize);
    }
    public void getLies() {
        System.out.println(lies);
    }
}