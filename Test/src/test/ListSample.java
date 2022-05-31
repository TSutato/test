/*List使用による、データの追加と取得方法*/

package test;

/*「Java.util」というパッケージ内にある「List」を呼び出すという意味。」*/
import java.util.ArrayList;
import java.util.List;

 class ListSample {

	public static void main(String[] args) {
	
    /*String の要素を持つリストをインスタンス生成。*/	
	List<String> users = new ArrayList<>();
	
	/*リストの要素をaddメソッドより追加。上記の通り<String>で生成しているため、文字列以外は追加不可。*/
	
	users.add("Taro");
	users.add("Ichiro");
	users.add("Jiro");
	
	/*要素の取得にはget(index)メソッドを使う。 indexは配列と同様、zeroから開始する。*/
	
	String user1 = users.get(0);
	String user2 = users.get(1);
	String user3 = users.get(2);
	
	/*それぞれ、"Taro"、"Ichiro"、"Jiro"が表示される。*/
	System.out.println( user1 );
	System.out.println( user2 );
	System.out.println( user3 );
	}

}
