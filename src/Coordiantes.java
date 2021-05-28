import java.util.Scanner;

class Point {
    double x=0.0d,y=0.0d;
    Point(double x1, double y1){
        x = x1;
        y = y1;
    }
}
public class Coordiantes {
    public static double distance(Point P1, Point P2){
        double distance = 0.0d;
        double diff1 = Math.pow(Math.abs(P1.x - P2.x),2);
        double diff2 = Math.pow(Math.abs(P1.y - P2.y),2);
        distance = Math.sqrt(diff1+diff2);
        return distance;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int x,y;
        System.out.println("Enter x and y coordinates for first point");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p1 = new Point(x,y);
        System.out.println("Enter x and y coordinates for second point");
        x = sc.nextInt();
        y = sc.nextInt();
        Point p2 = new Point(x,y);
        double dist = distance(p1,p2);
        System.out.println("Distance between points -> "+dist);
        sc.close();
    }
}
