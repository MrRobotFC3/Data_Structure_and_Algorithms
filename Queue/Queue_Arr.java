import java.util.Scanner;
class queue_using_array{
	int front, rear, n;
	int s[];
	queue_using_array(int size){
		n= size;
		s= new int[size];
		front= -1;
		rear= -1;
	}
	void insert(int item){
		if(front== -1 && rear== -1){
			rear=0;
			front=0;
			s[rear]= item;
		}
		else if( rear== n-1 ){
			System.out.println("Queue overflow");
		}
		else{
			rear++;
			s[rear] = item;
			System.out.println("Element Inserted");
		}
	}

	void delete(){
		if(front == -1 && rear== -1){
			System.out.println("Queue is empty");
		}
		else if(front==rear){
			System.out.println("Element Deleted");
			front=-1;
			rear=-1;
		}
		else{
			front++;
			System.out.println("Element deleted");
		}
	
	}

	void display(){
		if(front==-1 && rear==-1){
			System.out.println("Queue is empty");
		}
		else{
			System.out.println("Elements of Queue are :");
			for(int i = front; i <= rear; i++){
          			  System.out.println(s[i]);
        		}
		}
	}
}


class Queue_Arr{
	public static void main(String args[]){
		queue_using_array st= new queue_using_array(5);
		Scanner sc = new Scanner(System.in);
		int ch=0;
		while(ch!=4){
			System.out.println("-----------------------------------");
			System.out.println("| Press 1 to insert an element     |");
			System.out.println("| Press 2 to delete an element     |");
			System.out.println("| Press 3 to display the elements  |");	
			System.out.println("| Press 4 to Exit                  |");
			System.out.println("-----------------------------------");
			System.out.println(" Enter your choise : ");
			ch= sc.nextInt();
			if(ch==1){
				int a;
				System.out.println("Enter an element : ");
				a= sc.nextInt();
				st.insert(a);
			}
			if(ch==2){
				st.delete();
			}
			if(ch==3){
				st.display();
			}
			if(ch==4){
				break;
			}
		}
	}
}