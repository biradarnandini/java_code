package com.gqt;

import java.util.ArrayList;

public class minmax {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	  String min = al.stream().min((s1,s2)->s1.compareTo(s2)).get();
      System.out.println("the min value string is = " +min);
      String max = al.stream().max((s1,s2)->s1.compareTo(s2)).get();
      System.out.println("the min value string is = " +max);
	}

}
