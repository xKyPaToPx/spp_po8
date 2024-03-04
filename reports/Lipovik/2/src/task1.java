import java.io.*;
import java.util.Vector;

public class task1 {
    public static void main(String[] args) throws IOException {
        if(args.length>1){
            System.out.println("too many arguments!");
            return;
        }
        File file = new File(args[0]);
        if(!file.exists()){
            System.out.println("file not exist!");
            return;
        }
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        Vector uniqueWords = new Vector();
        String text="";
        while ((line = reader.readLine()) != null) {
            text +=line;
        }
        reader.close();
        String[] words = text.split(" ");
        for(String word:words){
            if(!uniqueWords.contains(word.split("[;:,.?!]")[0])){
                uniqueWords.add(word);
            }
            else if(word.split("[;:,.?!]").length>1){
                    uniqueWords.add(word.charAt(word.length()-1));
            }
        }


        for(Object str : uniqueWords){
            System.out.print(str+" ");
        }
    }
}