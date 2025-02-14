package com.celcom.day9;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.io.FileInputStream;

class Employee implements Serializable {
	transient public int eid;
	private String ename;
	private int esalary;
	
	public Employee(int eid, String ename, int esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsalary() {
		return esalary;
	}

	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}
public class SerializationExample  {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee sneha = new Employee(101,"sneha", 50000);
		
		//Serialization
		
		FileOutputStream fout = new FileOutputStream("D://ObjectFile.txt");
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		objout.writeObject(sneha);
		objout.close();
		fout.close();
		System.out.println("Object Saved");
		
		//De-Serialization
		
		FileInputStream fin = new FileInputStream("D://ObjectFile.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);
		Employee emp = (Employee) objin.readObject();
		objin.close();
		fin.close();
		System.out.println(emp);
		
		
	}

}
