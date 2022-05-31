/*Map使用によるインスタンスの生成方法。・*/

package test;

import java.util.HashMap;
import java.util.Map;


public class MapSample {

	public static void main(String[] args) {
		/*Mapインスタンスのキーの型が、String、値の型が、Integerとして生成。*/
		Map<String, Integer> testMap = new HashMap<>();
		/*Mapインスタンスのキーが"Taro"値が30という1要素を追加。List、Setがaddメソッドを使用するに対して,
		 *Mapではputメソッドを使用。*/
		testMap.put("Taro", 30);
		/*"Taro"というキーに対応する値をgetメソッドで取得。*/
		int point = testMap.get("Taro");
		/*int pointに対応する値(30)が表示される。*/
		System.out.println(point);
	}

}
