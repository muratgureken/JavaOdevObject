package murat.obj.binaryTreeSoyAgaci;

public class Runner {

	public static void main(String[] args) {
		BST aile= new BST();
		Node ben = null;
		
		ben = aile.insert(ben, "Murat","",4);
		ben = aile.insert(ben, "Emel","A",4);
		ben = aile.insert(ben, "Turan","AB",4);
		ben = aile.insert(ben, "Erol","B",4);
		ben = aile.insert(ben, "Ayse","BA",4);
		ben = aile.insert(ben, "Fatma","BAA",4);
		ben = aile.insert(ben, "Mehmet","BAAB",4);
		System.out.println(ben.data+" "+ben.adi);
		System.out.println(ben.anne.data+" "+ben.anne.adi);
		System.out.println(ben.anne.baba.data+" "+ben.anne.baba.adi);
		System.out.println(ben.baba.data+" "+ben.baba.adi);
		System.out.println(ben.baba.anne.anne.baba.data+" "+ben.baba.anne.anne.baba.adi);
		
	}

}
