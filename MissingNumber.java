import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));


        int n = Integer.parseInt(r.readLine());


        long expectedSum = (long) n * (n + 1) / 2;

        long actualSum = 0;
        String[] numbers = r.readLine().split(" ");
        for (String num : numbers) {
            actualSum += Long.parseLong(num);
        }

        long missingNumber = expectedSum - actualSum;


        System.out.println(missingNumber);
    }
}
