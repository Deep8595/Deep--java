// multiLevel INheritance 

class multiLevel_inHeritance{
	public static void main(String [] args){
		level3 l3 = new level3();
		l3.fun6();
		l3.fun1();
		level2  l2 = new level2();
		l2.fun2();
		l2.fun4();
	}
	
}

class level1{
	void fun1(){
		System.out.println("HELLO");
	}
	void fun2(){
		System.out.println("WORK");
	}
}

class level2  extends level1{
	void fun3(){
		System.out.println("IS");
	}
	void fun4(){
		System.out.println("DONE");
	}
}

class level3 extends level2{
	void fun5(){
		System.out.println("HII");
	}
	void fun6(){
	    System.out.println("SIR");	
	}
	level3(){
	System.out.println("DEEP");
	}
}