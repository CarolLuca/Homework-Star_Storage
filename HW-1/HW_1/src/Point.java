public class Point {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(){
        x=0;
        y=0;
    }

    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    public double distance(Point other){
        return Math.sqrt((double)((other.x-x)*(other.x-x)+(other.y-y)*(other.y-y)));
    }
    public double distance(){
        return distance(new Point(0,0));
    }
}
