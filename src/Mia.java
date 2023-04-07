import java.util.Arrays;
import java.util.Scanner;

public class Mia {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] zero = {0, 0};

        while (true) {
            int win;

            int[] player_1 = {scan.nextInt(), scan.nextInt()};
            int[] player_2 = {scan.nextInt(), scan.nextInt()};

            if (Arrays.equals(zero, player_1) && Arrays.equals(player_2, zero)) {
                break;
            }

            Arrays.sort(player_1);
            Arrays.sort(player_2);

            if (Arrays.equals(player_1, player_2)) {
                System.out.println("Tie.");
                continue;
            }

            int player_1_val = Integer.parseInt(player_1[1] + "" + player_1[0]);
            int player_2_val = Integer.parseInt(player_2[1] + "" + player_2[0]);

            if (player_1_val > player_2_val) {
                win = 1;
            } else {
                win = 2;
            }
                //System.out.println("here something occured");}
            if((player_1[0] == player_1[1]) && (player_2[0] != player_2[1])){
                win = 1;
            }
            if((player_2[0] == player_2[1]) && (player_1[0] != player_1[1])){
                win = 2;
            }

            String s1 = Integer.toString(player_1_val);
            //System.out.println("chek_1 == " + s1);
            String s2 = Integer.toString(player_2_val);
            //System.out.println("chek_2 == " +s2);

            if ((s1.contains("12") || s1.contains("21")) && (!s2.contains("12") || !s2.contains("21"))) {
                win = 1;
                //System.out.println("hello from here line <" + win+"> line ");
            }
            if ((s2.contains("12") || s2.contains("21")) && (!s1.contains("12") || !s2.contains("21"))) {
                win = 2;
                //System.out.println("hello from line 2 <"+win+"> line_2");
            }

            System.out.println("Player " + win + " wins.");

            }
        }
    }

