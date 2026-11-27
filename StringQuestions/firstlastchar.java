// Find the first and last character of a string.

class firstlastchar{

	public static void main(String[] args) {
		String a="bdsbbdhc udsvbij sbvj   ";
		a=a.trim();  

	    find(a);
	}

	public static void find(String a){
         

        int first=0;
        int last=a.length()-1;
		System.out.println(a.charAt(first));
		System.out.println(a.charAt(last));
	}
}