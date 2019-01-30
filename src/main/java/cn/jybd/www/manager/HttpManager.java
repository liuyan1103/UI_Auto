package cn.jybd.www.manager;


import java.net.HttpURLConnection;
/* 
 * 主机地址
 * */

public class HttpManager {

	
	
	public void process(HttpURLConnection conn) {
		conn.setConnectTimeout(15000);
		conn.setReadTimeout(15000);
	}
	
	public String address() {
		
//		gc环境
		return "http://hebing.jybd.cn";
//		hebing环境
//		return "http://hebing.jybd.cn";


		
		
		
	
	}
	
	
}
