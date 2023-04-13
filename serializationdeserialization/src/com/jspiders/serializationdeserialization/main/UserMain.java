package com.jspiders.serializationdeserialization.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdeserialization.object.User;

public class UserMain {
	
  public static void main(String[] args) {
	
	  File file;
	  FileInputStream fileInputStream;
	  FileOutputStream fileOutputStream;
	  
	  try {
		  file = new File("Object11.txt");
		  if(file.exists()) {
			  System.out.println("File Already Exists");
		  }else {
			  file.createNewFile();
			  System.out.println("File Is Created");
		  }
		  
		  fileInputStream = new FileInputStream(file);
		  
		  fileOutputStream = new FileOutputStream(file);
//		  Serialization
		  
		  ObjectOutputStream  objectOutputStream = new ObjectOutputStream(fileOutputStream);
		  User user = new User(1, "Ajit", "ajjusar2406@mail.com");
		  objectOutputStream.writeObject(user);
		  objectOutputStream.close();
		  
//		Deserialization
		  
		  ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		  User output = (User)objectInputStream.readObject();
		  System.out.println(user);
		  objectInputStream.close();
		
	} catch (IOException e) {
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
  }
}
