package com.study.demo.designModel.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

private Vector<Connection> pool;
	
	/*公有属性*/
	private String url = "jdbc:mysql://localhost:3306/mpay_busi";
	private String username = "mpay_busi";
	private String password = "mpay_busi";
	private String driverClassName = "com.mysql.cj.jdbc.Driver";

	private int poolSize = 100;
	Connection conn = null;
	
	/*构造方法，做一些初始化工作*/
	private ConnectionPool() {
		pool = new Vector<Connection>(poolSize);

		for (int i = 0; i < poolSize; i++) {
			try {
				Class.forName(driverClassName);
				conn = DriverManager.getConnection(url, username, password);
				pool.add(conn);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/* 返回连接到连接池 */
	public synchronized void release() {
		pool.add(conn);
	}

	/* 返回连接池中的一个数据库连接 */
	public synchronized Connection getConnection() {
		if (pool.size() > 0) {
			Connection conn = pool.get(0);
			pool.remove(conn);
			return conn;
		} else {
			return null;	
		}
	}

	public static void main(String[] args) {
		ConnectionPool connectionPool= new ConnectionPool();
		System.out.println("connectionPool:"+connectionPool.pool.size());
		Connection connection1=connectionPool.getConnection();
		System.out.println("connection1:"+connectionPool.pool.size());
		connectionPool.release();
		System.out.println("release:"+connectionPool.pool.size());
	}

}
