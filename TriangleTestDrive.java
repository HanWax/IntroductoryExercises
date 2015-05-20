/**
 * Created by hannahwaxman on 20/05/15.
 */
public class TriangleTestDrive {

    public static void main(String[] args) {
        Triangle t = new Triangle();
        System.out.println("Printing one asterix:");
        t.printAsterix();
        System.out.println("Drawing a horizontal line:");
        t.printHorizontalLine("*", 10);
        System.out.println();
        System.out.println("Drawing a vertical line:");
        t.printVerticalLine(3);
        System.out.println("Drawing a right angled triangle:");
        t.printRightTriangle(3);
        System.out.println("Drawing an isosceles triangle:");
        t.printIsoscelesTriangle(3);
        System.out.println("Drawing a diamond:");
        t.printDiamond(3);
        System.out.println("Drawing a named diamond:");
        t.printNamedDiamond(3, "Hannah");
    }
}
