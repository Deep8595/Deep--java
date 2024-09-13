public class reStart {

    public static void main(String[] args){
        // Example e1 = new Example();
        // e1.f1(5,6);
        // e1.display();
        example e2 = new example();
        e2.f3( 10, 11);
        e2.display();
        Example e1 = new Example();
        e1.display();

    }
}
class Example{
    protected int x;
    protected int y;
void f1(int x , int y){
     this.x = x ;
     this.y = y;
}
void display(){
    System.out.println(x);
    System.out.println(y);
}
}

class example extends Example{
    int x,y;
    void f3(int x , int y){
    super.x = x;
    super.y = y;
    }

    void display(int x, int y){
        System.out.println(super.x);
        System.out.println(super.y);
    }
}

