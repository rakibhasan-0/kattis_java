import java.util.Scanner;

public class Canadians {
    public static void main(String[] args){

        StringBuffer buffer = new StringBuffer();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            buffer.append(scanner.nextLine());
        }

        String line = buffer.toString();
        if (line.endsWith("eh?")){
            System.out.println("Canadian!");
        }
        else{
            System.out.println("Imposter!");
        }
    }
}
