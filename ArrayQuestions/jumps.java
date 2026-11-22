class jumps {
    public static void main(String[] args) {

        int arr[] = {2, 1, 3, 8, 6, 3, 2};

        int jump = 0;
        int pos = 0;
        int des = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            des = Math.max(des, i + arr[i]);

            if (i == pos) {

                if (des == pos) {
                    System.out.println("Not possible");
                    return;
                }

                pos = des;
                jump++;

                if (pos >= arr.length - 1) {
                	
                    break;
                }
            }
        }

        System.out.println("Minimum jumps: " + jump);
    }
}