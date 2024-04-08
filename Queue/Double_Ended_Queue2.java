import java.util.Scanner;
class Deque_using_array{
	int front, rear, n;
	int s[];
	Deque_using_array(int size){
		n= size;
		s= new int[n];
		front= -1;
		rear= -1;
	}
void insert_front(int item){
	if(front== -1 && rear== -1){
		rear=0;
		front=0;
		s[front]= item;
	}
	else if( (front== 0 && rear== n-1) ||front == rear+1){
		System.out.println("DEqueue overflow");
	}
	else if(front==0){  
		front=n-1;  
		s[front]=item;
	}
	else{
		front=front-1;
		s[front]=item;  
  	} 
}



void insert_rear(int item){
	if(front== -1 && rear== -1){
		rear=0;
		front=0;
		s[rear]= item;
	}
	else if( (front== 0 && rear== n-1) ||front == rear+1){
		System.out.println("DEqueue overflow");
	}
	else if(rear==n-1){  
		rear=0;  
		s[rear]=item;
	}
	else{
		front=rear+1;
		s[rear]=item;  

 	}

} 


void delete_front(){  
	if((front==-1) && (rear==-1)){  
		System.out.println("There is no element to delete inside a deque");  
	}  
	else if(front==rear){  
		System.out.println("The deleted element from the front is "+s[front]);  
		front=-1;  
		rear=-1;        
	}  
	else if(front==(n-1)){  
		System.out.println("The deleted element from the front is "+s[front]);  
		front=0;  
	}  
	else{  
		System.out.println("The deleted element from the front is "+s[front]);  
		front=front+1;  
	}  
}  

 
void delete_rear(){  
	if((front==-1) && (rear==-1)){  
		System.out.println("There is no element to delete inside a deque");  
	}  
	else if(front==rear){  
		System.out.println("The deleted element from rear is "+s[rear]);  
		front=-1;  
		rear=-1;        
	}  
	else if(rear==0){  
		System.out.println("The deleted element from the rear is "+s[rear]);  
		rear=n-1;
	}  
	else{  
		System.out.println("The deleted element from rear is "+s[rear]);  
		rear = rear-1;
	}
}



void display(){  
	int i=front;  
	System.out.println("Elements inside the double ended queue are : ");    
	while(i!=rear){  
		System.out.println(s[i]);  
		i=(i+1)%n;  
	}  
	System.out.println(s[rear]);  
} 
}

class Double_Ended_Queue2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the Queue : ");
		int nk= sc.nextInt(); 
		Deque_using_array st= new Deque_using_array(nk);
		int ch=0;
		while(ch!=6){
			System.out.println("------------------------------------------");
			System.out.println(" Press 1 to insert an element from front");
			System.out.println(" Press 2 to insert an element from rear");
			System.out.println(" Press 3 to delete an element from front");
			System.out.println(" Press 4 to delete an element from rear");
			System.out.println(" Press 5 to display the elements");	
			System.out.println(" Press 6 to Exit");
			System.out.println("-----------------------------------------");
			System.out.println(" Enter your choise : ");
			ch= sc.nextInt();
			if(ch==1){
				int a;
				System.out.println("Enter an element : ");
				a= sc.nextInt();
				st.insert_front(a);
			}
			if(ch==2){
				int b;
				System.out.println("Enter an element : ");
				b= sc.nextInt();
				st.insert_rear(b);
			}
			if(ch==3){
				st.delete_front();
			}
			if(ch==4){
				st.delete_rear();
			}
			if(ch==5){
				st.display();
			}
			if(ch==6){
				break;
			}
		}
	}
}