package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent implements Serializable{
	int i=10;
}
class Child extends Parent{
	int j=20;
}
public class ParentSerialInInheritance {
public static void main(String[] args) {
	Child c=new Child();
	
	try {
		FileOutputStream fos=new FileOutputStream("C:/Users/balkr/Desktop/iOStream/ParentSerialInheritance.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(c);
		oos.close();
		fos.close();
		System.out.println("serialized successfully");
		FileInputStream fis=new FileInputStream("C:/Users/balkr/Desktop/iOStream/ParentSerialInheritance.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Child deserialChild=(Child)ois.readObject();
		System.out.println(deserialChild.i);
		System.out.println(deserialChild.j);
		ois.close();
		fis.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
