import static java.lang.System.exit;
import java.io.*;
import java.util.*;

/**
 * @author mayurvpatil
 *
 * Date: 2020 December 29 | [ Tuesday ]
 * Time: 07 : 25 : 23 
 */

/**
 * Public      - CodeForces
 * No modifier - CodeChef
 */

public class DiameterOfBinaryTree {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right ;
    }

    int max = Integer.MIN_VALUE;

    public int findMax(TreeNode root) {
         if(root == null ) return 0;

        int l =0 , r = 0 ;
        if(root.left != null ) {
            l = findMax(root.left);
        }

        if(root.right != null ) {
            r = findMax(root.right);
        }

        if(l+r > max) {
            max = l+r;
        }
        
        return 1 + Math.max(l,r);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null ) return 0;

        findMax(root);
        return max;
    }

    public void solve() throws Exception {
            
    } // End

    public DiameterOfBinaryTree() throws Exception {
        boolean isMultipleTestCases = false;
        in = new InputReader(System.in);
        out = new PrintWriter(System.out);

        if (isMultipleTestCases) {
            int t = in.getInt();
            for (int i = 1; i <= t; ++i) {
                solve();
            }
        } else {
            solve();
        }
        out.close();
    }

    public static void main(String[] args) {
        try {
            new DiameterOfBinaryTree();
        } catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }

    private InputReader in = null;
    private PrintWriter out = null;

    // FastIO reader
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String getLine() throws Exception {
            return reader.readLine();
        }

        public String getString() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int getInt() {
            return Integer.parseInt(getString());
        }

        public long getLong() {
            return Long.parseLong(getString());
        }

        public int[] getIntArray(int n) {
            int[] temp = new int[n];
            for (int i = 0; i < n; i++)
                temp[i] = getInt();
            return temp;
        }

        public long[] getLongArray(int n) {
            long[] temp = new long[n];
            for (int i = 0; i < n; i++)
                temp[i] = getLong();
            return temp;
        }
    }
}
