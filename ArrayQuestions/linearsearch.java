import java.util.*;
class linearsearch{
	public static void main(String[] args) {
		int arr[]={
			10,20,30,40,50,60
		};

		Scanner sc= new Scanner(System.in);
		System.out.println("enter the target");
		int target=sc.nextInt();

		linearsearch(arr,target);

	}

	public static void linearsearch(int arr[] ,int target){

		boolean found=false;

		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){

				found=true;
				break;
			}


		}
		if(found){
			System.out.println("target is founded");
		}
		else{
			System.out.println("not founded");
		}
	}
}