package jp.co.internous.sample;

public class User {
	/* 5行目は「氏名」。6行目は「電話番号」の属性(フィールド)を設定。*/
	private String fullName;
	private String telephoneNo;
    /*8~9行目では「氏名」を設定するための振る舞い（メソッド）を設定。*/
	public void setFullName(String fullName ) {
		this.fullName = fullName;
	}
	/*12~13行目では 「氏名」をシステムに開示するという振る舞い（メソッド）を設定。*/
	public String getFullName() {
		return fullName;
	}
	 /*16~17行目では「電話番号」を設定するための振る舞い（メソッド）を設定。*/
    public void setTelephoeNo(String telephoneNo) {
    	this.telephoneNo = telephoneNo;
    }
    /*20~21行目では 「電話番号」をシステムに開示するという振る舞い（メソッド）を設定。*/
    public String getTelephoneNo() {
    	return telephoneNo;
    }
    /*24行目の商品クラス(Goods goods)は、新たに購入する商品の情報を受け取る一文。*/
    public String purchase(Goods goods) {
    	String message = goods.getGoodsName() + "を";
    	message += goods.getPrice() + "円で購入しました。";
    	
    	return message;
    }
    
    
    
    
}
