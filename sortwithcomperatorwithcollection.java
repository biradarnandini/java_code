package com.gqt;

import java.util.ArrayList;
import java.util.Collections;

public class sortwithcomperatorwithcollection {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
        al.add("harman");
        al.add("smirti");
        al.add("richa");
        al.add("deepti");
        System.out.println(al);
  	  System.out.println("=========================");
  	Collections.sort(al);
  	System.out.println(al);

	}

}
