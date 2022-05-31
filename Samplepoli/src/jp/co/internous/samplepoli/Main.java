package jp.co.internous.samplepoli;

public class Main {

	public static void main(String[] args) {
		Japanese p1 = new Japanese();
		String aisatsu1 = p1.greeting("田中");
		System.out.println(aisatsu1);
		
		American p2 = new American();
		String aisatsu2 = p2.greeting("マイケル"); 
        System.out.println(aisatsu2);
        
        Chinese p3 = new Chinese();
        String aisatsu3 = p3.greeting("ワン");
        System.out.println(aisatsu3);
        	
	}

}
