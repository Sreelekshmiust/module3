package com.ust.ioc;

public class Login {
	public DBConnection getDb() {
		return db;
	}


	public void setDb(DBConnection db) {
		this.db = db;
	}


	private String userName;
	private String password;
	DBConnection db;
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String validate() {
		//obtain connection and write sql
		//to verify username and password exist in database
		//db = new DBConnection();
		Connection con =db.getConnection();
		return "Login validated";
	}

}
	