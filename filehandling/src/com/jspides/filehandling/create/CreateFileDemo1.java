package com.jspides.filehandling.create;

import java.io.File;
import java.io.IOException;

public class CreateFileDemo1 {

	public static void main(String[] args) {
		
		File file = new File("Hello.txt");
		
		if(file.exists()) {
			System.out.println("File Alrady Exists");
		}else {
			try {
				file.createNewFile();
				System.out.println("File Created");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("file not Created");
				e.printStackTrace();
			}
		}
	}
}
