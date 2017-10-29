import java.io.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile
{
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("D:\\file1.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String str;
        String longestline = new String();
        List<String> list = new ArrayList<String>();
        while((str = in.readLine()) != null){
            list.add(str);
            if(longestline.length() < str.length()){
                longestline = str;
            }
        }
        in.close();

        LineNumberReader  lnr = new LineNumberReader(new FileReader(new File("D:\\file1.txt")));
        lnr.skip(Long.MAX_VALUE);
        lnr.close();

        try(FileWriter writer = new FileWriter("D:\\file2.txt", false))
        {
            writer.write("Longest line: ");
            writer.write(longestline);
            writer.write(",");
            writer.write("My name is ");
            writer.write(list.get(0));
            writer.write(",");
            writer.write("My birthday on ");
            writer.write(list.get(2));
            writer.write(".");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}