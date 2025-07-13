import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/1260
public class BOJ1260 {
    public static void main(String[] args) throws IOException {
        // 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000),
        // 간선의 개수 M(1 ≤ M ≤ 10,000),
        // 탐색을 시작할 정점의 번호 V가 주어진다.
        // 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다.
        // 어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다.
        // 입력으로 주어지는 간선은 양방향이다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        boolean visit[] = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            visit[i] = false;
        }
        // 노드에 대해 간선을 연결한다 (좌/우 숫자로 연결을 의미한다)
        Map<Integer, List<Integer>> arr = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
        }


    }
}
