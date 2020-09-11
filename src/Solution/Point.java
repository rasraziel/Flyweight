package Solution;

public class Point {
  private int x;  // 4 bytes
  private int y;  // 4 bytes
  private PointIcon icon;

  public Point(int x, int y, PointIcon icon) {
    this.x = x;
    this.y = y;
    this.icon = icon;
  }

  public void draw() {
    System.out.printf("%s %s at (%d, %d)\n", icon.getIcon(), icon.getType(), x, y);
  }
}
