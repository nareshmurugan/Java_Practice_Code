package java_Pra;
import java.util.*;
public class oddocur {

  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int ar[]=new int[n];
    for(int i=0;i<n;ar[i++]=sc.nextInt());
    sc.close();
    int l=0,r=n-1,m;
    if(ar[0]!=ar[1])System.out.print(ar[0]);
    else if(ar[n-1]!=ar[n-2])System.out.print(ar[r]);
    else{
      while(l<=r){
        m=(r-l)/2+l;
        if((ar[m-1]!=ar[m]&&(ar[+1]!=ar[m]))){
          System.out.print(ar[m]);
          break;
        }
        else if(m%2==0){
          if(ar[m-1]==ar[m])r=m-1;
          else l=m+1;
        }
        else{
          if(ar[m-1]==ar[m])l=m+1;
          else r=m-1;
      }
    }
  }
}
}