package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.Model.Top5Movies;

public class Searchmoviesdao {
	public static void search(String moviename){
		String sql = "select * from movie where name like (?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setString(1,"%" + moviename + "%");
			 ResultSet rs= stmt.executeQuery();
			 System.out.printf("%5s  %-32s %-10s  %s\n","ID","name","genre","year");
			 System.out.printf("%5s  %-32s %-10s  %s\n","==","====","=====","====");
			 while(rs.next()) {
				 //System.out.print("[ID ="+rs.getInt("id")+"]" + "   -------- >     ");
				 //System.out.println(rs.getString("name")); 
				 System.out.printf("%5d  ",rs.getInt("id"));
				 System.out.printf("%-33s",rs.getString("name"));
				 System.out.printf("%-10s",rs.getString("genre"));
				 System.out.printf("  %4d\n",rs.getInt("year"));
				 
			 }
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		System.out.println("================================================================");
		
	}

}
