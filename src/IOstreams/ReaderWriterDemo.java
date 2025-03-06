package IOstreams;

import java.io.FileReader;
import java.io.FileWriter;

public class ReaderWriterDemo {

    public static void main(String[] args) throws Exception{
        FileReader fr =null;
        FileWriter fw = null;

        fr = new FileReader("/Users/Apple/Desktop/Mandeep patel.txt");
        fw = new FileWriter("/Users/Apple/Desktop/Man patel.txt");

        int i;
        while((i = fr.read()) != -1) {
            fw.write(i);
        }

        fr.close();
        fw.close();
    }
}
