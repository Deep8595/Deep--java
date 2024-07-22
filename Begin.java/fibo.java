import java.util.Scanner;
class fibo {
    public static void main(String[] args){
        int x , f=1, n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number :");
        n = scan.nextInt();
        scan.close();
        // Calculating fibo series
        for(x=1;x<=n;x++){
            f=f*x;
        }
        System.out.println("factorial of "+n+" = "+f);

    }
}
