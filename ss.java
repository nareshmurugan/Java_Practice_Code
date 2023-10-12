package filee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ss {
    public static void main(String[] args) {
        FileInputStream fx=null; 
        try {
            fx = new FileInputStream("c:\\Users\\HP\\Desktop\\Naresh\\Java\\java_pra\\filee\\hh.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        try {
            System.out.println((char)fx.read());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e+"    "+"catch");
        }
    }
}
