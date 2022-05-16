
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        float myWallDecorationSize = 0;
        double myHoleSurface = 0;

        System.out.println("How many walls would you like to paint?");
        float numberOfWalls = myScanner.nextInt();

        if (numberOfWalls > 0) {

            for (int i = 0; i < numberOfWalls; i++) {

                //// calculate wall surface ////////////////////////////////////////////////////////////

                System.out.println("What is the length of your wall?");
                double myWallLength = myScanner.nextInt();
                System.out.println(("What is the width of your wall?"));
                double myWallWidth = myScanner.nextInt();
                System.out.println("The surface of your wall is " + myWallWidth * myWallLength + "\n");
                double myWallSurface = myWallLength * myWallWidth;


                //// myWallHole; calculate door/window (once for now) ////////////////////////////////////

                System.out.println("Any doors or windows? Enter 1 if yes and 2 for no.");
                double answerForDoorsOrWindows = myScanner.nextDouble();

                if ( answerForDoorsOrWindows == 1) {
                    System.out.println("What is the length of the door/window?");
                    double myHoleLength = myScanner.nextInt();
                    System.out.println(("What is the width of the door/window?"));
                    double myHoleWidth = myScanner.nextInt();
                    System.out.println("The surface of your door/window is " + myHoleWidth * myHoleLength + "\n");
                    myHoleSurface = myHoleLength * myHoleWidth;
                } else {
                    System.out.println("There are no doors or windows for this wall");
                }

                //// myWallDecorationSize; Calculate wall decorations ////////////////////////////////////////////////////

                System.out.println("Any sockets or paintings? Enter 1 if yes 2 for no");
                double answerForSocketsOrPaintings = myScanner.nextDouble();
                if (answerForSocketsOrPaintings == 1) {
                    System.out.println("What is the length of the socket?");
                    float mySocketLength = myScanner.nextFloat();
                    System.out.println(("What is the width of the socket?"));
                    float mySocketWidth = myScanner.nextFloat();
                    System.out.println("The surface of your hole is " + (mySocketWidth * mySocketLength));
                    myWallDecorationSize = mySocketLength * mySocketWidth;
                } else {
                    System.out.println("This wall has none of those");
                }

                //// Current wall surface ////////////////////////////////////////////////////////////////////////
                double myNewWallSurface = myWallSurface - myHoleSurface - myWallDecorationSize;
                System.out.println("Final wall surface " + myNewWallSurface + "\n");


                //// Buckets needed //////////////////////////////////////////////////////////////////////////////
                System.out.println("What is the surface your bucket of paint can cover?" + "\n");
                float myBucketSize = myScanner.nextFloat();
                System.out.println(("In order to cover that surface, you will need " + myNewWallSurface / myBucketSize + " buckets"));
            }

        }
        else {
            System.out.println("Time to figure it out then");
        };
    }
}
