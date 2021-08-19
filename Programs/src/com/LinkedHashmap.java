package com;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
	public static void main(String args[])
	{
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<Integer,String>();
		hm.put(1, "Nandu");
		hm.put(2, "Snehi");
		for (Map.Entry i :hm.entrySet())
		{
			System.out.println(i.getKey()+" "+i.getValue());
		}
			
	}

}
