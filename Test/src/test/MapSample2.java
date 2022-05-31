/*Mapにエントリーされている要素（キーと値の両方）を取得する方法。*/

package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapSample2 {

	public static void main(String[] args) {
		
	    Map<String, Integer> testMap = new HashMap<>();
	    
	    testMap.put("Taro",(30));
	    testMap.put("Ichiro", 60);
	    testMap.put("Jiro", 45);
	    /*MapのentrySetメソッドは、そのMapが持つ要素（キーと値）をSet型で返す。*/
	    /*entry.getKey()から各キーを取得し、entry.getValue()から各値を取得する。*/
	    for( Entry<String, Integer> entry :testMap.entrySet()) {
	    	System.out.println(entry.getKey() + "の点数は" + entry.getValue());
	    }
	}

}
