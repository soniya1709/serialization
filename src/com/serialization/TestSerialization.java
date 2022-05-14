package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args)  {
	File file=new File("C:/Users/balkr/Desktop/iOStream/serial.txt"); 
	try {
//		file.createNewFile();
		System.out.println("file Created Successufully");
		Employee e=new Employee(10,"Ram");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e);
		System.out.println("file write successfully"+oos);
		oos.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}
}
