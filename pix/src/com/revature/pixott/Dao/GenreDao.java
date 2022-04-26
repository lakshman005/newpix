package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GenreDao {
	public static void genre(String name) {
		String sql = "select * from movie where genre = (?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setString(1,name);
			  ResultSet rs =stmt.executeQuery();
			  System.out.printf("     %-38s  %s\n","Movie","Genre");
			  System.out.printf("     %-40s%s\n","=====","=====");
			  while(rs.next()) {
				  System.out.printf("  %-40s  %s\n",rs.getString("name"),rs.getString("genre"));
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
	}

}
