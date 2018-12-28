package murat.obj.binaryTreeSoyAgaci;

public class Runner {

	public static void main(String[] args) {
		BST aile= new BST();
		Node ben = null;
		
		ben = aile.insert(ben, "Murat","",3);
		ben = aile.insert(ben, "Emel","A",3);
		ben = aile.insert(ben, "Turan","AB",3);
		System.out.println(ben.data+" "+ben.adi);
		System.out.println(ben.anne.data+" "+ben.anne.adi);
		System.out.println(ben.anne.baba.data+" "+ben.anne.baba.adi);
	}

}
