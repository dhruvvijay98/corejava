package com.demo.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.demo.beans.Employee;

public class TestFileCSV {

	public static void main(String[] args) {
		Employee e1=new Employee(1,"Rajas",34567);
		Employee e2=new Employee(1,"Meenal",34567);
		Employee e3=new Employee(1,"Arundhati",34567);
		List<Employee> lst=List.of(e1,e2,e3);
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("empcsv.txt"));){
			for(Employee ob:lst) {
				bw.write(ob.getEmpid()+","+ob.getEname()+","+ob.getSal()+"\n");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//to read the file
		try(BufferedReader br=new BufferedReader(new FileReader("empcsv.txt"));){
			String s=br.readLine();
			while(s!=null) {
				System.out.println(s);
				s=br.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
