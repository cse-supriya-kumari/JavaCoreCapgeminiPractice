class ArmstrongNumber {
    public static void armstrong(int n) {
        int sum = 0;
        int temp = n;
        int digits = String.valueOf(n).length();
        for(int t = temp; t != 0; t = t / 10) {
            int r = t % 10;
            sum += Math.pow(r, digits);
        }
        if(sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}
















// class ArmstrongNumber {
//     public static void armstrong(int n) {
//         int sum = 0;
//         int temp = n;
//         int count = 0;

//         // First, count the number of digits
//         for(int t = temp; t != 0; t = t / 10) {
//             count++;
//         }

//         // Loop again to calculate sum of digits raised to power of count
//         for(int t = temp; t != 0; t = t / 10) {
//             int r = t % 10;
//             sum += Math.pow(r, count);
//         }

//         // Check if number is Armstrong
//         if(sum == n) {
//             System.out.println("Armstrong number");
//         } else {
//             System.out.println("Not an Armstrong number");
//         }
//     }
// }
