package com.corejava;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

/**
 *
 * @author Pradeep
 */
public class ArrayListExample {
    public static void main(String args[]){
    List<String> li1 = new ArrayList<String>();
    //List<String> li1 = new Vector<String>();
    //List<String> li1 = new Stack<String>();
    //Set<String> li1 = new LinkedHashSet<String>();
    //Set<String> li1 = new HashSet<String>();
    //Set<String> li1 = new TreeSet<String>();
    li1.add("4");
    li1.add("2");
    li1.add("1");
    li1.add("5");
    li1.add("6");
    li1.add("3");
 
    System.out.println(li1 + " " + li1.hashCode());
    
    }
}
