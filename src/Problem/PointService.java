package Problem;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(1, 2, PointType.RESTAURANT, "\uD83C\uDF7D"));
        points.add(new Point(3, 7, PointType.CAFE, "☕"));
        points.add(new Point(8, 7, PointType.HOSPITAL, "⛨"));
        points.add(new Point(7, 4, PointType.HOSPITAL, "⛨"));
        points.add(new Point(13, 7, PointType.RESTAURANT, "\uD83C\uDF7D"));
        points.add(new Point(56, 8, PointType.CAFE, "☕"));
        return points;
    }
}
