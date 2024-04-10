import java.util.Scanner;
class stack_using_array{
	int top, n;
	int s[];


	stack_using_array(int size){
		top= -1;
		s= new int[size];
		n= size;
	}


	void push(int item){
		if(top== n-1){
			System.out.println("Stack overflow");
			}
		else{
			top=top+1;
			s[top]=item;
			System.out.println("element pushed successfully");
		}
	}

	void pop(){
		if(top== -1){
			System.out.println("Stack empty");
		}
		else{
			top= top-1;
			System.out.println("an element poped successfully");
		}
	}


	void display(){
		System.out.println("Elements of stack are :");
		for(int i=0; i<=top; i++){
			System.out.println(s[i]);
		}
	}
}


class test_stack{
	public static void main(String args[]){
		stack_using_array st= new stack_using_array(5);
		Scanner sc = new Scanner(System.in);
		int ch=0;
		while(ch!=4){
			System.out.println("-------------------------------------");
			System.out.println("| Press 1 to push an element         |");
			System.out.println("| Press 2 to pop an element          |");	
			System.out.println("| Press 3 to display the elements    |"); 
			System.out.println("| Press 4 to Exit                    |");
			System.out.println("-------------------------------------");
			System.out.println(" Enter your choise : ");
			ch= sc.nextInt();
			if(ch==1){
				int a;
				System.out.println("Enter the element : ");
				a= sc.nextInt();
				st.push(a);
			}
			if(ch==2){
				st.pop();
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