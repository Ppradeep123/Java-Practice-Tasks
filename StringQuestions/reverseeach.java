// Reverse each word in a sentence.

class reverseeach{
	public static void main(String[] args) {
		String a="ahfb afb fjc";

		reverse(a);
	}

	public static void reverse(String a){

		StringBuilder result = new StringBuilder();
          
        String words[]=a.split(" "); 
        for(int i=0;i<words.length;i++){

        	StringBuilder word = new StringBuilder(words[i]);

        	word.reverse();

        	result.append(word);
 if(i < words.length - 1) {
                result.append(" ");
            }
		}

		System.out.println(result);
	}
}