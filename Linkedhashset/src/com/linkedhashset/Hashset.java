package com.linkedhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Hashset {

	public static void main(String[] args) 
	{
		LinkedList<String> llist=new LinkedList<String>();
		System.out.println("==========linked hashset values============");
		llist.add("Null");
		llist.add("vishal");
		llist.add("vishal");
		llist.add("ganesh");

		for(String str:llist)
		{
			System.out.println("linked values="+str);
		}
		
		
		LinkedHashSet<String> lh=new LinkedHashSet<String>();
		System.out.println("==========linked Hashset values============");
		lh.add("Null");
		lh.add("vishal");
		lh.add("vishal");
		lh.add("ganesh");

		for(String str:lh)
		{
			System.out.println("linked values="+str);
		}
		
		
		HashSet<String> h=new HashSet<String>();
		System.out.println("========== Hashset values============");
		h.add("Null");
		h.add("vishal");
		h.add("vishal");
		h.add("ganesh");

		for(String str:h)
		{
			System.out.println("linked values="+str);
		}
		
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("==========array list values============");
		al.add("Null");
		al.add("Null");
		al.add("vishal");
		al.add("vishal");
		al.add("ganesh");

		for(String str:al)
		{
			System.out.println("linked values="+str);
		}
	}

}
