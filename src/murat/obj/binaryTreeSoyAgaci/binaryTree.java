package murat.obj.binaryTreeSoyAgaci;

class Node{
	String adi;
	String soyadi;
	int data;
	Node anne;
	Node baba;
}

class BST{
	public Node CreateNewNode(int k, String adi) {
		Node a = new Node();
		a.data = k;
		a.adi =adi;
		a.anne = null;
		a.baba = null;
		return a;
	}
	
	public Node insert(Node node, String adi, String soy, int gobek) {
		int val,fark;
		val = (int)Math.pow(2, gobek);
		fark = val/2;
		for(int i=0;i<soy.length();i++)
		{
			if(soy.substring(i, i+1).equals("A"))
			{
				val = val - fark;
			}
			else
			{
				val = val + fark;
			}
			fark = fark/2;
		}
		
		if(node==null)
		{
			return CreateNewNode(val, adi);
		}
		
		if(val<node.data)
		{
			node.anne = insert(node.anne, adi, soy, gobek);
		}
		else if(val>node.data)
		{
			node.baba = insert(node.baba, adi, soy, gobek);
		}		
		
		return node;
	}
	
}

public class binaryTree {
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
