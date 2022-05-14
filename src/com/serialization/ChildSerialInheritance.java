package com.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class P{
	int i;
	public P(int i) {
		this.i=i;
	}
	public P() {
		super();
		System.out.println("Inside no args constructor");
	}
}
class Q extends P implements Serializable{
	int j=20;
	public Q(int i) {
		super(i);
		}
}
public class ChildSerialInheritance {
public static void main(String[] args) {
	Q q=new Q(50);
	try {
		FileOutputStream fos=new FileOutputStream("C:/Users/balkr/Desktop/iOStream/childSerialInheritance.txt");
	    ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(q);
		oos.close();
		fos.close();
		System.out.println("serialized successfully");
		FileInputStream fis=new FileInputStream("C:/Users/balkr/Desktop/iOStream/childSerialInheritance.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Q deserialChild=(Q)ois.readObject();
		System.out.println(deserialChild.i);
		System.out.println(deserialChild.j);
		ois.close();
		fis.close();
	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
