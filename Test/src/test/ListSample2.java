/*既存の配列からListを生成する方法と、追加した要素をループ処理で表示させる方法。*/

package test;

import java.util.Arrays;
import java.util.List;

class ListSample2 {
	/*"Sun"から"Sat"までの英語略曜日が配列として定義済*/
	static final String[] WEEK = {"Sun","Mon","Tue","Wed", "Thu","Fri","Sat"};
	
	public static void main(String[] args) {
	/*Arrayクラスが持つstatic メソッドのasListを使い簡単にListを生成出来る。*/
	  List<String> week = Arrays.asList(WEEK);
	 
	  /*拡張forループを使い、indexを使わず各要素を表示可能*/
	  for (String day:week) {
		  System.out.println(day);
	  }

	}

}
