package com.gqt;

import java.util.ArrayList;

public class minmax1 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("101");
        al.add("99");
        al.add("32");
        al.add("4");
        System.out.println(al);
  	  System.out.println("=========================");
  	  String min = al.stream().min((s1,s2)->s1.compareTo(s2)).get();
      System.out.println("the min value string is = " +min);
      String max = al.stream().max((s1,s2)->s1.compareTo(s2)).get();
      System.out.println("the min value string is = " +max);
	}

}