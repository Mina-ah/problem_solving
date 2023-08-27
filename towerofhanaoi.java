public class towerofhanaoi {
    public static void toh(int n, String src, String help, String dest) {
        System.out.println(n+" "+src+" "+help+" " + dest);
        if (n == 1) {
            System.out.println("transfer disk" + n + "from" + src + dest);
            return;
        }
        toh(n - 1, src, dest, help);
        System.out.println("transfer disk" + n + "from" + src + dest);
        toh(n - 1, help, src, dest);
    }

    public static void main(String[] args) {
        int n = 2;
        toh(n, "S", "H", "D");
    }
}
