package com.corejava;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachIterable {
	
	public static void main(String[] args) {
		List<Integer> ls = new ArrayList<Integer>();
		for(int i=1;i<=10;i++){
			ls.add(i);
		}
		Iterator<Integer> iterator = ls.iterator();
		while(iterator.hasNext()){
			Integer l = iterator.next();
			System.out.println("Iterator Value:" +l);
		}
		//traversing through forEach method of Iterable with anonymous class
		ls.forEach(new Consumer<Integer>(){
			public void accept(Integer t) {
				System.out.println("ForEach Anonymous class Value: " +t);
			}
			
		});
		for(Integer in:ls){
			System.out.println("ForEach :" +in);
		}
		
	}

}
