package Solution;

public class PointIcon {
  private final PointType type; // 4 bytes

  private final String icon;    // 20 KB -> 20 MB

  public PointIcon(PointType type, String icon) {
    this.type = type;
    this.icon = icon;
  }

  public PointType getType() {
    return type;
  }
  public String getIcon() { return icon; }
}
