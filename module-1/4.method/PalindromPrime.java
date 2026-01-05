class PalindromPrime {

    public static void isPalindromePrime(int n) {
        if (isPalindrome(n) && isPrime(n)) {
            System.out.println("Palindrome Prime");
        } else {
            System.out.println("Not a Palindrome Prime");
        }
    }
    public static boolean isPalindrome(int n) {
        int rem = 0;
        int rev = 0;
        int temp = n;

        for (int t = temp; t != 0; t /= 10) {
            rem = t % 10;
            rev = (rev * 10) + rem;
        }

        return rev == n;
    }
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
