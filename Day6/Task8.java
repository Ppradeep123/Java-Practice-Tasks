package Day6;

public class Task8 {
    public static void main(String args[]) {
        String words = "I am a employee";
        int lowercount = 0;
        int uppercount = 0;

        for (int i = 0; i < words.length(); i++) {
            if (Character.isUpperCase(words.charAt(i))) {
                uppercount++;
            } else if (Character.isLowerCase(words.charAt(i))) {
                lowercount++;

            }
        }
        System.out.println(lowercount);
        System.out.println(uppercount);
    }
}
