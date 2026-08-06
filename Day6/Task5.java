package Day6;

//Count words in a sentence.
// Convert to uppercase.
// Convert to lowercase.
public class Task5 {
    public static void main(String args[]) {
        String sentences = "i am studying at ashokrao mane college ";
        sentences = sentences.trim();
        int count = 1;
        for (int i = 0; i <= sentences.length() - 1; i++) {
            if (sentences.charAt(i) == ' ')
                count += 1;
        }
        System.out.println("words count : " + count);
        System.out.println(sentences.toLowerCase());
        System.out.println(sentences.toUpperCase());
    }
}
