package jp.co.internous.sample;

public class Person {
	
	private String firstName;
	private String familyName;
	private String birthday;
	private int age;
	
	/*firstNameとfamilyNameを引数として設定したコンストラクタを追加。Personクラスをインスタンス化するとき姓と名も同時に設定する。*/
	public Person(String firstName,String familyName) {
		this.firstName = firstName;
		this.familyName = familyName;
	}
	/*firstNameとfamilyNameを引数として設定したコンストラクタを追加。Personクラスをインスタンス化するとき姓と名も同時に設定する。*/
	public Person(String firstName,String familyName,String birthday, int age) {
		this.firstName = firstName;
		this.familyName = familyName;
		this.birthday = birthday;
		this.age = age;
	}
	
	/*上記のコンストラクタ追加とPersonクラスをインスタンス化する際に姓を設定出来るので省略*/
	/* public void setFirstName(String firstName) {
		this.firstName = firstName;
	} */
	
	public String getFirstName() {
		return firstName;
	}
	/*上記のコンストラクタ追加とPersonクラスをインスタンス化する際に姓を設定出来るので省略*/
	/* public void setFamilyName(String familyName) {
		this.familyName = familyName;
	} */
	
	public String getFamilyName() {
		return familyName;
	}
	
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
	public String getBirthday() {
		return birthday;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void jikoshokai() {
		System.out.println(familyName + firstName +  "です。" + birthday +"生まれの" + age +"歳です。");
	}
}
