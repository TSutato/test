/*「mySQl-connector-java-5.1. 46-bin. jar」を使用しJavaとデータベースを繋げるコード*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnector {
	/*JDBCのドライバー(Javaとデータペースを繋げるもの）名を変数に代入。*/
	private static String driverName = "com.mysql.jdbc.Driver";
    /*mysql用のURLの指定の仕方になり、localhost(自分の使っているPC)testdb(データベース名）を使う。*/
	private static String url =
			"jdbc:mysql://localhost/testdb?autoReconnect=true&useSSL=false";
    /*rootアカウントに内するパスワードを、上記の通りlocalhost（自分の使っているPC)としていることから、今回は自分が使用しているMySQLの"root"と指定する。*/
	/*もし、パスワードを指定しない場合は、「private static String password = "";」と変更する。」*/
    private static String user = "root";
    private static String password = "root";
    
    /*データベースに接続するメソッド*/
    public Connection getConnection() {
    	
    	/*接続状態をnull（何もない状態）に初期化*/
    	Connection con = null;
    	
    	/* try~catchはJavaの例外処理の為の構文。try内にエラーが発生しそうな処理を書く。
    	 * 発生した場合、　catchが受け取り、printStackTraneでエラーに至る履歴を表示。
    	 * 今回は、①ClassnotFoundException(クラスが見つからない場合の例外)、②SQLException(データベース処理に関する例外)である。*/
    	try {
    		/*27~28行目。ドライバーがロードされ、使える状態にする。 */
    		Class.forName(driverName);
    		con = DriverManager.getConnection(url,user,password);
    	} catch (ClassNotFoundException e) {
    		e.printStackTrace();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	return con ;
    }
}