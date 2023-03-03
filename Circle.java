public class Circle {
    private Point2D point2d;
    private double diam;
public Circle(Point2D point2d, double diam){
    this.point2d=point2d;
    this.diam=diam;
}




    public static void main(String[] args) {
        Point2D point2d = new Point2D(2.5, 1.0);
        System.out.println(point2d.toString());
        
    }



}
