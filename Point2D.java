public class Point2D {
    private double x;
    private double y;
    public Point2D(double x, double y){
        this.x=x;
        this.y=y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double distanceTo(double p2x,double p2y){
        double result=Math.sqrt(Math.pow((p2x-x),2)+Math.pow((p2y-y),2));
        return result;
    }
    public String toString(){
        String result = "("+x+", "+y+")";
        return result;
    }




    public static void main(String[] args) {
        Point2D point2d = new Point2D(2.5, 1.0);
        System.out.println(point2d.distanceTo(5, 3));
        System.out.println(point2d.toString());
    }
}
