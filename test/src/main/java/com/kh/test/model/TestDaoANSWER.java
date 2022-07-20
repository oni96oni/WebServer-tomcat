package com.kh.test.model;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;

public class TestDao {

	public List<Test> selectList(){

		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		Connection con = null;

		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		String user = "kh";

		String password = "kh";

		try {

			con = DriverManager.getConnection(url, user, password);

			con.setAutoCommit(false);

		} catch (SQLException e) {

			e.printStackTrace();

		}

		PreparedStatement pstm = null;

		ResultSet rs = null;

		List<Test> list = new ArrayList<Test>();

		String sql = " SELECT * FROM TEST ";

		try {

			pstm = con.prepareStatement(sql);

			rs = pstm.executeQuery();

			while(rs.next()) {

				Test test = new Test();

				test.setSeq(rs.getInt(1));

				test.setWriter(rs.getString(2));

				test.setTitle(rs.getString(3));

				test.setContent(rs.getString(4));

				test.setRegdate(rs.getDate(5));

				list.add(test);

			}

		} catch (SQLException e) {

			e.printStackTrace();

		} finally {

			try {

				rs.close();

				pstm.close();

				con.close();

			} catch (SQLException e) {

				e.printStackTrace();

			}

		}

		return list;

	}

}