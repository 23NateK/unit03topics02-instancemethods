public class Circle {
    private Point2D point2d;
    private double radius;
public Circle(Point2D point2d, double radius){
    this.point2d=point2d;
    this.radius=radius;
}
public Double getArea() {
    Double result = Math.PI*Math.pow(radius,2);
    return result;
}
public Double getCircumference() {
    Double result = 2*Math.PI*radius;
    return result;
}
public boolean intersectWith(Circle Circle2){
    Double X2 = Circle2.point2d.getX();
    Double Y2 = Circle2.point2d.getY();
if(this.radius>this.point2d.distanceTo(X2, Y2)+Circle2.radius){
    return false;
}else if (this.point2d.distanceTo(X2, Y2)<this.radius+Circle2.radius){
    return true;
}
    return false;
}
public boolean contains(Circle Circle2){
    Double X2 = Circle2.point2d.getX();
    Double Y2 = Circle2.point2d.getY();
if(this.radius>this.point2d.distanceTo(X2, Y2)+Circle2.radius){
    return true;
}
return false;
}



    public static void main(String[] args) {
        Point2D point2d = new Point2D(2.5, 1.0);
        Circle Circle1 = new Circle(point2d, 5.0);
        Point2D point2d2 = new Point2D(4, 1.0);
        Circle Circle2 = new Circle(point2d2, 3.0);
        System.out.println(Circle1.intersectWith(Circle2));
        
    }



}
