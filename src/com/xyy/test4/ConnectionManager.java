package com.xyy.test4;

import java.util.Arrays;

import com.xyy.tools.Print;

class Connection{
	private Connection() {}
	private static Connection connection = new Connection();
	public static Connection makeConnection() {
		return connection;
	}
}

public class ConnectionManager {
	public static Connection[] conns = new Connection[5];	//声明了一个Connection类型，数量为5的数组，
	static{
		Print.print("----------- 初始化Connection对象 ------------");
		for(int i = 0; i < 5; i++){
			conns[i] = Connection.makeConnection();
		}
	}
	
	public static Connection getConnection(){
		int len = conns.length;
		if(len > 0){
			Connection conn = conns[--len];
			
			conns = Arrays.copyOf(conns, len);
			return conn;
		}else{
			return null;
		}
	}
	public static void main(String[] args){
		try {
			for (int i = 0; i < 7; i++) {
				Connection con = ConnectionManager.getConnection();
				Print.print(i + "、" + con);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
