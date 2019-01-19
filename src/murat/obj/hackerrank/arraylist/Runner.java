package murat.obj.hackerrank.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
	       int deger, deger2, deger3;
	        String s;
	        Scanner scan = new Scanner(System.in);
	        ArrayList<Integer> array1 = new ArrayList<Integer>();
	        deger = scan.nextInt();
	        for(int i=0;i<deger;i++)
	        {
	            deger2 = scan.nextInt();
	            ekle(array1, deger2,i);
	        }
	        deger = scan.nextInt();
	        for(int i=0; i<deger;i++)
	        {
	           System.out.println("hehe");
	        	s = scan.next();
	        	System.out.println("ne:"+s);
	            if(s.equals("Insert"))
	            {
	                deger2 = scan.nextInt();
	                deger3 = scan.nextInt();
	                ekle(array1,deger3,deger2);
	            }
	            if(s.equals("Delete"))
	            {
	                deger2 = scan.nextInt();
	                cikar(array1,deger2);
	            }
	        }
	        yazdir(array1);
	        
	    }

	    public static void ekle(ArrayList<Integer> array1, int deger, int indis)
	    {
	        array1.add(indis, deger);
	    }

	    public static void cikar(ArrayList<Integer> array1, int deger)
	    {
	        array1.remove(deger);
	    }
	    public static void yazdir(ArrayList<Integer> array1)
	    {
	        for(Integer a:array1)
	        {
	            System.out.print(a);
	            System.out.print(" ");
	        }
	            System.out.println();
	    }

}
