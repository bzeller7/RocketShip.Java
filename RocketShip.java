// Brea Zeller
//1/17/2018
//CPW 142
//Programming Assignment #2
//
//This program assignment will create the rocket ship, and can adapt its size when you change the rocket_size! 
//I also created the methods to decrease the redundancy. 

public class RocketShip {

    public static final int ROCKET_SIZE = 5;

    public static void main(String[] args) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    /**
     Print the nozzle at the bottom of the rocket.
     This reuses the pattern of the nose cone.
     */
    public static void printNozzle() {
        printNoseCone();
    }

    /**
     Print the nose cone. There is a pattern of **
     down the middle of the cone with a widening pattern
     of //...\\ on either side.
     */
    public static void printNoseCone() {
        for (int line = 1; line <= (ROCKET_SIZE * 2 - 1); line++) {
            System.out.print(" ");
            for (int i = 1; i <= (ROCKET_SIZE * 2 - 1) - line; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= line; i++) {
                System.out.print("/");
            }
            System.out.print("**");
            for (int i = 1; i <= line; i++) {
                System.out.print("\\");
            }

            System.out.println(" ");
        }

    }




    /**
      Print body of rocket. This is a two-stage pattern
      with a diamond pattern in the top half and an
      hour glass on the bottom.
     */
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
        printDiamondBottom();
        printDiamondTop();
        printEdge();
    }

    /**
     Print the top half of two diamonds between vertical lines.
     */
    public static void printDiamondTop() {
        for (int line = 1; line <= ROCKET_SIZE; line++) {
            System.out.print("|");
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= ROCKET_SIZE - line; j++) {
                    System.out.print(".");
                }
                for (int j = 1; j <= line; j++) {
                    System.out.print("/\\");
                }
                for (int j = 1; j <= ROCKET_SIZE - line; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }

    }


    /**
     Print the bottom half of two diamonds between vertical lines.
     */
    public static void printDiamondBottom() {
        for (int line = ROCKET_SIZE; line >= 1; line--) {
            System.out.print("|");
            for (int i = 1; i <= 2; i++) {
                for (int j = 1; j <= ROCKET_SIZE - line; j++) {
                    System.out.print(".");
                }
                for (int j = 1; j <= line; j++) {
                    System.out.print("\\/");
                }
                for (int j = 1; j <= ROCKET_SIZE - line; j++) {
                    System.out.print(".");
                }
            }
            System.out.println("|");
        }


    }
    /**
      Print +=*=*=*...=+ to fit the width of the rocket. 
     */
    public static void printEdge() {
        System.out.print("+");
        for (int i = 1; i <= (2 * ROCKET_SIZE); i++) {
            System.out.print("=*");
        }
        System.out.println("+");
    }


}