import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int winner = -1;

        for (int i = 0; i < 5; i++){
            int temp = 0;
            for (int j = 0; j < 4; j++){
             temp = temp + scan.nextInt();
            }
            if(temp > sum){
                sum = temp;
                winner = i+1;
            }
        }

        System.out.println(winner+ " " + sum);
    }
}
