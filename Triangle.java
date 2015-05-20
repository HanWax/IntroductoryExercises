import java.util.Formatter;

public class Triangle {


    // Print one asterisk to the console.

    public void printAsterix() {
        System.out.println("*");
    }

    //Given a number n, print n asterisks on one line.

    public void printHorizontalLine(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(s);
        }
    }

    //Given a number n, print n lines, each with one asterisks
    public void printVerticalLine(int n) {
        for (int i = 0; i < n; i++)
            System.out.println("*");
    }

    //Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
    public void printRightTriangle(int n) {
        for (int i = 0; i <= n; i++) {
                printHorizontalLine("*", i);
                System.out.println();
        }
    }

    //Given a number n, print a centered triangle.

    public void printIsoscelesTriangle(int n) {
        int baseLine = (2 * n) - 1;

        for (int i = 0; i < n; i++) {
            int asterixNumber = (2 * i) + 1;
            int spaceNumber = (baseLine - asterixNumber) / 2;

            printHorizontalLine(" ", spaceNumber);
            printHorizontalLine("*", asterixNumber);
            System.out.println();
        }
    }

    public void printInverseIsosceles(int n) {
        int baseLine = (2 * n) - 1;

        for (int i = 1; i <= n; i++) {
            int spaceNumber = i - 1;
            int asterixNumber = baseLine - (2 * spaceNumber);

            printHorizontalLine(" ", spaceNumber);
            printHorizontalLine("*", asterixNumber);
            System.out.println();
        }
    }

    public void printSpacedInverseIsosceles(int n) {
        int baseLine = (2 * n) - 1;

        for (int i = 1; i <= n; i++) {
            int spaceNumber = i;
            int asterixNumber = baseLine - (2 * spaceNumber);

            printHorizontalLine(" ", spaceNumber);
            printHorizontalLine("*", asterixNumber);
            System.out.println();
        }
    }


    // Given a number n, print a centered diamond.
    public void printDiamond(int n) {
        printIsoscelesTriangle(n);
        printSpacedInverseIsosceles(n);
    }

    // Given a number n, print a centered diamond with your name in place of the middle line.

    public void printNamedDiamond(int n, String name) {
        printIsoscelesTriangle(n - 1);
        System.out.println(name);
        printInverseIsosceles(n - 1);
    }

}