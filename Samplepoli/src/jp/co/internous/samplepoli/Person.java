package jp.co.internous.samplepoli;

public interface Person {
	/*インターフェイスのメソッドではprivateのようなアクセス修飾子無し。*/
   /*他のクラスから実装される前提として存在しており、インターフェース単体ではインスタンス化出来ない。
    そのため、メソッドのアクセス修飾子を省略した場合は自動的にpublicとなる。*/
  
   String greeting(String name);
}
