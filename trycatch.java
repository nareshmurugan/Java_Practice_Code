import javax.crypto.AEADBadTagException;

public class trycatch {
  
    public static void main(String[] args) throws AEADBadTagException {
        try{throw new AEADBadTagException();} catch (Exception e) {
            System.out.println("catch");
        }
        System.out.println("jeghjgh");
    }
}
/*
 Throwable--> Error, Exception
 Exception--> Checked Exception, Unchecked Exception.
 only "Runtime Exception" is a unchecked Exception.
 */