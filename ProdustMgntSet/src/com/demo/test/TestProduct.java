package com.demo.test;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.demo.beans.Product;
import com.demo.service.ProductService;
import com.demo.service.ProductServiceImpl;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Create a ProductService class object
		ProductService pservice = new ProductServiceImpl();
		
		int choice = 0;
		do {
			System.out.println("1. Add New Product\n2. Display All\n3.Display By Id");
			System.out.println("4. Display By Name\n5. Display By Price\n6. Display in Sorted Order Of Price");
			System.out.println("7. Display By Sorted Order by Name\n8. Delete By ID\n9. Modify Product");
			System.out.println("10. Sorted order by Id \n11. Exit\nchoice : ");
			
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				boolean status = pservice.addNewProduct();
				if(status) {
					System.out.println("Added Successfully");
				}
				else {
					System.out.println("Error Occurred");
				}
				break;
			case 2:
				Set<Product> plist = pservice.displayAll();
				plist.stream().forEach(ob->System.out.println(ob));
				
				break;
			case 3:
				System.out.println("Enter Pid");
				int pid = sc.nextInt();
				Product p = pservice.displayById(pid);
				if(p!=null) {
					System.out.println(p);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Enter Name :");
				String nm = sc.next();
				 List<Product> lst = pservice.displayByName(nm);
				 lst.stream().forEach(ob->System.out.println(ob));
				break;
			case 5:
				  System.out.println("Enter Price");
				  float price = sc.nextFloat();
				  lst = pservice.displayByPrice(price); 
				  lst.stream().forEach(ob->System.out.println(ob));
				break;
			case 6:
				lst=pservice.sortByPrice();
				lst.stream().forEach(System.out::println);
				break;
			case 7:
				lst=pservice.sortByName();
				lst.stream().forEach(System.out::println);
				break;
			case 8:
				System.out.println("Enter Id to Delete:");
				int id = sc.nextInt();
				status = pservice.removeById(id);
				if(status) {
					System.out.println("Deleted SuccesFully");
				}
				else {
					System.out.println("Operation Failed");
				}
				

				break;
			case 9:
				System.out.println("Enter Pid");
				pid = sc.nextInt();
				System.out.println("Enter Quantity");
				int qty = sc.nextInt();
				System.out.println("Enter Price");
			    price = sc.nextFloat();
			    
			    status = pservice.modifyById(pid,qty,price);
			    
			    if(status) {
			    	System.out.println("Modified Succesful");
			    }
			    else {
			    	System.out.println("Not Found");
			    }
			  
				break;
			
			case 10:
				plist=pservice.sortById();
				plist.stream().forEach(ob->System.out.println(ob));
				
				break;
				
			case 11:
				sc.close();
				System.out.println("Thank you for Visiting!!!");
				break;
			default :
				System.out.println("Invalid Choice");
				break;
			}
			
		} while(choice!=11);
	}

}
