import java.util.*;
public class q2{

    static boolean sum_rec(int a,int b,int c,int d){
        if(a>c || b>d) return false;
        if(a==c && b==d) return true;

        return sum_rec(a,a+b,c,d) || sum_rec(a+b,b,c,d);
    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);  //Scanner input object 
        int a,b,c,d;
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        System.out.println(sum_rec(a,b,c,d));
    }
}