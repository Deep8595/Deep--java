class Command_Line_Arg{
    public static void main(String []args){
        // int a[] =  new int[5];
        // a[1] = 51;
        // System.out.println(a.length);
        // String[] x = new String[3];
        // x[0] = "Ashish";
        // x[1] = "Deep";
        // x[2] = "Anshu";
        // System.out.println(x[2]);
    //___Command line Argument___
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(args[2]);
        // System.out.println(args[3]);

        int i , s = 0 ;
        for(i=0 ; i<args.length; i++){
            // System.out.println(Integer.parseInt(args[i]));
            s = s+ Integer.parseInt(args[i]);
        }
        System.out.println("Average is "+s/args.length);

    }
}
