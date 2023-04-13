package com.jspides.filehandling.delete;

import java.io.File;
import java.io.IOException;

public class DeleteFileDemo1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Hello.txt");
		
		if(file.exists()) {
			file.delete();
			System.out.println("File Delete");
		}else {
			System.out.println("File Not Delete");
		}
	}
}
