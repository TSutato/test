package jp.co.internous.sample3;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Person p = new Person( "太郎");
		
		/*アクセス修飾子が「public」の場合、値に著癖悦アクセスし、不正な変更が可能となってしまうため、
		 * アクセス修飾子はprivateとし、ゲッターとセッターを利用して変更や開示を行う。*/
		p.name="三郎";
		
		String message = p.name;
		System.out.println(message);

	}

}
