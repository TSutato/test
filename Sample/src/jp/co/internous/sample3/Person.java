package jp.co.internous.sample3;

public class Person {
	/*本来はアクセス修飾子privateで指定されている値を外部から変更・アクセス不可能にする。*/
	public String name;

	public Person(String name) {
		this.name = name;
	}
	/*get(ゲッター),set(セッター）メソッドを利用することで、アクセス修飾子privateで指定されている値も、直接フィールドにアクセスすることなく変更・開示が可能。*/
	public String getName(String name) {
		return name;
	}
	
	public void setName(String name) {
		this.name =name;
	}
	
	public String introduce() {
		String message  = "私の名前は" + name + "です。";
		return message;
	}

}
