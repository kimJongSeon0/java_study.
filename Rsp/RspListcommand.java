package rsp.dao;

import java.sql.Connection;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import rsp.vo.RspVO;

public class RspDao {
	
	private DataSource dataSource = null;
	
	public RspDao() {
		try {
			Context context = new InitialContext();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<RspVO> lsit(){
		
		ArrayList<RspVO> RsplList = new ArrayList<RspVO>();
		
		Connection connection = null;
		
		
		
		
		
		return null;
		
	}
}
