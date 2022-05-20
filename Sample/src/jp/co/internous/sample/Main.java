package jp.co.internous.sample;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//10~19行目　メインクラスのメインメソッドの記述。
		//10行目・・・実体(インスタンス)の生成。
		User user1 = new User();
		//11~12行目・・・Userクラスに定義されたメソッドを使い、user1インスタンスにユーザー名と電話番号をセット。
		user1.setFullName("鈴木 一郎");
		user1.setTelephoeNo("090-1111-2222");
		//15~16行目・・・Userクラスに定義されたメソッドを使い、user1インスタンスから取得した情報を変数に代入.
		
		String fullName = user1.getFullName();
		String telNo = user1.getTelephoneNo();
		
		System.out.println(fullName);
		System.out.println(telNo);
		
		//23行目・・・商品クラスからは、商品のインスタンスを生成する設定。
		Goods goods = new Goods();
		//25行目・・・商品インスタンスの１つである、商品名を"Tシャツ"として設定。
		goods.setGoodsName("Tシャツ");
		//27行目・・・商品インスタンスの１つである、価格を1000として設定。
		goods.setPrice(1000);
		//29行目・・・ユーザーインスタンス購入機能(purchaseメソッド）を呼び出し、メッセージ文を取得する。
		String message = user1.purchase(goods);
		//31行目・・・メッセージをコンソールに表示。
		System.out.println(message);
		

	}

}
