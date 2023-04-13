package com.jspides.filehandling.write;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {
 
	public static void main(String[] args) {
		File file = new File("ByteStream.txt");
		
		if(file.exists()) {
			System.out.println("File Already Exists");
		}else {
			try {
				file.createNewFile();
				System.out.println("File Created");
				
				FileOutputStream FileOutputStream = new FileOutputStream(file);
				FileOutputStream.write(25);
				System.out.println("Data Written in File");
				FileOutputStream.close();
			} catch (IOException e) {
				System.out.println("File not Created");
				e.printStackTrace();
				
			}
		}
	}
}
