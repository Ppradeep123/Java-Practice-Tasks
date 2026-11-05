package tcs_question;

public class zeroatend {
    public static void main(String args[]) {

        int arr[] = {
                10, 50, 0, 5, 0, 4
        };

        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }
            
        }
        while(index<arr.length){
            arr[index]=0;
            index++;
        }

        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
        }

    }
}
