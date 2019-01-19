package murat.obj.hackerrank.generics;

import java.io.IOException;
import java.lang.reflect.Method;

//import javafx.print.Printer;

public class Runner {

	public static void main(String[] args) {
		  Printer myPrinter = new Printer();
	        Integer[] intArray = { 1, 2, 3 };
	        String[] stringArray = {"Hello", "World"};
	        myPrinter.printArray(intArray);
	        myPrinter.printArray(stringArray);
	        int count = 0;

	        for (Method method : Printer.class.getDeclaredMethods()) {
	            String name = method.getName();

	            if(name.equals("printArray"))
	                count++;
	        }

	        if(count > 1)System.out.println("Method overloading is not allowed!");
	}

}

class Printer
{
   public void printArray(Integer[] deger)
   {
       for(int i=0;i<deger.length;i++)
       {
        System.out.println(deger[i]);
       }
   }
 
    public void printArray(String[] deger) {
        for (int i = 0; i < deger.length; i++) {
            System.out.println(deger[i]);
        }
    }
}