package java_Pra;
import java.util.*;
public class tt {
    

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int mod = (int)1e8+7;
    long n,a=0,b=1,c=2,d=0;

    n = sc.nextLong();
    if(n<=0){
        System.out.println("INVALID INPUT");
        System.exit(1);
    }
    if(n==1 || n==2)
        System.out.println(n-1);
    else{
        for(int i=3 ; i<=n ; i++){
            d = (c * (a + b))%m;
            a = b;
            b = d;
             c++;
        }
        System.out.println(d);
        }
    }
}
