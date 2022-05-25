package jp.co.internous.practice;

public class Pets extends Animal {
	
	public String name;
	//Animal　クラスより継承。
	public Pets(String kind) {
     super (kind);
	}
	
	public void keep(){
		System.out.println(name + "という"+ size + kind +"を飼っています。");
	}
	
    public void setName(String name) {
    	this.name= name;
    }
    
    //extendsでAnimalよりクラスを継承し、sizeに値をセットするためのコードがここに必要になってくる。
	public void setSize(String size) {
		this.size = size;
		
	}

}
