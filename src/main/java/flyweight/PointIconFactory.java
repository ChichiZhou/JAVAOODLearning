package flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> icons = new HashMap<>();

    public PointIcon getPointIcon(PointType type){
        if (!icons.containsKey(type)){
            PointIcon pointIcon = new PointIcon(type, null);
            icons.put(type, pointIcon);
        }

        return icons.get(type);
    }
}
