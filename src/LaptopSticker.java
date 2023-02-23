import java.util.Scanner;

public class LaptopSticker {
    public static void main(String[] args){
        int wc,hc,ws,hs;

        Scanner scan = new Scanner(System.in);

        wc = scan.nextInt();
        hc = scan.nextInt();
        ws = scan.nextInt();
        hs = scan.nextInt();

        int pc = wc - ws;
        int s = hc - hs;

        if(pc > 1 && s > 1){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
