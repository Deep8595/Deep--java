// hierarchical level 
class inHeritance1{
	public static void main(String[] args){
		C c = new C();
		c.fun2();
		c.fun5();
		B b = new B();
		b.fun1();
		//b.fun2();
		b.fun3();
		b.fun4();
	}
}
// Parents Class
class A{
	void fun1(){
		System.out.println("HELLO");
	}
	void fun2(){
		System.out.println("HII");
	}
	
}
// Subclass 1
class B extends A{
	void fun3(){
		System.out.print("DEEP");
	}
	void fun4(){
         System.out.print("ANSHU");
	}
}
// Subclass 2
class C extends A{
    void fun5(){
		System.out.println("FUNS WORK");
	}
}