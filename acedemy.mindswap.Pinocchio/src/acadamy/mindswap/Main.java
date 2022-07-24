package acadamy.mindswap;

public class Main {

    public static void main(String[] args) {
        Pinocchio pinocchio = new Pinocchio();
        pinocchio.fixPinocchioHead();
        pinocchio.lies();
        pinocchio.lies();
        pinocchio.lies();
        pinocchio.lies();
        pinocchio.lies();
        pinocchio.doGoodDeed();

    }
}
// to do  24/07/22  arraylist of lies pinochio can say with random number
// to do 24/07/22  scan.in to questions to make in the terminal
// to do random pinnochio tell the truth


    /*Create a class to represent Pinnochio, following the rules below:
            1. If Pinocchio lies, his nose grows. Nose growth is proportional to the number of lies told.
            2. If Pinocchio's nose reaches a certain size, his head explodes. It can be fixed, but Pinocchio loses his
    ability to become a real boy forever.
 3. If Pinocchio's head explodes, he can't do anything else until we fix it.
            3. Pinocchio can do good deeds to make up for his lies. Every good deed completed, shortens Pinocchio's nose
    proportionally.
 4. If Pinocchio's nose reaches 1 unit of size and he manages to do two additional good deeds without telling more lies
    in between, Pinocchio becomes a real boy (assuming he still can).
            5. If Pinocchio becomes a real boy, his nose size will remain the same forever.


            */