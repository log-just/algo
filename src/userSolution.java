import java.util.ArrayList;
import java.util.List;

class UserSolution {
    public final static int N = 4;

    public void doUserImplementation(int guess[]) {
        // Implement a user's implementation function
        //
        // The array of guess[] is a return array that
        // is your guess for what digits[] would be.

//        List<String>[] arrayOfList = new List[2];
        ArrayList<Integer>[] impossiable = new ArrayList[N];
        for (int i = 0; i < N; i++) {
            impossiable[i] = new ArrayList<Integer>();
        }

        Solution.Result result = Solution.query(guess);
        int possibleCount = result.ball+result.strike;
        if (possibleCount >= N) {
            if(result.strike < 1) {
                impossiable[0].add(2);
            } else {
                impossiable[0].add(2);
            }
            // 모두 ball
        } else {
            // 수는 다 찾았다

        }
    }
}
