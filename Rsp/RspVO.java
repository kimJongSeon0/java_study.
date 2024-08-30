package Rsp;

public class RspVO {
    
}
package rsp.vo;

public class RspVO {
	
	private String name;
	private String rsp;
	private int time;
	
	public RspVO(String name, String rsp, int time) {
		this.name = name;
		this.rsp = rsp;
		this.time = time;
		int num = (int) (Math.random() * 3);
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRsp() {
		return rsp;
	}

	public void setRsp(String rsp) {
		this.rsp = rsp;
	}
	
	
}
