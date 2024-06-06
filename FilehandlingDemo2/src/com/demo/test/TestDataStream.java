package com.demo.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Employee;

public class TestDataStream {
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Rajas",34567);
		Employee e2=new Employee(1,"Meenal",34567);
		Employee e3=new Employee(1,"Arundhati",34567);
		List<Employee> lst=List.of(e1,e2,e3);
		try (DataOutputStream dos=new DataOutputStream(new FileOutputStream("empdata.txt"));){
			
			for(Employee ob:lst) {
				String s=ob.getEmpid()+","+ob.getEname()+","+ob.getSal();
				dos.writeUTF(s);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//to read the data
		try (DataInputStream dis=new DataInputStream(new FileInputStream("empdata.txt"));){
			  String s=dis.readUTF();
			  while(true) {
				  System.out.println(s);
				  s=dis.readUTF();
				  
			  }
		
		
		} catch(EOFException e) {
			System.out.println("Reached at the end of the list....");
		} catch(FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
