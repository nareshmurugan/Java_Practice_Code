package java_Pra;

/**
 * Java program to demonstrate How to write a parameterized classes in Java and type-safety
 * provided by the parameterized class. The program also compares non parameterized to
 * parameterized class to highlight issues with non-generic classes in Java.
 *
 * @author Javin Paul
 */
public class generic_class {
 
    public static void main(String args[]) {
       
        //string wrapper
        Wrapper<String> stringWrapper = new Wrapper<String>();
        stringWrapper.setItem("Test");
        System.out.println(stringWrapper.getItem());
       
        //compilation error, type checking at compile time
        //stringWrapper.setItem(new StringBuffer(""));
     
        Wrapper<Integer> integerWrapper = new Wrapper<Integer>();
        integerWrapper.setItem(123);
       
        //compilation error, type safety checking
        //integerWrapper.setItem("123");
        System.out.println(integerWrapper.getItem());
     
     
        // Now let's see how to write generic wrapper without using
        // JDK1.5 generic and what problem it poses
     
        OldWrapper oldStringWrapper = new OldWrapper();
     
        //no compilation error i.e. no type checking at compile time
        oldStringWrapper.setItem(123);

        //will throw ClassCastException at runtime  
        // ((String)oldStringWrapper.getItem()).toUpperCase();
    }
}

/*
 * wrapper can wrap any item
 * Generic parameterized form of Wrapper, offers compile time type checking
 */
class Wrapper<T> {
    private T item;
 
    public T getItem(){
        return item;
    }
 
    public void setItem(T item){
        this.item = item;
    }
}

/*
 * Object form of Wrapper fragile and error prone
 */
class OldWrapper{
    private Object item;
 
    public Object getItem(){
        return item;
    }
 
    public void setItem(Object item){
        this.item = item;
    }
}
/**
 * Java program to demonstrate how to write parameterized method in Java
 * parameterized method needs a type parameter declaration before return
 * type, here is a type parameter
 * @author Javin
 */
class ItemUtils{
   
    public static <T> T wrap(T item){
        //code for wrapping item
        return item;
    }
   
}