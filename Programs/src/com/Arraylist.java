package com;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add("1");
		al.add("NandiniSrinivas");
		al.add("0.1");
		al.add("Srinivas");
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		
		
	}

}
