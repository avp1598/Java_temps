import java.util.*;
public class q2{

    static boolean sum_rec(int a,int b,int c,int d){
        if(a>c || b>d) return false;
        if(a==c && b==d) return true;

        return sum_rec(a,a+b,c,d) || sum_rec(a+b,b,c,d);//recur both paths
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);  //Scanner input object 
        int a,b,c,d;
        System.out.println("Enter a:");
        a=in.nextInt();
        System.out.println("Enter b:");
        b=in.nextInt();
        System.out.println("Enter c:");
        c=in.nextInt();
        System.out.println("Enter d:");
        d=in.nextInt();
        System.out.println(sum_rec(a,b,c,d));//print true or false
    }
}