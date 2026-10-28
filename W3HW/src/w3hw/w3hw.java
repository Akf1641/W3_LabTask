package w3hw;

public class w3hw {
    public static void main(String[] args) {
        int[][] points = {{1, 1}, {2, 3}, {3, 2}};
        
        int x1 = points[0][0];
        int y1 = points[0][1];
        int x2 = points[1][0];
        int y2 = points[1][1];
        int x3 = points[2][0];
        int y3 = points[2][1];

        // Area of triangle with 3 vertices
        double area = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) * 0.5;
        double treshold = 0.0000001;
        if (Math.abs(area) < treshold){
            System.out.println(false);
        }
        else{
            System.out.println(true);
        }
    }
}
