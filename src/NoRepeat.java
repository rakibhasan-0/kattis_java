import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class NoRepeat {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        StringBuffer string = new StringBuffer();

        string.append(scan.nextLine());

        List<String> words = new ArrayList<String>();
        String word = string.toString();
        words = Arrays.stream(word.split(" ")).collect(Collectors.toList());

        HashSet<String> set = new HashSet<String>();
        for(String w : words){
            if(!set.add(w)){
                System.out.println("no");
                return;
            }
        }
        System.out.println("yes");


    }
}
