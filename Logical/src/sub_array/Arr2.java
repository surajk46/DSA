package sub_array;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Arr2 {
	
	  public static List<Integer> reverseArray(List<Integer> a) {
		    // Write your code here
		    List<Integer> arr=new ArrayList<>();
		    int end=a.size()/2;
		    int e=a.size()-1;
		    System.out.println("half size: "+a.size()/2);
		    System.out.println("full size: "+e);
		    for(int i=0;i<end;i++)
		    {
		        int temp=a.get(i);
		        a.set(i,a.get(e));
		        a.set(e, temp);
		        e--; 
		    }
		    return a;
		}
	
	
	public static void main(String[] args) {
		List<Integer>arr=new ArrayList<>();
		for(int i=0;i<5;i++)
			arr.add(i);
		
		
		
		for(int i=0;i<arr.size();i++)
			System.out.println("old : "+arr.get(i));
		
		
		
		
		System.out.println(arr.size());
		int d=2;
		
		int narr[]=new int[arr.size()];
		int l=arr.size();
	        for(int i=0;i<l-d;i++)
	        {
	          narr[i]=arr.get(i);
	    
	        }
	        int k=0;
	        for(int i=l-d;i<arr.size();i++)
	        {
	          arr.set(k++,arr.get(i));
	        }
	         for(int i=0;i<l-d;i++)
	        {
	          arr.set(k++,narr[i]);
	        }
	         for(int i=0;i<narr.length;i++)
	 		{
	 			System.out.println("arr:" +narr[i]);
	 		}
		
		
//		int d=2;
//		
//		int narr[]=new int[arr.size()-d-1];
//		int k=0;
//		for(int i=arr.size()-d;i<arr.size();i++)
//			{
//				narr[k]=arr.get(i);
//				arr.set(i, arr.get(k));
//				k++;
//			}
//		
////		for(int i=0;i<narr.length;i++)
////		{
////			System.out.println("arr:" +narr[i]);
////		}
//		
//		
//		for(int i=0;i<arr.size()-d;i++)
//		{
//			arr.set(i, narr[i]);
//		}
		
	         class Checker implements Comparator
	         {
	        	 public int compare(Object o1,Object o2)
	        	 {
	        		 Player a1=(Player)o1;
	        		 Player a2=(Player)o2;
	        		 if(a1.score==a2.score)
	        			 return a1.name.compareTo(a2.name);
	        		 else if(a1.score>a2.score)
	        			 	return -1;
	        		 else {
						return 1;
					}
	        	 }
	         }
		
	
		
		
		//List<Integer>aa=reverseArray(arr);
		for(int i=0;i<arr.size();i++)
			System.out.println(arr.get(i));
	}
}
