package org.design.pattern.chapter11;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

/**
 * 实现实例要求的功能
 * @author YAO
 *
 */
public class UserManager {

	public Collection<UserModelApi> getUserByDepId(String depId) throws Exception {
		Collection<UserModelApi> col = new ArrayList<>();
		Connection conn = null;
		try {
			conn = this.getConnection();
			String sql = "select u.userId, u.name " + " from tbl_user u,tbl_dep d "
					+ "where u.depId=d.depId and d.depId like ? ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, depId + "%");
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {

				//这里是创建的代理对象，而不是直接创建UserModel上的对象
				Proxy proxy = new Proxy(new UserModel());
				//只是设置userId和name两个值就可以死了
				proxy.setUserId(rs.getString("userId"));
				proxy.setName(rs.getString("name"));
				col.add(proxy);
				
			}
			rs.close();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				conn.close();
			}
		}
		
		return col;
	}
	
	/**
	 * 获取与数据库的连接
	 * @return 数据库连接
	 * @throws Exception 
	 */
	private Connection getConnection() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");	//加载驱动
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/designpattern","root","yao1243");
	}
}
