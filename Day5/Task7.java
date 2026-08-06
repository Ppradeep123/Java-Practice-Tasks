package Day5;

public class Task7 {
    public static void main(String arg[]) {
        // simple method 1
        // int arr[] = { 52, 78, 5, 2, 6, 4, 8 };
        // int result = 0;
        // int target = 66;
        // for (int i = 0; i <= arr.length-1; i++) {
        // if (arr[i] == target) {
        // result = 1;
        // }
        // }
        // if (result == 1) {
        // System.out.println("target is found ");

        // } else {
        // System.out.println("target is not found");
        // }

        // method 2 using boolean

        int arr[] = { 52, 78, 5, 2, 6, 4, 8 };
        boolean found=false;
        int target = 88;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]==target){
                found=true;
                System.out.println("number is found");
                break;
            }

        }
        if(!found){
            System.out.println("not found");
        }
    }
}
