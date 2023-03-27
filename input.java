import java.util.*;
import java.lang.*;
import java.io.*;

class input{
    
    static final PrintWriter out =new PrintWriter(System.out);
    static final FastReader sc = new FastReader();
	
    public static void main (String[] args) throws java.lang.Exception{
        
    }
    
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
                                                                //the condition here makes sure that only one line is read at a time
        String next()
        {
            while (st == null || !st.hasMoreElements()) {           
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() { return Integer.parseInt(next()); }
 
        long nextLong() { return Long.parseLong(next()); }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}