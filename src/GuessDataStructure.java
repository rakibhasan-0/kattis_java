import java.io.IOException;
import java.util.*;

public class GuessDataStructure {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){

            int totalTests = scan.nextInt();

            boolean q = true;
            boolean s = true;
            boolean prioQueue = true;
            Queue<Integer> queue = new LinkedList<Integer>();
            Stack<Integer> stack = new Stack<Integer>();
            PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

            for (int i = 0; i < totalTests; i++){

                int type = scan.nextInt();
                if(type == 1){
                    int element = scan.nextInt();
                    if(q){
                        queue.add(element);
                    }
                    if(prioQueue){
                        pq.add(element);
                    }
                    if(s){
                        stack.push(element);
                    }
                }

                if(type == 2){
                    int num = scan.nextInt();
                    if(!pq.isEmpty()){
                        int e = pq.poll();
                        //System.out.println();
                        if(e != num){
                            prioQueue  = false;
                        }
                    }
                    else{
                        prioQueue = false;
                    }
                    if(!queue.isEmpty()){
                        int e = queue.poll();
                        //System.out.println("queue == " +e);
                        if(e != num){
                            q = false;
                        }
                    }
                    else{
                        q = false;
                    }
                    if(!stack.isEmpty()){
                        int e = stack.pop();
                        //System.out.println("stack == "+ e);
                        if(e != num){
                            s = false;
                        }
                    }
                    else{
                        s = false;
                    }
                }
            }

                if(!s && !q && !prioQueue){
                    System.out.println("impossible");
                }
                else if(s && q || q && prioQueue || prioQueue && s){
                    System.out.println("not sure");
                }
                else if(q){
                    System.out.println("queue");
                }
                else if (prioQueue){
                    System.out.println("priority queue");
                }
                else if (s){
                    System.out.println("stack");
                }
            }

        }

    }
