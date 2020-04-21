package com.helloworld;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*************************************************************************
	> File Name: Welcome.java
	> Author: 
	> Mail: 
	> Created Time: 2018年12月03日 星期一 15时24分44秒
 ************************************************************************/

public class Welcome extends HttpServlet{
    public Welcome(){
        super();
    }

    //处理Get请求
    public void doGet(HttpServletRequest req, HttpServletResponse res){
        try{
            //中文乱码
            res.setContentType("text/html; charset:gbk");
            PrintWriter pw = res.getWriter();

            //返回登录界面
            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>Welcome</h1>");
            pw.println("</body>");
            pw.println("</html>");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void  doPost(HttpServletRequest req, HttpServletResponse res){
        this.doGet(req,res);
    }

    public void destroy(){
        super.destroy();
    }
    public void init() throws ServletException{
       
    }

}

