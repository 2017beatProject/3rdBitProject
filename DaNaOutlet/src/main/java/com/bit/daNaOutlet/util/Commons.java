package com.bit.daNaOutlet.util;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

public class Commons {

	
	public String commonsUp(String productName,MultipartFile file,HttpServletRequest req) throws Exception {
		ServletContext context =req.getSession().getServletContext();
		String realPath=context.getRealPath("/");				
		String path=realPath+"\\resources\\imgs\\hotdealimgs\\";
		String srcPath="C:\\Users\\1027\\git\\3rdBitProject\\DaNaOutlet\\src\\main\\webapp\\resources\\imgs\\hotdealimgs\\";
		String orginalName=file.getOriginalFilename();
		int pos = orginalName.lastIndexOf( "." );
		String ext = orginalName.substring( pos );
		File realF=new File(path+productName+ext);
		File srcF=new File(srcPath+productName+ext);
		file.transferTo(realF);	
		file.transferTo(srcF);
		return productName+ext;
	}
}