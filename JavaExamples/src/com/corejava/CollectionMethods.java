package com.corejava;
import java.util.List;
import java.util.Spliterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
public class CollectionMethods{
	public static void main(String[] args) {
		List cm = new ArrayList();
		List l = new LinkedList();
		
		cm.add('1');
		cm.add('4');
		cm.add('6');
		cm.add("3");
		cm.add('2');
		cm.add('5');
		Spliterator sl = cm.spliterator();
		l.add("C");
		l.add("A");
		l.add("B");
		l.add("1");
		System.out.println(cm.size() + "size>>>" + cm);
		System.out.println(cm.isEmpty() + "isemp>>>" + cm);
		System.out.println(cm.contains("3") + "con>>>" + cm);
		System.out.println(l.toArray() + "toarr>>>" + cm);
		System.out.println(cm.remove(2) + "rm>>>" + cm);
		System.out.println(cm.containsAll(l) + "conall>>>" + cm);
		System.out.println(cm.addAll(l) + "adal>>>" + cm);
		System.out.println(cm.retainAll(l) + "retal>>>" + cm);
		System.out.println(l + ">>" + cm);
		System.out.println(l.removeAll(cm) + "rmal>>>" + cm);				
		System.out.println(cm.equals(l) + "eq>>>" + cm);
		System.out.println(cm.hashCode() + "hash>>>" + cm);
		System.out.println(">>>>>:::" + sl.getExactSizeIfKnown() + ":::splitr>>>" + cm);
		System.out.println(cm.stream() + "stream>>>" + cm);
		System.out.println(cm.parallelStream() + "parstream>>>" + cm);
		l.clear();
		System.out.println(l);
	}

}
