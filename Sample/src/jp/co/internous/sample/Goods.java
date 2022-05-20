package jp.co.internous.sample;

public class Goods {
	/* 5行目は「商品名」。6行目は「価格」の属性(フィールド)を設定*/
	private String goodsName;
	private int price;
	 /*8~9行目では「商品名」を設定するための振る舞い（メソッド）を設定。*/
	public String getGoodsName() {
		return goodsName;
	}
	/*12~13行目では 「商品名」をシステムに開示するという振る舞い（メソッド）を設定。*/
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	 /*16~17行目では「価格」を設定するための振る舞い（メソッド）を設定。*/
	public int getPrice() {
		return price;
	}
	  /*20~21行目では 「価格」をシステムに開示するという振る舞い（メソッド）を設定。*/
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
