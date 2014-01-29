/**
 * 
 */

/**
 * @author allwin.raj
 *
 */
public class Stack {
	final int len = 5;
	int sp;
	int[] stk = new int[len];
	/**
	 * 
	 */
	public Stack() {
		// TODO Auto-generated constructor stub
		sp = -1;
	}
	
	public void push(int val){
		if(!isFull()){
			stk[++sp] = val;
		}
		else
		{
			System.out.println("Stack Overflow");
		}
	}

	public int pop(){
		if(!isEmpty()){
			return stk[sp--];
		}
		else
			System.out.println("Stack Underflow");
		return -1;
	}
	
	public int peep(){
		if(!isEmpty()){
			return stk[sp];
		}
		else
			System.out.println("Stack Underflow");
		return -1;
	}
	
	public boolean isEmpty(){
		if(sp<0)
		return true;
		return false;
	}
	public boolean isFull(){
		if(sp>=len-1)
		return true;
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack();
		for(int i = 0; i<7;i++){			
			int val = ((int)((100 - 0) * Math.random()));
			System.out.println("Pushed : "+val);
			s.push(val);
		}
		
		
		for(int i = 0; i<7;i++){	
			System.out.println("Peeped : "+s.peep());
			System.out.println("Poped : "+s.pop());
		}
		
		
	}

}
