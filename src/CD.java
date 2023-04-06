import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;


public class CD {
    public static void main(String[]args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String line = scan.readLine();


        while (!line.equals("0 0")) {
            String[] parts = line.split(" ");
            int jack = Integer.parseInt(parts[0]);
            int jill = Integer.parseInt(parts[1]);
            int duplicates = 0;
            HashSet<String> cds = new HashSet<String>();


            for (int i = 0; i < jack; i++) {
                cds.add(scan.readLine());
            }


            for (int j = 0; j < jill; j++) {
                if (cds.contains(scan.readLine())) {
                    duplicates++;
                }
            }


            System.out.println(duplicates);
            line = scan.readLine();

        }

    }
}
