class StrongNumber {

    public static void strong(int n) {
        int r = 0;
        int sum = 0;
        int temp = n;

        for(int t = temp; t != 0; t = t / 10) {
            r = t % 10;             
            sum = sum + fact(r);         
        }

        if(sum == n) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a Strong number");
        }
    }
    public static int fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}
