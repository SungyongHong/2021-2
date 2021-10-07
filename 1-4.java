package exam04_implementation;
import java.io.*;
import java.util.StringTokenizer;

public class Q1 {
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};
    static String[] move_types = {"L", "R", "U", "D"};
    public static int[] solution(String[] plan, int n) {
        int curX = 1;
        int curY = 1;
        int nx = 0;
        int ny = 0;

        for (int i = 0; i < plan.length; i++) {
            String element = plan[i];
            for(int j=0 ; j<move_types.length ; j++) {

                if (element.equals(move_types[j])){
                    nx = curX + dx[j];
                    ny = curY + dy[j];
                }

                if(nx < 1 || ny < 1 || nx > n || ny > n)
                    continue;

                curX = nx;
                curY = ny;

            }

        }

        int[] result = {nx, ny};

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        String[] plan = new String[st.countTokens()];
        int index = 0;
        while (st.countTokens() != 0) {
            plan[index] = st.nextToken();
            index++;
        }

        int[] result = solution(plan, n);
        System.out.println(result[0] + " " + result[1]);

        br.close();
        bw.close();
    }

}