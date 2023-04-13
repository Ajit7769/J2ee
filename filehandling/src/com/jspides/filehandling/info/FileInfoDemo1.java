package com.jspides.filehandling.info;

import java.io.File;

public class FileInfoDemo1 {

	public static void main(String[] args) {
		
		File file = new File("Hello.txt");
		
		if(file.exists()) {
			System.out.println("File Name : " + file.getName());
			
			System.out.println("File Absoulate Path : " + file.getAbsolutePath());
			System.out.println("File length : " + file.length());
			file.length();
			
			if(file.canRead()) {
				System.out.println("File Is Readable");
			}else {
				System.out.println("File not Readable");
			}
			
			if(file.canWrite()) {
				System.out.println("File Is Writable");
			}else {
				System.out.println("File not Writable");
			}
			
			if(file.canExecute()) {
				System.out.println("File is Excutable");
			}else {
				System.out.println("File not Exicutable");
			}
		}else {
			System.out.println("File Does not Exist");
		}
	}
}
