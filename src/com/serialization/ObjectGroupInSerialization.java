package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable{
	B b=new B();
}
class B implements Serializable{
	C c=new C();
}
class C implements Serializable{
	int i=10;
	int j=20;
}
public class ObjectGroupInSerialization {
public static void main(String[] args) {
	A a=new A();
	try {
		FileOutputStream fos=new FileOutputStream("C:/Users/balkr/Desktop/iOStream/objectgroup.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(a);
		oos.close();
		fos.close();
		System.out.println("serialized successfully");
		FileInputStream fis=new FileInputStream("C:/Users/balkr/Desktop/iOStream/objectgroup.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		A deserialA=(A)ois.readObject();
		System.out.println(deserialA.b.c.i);
		System.out.println(deserialA.b.c.j);
		ois.close();
		fis.close();
	} 
	catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} 
	catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
