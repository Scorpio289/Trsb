package com.helloworld;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*************************************************************************
	> File Name: LoginC1.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月03日 星期一 14时50分41秒
 ************************************************************************/

public class LoginC1 extends HttpServlet{
    public LoginC1(){
        super();
    }
    
    //处理Get请求
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            //中文乱码
            res.setContentType("text/html; charset=gbk");
            //接受用户名和密码
            String  u = req.getParameter("username");
            System.out.println(u);
            String p =req.getParameter("passwd");
            //验证
            if(u.equals("sp")&&p.equals("123")){
                //合法
                res.sendRedirect("Welcome");
            }
            else{
                //不合法
                res.sendRedirect("Login");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res){
        this.doGet(req, res);
        
    }

    public void destroy(){
        super.destroy();
    }

    public void init() throws ServletException{

    }

}

