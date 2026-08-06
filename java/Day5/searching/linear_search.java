package Day5.searching;

public class linear_search {
    public static void main(String args[]){
        int arr[]={10,5,55,7,8,9,6,4,65};

        int target=5;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==target){
                System.out.println("target "+ target+" is founded on  "+i+ " index");
            }
        }
    }
}
