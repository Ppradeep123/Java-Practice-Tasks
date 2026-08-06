package Day5;

public class Task3 {
    static void findaverage(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        System.out.println(average);
    }
    public static void main(String args[]){
        int mark[]={10,20,30,40,50};
        findaverage(mark);
    }
}
