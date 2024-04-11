
class Queue_Using_Stack{
	int stack1[] = new int[5];
	int stack2[] = new int[5]; 
	int top1=-1, top2=-1;   
	int count=0;  
	int N = 5;
  
	void push1(int data1){   
 		if(top1== N-1){  
			System.out.println("Stack is overflow...");  
		}  
		else{  
   			top1++;  
   			stack1[top1] = data1;  
		}
	}  
  
	int pop1(){     
		if(top1 == -1){  
   			System.out.println("Stack is empty..");  
		}  
		else{  
   			int a = stack1[top1];   
   			top1--;  
   			return a;   
		}  
		return -1;
	}     
	void push2(int data2){
		if(top2 == N-1){  
   			System.out.println("Stack is full..");  
		}  
		else{  
    		top2++;
    		stack2[top2] = data2; 
  
		}  
	}   
	int pop2(){  
   		int b = stack2[top2];  
   		top2--;
   		return b;  
	}   
	void enqueue(int x){  
    		push1(x);  
    		count++;  
	}  
	void dequeue(){  
   		if((top1 == -1) && (top2 == -1)){  
   			System.out.println("Queue is empty");  
		}  
		else{  
  			for(int i=0; i<count; i++){  
     			int element = pop1();  
     			push2(element);  
  			}  
			int b= pop2();  
			System.out.println("The dequeued element is "+b);  
			System.out.println("");  
			count--;  
			for(int i=0; i<count; i++){  
   				int a = pop2();  
   				push1(a);   
			}  
		}
	}   
	void display(){  
   		for(int i=0;i<=top1;i++){  
     		System.out.println(stack1[i]+" ");  
  		}  
	}  
	public static void main(String args[]){
		Queue_Using_Stack q = new Queue_Using_Stack(); 
   		q.enqueue(10);  
   		q.enqueue(20);  
   		q.enqueue(30);  
   		q.dequeue();  
   		q.enqueue(40);  
   		q.display();  
	} 
} 