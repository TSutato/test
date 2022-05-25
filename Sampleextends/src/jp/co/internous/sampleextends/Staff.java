package jp.co.internous.sampleextends;

public class Staff extends Person {
	
	private int staffNo;  //社員番号のフィールド
	 public Staff (String name) {
	  super(name);
	 }
	 
	 public Staff(String name,int gender, int staffNo) {
		 super(name);
		 this.staffNo = staffNo;
	 }
	 
	 public void work(String job) { //働くのメソッド
		 System.out.println("私は" + job + "の仕事をします。");
	 }
	 
	 public int getStaffNo() {
		 return staffNo;
	 }
	 
	 public void setStaffNo(int staffNo) {
		 this.staffNo = staffNo;
	 }
	

}
