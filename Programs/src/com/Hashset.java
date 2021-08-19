package com;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
	public static void main(String args)
	{
		HashSet hs= new HashSet();
		hs.add("1");
		hs.add("Nandini");
		hs.add("0.2");
		Iterator i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
