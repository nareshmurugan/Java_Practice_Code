package mutithread_Pro;

public class thread_print_1_to_10 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            
            if (i == 5) {
                try {
                    Thread.sleep(5000); // Delay for 5 seconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            
            }
        }
    }
}
