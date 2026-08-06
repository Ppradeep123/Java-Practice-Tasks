package Day6;

public class Task4 {
    public static void main(String args[]) {
        String st = "pradip";
        int count = 0;
        int constant=0;
        for (int i = 0; i<st.length(); i++) {

            char ch = Character.toLowerCase(st.charAt(i));
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e' || ch == 'u') {
                count+= 1;
            }
            else{
                constant+=1;
            }
        }

        System.out.println(count);
        System.out.println(constant);
    }
}
