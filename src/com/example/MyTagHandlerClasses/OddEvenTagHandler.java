package com.example.MyTagHandlerClasses;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import org.apache.taglibs.standard.lang.jstl.test.PageContextImpl;

public class OddEvenTagHandler extends SimpleTagSupport{

	private int number;

	public void setNumber(String number) {
		this.number = Integer.parseInt(number);
	}
	
	public void doTag() throws JspException, IOException{
			
		JspWriter out = getJspContext().getOut();
		try{
			if(number % 2 == 0)
			{
				out.println("<h3 style=\"color:#042966;\">"+ number +" is EVEN NO...!!</h3>");
			}
			else
			{
				out.println("<h3 style=\"color:#042966;\">"+ number +" is ODD NO...!!</h3>");
			}
		}
		catch(Exception e)
		{
				out.println(e);
		}
	}
	
}
