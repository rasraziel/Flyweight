package Problem;

public class Point {
    private int x; //4 bytes
    private int y; //4 bytes
    private PointType type; //4 bytes
    private String icon; //20 KB (if we have a proper jpg)

    public Point(int x, int y, PointType type, String icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
    }

    public void draw(){
        System.out.printf("%s %s at (%d,%d)\n",icon, type, x, y);

    }
}
