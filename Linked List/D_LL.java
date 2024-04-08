class D_LL{
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int key){
			data = key;
			next = null;
			prev = null;
		}
	}
	Node front = null;
	Node rear = null;
//-------------------------------------
	void insert_begin(int item){
		Node newNode = new Node(item);
		if(front == null){
			front = newNode;
			rear = newNode;
		}
		else{
			newNode.next = front;
			front.prev = newNode;
			front = newNode;
		}
		System.out.println("Rear -> "+rear.data);
		System.out.println("Front -> "+front.data);
		System.out.println("-----------------------");
	}
//----------------------------------------
	void insert_mid(int item, int loc){
		Node newNode = new Node(item);
		Node q = front;
		if(loc > 1){
		for(int i=1; i<loc-1; i++){
			if(q.next == null){
				System.out.println("location not present");
				return;
			}
			else{
				q = q.next;
			}
		}
		newNode.next = q.next;
		newNode.prev = q;
		q.next.prev = newNode;
		q.next = newNode;
		System.out.println("data entered");
		return;
		}
		System.out.println("Enter loc > 1");
	}
//-------------------------------------
	void insert_end(int item){
		Node newNode = new Node(item);
		if(front == null){
			front = newNode;
			rear = newNode;
		}
		else{
			newNode.prev = rear;
			rear.next = newNode;
			rear = newNode;
		}
		System.out.println("Rear -> "+rear.data);
		System.out.println("Front -> "+front.data);
		System.out.println("-----------------------");
	}
//------------------------------------------
	void delete_front(){
		if( rear ==  front ){
			rear = null;
			front = null;
			System.out.println("item deleted from front");
		}
		if(front != rear){
			front.next.prev = null;
			front = front.next;
			System.out.println("item deleted from front");
		}
		
		else{
			System.out.println("List Empty");
		}
	}
//---------------------------------------
	void delete_end(){
		if( rear ==  front ){
			rear = null;
			front = null;
			System.out.println("item deleted from end");
		}
		if(front != rear){
			rear.prev.next = null;
			System.out.println("item deleted from end");
		}
		else{
			System.out.println("List Empty");
		}
	}
//-----------------------------------------
	void delete_mid(int item){
		Node q = front;
		Node rec = null;
		while( q.next != null){
			if(q.data == item){
				break;
			}
			else{
				rec = q;
				q = q.next;
			}
		}
		rec.next = q.next;
		q.next.prev = rec;
		System.out.println("item deleted from mid");
	}
		
//------------------------------------
	void display(){
		Node q = front;
		while( q.next != null ){
			System.out.print(q.data+"->");
			q = q.next;
		}
		System.out.print(q.data);
	}
//-------------------------------------
	public static void main(String args[]){
		D_LL d = new D_LL();
		d.insert_end(6);
		d.insert_begin(10);
		d.insert_begin(20);
		d.insert_end(5);
		d.insert_begin(30);
		d.insert_begin(40);
		d.insert_end(4);
		d.insert_mid(33,5);
		d.delete_front();
		d.delete_end();
		d.delete_mid(20);
		d.display();
	}
}
		