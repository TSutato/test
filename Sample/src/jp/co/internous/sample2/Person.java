package jp.co.internous.sample2;

public class Person {
	
	private String name;
	private String from;
	
	public Person (String name, String from) {
		this.name = name;
		this.from = from;
	}
	
	public String from() {
		return from;
	}
	
	
	public void introduce() {
		System.out.println("私は"+ name + "です。" + from + "出身です。" );
	}
	
	public void introduce(String overMessage) {
		introduce();
		System.out.println(overMessage);
	}


}
