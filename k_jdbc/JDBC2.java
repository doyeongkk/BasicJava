package k_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2{

	public static void main(String[] args) {
		

	


String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
String user = "doyeong";
String password = "java";

//닫을때는 역순으로 r부터 닫는다

Connection con = null;
PreparedStatement ps = null;
ResultSet rs = null; 


	try {
	con = DriverManager.getConnection(url, user, password);
	
	
	String sql = "select * from cart where cart_member = ?";
	
	ps = con.prepareStatement(sql);
	ps.setString(1, "a001");  //첫번째있는 ?에 a001을 넣겠다. 
//	ps.setInt(2, 10);
//	ps.setDate(3, new Date(new java.util.Date().getTime()));
	
	rs = ps.executeQuery();
	
	ResultSetMetaData md = rs.getMetaData(); // 메타데이터: 데이터에 대한 데이터 
	
	
   int columnCount = md.getColumnCount(); //조회된 컬럼의 수 
   
   while(rs.next()){
	   for(int i = 1; i <= columnCount; i ++){
		   Object value = rs.getObject(i);
		   System.out.print(value + "\t");
	   }
       System.out.println();
  
   }
   
   //임이의 테이블에 insert할 수 있는 코드를 작성해주세요.
  sql = "insert into dept values(?, ?, ?)";
  ps = con.prepareStatement(sql);
  ps.setInt(1, 50); 
  ps.setString(2, "TEST");
  ps.setString(3,"DAEJEON");
  
  int result =  ps.executeUpdate();
  System.out.println(result + "개의 행이 바뀌었습니다.");
  
  
} catch (SQLException e) {
	e.printStackTrace();
} finally {
	if(rs != null) try { rs.close(); } catch (Exception e){}
	if(ps != null) try { ps.close(); } catch (Exception e){}
	if(con != null) try { con.close(); } catch (Exception e){}
			}
}
}