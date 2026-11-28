// Reverse the order of words in a sentence.

class reverseorder{
	public static void main(String[] args) {
		String a = " i am a boy ";
		reverse(a);

	}

	public static void reverse(String a){
		StringBuilder result = new StringBuilder();

        String words[]=a.split(" ");

        for(int i=words.length-1;i>=0;i--){

        	result.append(words[i]);
        	if(i>0){
                result.append(" ");
        	}
        }

        System.out.println(result);
	}
}