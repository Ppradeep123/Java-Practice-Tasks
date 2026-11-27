// Convert lowercase characters to uppercase without using toUpperCase()

class convertupper{
	public static void main(String[] args) {
		String a ="afbjd";

		lowertoupper(a);
	}
	public static void lowertoupper(String a){


        StringBuilder result= new StringBuilder();

		for(int i=0;i<a.length();i++){
            
            char ch = a.charAt(i);

            if(ch>='a' && ch<='z'){
            	ch = (char)(ch-32);
            	result.append(ch);
            }

		}
		System.out.println(result);
	}
}