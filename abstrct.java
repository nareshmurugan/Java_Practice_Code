package java_Pra;

abstract class abstrct {
    public static void main(String[] args) {
        System.out.println("jkchc");
        a obj=new a();
        obj.name();
    }
    abstract void name();
}
static class htr {
    public void name() {
        int a=10;
    }
    
}

class a extends abstrct{
     void name() {
        System.out.println("hai");
    }    
}
class b extends abstrct{
     void name() {
        System.out.println("hi");
    }    
}
