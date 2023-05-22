package ss12_collection_framework.exercise.treemap_key;

import java.util.LinkedHashMap;
import java.util.Map;

public class TreeMapKey {
    public void treeMap(String string) {
        String upperCaseString = string.toUpperCase();
        String[] arrayKey = upperCaseString.split(" ");
        Map<String, Integer> treeMapKey = new LinkedHashMap<>();
        for (int i = 0; i < arrayKey.length; i++) {
            if (treeMapKey.containsKey(arrayKey[i])) {
                treeMapKey.replace(arrayKey[i], treeMapKey.get(arrayKey[i] + 1));
            } else {
                treeMapKey.put(arrayKey[i], 1);
            }
        }
        for (String key : treeMapKey.keySet()) {
            System.out.println("Key :" + key + " .giá trị :" + treeMapKey.get(key));
        }
    }
}
