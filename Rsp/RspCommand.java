package Rsp;

public class RspCommand {
    
}
package rsp.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface RspCommand {
	
	public abstract void execute(HttpServletRequest request, HttpServletResponse response);

}
