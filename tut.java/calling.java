/**
 * code
 */
class box{
    static void fun1(){
        System.out.println("fun1");
    }
    static void fun2(){
        System.out.println("fun2");
    }
}
class calling{
     static void fun3(){
        System.out.println("fun3");
     }
}
class code{
    static void fun4(){
        System.out.println("fun4");
    }
    public static void main(String[] args){
    //    System.out.println("Hello Deepanshu"); 
    box.fun1();
    box.fun2();
    calling.fun3();
    fun4();

    }
}