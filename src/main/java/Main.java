
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {





        Scanner myScanner = new Scanner(System.in);

        System.out.println("How many walls would you like to paint?");
        float numberOfWalls = myScanner.nextInt();

        if (numberOfWalls > 0) {

            // calculate wall surface

            System.out.println("What is the length of your wall?");
            double myWallLength = myScanner.nextInt();
            System.out.println(("What is the width of your wall?"));
            double myWallWidth = myScanner.nextInt();
            System.out.println("The surface of your wall is " + myWallWidth * myWallLength + "\n");
            double myWallSurface = myWallLength * myWallWidth;


            // myWallHole; calculate door/window (once for now)

            System.out.println("What is the length of the hole?");
            double myHoleLength = myScanner.nextInt();
            System.out.println(("What is the width of the hole?"));
            double myHoleWidth = myScanner.nextInt();
            System.out.println("The surface of your hole is " + myHoleWidth * myHoleLength + "\n");
            double myHoleSurface = myHoleLength * myHoleWidth;

            //myWallDecorationSize; Calculate wall decorations

            System.out.println("What is the length of the socket?");
            float mySocketLength = myScanner.nextFloat();
            System.out.println(("What is the width of the socket?"));
            float mySocketWidth = myScanner.nextFloat();
            System.out.println("The surface of your hole is " + (mySocketWidth * mySocketLength));
            float myWallDecorationSize = mySocketLength * mySocketWidth;

            //Current wall surface
            double myNewWallSurface = myWallSurface - myHoleSurface - myWallDecorationSize;
            System.out.println("Final wall surface " + myNewWallSurface + "\n");


            //Buckets needed
            System.out.println("What is the surface your bucket of paint can cover?" + "\n");
            float myBucketSize = myScanner.nextFloat();
            System.out.println(("In order to cover that surface, you will need " + myNewWallSurface / myBucketSize + " buckets"));
        }
        else {
            System.out.println("Time to figure it out then");
        };


    }
}
