import java.util.*;
class Greater{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A value is Greater than B");
        }
        else{
            System.out.println("B is Greater");
        }
    }
}
