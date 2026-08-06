package Day5.sorting;

public class selection {

    public static void main(String args[]) {
        int arr[] = { 10, 15, 15, 4, 6, 8 };
        for (int i = 0; i < arr.length - 1; i++) {

            int minindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }

            }

            int temp=arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;


        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
