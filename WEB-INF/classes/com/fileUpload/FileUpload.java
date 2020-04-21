package com.fileUpload;

import java.io.*;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.util.Streams;

public class FileUpload extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException  {
		Writer o = response.getWriter();
		PrintWriter out = response.getWriter();
		
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		//the file must exists
		File fileDir = new File("/home/zzh/Documents/temp/");
		
		if(fileDir.isDirectory() && fileDir.exists() == false) {
			fileDir.mkdir();
		}
		
		//set param
		factory.setRepository(fileDir);
		
		//create handle tools
		ServletFileUpload sfu = new ServletFileUpload(factory);
		sfu.setHeaderEncoding("gbk");
		List<FileItem> items = null;
		try {
			//parse request
			items = sfu.parseRequest(request);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//get iterator
		Iterator<FileItem> iter = items.iterator();
		
		//after uploading, the file storing place
		File images = new File("/home/zzh/Documents/images/");
		if(images.exists() == false) {
			images.mkdirs();
		}
		try {
			//iter items
			while(iter != null && iter.hasNext()) {
				FileItem item = (FileItem) iter.next();
				System.out.println("source file:"+ item.getName());
				String fileName = item.getName().substring(item.getName().lastIndexOf("\\")+1);
				BufferedInputStream in = new BufferedInputStream(item.getInputStream());
				BufferedOutputStream out1 = new BufferedOutputStream(new FileOutputStream(
						new File(images.getAbsolutePath()+ "/" +fileName)));
                                //out.println(images.getAbsolutePath()+fileName);
				Streams.copy(in, out1, true);
				out.println("file upload success!");
			}
		}catch(Exception e) {
			out.println(e.toString());
			out.println("&nbsp file upload fail!");
		}
	}
}
