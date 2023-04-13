package com.jspides.filehandling.read;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {

	public static void main(String[] args) {
		File file = new File("CharStream.txt");
        
		if(file.exists()) {
			try {
				FileReader fileReader = new FileReader(file);
				System.out.println("Reading Data From File");
				System.out.println("Read() Output : " + fileReader.read());
				
				Scanner scanner = new Scanner(file);
				System.out.println("Scanner Output");
				while(scanner.hasNextLine()) {
					System.out.println(scanner.nextLine());
				}
				fileReader.close();
				scanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}
