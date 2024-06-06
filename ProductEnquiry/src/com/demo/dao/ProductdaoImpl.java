package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import com.demo.beans.Product;
import com.demo.comparators.MyComPrice;
import com.demo.comparators.Mynamecomparator;

public class ProductdaoImpl implements Productdao {
	static List<Product> plist;
	static {
		plist = new ArrayList<>();
		plist.add(new Product(1,"lays",34,45,LocalDate.of(2024, 06,06)));
		plist.add(new Product(2,"Marie",34,20,LocalDate.of(2024, 07,06)));
		plist.add(new Product(3,"Maggi",40,50,LocalDate.of(2024, 05,06)));
	}
	@Override
	public boolean save(Product p) {
		
		return plist.add(p);
	}
	@Override
	public List<Product> findAll() {
		
		return plist;
	}
	@Override
	public Product findbyID(int pid) {
		int pos = plist.indexOf(new Product(pid));
		if(pos!=-1) {
			return plist.get(pos);
		}
		return null;
		
	}
	@Override
	public List<Product> findbyName(String nm) {
		List<Product> lst = plist.stream()
				.filter(ob->ob.getName().equals(nm))
				.collect(Collectors.toList());
		if(lst.isEmpty()) {
			return null;
		}
		return lst;

}
	@Override
	public List<Product> findbyPrice(float price) {
	
			List<Product> lst = plist.stream()
					.filter(ob->ob.getPrice()>price)
					.collect(Collectors.toList());
			if(lst.isEmpty()) {
				return null;
			}
			return lst;
	}
	@Override
	public boolean removebyId(int pid) {
		// TODO Auto-generated method stub
		return plist.remove(new Product(pid));
	}
	@Override
	public boolean modify(int id, String nm1, float price1) {
		plist.sort(null);
		Product p = findbyID(id);
		if(p!=null) {
			p.setName(nm1);
			p.setPrice(price1);
			return true;
		}else {
		
		return false;
	}
	}
	//@Override
	//public List<Product> ArrangebyPrice() {
		// TODO Auto-generated method stub
		//return null;
	//}
	@Override
	public List<Product> ArrangebyName() {
		List<Product> lst = new ArrayList();
		for(Product p : plist) {
			lst.add(p);
		}
		lst.sort(new Mynamecomparator());
		return lst;
	}
	@Override
	public List<Product> ArrangebyId() {
		List<Product> lst=new ArrayList<>();
		for(Product p:plist) {
			lst.add(p);
		}
		//Collections.sort(lst);
		lst.sort(new MyComPrice());
		return lst;
	
//		
	}
}
	
