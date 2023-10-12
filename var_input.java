package java_Pra;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Scanner;

public class var_input {
    public static void main(String[] args) {
        InputStreamReader input = new InputStreamReader(System.in);
        // Creating a buffer of size 16 KB
        BufferedReader reader = new BufferedReader(input, 16384);

        Scanner sc=new Scanner(System.in);

        Console c=System.console();
        char[]a=c.readPassword(null, args);
        for(char ch:a)
        System.out.println(ch);
    }
}
