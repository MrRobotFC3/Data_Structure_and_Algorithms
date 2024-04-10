import java.util.Scanner;
class stack_LL1{
	class Node{
		int data;
		Node next;
		Node(){
			data=0;
			next=null;
		}
	}
	Node head = null;
	Node tail = null;
//-------------------------------------------------------
	void push(int item){
		Node newNode= new Node();
		newNode.data = item;
		newNode.next = head;
		head = newNode;	
		System.out.println("Inserted");
	}	
	
//-----------------------------------------------------------
	void pop(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			head = head.next;
			System.out.println("Deleted");
		}
		
	}
//------------------------------------------------------------
	boolean contains(int item){
		tail=head;
		while(tail.next != null){
			if(tail.data == item){
				return true;
			}
			tail = tail.next;
		}
		return false;
	}
//------------------------------------------------------------
	int indexOf(int item){
		tail=head;
		int index=0;
		while(tail.next != null){
			if(tail.data == item){
				return index;
			}
			tail = tail.next;
			index++;
		}
		return -1;
	}
//------------------------------------------------------------
	void display(){
		tail = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			System.out.print("Display : ");
			while(tail.next != null){
				System.out.print(tail.data);
				tail = tail.next;
				if(tail.next != null){
					System.out.print("->");
				}	
			}
			System.out.print("->");
			System.out.print(tail.data);
			System.out.println("");
		}
	}
}
	
//------------------------------------------------------------

class stack_LL{
	public static void main(String args[]){
		stack_LL1 s = new stack_LL1();
		s.push(10);
		s.push(20);
		s.push(30);
		s.display();
		s.pop();
		s.display();	
	}
}

	

		