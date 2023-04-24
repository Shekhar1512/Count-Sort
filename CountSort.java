package javaPrograms;

public class CountSort {

	public static void main(String[] args) {
		
		
		int a[] = {999,99,1,121,9,7,8,6,5,4,3,2,1,0,0,0,0,0,0,1,1,1,1,1,1,2,2,2,2,2,3,38,3,4,10,11};
		int b[] = new int[a.length];
		
		int max=0;
		for(int i=1; i<a.length; i++)
		{
			if(a[i]>a[max])
			{
				max=i;
			}
		}
				//above for loop find max element in given array
		max=a[max]+1;
		
		int count[] = new int [max+1]; // create new array of size max+1 and initialize it with zero  , in java it is by default
		
		//storing count of repeat elements 
		for(int i=0; i<a.length; i++)
		{
			count[a[i]]++;
		}
		
		for(int i=1; i<count.length; i++)
		{
			count[i]=count[i]+count[i-1];
		}
		
		
		for(int i=a.length-1; i>=0; i--)     //we traverse our array from last
		{
		      b[--count[a[i]]] =  a[i];
		}
		
		
		//copying second sorted array to first array 
		for(int i=0; i<a.length; i++)
		{
			a[i]=b[i];
		}
		
		
		//print sorted array
		for(int i :a)
		{
			System.out.print(i+"  ");
		}
		
		
		
		
		
		
	}

}
