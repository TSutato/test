package jp.co.internous.sample;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person p1 = new Person("太郎","山田");
		p1.setBirthday("1995/1/12");
		p1.getBirthday();
		p1.setAge(22);
		p1.getAge();
		p1.jikoshokai();
		
		Person p2 = new Person("花子","田中","1989/3/5",30);
		p2.jikoshokai();
	}
	
	

}
