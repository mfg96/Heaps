package dataAsgn4heaps;

import java.util.*;

public class MinHeap
{

	public static void main(String[] args) {
		
		
		
		
		HeapFunc H=new HeapFunc();
		
		
		H.insert(16);
		H.insert(13);
		H.insert(4);
		H.insert(18);
		H.insert(23);
		H.insert(25);
		H.insert(44);
		H.insert(29);
		H.insert(30);
		
		for(int k: H.arr) {
			System.out.println(k);
		}
		
		System.out.println("Size");
		
		System.out.println(H.Hsize);
		//System.out.println("Removal");
		
		//System.out.println(H.removeMin());
		
		System.out.println("Sorting");
		
		H.sort(H.arr);
		
		//int ar[]=H.sortH(H.arr);
		
		
		
		//for(int k: ar) {
		//	System.out.println(k);
		//}
		
		//for(int k: H.arr) {
		//	System.out.println(k);
		//}
		 
		/*
		long start=System.nanoTime();
		H.RandomArr(128);
		
		long end=System.nanoTime();
		
		System.out.println("Time= "+(end-start));
		
		//System.out.println("removal");
		//System.out.println(H.removeMin(H.arr));*/

	}

}
