package com.review10;

import java.util.Iterator;
import java.util.LinkedList;
class Repl1 {
	 public LinkedList myLlist() {
		LinkedList<String> myList=new LinkedList<>();
		myList.add("John");
		myList.add("Brian");
		myList.add("Ryan");
		return myList;
	  }
		public static void main(String[] args) {
 LinkedList<String> lList= new LinkedList<String>();
 Repl1 obj = new Repl1();
//System.out.println(obj.myLlist());
  lList.addAll(obj.myLlist());
  Iterator<String> myIt = lList.iterator();
  while(myIt.hasNext()) {
	   System.out.println(myIt.next());
  }
}
}
