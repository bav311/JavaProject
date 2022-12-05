package javarush;

import java.util.StringTokenizer;

public class Test {


    public static void main(String[] args) {
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"e");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }


    }

}