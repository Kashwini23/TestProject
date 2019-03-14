package com;
import java.sql.*;

public class EmpModel {
Connection con=null;
PreparedStatement ps=null;
public EmpModel(){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","tiger");
		System.out.println(con);
	}catch(Exception e){
		System.out.println(e);
	}
}
	public int verify(String s1,String s2){
		int x=0;
		try{
			ps=con.prepareStatement("select * from emp where username=? and password=?");
			ps.setString(1, s1);
			ps.setString(2, s2);
			ResultSet rs=ps.executeQuery();
			System.out.println("Name"+s1+"--"+s2);
			while(rs.next()){
				x=1;
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			try{
				con.close();
				ps.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
			return x;
		}
	public int insert(ResultBean rb){
			int x=0;
			try{
				ps=con.prepareStatement("insert into emp values(?,?,?,?,?,?)");
				ps.setString(1, rb.getUn());
				ps.setString(2, rb.getPw());
				ps.setString(3, rb.getEmail());
				ps.setString(4, rb.getPhone());
				ps.setString(5, rb.getSq());
				ps.setString(6, rb.getSa());
				x=ps.executeUpdate();
			}catch(Exception e){
				System.out.println(e);
			}finally{
				try{
					con.close();
					ps.close();
				}catch(Exception e){
					System.out.println(e);
				}
			}
			return x;
		}
		public ResultBean getInfo(String e){
			ResultBean rb=null;
			try{
				ps=con.prepareStatement("select * from emp where email=?");
				ps.setString(1, e);
				ResultSet rs=ps.executeQuery();
				rb=new ResultBean();
				while(rs.next()){
					rb.setUn(rs.getString(1));
					rb.setPw(rs.getString(2));
					rb.setEmail(rs.getString(3));
					rb.setPhone(rs.getString(4));
					rb.setSq(rs.getString(5));
					rb.setSa(rs.getString(6));
				}
			
			}catch(Exception e1){
				System.out.println(e1);
			}finally{
				try{
					con.close();
					ps.close();
					//rb.close();
				}catch(Exception e2){
					System.out.println(e2);
				}
			}
			return rb;
		}
		public String getpwd(String s1,String s2){
			String p="";
			try{
				ps=con.prepareStatement("select password from emp where sa=? and username=?");
				ps.setString(1,s2);
				ps.setString(2, s1);
				ResultSet rs=ps.executeQuery();
				while(rs.next()){
					p=rs.getString(1);
				}
				
			}catch(Exception e3){}
			finally{
				try
			{
				con.close();
				ps.close();
			}catch(Exception e4){
				System.out.println(e4);
			}
			
			}
			return p;
		}
	}
	
	
	

