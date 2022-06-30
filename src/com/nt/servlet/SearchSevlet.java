package com.nt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/searchurl")
public class SearchSevlet extends HttpServlet {

	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
		String ss=null;
		//general settings
		
		pw=res.getWriter();
	    res.setContentType("text/html");
	    
	    //read from data
	    ss=req.getParameter("ss");
	    
	    //prepare link
 pw.println("<h1><a href='https://www.google.co.in/search?q="+ss+"'>Search Here</a></h1>");
	    pw.close();
	    
	    
	}//doget
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req,res);
	}//dopost
	
	
	
	
	
}//class
