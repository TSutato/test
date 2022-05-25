package jp.co.internous.sampleextends;

public class Main {

	public static void main(String[] args) {
		/*Studentクラスをインスタンス化し、引数は「Taro」。*/
		Student s = new Student("Taro");
		/*setterで「Jiro」に再設定*/
		s.setName("Jiro");
		/*getterで「jiro」を開示。*/
		System.out.println(s.getName());
		/*Studentクラスのメソッドを実行。*/
		s.study("英語");
		
		Staff var = new Staff("Jiro");
		var.work("建築士");

	}

}
