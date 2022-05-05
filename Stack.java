class Stack{
	int arr[];
	int top1;
	int top2;
	int capacity;
	
	Stack(int size){
		arr=new int[size];
		capacity = size;
		top1=-1;
		top2=size;
		
	}
	
	public void push1(int x){
		arr[++top1]= x;
	}
	
	public void push2(int x){
		arr[--top2]=x;
	}
	
	public int pop1(){
		System.out.println("Popped element from stack1 is "+arr[top1]);
		return arr[top1--];
	}
	
	public int pop2(){
		System.out.println("Popped element from stack2 is "+arr[top2]);
		return arr[top2++];
	}
	
	
	public static void main(String args[]){
		Stack s1 = new Stack(10);
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		s1.push2(40);
		
		s1.pop1();
		s1.pop2();
		
	}
}