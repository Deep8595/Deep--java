class A{
    private int x;
    private static int y ;
    void fun1(){
        x = 40;
        y = 11;
    }
    void fun2(){
        System.out.println(x);
        System.out.println(y);
    }
    void fun3(){
        y = 55;
    }
}
/**
 * staticMember
 */
public class staticMember {

    public static void main(String[] args) {
        A a = new A();
        a.fun1();
        // a.fun2();
        A b = new A();
        b.fun3();
        b.fun2();
        System.out.println();
    }
}