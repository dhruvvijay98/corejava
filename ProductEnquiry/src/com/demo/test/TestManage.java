package com.demo.test;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestManage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService pservice = new ProductServiceImpl();
		int choice =0;
		do {
		System.out.println("1.AddnewProduct\n2.displayAll\n3.Display by ID ");
		System.out.println("4.Display by Name\n5.DisplaybyPrice\n6.Sort by price ");
		System.out.println("7.Sort by Name\n8.delete by id\n9.modify\n10.exit\nchoice:\n ");
		choice = sc.nextInt();
		switch(choice)
		{
		case 1: 
		{
			boolean status = pservice.addnewproduct();
			if(status) {
				System.out.println("Added successfully");
			}
			else System.out.println("Error occured");
			
			
		}
			break;
		case 2: 
			List<Product> plist = pservice.displayAll();
			plist.stream().forEach(ob->System.out.println(ob));
			break;
		case 3: 
			System.out.println("enter id to search");
			int pid = sc.nextInt();
			Product p = pservice.displaybyID(pid);
			if(p!=null) {
				System.out.println(p);
			}
			else {
				System.out.println("Not Found");
			}
		
			break;
		case 4: 	
			System.out.println("enter name to search");
			String nm = sc.next();
			 plist = pservice.displayByName(nm);
			 plist.stream().forEach(ob->System.out.println(ob));
				
			break;
		case 5: 
			System.out.println("enter price to search");
			float price = sc.nextFloat();
			plist = pservice.searchbyPrice(price);
			plist.stream().forEach(ob->System.out.println(ob));
			
			break;
		case 6: 
			plist=pservice.sortById();
			plist.stream().forEach(System.out::println);
			break;
		case 7: 
			plist=pservice.sortByName();
			plist.stream().forEach(System.out::println);
			break;
		case 8: 
			System.out.println("enter id to Delete");
			 pid = sc.nextInt();
		       boolean status = pservice.deletebyID(pid);
		       if(status) {
		    	   System.out.println("Deleted Successfully");
		       }else {
		    	   System.out.println("Operation Failed");
		       }
			break;
		case 9: 
			System.out.println("enter id");
			int id = sc.nextInt();
			System.out.println("enter name");
			String nm1 = sc.next();
			System.out.println("enter price");
			float price1 = sc.nextFloat();
			
			 status = pservice.modifyAll(id,nm1,price1);
			if(status) {
				System.out.println("Modify Successfully");
			}else {
		    	   System.out.println("Operation Failed");
		       }
			
			break;
		case 10:
			System.out.println("thanks for visiting");
			sc.close();
			
			break;
		default: System.out.println("Wrong Choice");
			break;
			
		}
	}while(choice!=10);

}
}
