package java_Pra;
import java.util.*;

public class nareshtest {

  static int c=0;
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    for(int i=0;i<t;t++){
      int n=sc.nextInt();
      int ar[]=new int[n];
      for(int j=0;j<n;ar[j++]=sc.nextInt());
      int s=sc.nextInt();
      sol(n,ar,s);
    }
  }
  public static void sol(int n, int[]ar,int s){
    if(n==0||s<0){return;}
    boolean[][] arr=new boolean[n][s+1];
    for(int i=0;i<n;arr[i++][0]=true);
    for(int i=1;i<n;i++)
      for(int j=0;j<=s;j++)
        arr[i][j]=(ar[i]<=j)?(arr[i-1][j]||arr[i-1][j-ar[i]]):arr[i-1][j];
    if(arr[n-1][s]==false){
      System.out.print("THERE IS NO SUBSET");return;
    }
    System.out.println(count(arr,ar,n-1,s));
  }
  public static int count(boolean[][]arr,int[]ar,int n,int s){
    if(n==0&&s!=0&&arr[0][s]){
      c++;
      return c;
    }
    if(n==0&&s==0){
      c++;return c;
    }
    if(arr[n-1][s]){
      count(arr,ar,n-1,s);
    }
    if(s>=ar[n]&&arr[n-1][s-ar[n]]){
      count(arr,ar,n-1,s-ar[n]);
    }
    return -1;
  }
}