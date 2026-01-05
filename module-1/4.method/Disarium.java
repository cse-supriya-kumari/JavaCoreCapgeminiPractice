class Disarium {

    public static void disarium(int n) {
        int sum = 0;
        int temp = n;
        int count = 0;
        for(int t = temp; t != 0; t = t / 10) {
            count++;
        }

        for(int t = temp; t != 0; t = t / 10) {
            int r = t % 10;
            sum += Math.pow(r, count);
            count--;   
        }
        if(sum == n) {
            System.out.println("Disarium number");
        } else {
            System.out.println("Not a Disarium number");
        }
    }
}

