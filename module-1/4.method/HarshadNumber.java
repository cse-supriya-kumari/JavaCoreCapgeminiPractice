class HarshadNumber {
    public static void isHarshadNumber(int n) {
            int sum = 0;
            int r = 0;
            // Loop should run while i > 0
            for(int i = n; i > 0; i = i / 10) {
                r = i % 10;     
                sum = sum + r;   
            }
            if(n % sum == 0) {
                System.out.println("Harshad number");
            } else {
                System.out.println("Not a Harshad number");
            }
        }
    }

