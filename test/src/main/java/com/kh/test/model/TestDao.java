package com.kh.test.model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TestDao {
	Connection conn = null;

	Statement stmt = null;

	ResultSet rs = null;

	TestDao(String ip, String port, String db, String id, String pwd ){
		try {
			Class.forName("org.oracle.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@192.168.10.3:1521:xe","kh","kh");
			if(conn != null) {
				System.out.println("DB 접속성공" + conn);
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}


	}

	public List<TEST> selectList() {
		List<TEST> list = new ArrayList<TEST>();

		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from TEST");
			while(rs.next()) {
				TEST vo = new TEST();
				vo.setWriter(rs.getString("writer"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setRegDate(rs.getDate("regDate"));
				list.add(vo);
			}
		} catch(Exception e) {}
		return list;
	}
}

