package com.jspides.filehandling.write;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CharStremamWrite {

	public static void main(String[] args) {
		File file = new File("CharStream.txt");
		if(file.exists()) {
			System.out.println("File Already Exists");
		}else {
			try {
				file.createNewFile();
				System.out.println("File Created");
				
				FileWriter fileReader = new FileWriter(file);
				fileReader.write("Hello");
				System.out.println("Data Written In File");
				fileReader.close();
			} catch (IOException e) {
				System.out.println("File Not Created");
				e.printStackTrace();
			}
			
		}
	}
}
