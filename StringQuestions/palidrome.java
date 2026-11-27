// Check whether a string is a palindrome.

class palidrome{
	public static void main(String[] args) {
	String a="mom";
reverse(a);
twopointer(a);
   
	}

	public static void reverse(String a){

	String reverse="";

	for(int i=a.length()-1;i>=0;i--){

		reverse=reverse+a.charAt(i);

	}

	if(a.equals(reverse)){
		System.out.println("String is palindrome");

	}
	else{
		System.out.println("not palindrome");
	}
	}

	public static void twopointer(String a){

		int left = 0;
		int right=a.length()-1;

		boolean ispalidrome = true;
		while(left<=right){

			if(a.charAt(left)!=a.charAt(right)){
				ispalidrome = false;
				break;

			}

           left++;
           right--;

		}

		System.out.println(ispalidrome ? "palidrome" : "not palidrome");
	}
}