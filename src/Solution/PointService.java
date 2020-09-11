package Solution;

import java.util.ArrayList;
import java.util.List;

public class PointService {
  private PointIconFactory iconFactory;

  public PointService(PointIconFactory iconFactory) {
    this.iconFactory = iconFactory;
  }

  public List<Point> getPoints() {
    List<Point> points = new ArrayList<>();
    points.add(new Point(1, 2, iconFactory.getPointIcon(PointType.RESTAURANT)));
    points.add(new Point(3, 7, iconFactory.getPointIcon(PointType.CAFE)));
    points.add(new Point(8, 7, iconFactory.getPointIcon(PointType.HOSPITAL)));
    points.add(new Point(7, 4, iconFactory.getPointIcon(PointType.HOSPITAL)));
    points.add(new Point(13, 7, iconFactory.getPointIcon(PointType.RESTAURANT)));
    points.add(new Point(56, 8, iconFactory.getPointIcon(PointType.CAFE)));
    return points;
  }
}
