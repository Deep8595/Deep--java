//there are three type of constructor in this 
//1) Default constructor -- compiler is created this
//2) No-args constructor -- user created 
//3) parameterized constructor -- user created parameter pass in this(int a , int b)
public class type_constructor{
	public static void main(String []args){
		demo d1 = new demo(5,6);
		demo d2 = new demo(5);
		d2.SetData(44,55);
		d1.SetData(11,99);
		demo d3 = new demo();
		
	}
	 
}

class demo{
	static void  SetData (int a , int b){
		System.out.println("Number is "+a);
		System.out.println("Number is "+b);
		System.out.println("HELLO");
	}
	demo(int r , int s){
		System.out.println(r);
		System.out.println(s);
	}
	demo(){
	System.out.println("DONE");
	}
	demo(int t){
	System.out.println("Number is" +t);
	}
	
}

