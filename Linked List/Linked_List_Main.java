import java.util.Scanner;
class Linked_List{
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
	void insert_begin(int item){
		Node newNode= new Node();
		newNode.data = item;
		newNode.next = head;
		head = newNode;	
	}
//--------------------------------------------------------
	void insert_mid(int item, int loc){
		Node newNode= new Node();
		tail=head;
		for(int i=0; i<loc-1; i++){
			tail=tail.next;
			if(tail.next==null){
				System.out.println("index not present");
				return;
			}
		}
		newNode.data=item;
		newNode.next=tail.next;
		tail.next=newNode;
		System.out.println(item+" Entered");
		
	}
//--------------------------------------------------------	
	void insert_end(int item){
		Node newNode= new Node();
		tail = head;
		if(head == null){
			newNode.data = item;
			newNode.next = head;
			head = newNode;
		}
		else{
			while(tail.next != null){
				tail = tail.next;
			}
		newNode.data = item;
		newNode.next = null;
		tail.next = newNode;
		}
	}	
	
//-----------------------------------------------------------
	void delete_begin(){
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			head = head.next;
			System.out.println("Deleted");
		}
		
	}
	

    
//-----------------------------------------------------------
	void delete_mid(int key){
		tail = head;
        	Node previous = null;
        	if(tail == null){
            		System.out.println("Linked List empty");
			return;
      		}
		else{
        		if(tail.data == key){
            			head = tail.next;
            			System.out.println("Deleted: " + key);
				return;
	        	}
	        	while (tail != null && tail.data != key){
	            		previous = tail;
        	    		tail = tail.next;
        		}
        		if(tail==null){
				System.out.println("Value not found");
				return;
			}
        		previous.next = tail.next;
        		System.out.println("Deleted: " + key);
		}
	}
//------------------------------------------------------------------
	void delete_end(){
		tail = head;
		Node previous = null;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			while(tail.next != null){
				previous = tail;
				tail = tail.next;
			}
		}
		previous.next = null;
        	System.out.println("Deleted");
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
	void display_list(){
		tail = head;
		if(head == null){
			System.out.println("List is empty");
			return;
		}
		else{
			System.out.println("Currently all the nodes in the list");
			while(tail != null){
				System.out.println(tail.data+" ");
				tail = tail.next;
			}
		}
	}
	Node merge(Node n1, Node n2){
		tail = n1;
		if(n1 != null && n2 != null){
			  while(tail.next != null){
				tail=tail.next;
			  }
			tail.next = n2;
			return n1;
		}
		if(n1 == null){
			return n2;
		}
		return n1;
	}
	void d1(Node n){
		System.out.println("Currently all the nodes in the merged list");
		while(n.next != null){
			System.out.println(n.data+" ");
			n = n.next;
		}
		System.out.println(n.data+" ");
	}
}
//------------------------------------------------------------

class Linked_List_Main{
	public static void main(String args[]){
		Linked_List l1 = new Linked_List();
		Linked_List l2 = new Linked_List();
		l1.insert_begin(30);
		l1.insert_begin(20);
		l1.insert_begin(10);
		l1.display_list();
		l2.insert_begin(60);
		l2.insert_begin(50);
		l2.insert_begin(40);
		l2.display_list();
		l1.d1(l1.merge(l1.head, l2.head));
			
	}
}

	

		