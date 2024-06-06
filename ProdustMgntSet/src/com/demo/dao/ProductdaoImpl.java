package com.demo.dao;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import com.demo.beans.Product;
import com.demo.comparators.MyNameComparator;
import com.demo.comparators.MyPriceComparator;

public class ProductdaoImpl implements Productdao{

	static Set<Product> pset; 
	static {
		pset = new HashSet<>();
		pset.add(new Product(1,"tanatan",45,LocalDate.of(2024,12,23)));
		pset.add(new Product(2,"tana",34,LocalDate.of(2024,12,23)));
		pset.add(new Product(3,"tann",40,LocalDate.of(2024,12,23)));
	}
	@Override
	public boolean save(Product p) {
		return pset.add(p);
	}

	@Override
	public Set<Product> findAll() {
		
		return pset;
	}

	@Override
	public Product findById(int pid) {
		
		for(Product p : pset)
		{
			if(p.getPid()==pid)
				return p;
		}
		return null;
	}
	
		

	@Override
	public List<Product> findByName(String nm) {
		List<Product> plist1 = new ArrayList<>();
			for(Product p : pset)
			{
				if(p.getPname().equals(nm))
				{
					 plist1.add(p);
				}
				if(plist1.isEmpty())
					{return null;}
			}return plist1;
	}

	@Override
	public List<Product> findByPrice(float price) {
		List<Product> lst = pset.stream().filter(ob->ob.getPrice()>price)
				.collect(Collectors.toList());
		if(lst.isEmpty())
			return null;
		return lst;
		
	}

	@Override
	public boolean deleteById(int id) {
		return pset.remove(new Product(id));
		
	}

	
	@Override
	public List<Product> arrangeByPrice() {
		List<Product> lst = new ArrayList<>();
		for(Product p:pset)
		{
			lst.add(p);
		}
		lst.sort(new MyPriceComparator());
		return lst;
	}
		

	@Override
	public List<Product> arrangeByName() {
		List<Product> lst = new ArrayList<>();
		for(Product p:pset)
		{
			lst.add(p);
		}
		lst.sort(new MyNameComparator());
		return lst;
	}

	@Override
	public Set<Product> arrangeById() {
		Set<Product> tset = new TreeSet<>();
		for(Product p:pset)
		{
			tset.add(p);
		}
		return tset;
	}

	@Override
	public boolean updateById(int pid, int qty, float price) {
		// TODO Auto-generated method stub
		Product p = findById(pid);
		if(p!=null) {
			p.setQty(qty);
			p.setPrice(price);
			return true;
		}
		 return false;
		
	}

}
