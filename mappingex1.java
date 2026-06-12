package com.gqt;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class mappingex1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	 List<String> res = al.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
	  System.out.println(res);
	}

}
