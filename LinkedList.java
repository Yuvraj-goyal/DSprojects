package labb7;

public class LinkedList {
	static node head=null;
	static class node{
		int data;
		node nxt;
		node(int a){
		data=a;
		}
		node(int a, node b){
			data=a;
			nxt=b;
		}
	}

	public static void main(String[] args) {
		node n1=new node (50) ;
		node n2=new node(11);
		node n3=new node (33) ;
		node n4=new node (21) ;
		node n5=new node (40);
		node n6=new node (71) ;
		head=n1;
		n1.nxt=n2;
		n2.nxt=n3;
		n3.nxt=n4;
		n4.nxt=n5;
		n5.nxt=n6;
		System.out.println( "Elements of linked list");
		print (head) ;
		remove2Last(head);
		System.out.println( "Elements of linked list after removal of 2nd last element");
		print (head) ;
		}
		public static void print (node head)
		{
		node temp=head;
		while(temp!=null)
		{
		System.out.print (temp.data+" ");
		temp=temp. nxt;
		}
		System.out.println();
	}
		public static void remove2Last(node head) {
			node slow = head, fast=head;
			fast=head.nxt.nxt;
			while(fast.nxt!=null) {
				slow = slow.nxt;
				fast=fast.nxt;
			}
			slow.nxt=fast;
		}

}
