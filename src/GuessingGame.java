import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessingGame {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int min = 0, max = 11, num;

        while(true){
            num = Integer.parseInt(reader.readLine());
            if(num == 0){
                break;
            }
            String line = reader.readLine();
            if(line.startsWith("r")){
                if(min < num && max > num){
                    System.out.println("Stan may be honest");
                }
                else{
                    System.out.println("Stan is dishonest");
                }
                min = 0;
                max = 11;
            }
            if(line.equals("too low")){
                min = Math.max(num,min);
            }
            if(line.equals("too high")){
                max = Math.min(num, max);
            }

        }

    }
}
