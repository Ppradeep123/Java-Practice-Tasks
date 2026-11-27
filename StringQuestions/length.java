// Find the length of a string without using length().

class length{
	public static void main(String[] args) {
		String a="grugre";
int count =0;
		for(char ch : a.toCharArray()){

			count++;

		}
		System.out.println(count);
	}
}