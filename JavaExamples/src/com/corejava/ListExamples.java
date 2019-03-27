package com.corejava;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Stack;
import java.util.Vector;

public class ListExamples {

	public static void main(String[] args) {
			
			Vector v = new Vector();			
			v.add(1);
			v.add(3);
			v.add(4);
			System.out.println(v + "<<>>>" + v.get(1) + v.elementAt(1));
			//Collections.synchronizedList(al);	
			//LinkedList<E>
			v.toArray();
			ArrayList<String> al = new ArrayList<String>(v);
			ArrayList<String> vl = new ArrayList<String>();
			al.add("A");
			al.add(null);
			System.out.println(al);
			al.remove(0);
			System.out.println(al);
			vl.add(0, "BB");
			vl.add("CC");
			vl.add("DD");
			vl.add("EE");
			vl.get(0);
			vl.get(1);
			System.out.println(al + "<>" + al.get(2) );
			
			@SuppressWarnings("rawtypes")
			Enumeration en = v.elements();
			System.out.print("Enumerated List:");
			while(en.hasMoreElements()){
				System.out.print(en.nextElement() + "\t >>>>>" + en.getClass().getName());
				
			}
			System.out.println("");
			System.out.println("-----------");
			Iterator it = al.iterator();
			System.out.print("Iterator List: \n");
			while(it.hasNext()){
				System.out.print(it.next() + "\t =>>" + it.getClass().getName());
			}
			ListIterator ltr = vl.listIterator();
			System.out.println();
			System.out.print("List Iterator: \n" );
			while(ltr.hasNext()){
				System.out.println(ltr.next() + "\t <<= " + ltr.getClass().getName());
			}
			Dictionary s;
			Properties p;
			
			
			
			}
			
	}
