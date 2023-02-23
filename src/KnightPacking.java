import java.util.Scanner;
public class KnightPacking {
    public static void main(String [] args){
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        if(num % 2 == 0){
            System.out.println("Second");
        }
        else{
            System.out.println("First");
        }
    }
}
