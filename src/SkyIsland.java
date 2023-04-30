import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class SkyIsland {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int island = scan.nextInt();
        int bridges = scan.nextInt();
        boolean first = false;

        HashSet<Integer> set1 = new HashSet<Integer>();
        ArrayList<Integer> set2 = new ArrayList<Integer>();

        for(int i = 0; i < bridges; i++){
            if(!first){
                int f = scan.nextInt();
                int g = scan.nextInt();
                set1.add(f);
                set2.add(f);
                set2.add(g);
                set1.add(g);
                first = true;
            }
            else{
                int f = scan.nextInt();
                int g = scan.nextInt();
                if(f == island){
                    set1.add(f);
                }
                if(g == island){
                    set1.add(g);
                }
                set2.add(f);
                set1.add(g);
            }

        }

        boolean yes = true;
        for(int i : set2){
                if(set1.contains(i)){
                    yes = true;
                   // System.out.println(i);
                }
                else{
                    yes = false;
                    //System.out.println(i);
                    break;


                }

        }
        if(yes){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }



}