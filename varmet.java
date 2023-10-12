package java_Pra;
import java.util.function.Predicate;
// public class varmet {
//     public static void main(String[] args) {
//         Object t= varmet::run;
//     }
// }



public class varmet {
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        Predicate<Integer> isPositivePredicate = varmet::isPositive;
        
        System.out.println(isPositivePredicate.test(5));  // Output: true
        System.out.println(isPositivePredicate.test(-2)); // Output: false
    }
}

// public class Main {
//     public static void main(String[] args) {
//         Predicate<Integer> isPositivePredicate = number -> number > 0;
        
//         System.out.println(isPositivePredicate.test(5));  // Output: true
//         System.out.println(isPositivePredicate.test(-2)); // Output: false
//     }
// }