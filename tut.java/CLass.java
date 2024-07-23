class CLass {
    public static void  main(String[] args){
        newClass.fin();
        newClass.fin2();
        newClass newC = new newClass();
        newClass newcc = new newClass();
        newcc.x = 10;
        newcc.y = 20;
        newC.x = 5;
        newC.y = 50;
        System.out.println(newC.x);
        System.out.println(newcc.y);
    }
}
class newClass{
    int x , y ;
    static void fin(){
        System.out.println("fin");
    }
    static void fin2(){
        System.out.println("fin2");
    }
}

