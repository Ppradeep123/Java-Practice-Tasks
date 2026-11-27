// Remove all spaces from a string.

class spaces{
	public static void main(String[] args) {
		
		String a = "feb evb efvbh";

		spaces(a);
		goodapproach(a);
		tabsremove(a);
	}
	public static void spaces(String a ){
        String result="";
		for(int i=0;i<a.length();i++){
               char ch =' ';
               if(a.charAt(i)!= ch){
               	result=result+a.charAt(i);
               }
		}
		System.out.println(result);          // this method has time complexity is O(n^2) because of string concatination
	}
	public static void goodapproach(String a){

		StringBuilder result = new StringBuilder();

		for(int i=0;i<a.length();i++){

			if(a.charAt(i)!=' '){
				result.append(a.charAt(i));
			}
		}
		System.out.println(result);           // using stringbuilder
	}

	public static void tabsremove(String a){

		StringBuffer result = new StringBuffer();
        
        for(int i=0;i<a.length();i++){

			if(!Character.isWhitespace(a.charAt(i))){
				result.append(a.charAt(i));
			}
		}
		System.out.println(result);           // for tabs remove  use Character.isWhitespace(ch)
	

	}
}