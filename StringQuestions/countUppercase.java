// Count uppercase and lowercase letters

class countUppercase{
	public static void main(String[] args) {
		String a= "HSbwurwJg";

		countUppercase(a);

	}

	public static void countUppercase(String a){

		int countUppercase=0;
		int countLowercase=0;

		for(int i=0;i<a.length();i++){

			char ch = a.charAt(i);
			if(ch>='a' && ch<='z'){
				countLowercase++;
			}
			else if (ch>='A' && ch<='Z'){
				countUppercase++;
			}
		}
		System.out.println(countUppercase);
		System.out.println(countLowercase);
	}
}