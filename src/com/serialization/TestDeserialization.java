package com.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserialization {
public static void main(String[] args) {
	File file=new File("C:/Users/balkr/Desktop/iOStream/serial.txt");
	
	try {

		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee e1=(Employee)ois.readObject();
		System.out.println(e1);
		ois.close();
	} catch (FileNotFoundException e1) {
		
		e1.printStackTrace();
	} catch (IOException e1) {
		
		e1.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	
}
}
