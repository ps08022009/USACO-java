/* Template */

import java.io.*;
import java.util.StringTokenizer;

public class IO {
    public static void Main (String[] args) throws IOException{
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        StringTokenizer st = new StringTokenizer(r.readLine());

        pw.close();
    }
}

