package JavaMethods;


public class CollinearityOf3Points {

    // Method to check collinearity using slope formula
    public static boolean arePointsCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean arePointsCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
        // Sample points A(2, 4), B(4, 6), C(6, 8)
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;

        // Check collinearity using slope formula
        boolean collinearSlope = arePointsCollinearSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear (using slope)? " + collinearSlope);

        // Check collinearity using area of triangle formula
        boolean collinearArea = arePointsCollinearArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear (using area)? " + collinearArea);
    }
}