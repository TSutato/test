import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class TestUserDAO {
	
	String name = "";
	String password =  "";
	
	
	public void select(String name, String password) {
		/*DBへの接続の準備。mySQLにログイン*/
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
	    /*?は「プレースホルダ」と言い、その都度違うデータを入れたい時に使用。*/
		String sql = "select*from test_table where user_name=? and password=?";
		try {
			/*PrepareStatementとは、DBまで運んでくれる箱のようなもの。*/
			PreparedStatement ps =con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, password);
			/*executeQuery();は実行メソッドで、必ずResultSetが返ってくる。*/
			ResultSet rs=ps.executeQuery();
			/*一行目をずらし、データがあるなら"user_name"と"password"の戻り値を返す（データを抽出する。)。*/
			if (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			/*con.cleseすることでデータベースとの接続を終了させてメモリの負荷を減らす。*/
			con.close() ;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	/*データを全て選び、全て抽出する実行。*/
	public void selectAll() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql = "select*from test_table";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			/*53~56行目・・・カーソルを1行ずつ実行していき、データ無くなったら終了する。*/
			while (rs.next()) {
				System.out.println(rs.getString("user_name"));
				System.out.println(rs.getString("password"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
	}
	/*名前を選ぶことで、対象となるデータ(user_name,password）の抽出を実行。*/
	public void selectByName(String name) {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		
		String sql="select*from test_table where user_name=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
            ResultSet rs=ps.executeQuery();
            while(rs.next()) {
            	System.out.println(rs.getString("user_name"));
            	System.out.println(rs.getString("password"));
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			con.close();
		} catch (SQLException e) {	
			e.printStackTrace();
		}
	}
	/*パスワードを選ぶことで、対象となるデータ(user_name,password)の抽出を実行*/
    public void selectByPassword(String password) {
    	DBConnector db = new DBConnector();
    	Connection con = db.getConnection();
    	
    	String sql ="select*from test_table where password=?";
    	try {
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setString (1, password);
    		ResultSet rs=ps.executeQuery();
    		while (rs.next()) {
    			System.out.println(rs.getString("user_name"));
    			System.out.println(rs.getString("password"));
    		}
    	} catch(SQLException e) {
    		e.printStackTrace();
    	}
    	try {
    		con.close();
    	} catch (SQLException e ) {
    		e.printStackTrace();
    	}
    }
    
    /*名前変更の際に、「〜件更新されました」の更新メッセージを表示する。*/
    
    public void updateUserNameByUserName(String oldName,String newName) {
    	DBConnector db = new DBConnector();
    	Connection con = db.getConnection();
    	
    	String sql ="update test_table set user_name=? where user_name=?";
    	try {
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setString(1, newName);
    		ps.setString(2, oldName);
    		/*executeUpdate()は、データの件数（値)を返している為、int型を使用する。*/
    		int i=ps.executeUpdate();
    		if (i>0) {
    			System.out.println(i+"件更新されました");
    		} else {
    			System.out.println("該当するデータはありませんでした");
    		}
     	} catch (SQLException e ) {
     		e.printStackTrace();
     	}
    	try {
    		con.close() ;
    	} catch (SQLException e ) {
    		e.printStackTrace();
    	}
    }
    
    /*データ(ID,name,password)の挿入の際に、「〜件登録されました。」の登録メッセージを表示する。*/
    
    public void insert(int user_id, String name, String password) {
    	DBConnector db = new DBConnector();
    	Connection con = db.getConnection();
    	
    	String sql ="insert into test_table values(?,?,?)";
    	try {
    		PreparedStatement ps = con.prepareStatement(sql);
    		ps.setInt(1, user_id);
    		ps.setString(2, name);
    		ps.setString(3, password);
    		int i=ps.executeUpdate();
    		if(i>0) {
    			System.out.println(i+ "件登録されました");
    		}
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    	try {
    		con.close();
    	} catch (SQLException e) {
    		e.printStackTrace();
    	}
    }
    
    /*データの削除の際に、「〜件削除されました」のメッセージを表示する。*/
   public void delete(String name) {
	   DBConnector db = new DBConnector();
	   Connection con = db.getConnection();
	   
	   String sql ="delete from test_table where user_name=?";
	   try {
		   PreparedStatement ps = con.prepareStatement(sql);
		   ps.setString(1, name);
		   int i=ps.executeUpdate();
		   if (i>0) {
			   System.out.println(i + "件削除されました");
		   }
	   } catch (SQLException e) {
		   e.printStackTrace();
	   }
	   try {
		   con.close();
	   } catch (SQLException e) {
		   e.printStackTrace();
	   }
   }
}
