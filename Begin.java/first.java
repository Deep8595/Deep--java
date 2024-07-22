class first{
 private static int x;
 static void fun1(){
    x = 5;
    System.out.println("Hello static");
    System.out.println(x);
    
 }
}

class inter{
    public static void main(String[] args){
        // first f1 = new first();
        // f1.fun1();
        first.fun1();
        
        System.out.println();
    }
}
