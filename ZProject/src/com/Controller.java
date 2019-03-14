package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Controller extends HttpServlet {
	
public void service(HttpServletRequest req, HttpServletResponse res)throws ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter pw=res.getWriter();
	RequestDispatcher rd=null;
	String msg=" ";
	String xyz=" ";
	EmpModel em=new EmpModel();
	ResultBean rb=new ResultBean();
	HttpSession hs=req.getSession();
	String s1=req.getParameter("sn");
	if(s1.equals("login")){
		String u=req.getParameter("un");
		String p=req.getParameter("pw");
		if(u.equals("")|| p.equals("")){
			msg="Both are Mandatory";
			req.setAttribute("MSG", msg);
			rd=req.getRequestDispatcher("/Login.jsp");
		}
		else{
			int x=em.verify(u,p);
			if(x==0){
				msg="Not a valid usname and pw";
				req.setAttribute("MSG", msg);
				rd=req.getRequestDispatcher("/Login.jsp");
			}
			else{
				req.setAttribute("NA",u);
				msg="login successfull";
				req.setAttribute("MSG", msg);
				rd=req.getRequestDispatcher("/home.jsp");
			}
		}
	}
	else if(s1.equals("Register")){
		String u=req.getParameter("un");
		String p=req.getParameter("pw");
		String e=req.getParameter("email");
		String ph=req.getParameter("phone");
		String sq=req.getParameter("sq");
		String sa=req.getParameter("sa");
		if(u.equals("")||p.equals("")||e.equals("")||ph.equals("")||sq.equals("")||sa.equals("")){
			msg="All are mandatory";
			req.setAttribute("MSG", msg);
			rd=req.getRequestDispatcher("/Regester.jsp");
		}
		else{
			rb.setUn(u);
			rb.setPw(p);
			rb.setEmail(e);
			rb.setPhone(ph);
			rb.setSq(sq);
			rb.setSa(sa);
			int x=em.insert(rb);
			if(x==0){
				msg="Register failed";
				req.setAttribute("MSG", msg);
				rd=req.getRequestDispatcher("/Regester.jsp");
			}
			else{
				msg="Register successfull";
				req.setAttribute("MSG", msg);
				rd=req.getRequestDispatcher("/Login.jsp");
			}
		}
	}
	else if(s1.equals("home")){
		String e=req.getParameter("email");
		if(e.equals("")){
			msg="Email is mandatory";
			req.setAttribute("MSG", msg);
			rd=req.getRequestDispatcher("/home.jsp");
		}
		else{
			ResultBean rb1=em.getInfo(e);
			if(rb1.getUn().equals("")){
				msg="Enter valid email";
				req.setAttribute("MSG", msg);
				rd=req.getRequestDispatcher("/home.jsp");
			}
			else{
				req.setAttribute("RB", rb1);
				rd=req.getRequestDispatcher("/Search.jsp");
			}
		}
	}
	else if(s1.equals("forget")){
		String e=req.getParameter("email");
		if(e.equals("")){
			msg=" Email is Mandatory";
			req.setAttribute("MSG", msg);
			rd=req.getRequestDispatcher("/Forget.jsp");
		}
		else{
			ResultBean rb1=em.getInfo(e);
			if(rb1.getUn()==null){
				msg="Enter valid Email";
				req.setAttribute("MSG", msg);
				
				rd=req.getRequestDispatcher("/Forget.jsp");
			}
			else{
				hs.setAttribute("RB", rb1);
				rd=req.getRequestDispatcher("/Recover.jsp");
			}
		}
	}
	else{
		String usename1=req.getParameter("un");
		String sa=req.getParameter("sa");
		System.out.println("security ans "+sa);
		if(sa.equals("")){
			msg=" Security Answer is mandatory";
			hs.setAttribute("MSG",msg);
			rd=req.getRequestDispatcher("/Recover.jsp");
		}
		else{
			String pass=em.getpwd(usename1,sa);
			if(pass.equals("")){
				msg="Answer is incorrect";
				hs.setAttribute("MSG", msg);
			rd=req.getRequestDispatcher("/Recover.jsp");
			}
			else{
				req.setAttribute("PA", pass);
				rd=req.getRequestDispatcher("/Password.jsp");
			}
		}
	}
	
	
	rd.forward(req, res);
			}
}

