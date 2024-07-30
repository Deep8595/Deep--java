//INHERITANCE IN JAVA 
// Nokia is parent class(Super Class)
// SINGLE LEVEL INHERITANCE ;

class inHeritance{
	public static void main(String []args){
	Nokia2 n1 = new Nokia2();
	n1.setData();
	n1.f1();
	
	}
}

class Nokia{
	int mic;
	int speacker;
	int radio;
	void setData(){
		System.out.println("HELLO");
		
	}
    void display(){
	
    }
	
}
// Nokia2 is child class(Sub CLass)
class Nokia2 extends Nokia{
	int sensor;
	int music;
	void f1(){
	System.out.println("WORK");
	}
	
}

