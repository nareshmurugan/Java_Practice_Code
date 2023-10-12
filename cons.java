

// import java.util.LinkedList;
//constructor and final method cannot be overridden.

public class cons {
    public static void main(String[]args) {
        y obj=new z();
        obj=new y();
        obj.namez(8);
    }
}
class x {
    x(){
        System.out.println("x");
    }
    public void namex() {
        System.out.println("nx");
    }
}

class y extends x{
    y(){
        System.out.println("y");
    }
    public void namez(int a) {
        System.out.println("ny");
    }
    
}
class z extends y{
    z(){
        System.out.println("z");
    }
    public void namez() {
        System.out.println("nz");
    }
}