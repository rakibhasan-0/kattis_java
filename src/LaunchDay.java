import java.io.IOException;
import java.util.Scanner;

public class LaunchDay {
    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);

        int num_1 = reader.nextInt();

        int time = Integer.MIN_VALUE;
        int laugh_time = Integer.MAX_VALUE;
        int min_index = 0;

       for (int i = 0; i < num_1; i++) {
            int value = reader.nextInt();
            if(laugh_time > value) {
                laugh_time = value;
                min_index = i;
            }
       }

        System.out.println(min_index);




    }
}
