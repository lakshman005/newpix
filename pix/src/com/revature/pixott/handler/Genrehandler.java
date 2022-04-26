package com.revature.pixott.handler;

import com.revature.pixott.Dao.GenreDao;
import com.revature.pixott.app.App;

public class Genrehandler {
	public static void ans() {
		System.out.println("1) Comedy");
		System.out.println("2) Drama");
		System.out.println("3) Animation");
		System.out.println("4) Romance");
		System.out.println("5) Fantasy");
		int ops= App.scanner.nextInt();
		String name="";
		
		if(ops==1) {
			 name="Comedy";
			GenreDao.genre(name);
			
		}
		else if(ops==2) {
			 name="Drama";
			GenreDao.genre(name);
		}
		else if(ops==3) {
			 name="Animation";
			GenreDao.genre(name);
		}
		else if(ops==4) {
			 name="Romance";
			GenreDao.genre(name);
		}
		else if (ops==5) {
			 name="Fantasy";
			GenreDao.genre(name);
			
		}
		
	}

}
