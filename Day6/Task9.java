package Day6;

public class Task9 {
    public static void main(String args[]) {
        String sentence = "i am working on HRMS dashboards";

        String words[] = sentence.split(" ");
        int max = 0;
        String largestword = "  ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > max) {
                max = words[i].length();
                largestword = words[i];
            }
        }
        System.out.println(max);
        System.out.println(largestword);
    }
}
