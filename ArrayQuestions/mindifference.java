class mindifference {
    public static void main(String[] args) {

        int arr[] = {4, 6, 8, 12, 45, 85};
         
         mindifference(arr);
   }

       public static void mindifference(int arr[]){
           int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int diff = Math.abs(arr[i] - arr[j]);

                if (diff < min) {
                    min = diff;
                }
            }
        }

        System.out.println(min);
    }

}