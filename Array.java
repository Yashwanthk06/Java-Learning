import java.util.*;
class Array{
    public static void main(String []args){
        int n[] = new int[10];
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values for an array");
        for(int i=0; i<10; i++){
            n[i] = sc.nextInt();
        }
        for(int i = 0;i<10;i++){
            a[i] = (int)Math.pow(2,n[i]);
        }
         int c= 0;
        for(int i =0;i<10;i++){
           
            c = a[i] + c;
        }
    System.out.println("The sqayre of every element and addition of tht is "+c);
}
}
