package k_jdbc;

 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

 

public class JDBCUtil {

	

	//싱글톤 패턴 : 인스턴스의 생성을 제한하여 하나의 인스턴스만 사용하는 디자인 패턴
	private JDBCUtil(){
	}

	//인스턴스를 보관할 변수
	private static JDBCUtil instance;
	//인스턴스를 빌려주는 메서드
	public static JDBCUtil getInstance(){
		if(instance == null){
			instance = new JDBCUtil();

		}

		return instance;

	}

	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "doyeong";
	private String password = "java";
	
	private Connection con = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;

	

	/*
	 * Map<String, Object> selectOne(String sql)
	 * Map<String, Object> selectOne(String sql, List<Object> param)
	 * List<Map<String, Object>> selectList(String sql)
	 * List<Map<String, Object>> selectList(String sql, List<Object> param)
	 * int update(String sql)
	 * int update(String sql, List<Object> param)
	 */

	
//1
	public Map<String, Object> selectOne(String sql){
		Map<String, Object> map = new HashMap<>();

	
		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

		
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();

			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
					map.put(key, value);
				}

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}

		}

		return map;

	}
	
//2
	public Map<String, Object> selectOne(String sql, List<Object> param){
		Map<String, Object> map = new HashMap<>();
		try {
       con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));
			}
			rs = ps.executeQuery();
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();

			while(rs.next()){
				for(int i = 1; i <= columnCount; i++){
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
					map.put(key, value);

				}

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}

		}

		return map;

	}

//3
	public List<Map<String, Object>> selectList(String sql){
		List<Map<String, Object>> list = new ArrayList<>();

		try {

			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();

			
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();

			while(rs.next()){
				Map<String, Object> row = new HashMap<>();
				for(int i = 1; i <= columnCount; i++){
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);

				}

				list.add(row);

			}

		} catch (SQLException e) {
			e.printStackTrace();

		}

		return list;

	}

//4
	public List<Map<String, Object>> selectList(String sql, List<Object> param){
		List<Map<String, Object>> list = new ArrayList<>();   //리턴을 해줘야 하기때문에 try밖에서 생성해야한다.

		try {

			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);

			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));

			}

			rs = ps.executeQuery();

	
			ResultSetMetaData md = rs.getMetaData();
			int columnCount = md.getColumnCount();

			while(rs.next()){

				Map<String, Object> row = new HashMap<>();    //while문 밖에 있으면 제대로 저장이 안된다.
				for(int i = 1; i <= columnCount; i++){
					String key = md.getColumnName(i);
					Object value = rs.getObject(i);
					row.put(key, value);

				}

				list.add(row);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		}finally {

			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}

		}
		return list;

	}

	
//5
	public int update(String sql){

		int result = 0;
		try {

			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);

			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}

		}

		return result;

	}

		
//6          
	public int update(String sql, List<Object> param){
		int result = 0;

		try {
			con = DriverManager.getConnection(url, user, password);
			ps = con.prepareStatement(sql);


			for(int i = 0; i < param.size(); i++){
				ps.setObject(i + 1, param.get(i));
			}
			result = ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}finally {

			if(rs != null) try {rs.close();} catch(Exception e) {}
			if(ps != null) try {ps.close();} catch(Exception e) {}
			if(con != null) try {con.close();} catch(Exception e) {}
		}

		return result;

	}

}

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 


