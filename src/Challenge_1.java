import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Challenge_1 {
    public static void main(String[] args) throws IOException {

        Scanner reader = new Scanner(System.in);
        String [] array = reader.nextLine().split(" ");
        int parts = Integer.parseInt(array[0]);
        int days = Integer.parseInt(array [1]);

        HashSet<String> map = new HashSet<String>();


        int d = 1;

        while (days > 0) {
            String line = reader.nextLine();
            if(!map.contains(line)){
                map.add(line);
                d++;
            }
            else if(map.size() == parts){
                System.out.println(d);
                return;
            }
            days--;
        }
        reader.close();

        System.out.println("paradox avoided");

    }
}
