package dataAsgn4heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HeapFunc {
	
	int cap=10;
	int[] arr=new int[cap];
	
	int Hsize=0;
	
	public boolean isEmpty() {
		
		if(Hsize==0)
			return true;
		else
			return false;
	}
	
	public int getLeftCI(int i) {
		return 2*i;
	}
	
	public int getRightCI(int i) {
		return 2*i+1;
	}
	
	public int getParentI(int i) {
		return i/2;
	}
	
	public int leftC(int i) {
		return arr[getLeftCI(i)];
	}
	
	public int RightC(int i) {
		return arr[getRightCI(i)];
	}
	
	public int Parent(int i) {
		return arr[getParentI(i)];
	}
	
	public boolean hasLeftC(int i) {
		
		return getLeftCI(i)<Hsize;
		
	}
	
	public boolean hasRightC(int i) {
		
		return getRightCI(i)<Hsize;
		
	}

	public boolean hasParent(int i) {
		
		return getParentI(i)>=0;
	
	}
	
	public int size() {
		return Hsize;
	}
	
	
	
	public void insert(int k) {
		
		//if(!(isEmpty())) {
		//	System.out.println("Overflow, can not add!!");
		//	return;
		//}
		//else
		
		
		//int i=Hsize+1;
		arr[Hsize+1]=k;
		Hsize++;
		
		heapifyUp();
		
		/*while(i!=1&&arr[parent(i)]>arr[i]) {
			
			//swap(arr[i],arr[parent(i)]);
			
			int temp=arr[i];
			arr[i]=arr[parent(i)];
			arr[parent(i)]=temp;
			i=parent(i);
			
		}*/
	}
	
	/*public int parent(int i) {
		
		return i/2;
	}*/
	
	public int min() {
		if(Hsize==0) {
			System.out.println("Nothing in array!!");
			throw new IllegalStateException();
		}
		else
			return arr[1];
	}
	
	public int removeMin(int arr[]) {
		
		//if(Hsize==0) {
		//	System.out.println("Nothing in array!!");
		//	throw new IllegalStateException();
		//}
		
		int i=Hsize;
		int k=arr[1];
		arr[1]=arr[i];
		Hsize--;
		
		heapifyDown();
		
		return k;
	}
	
	public void heapifyDown() {
		
		int k=1;
		
		while(hasLeftC(k)) {
			int smallCI=getLeftCI(k);
			if(hasRightC(k) && RightC(k)<leftC(k)) {
				smallCI= getRightCI(k);
			}
			if(arr[k]<arr[smallCI]) {
				break;
			}
			else {
				swap(k,smallCI);
			}
			k=smallCI;
		}
		
	}
	
public void heapifyUp() {
	
	int k=Hsize;
	while(hasParent(k) && Parent(k)> arr[k]) {
		
		swap(getParentI(k),k);
		k=getParentI(k);
		
		
	}
		
	}

	public void swap(int i, int j) {
		
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}

	
	/*public void IncCap() {
		if(Hsize==cap) {
		arr=Arrays.copyOf(arr, cap*2);
		cap*=2;
		
		}
	}*/
	
	public void sort(int list[]) {
		
		for(int i=1;i<list.length;i++) {
			int j=i;
			while(j>0&&list[j-1]>list[j]) {
				int temp=list[j-1];
				list[j-1]=list[j];
				list[j]=temp;
				j--;
			}
		}
		
		for(int k: list) {
			System.out.println(k);
		}
		
	}
	
	 public int[] sortH(int k[]) 
	    { 
		 int f=Hsize;
		 	int list[]=new int[f+1];
		 	int i=0;
	        for(int e: k) {
	        	list[i]=removeMin(k);
	        	//Hsize--;
	        	i++;
	        }
	       
	        return list;
	    }
	 
	/* public int[] sortHR(int k[]) 
	    { 
		 	int list[]=new int[k.length];
	        for(int i=1;1<k.length;i++) {
	        	list[i]=removeMin(k);
	        	//Hsize--;
	        }
	       // arr=Arrays.copyOf(list, cap);
	        return list;
	    }*/
	 
	 public void RandomArr(int k) {
		 
		 Random r=new Random();
			//int k=0;
			int[] count=new int[k];
			
			for(int i=0;i<k;i++) {
				
				count[i]=r.nextInt(8);
				Hsize++;
				
			}
			
			//System.out.println(Hsize);
			
			for(int d: count) {
				System.out.println(d);
			}
			
			//int[] sorted=new int[k];
			
			//int[] sorted=sortH(count);
			
			sort(count);
			
			System.out.println("Random Sorting");
			
			for(int d: count) {
				System.out.println(d);
			}
	 }
}
