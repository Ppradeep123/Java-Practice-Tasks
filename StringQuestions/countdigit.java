// Count digits, alphabets and special characters.

class countdigit{
	public static void main(String[] args) {
		String a="abgHB@145";

		countdigit(a);
	}
	public static void countdigit(String a){

		int countdigit=0;
		int specialchar=0;
		int alphabet=0;

		for(int i=0;i<a.length();i++){

			char ch = Character.toLowerCase(a.charAt(i));

			if(ch>='a' && ch<='z'){
				alphabet++;
			}
			else if(ch>='0' && ch<='9'){
				countdigit++;
			}
			else{
				specialchar++;
			}
		}
		System.out.println("count of digit "  + countdigit);
		System.out.println("count of specialchar "  +specialchar);
		System.out.println("count of alphabet "  +alphabet);

	}
}