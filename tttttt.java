package java_Pra;
import java.util.*;
public class tttttt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0 ; i<n ; i++)  arr[i] = sc.nextInt();
        int left=0,right=n-1,mid,pre,nxt;
        if(arr[0] != arr[1])System.out.print(arr[0]);
        else if(arr[n-1] != arr[n-2])System.out.print(arr[n-1]);
        else{
            while(left <= right){
                mid = ((right-left)/2)+left;
                pre = mid-1;
                nxt = mid+1;
                if((arr[pre] != arr[mid]) && (arr[nxt] != arr[mid])){
                    System.out.print(arr[mid]);
                    break;
                }
                else if(mid%2==0){
                    if(arr[pre] == arr[mid])right = mid - 1;
                    else left = mid + 1;
                }
                else{
                    if(arr[pre] == arr[mid])left = mid + 1;
                    else right = mid - 1;
                }
            }
        }
        sc.close();
   }
}
