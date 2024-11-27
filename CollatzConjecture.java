import java.io.*;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder output = new StringBuilder();

        long n = Long.parseLong(r.readLine()); 

        while (n != 1) {
            output.append(n).append(" "); 
            if ((n & 1) == 0) { 
                n >>= 1; 
            } else {
                n = n * 3 + 1;
            }
        }
        output.append(n);
        System.out.println(output); 
    }
}
