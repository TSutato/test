package jp.co.internous.sampleextends;

/*継承の書き方は、public class　子クラス(継承するクラス）　expands　親クラス(継承されるクラス）{}*/
  public class Student extends Person { 
	 public Student(String name) { 
/*super()は親クラスのコンストラクタを呼び出す。記載しなくてもPersonクラスのコンストラクタは呼び出されるが引数を渡す必要があるときは記載する。*/
	  super(name);
  }
  
  public void study(String subject) {
	 System.out.println(subject + "を勉強します。");
  }


}
