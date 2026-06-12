package com.gqt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class sortwithcomperator {
public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	 List<String> res = al.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
	  	System.out.println(res);
	}

}
