package murat.obj.odevSoyAgaci;

import java.util.LinkedList;

public class RunnerLinkedList {

	public static void main(String[] args) {
		LinkedList<Aile> kisi = new LinkedList<Aile>();
		
		Aile ben = new Aile("Murat","Emel","Erol");
		kisi.add(new Aile("Murat","Emel","Erol"));
		
		for(Aile element : kisi)
		{
			System.out.println(element+"\n");
		}
			kisi.getClass();
	}

}
