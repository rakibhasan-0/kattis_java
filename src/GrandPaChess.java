import java.util.Arrays;
import java.util.Scanner;

class GrandPaChess{

    public static void main (String [] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int grid = Integer.parseInt(scan.nextLine());

        char[][] chess_board = new char[grid][];

      //  System.out.println(grid);
        for (int i = 0; i < grid; i++) {
            chess_board[i] = scan.nextLine().toCharArray();
        }

        boolean row_check = true;
        for(int i = 0; i < grid; i++){
            String line = Arrays.toString(chess_board[i]);
            int black = 0, white = 0;
            for(int j = 0; j <grid; j++) {
                if (chess_board[i][j] == 'B'){
                    black++;
                }
                else{white++;}
            }
            if(line.contains("BBB") || line.contains("WWW") || white != black){
                row_check = false;
            }
        }


        boolean col_check = true;

        for(int i = 0; i < grid ; i++){

           StringBuffer buffer = new StringBuffer();
           int black = 0, white = 0;

            for(int j = 0; j < grid; j++){
                if(chess_board[j][i] == 'B'){
                    black++;
                }
                else{white++;}
                buffer.append(chess_board[j][i]);
            }

            String str = buffer.toString();
            if(str.contains("BBB") || str.contains("WWW") || black != white){
                col_check = false;
            }
        }

        if(col_check && row_check){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }

}