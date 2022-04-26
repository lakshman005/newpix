package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Markmoviesdao {
	
	public static void unavailbale(int moviesid) {
		String sql ="delete from movie where id =(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setInt(1,moviesid);
			 stmt.executeUpdate();

		} catch (SQLException e) {
			Util.displayMessage(e);
		}
		
	}

}
