import java.io.*;
public class Lab_10_1 {
    public static void main(String[] args) {
        try{
            PrintWriter pw=new PrintWriter(new FileWriter("abc.txt"));
            pw.write("Hello\n");
            pw.write("World");
            pw.close();

            BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
            int line_count=0;
            int word_count=0;
            int char_count=0;
            String line;
            while((line=br.readLine())!=null){
                line_count++;
                String []word=line.split("\\s+");
                word_count+=word.length;
                char_count+=line.length();
            }
            System.out.println("Line:"+line_count);
            System.out.println("Word:"+word_count);
            System.out.println("Character:" +char_count);
            br.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }   
}
