package com.jspides.filehandling.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) {
		
		File file = new File("ByteStream.txt");
		if(file.exists()) {
			try {
				FileInputStream fileInputStream = new FileInputStream(file);
				System.out.println("Reading Data From file");
				System.out.println(fileInputStream.read());
				fileInputStream.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
