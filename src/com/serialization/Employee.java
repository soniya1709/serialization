package com.serialization;

import java.io.Serializable;

public class Employee implements Serializable{
int id;
String name;
public Employee() {
	super();
}
public Employee(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}

}
