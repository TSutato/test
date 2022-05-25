package jp.co.internous.sample;

public class Student {
	/*属性(フィールド)には「name」という名前を設定。*/
	private String name;
	/*コンストラクタを記載。*/
	public Student() {
	    this.name = "佐藤花子";
		
	}
	 /*「氏名」を設定するための振る舞いとシステムに開示する（メソッド）を設定。*/
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	 /*「自己紹介]の振る舞い（メソッド）を設定。*/
	public void introduceName() {
		System.out.println("私の名前は" + name +  "です。");
	}

}
