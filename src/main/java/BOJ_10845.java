import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_10845 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int last = 0;

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            String order = st.nextToken();

            switch(order) {
                case "push" :
                    int temp = Integer.parseInt(st.nextToken());
                    queue.add(temp);
                    last = temp;
                    break;
                case "pop" :
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.poll());
                    break;
                case "size" :
                    System.out.println(queue.size());
                    break;
                case "empty" :
                    if (queue.isEmpty())
                        System.out.println("1");
                    else
                        System.out.println("0");
                    break;
                case "front" :
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(queue.peek());
                    break;
                case "back" :
                    if (queue.isEmpty())
                        System.out.println(-1);
                    else
                        System.out.println(last);
                    break;
            }
        }
    }
}
