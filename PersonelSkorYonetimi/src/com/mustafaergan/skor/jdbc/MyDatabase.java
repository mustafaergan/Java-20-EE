package com.mustafaergan.skor.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mustafaergan.skor.entity.Person;

public class MyDatabase {

	public void addPerson(Person person) {

		String url = "jdbc:mysql://localhost:3306/skor";
		
		
		try {
			Connection con = 
		DriverManager.getConnection(url, "root", "");
			
			if(con != null)
				System.out.println("baglandi");
			
		String SQL = "INSERT INTO PERSON"
				+ " (id,name,username,password,role)"
				+ " values(%s,'%s','%s','%s',"
				+ " %s)";
		
		SQL = String.format(SQL,person.getId(), 
				person.getName(),
				person.getUserName(),
				person.getPassword(),
				person.getRole());
		
		Statement statement = con.createStatement();
		statement.execute(SQL);
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
