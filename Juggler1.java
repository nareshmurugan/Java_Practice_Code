import java.io.*;
import java.util.*;
class Main {
 
                static void printBool(int n, int len)
                {
 
                                while (n>0) {
                                                if ((n & 1) == 1)
                                                                System.out.print(1);
                                                else
                                                                System.out.print(0);
 
                                                n >>= 1;
                                                len--;
                                }
 
                                while (len>0) {
                                                System.out.print(0);
                                                len--;
                                }
                                System.out.println();
                }
 
                static void printSubsetsCount(int set[], int n, int val)
                {
                                int sum;
                                int count = 0;
                                for (int i = 0; i < (1 << n); i++) {
                                                sum = 0;
                                                for (int j = 0; j < n; j++)
 
                                                                if ((i & (1 << j)) > 0) {
                                                                                sum += set[j];
                                                                }
 
                                                if (sum == val) {
                                               
                                                                count++;
                                                }
                                }
 
                                if (count == 0) {
                                                System.out.println("No subset is found");
                                }
                                else {
                                                System.out.println(count);
                                }
                }
 
                public static void main(String[] args)
                {
                    Scanner sc = new Scanner(System.in);
                    int t = sc.nextInt();
                    int n,sum;
                    while(t>0)
                    {
                        n=sc.nextInt();
                        int set[] = new int[n];
                        for(int i=0;i<n;i++)
                        set[i] = sc.nextInt();
                        sum = sc.nextInt();
                        printSubsetsCount(set, n, sum);
                        t--;
                    }
                               
                }
}
