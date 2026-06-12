package com.gqt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class processingsortwithoutcollection {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(455);
		al.add(1);
		al.add(67);
		al.add(9);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		  System.out.println(al);;
	  	  System.out.println("=========================");
	  	 List<Integer> res = al.stream().sorted().collect(Collectors.toList());
	  	System.out.println(res);
}
}