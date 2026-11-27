// Count vowels and consonants in a string

class countVowels{
	public static void main(String[] args) {
		String name="pradip";
        countVowels(name);


	}
	public static void countVowels(String name){
		int countVowels=0;
		int countConsonants=0;

		for(int i=0;i<name.length();i++){
			
			char ch=Character.toLowerCase(name.charAt(i));

			if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {

                countVowels++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                countConsonants++;
            }
        }

        System.out.println("Vowels: " + countVowels);
        System.out.println("Consonants: " + countConsonants);


			
		
	}
}