package Solution;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
  private Map<PointType, PointIcon> icons = new HashMap<>(){{
    put(PointType.HOSPITAL, new PointIcon(PointType.HOSPITAL, "⛨"));
    put(PointType.CAFE, new PointIcon(PointType.CAFE, "☕"));
    put(PointType.RESTAURANT, new PointIcon(PointType.RESTAURANT, "\uD83C\uDF7D"));
  }};

  public PointIcon getPointIcon(PointType type) {
    if (!icons.containsKey(type)) {
      var icon = new PointIcon(type, null);
      icons.put(type, icon);
    }

    return icons.get(type);
  }
}
