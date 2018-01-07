package flyweight.forest.app;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * FlyweightFactory - Creates and manages flyweight objects.
 */
public class TreeFactory {

    public static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }

        return result;
    }
}
