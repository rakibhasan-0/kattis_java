import java.util.ArrayList;
import java.util.Scanner;

public class PaulEigon {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        long serves = scan.nextLong();
        long paul_score = scan.nextLong();
        long oppo_score = scan.nextLong();

        if (((paul_score + oppo_score) / serves) % 2 == 0) {
            System.out.println("paul");
        } else{
            System.out.println("opponent");
        }

        scan.close();
    }
}
