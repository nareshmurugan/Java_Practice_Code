import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String costStr = scanner.nextLine();
        int k = scanner.nextInt();
        char[] costArray = costStr.toCharArray();
        Arrays.sort(costArray);
        
        int i = 0;
        while (k > 0 && i < costArray.length) {
            costArray[i] = '\0';  // Removing the digit by replacing with null character
            i++;
            k--;
        }

        int remainingCost = 0;
        for (char digit : costArray) {
            if (digit != '\0') {
                remainingCost = remainingCost * 10 + Character.getNumericValue(digit);
            }
        }
        int discountedCost = remainingCost / 2;

        System.out.println(discountedCost);
    }
}