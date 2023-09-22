package com.collection;

import java.util.*;

class Contact {
	private long id;
	private String name;
	private String mobileNo;

	public Contact(long id, String name, String mobileNo) {
		this.id = id;
		this.name = name;
		this.mobileNo = mobileNo;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Mobile No: " + mobileNo;
	}
}

public class Collectiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Object> li = new ArrayList<>();
		Contact c = new Contact();
		c.setId(101);
		c.setName("sami");
		c.setMobileNo("0886466");
 System.ouy.println("this is test");
		Contact c1 = new Contact();
		c1.setId(102);
		c1.setName("name");
		c1.setMobileNo("98765434567");

		li.add(c);
		li.add(c1);
//		li.remove(c);
		
		Contact cUpdate = new Contact();
		cUpdate.setId(102);
		cUpdate.setName("NAME");
		cUpdate.setMobileNo("876567898");
		
		li.set(1, cUpdate);
        	
//System.out.println(c);

		Iterator<Object> it = li.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
