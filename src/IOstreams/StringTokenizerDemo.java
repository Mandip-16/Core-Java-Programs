package IOstreams;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

    public static void main(String[] args) {
        String str = "my,name,is,mandeep,patel";

        StringTokenizer s = new StringTokenizer(str,",",true);
        while (s.hasMoreTokens()) {
            System.out.println(s.nextToken());
        }
    }
}
