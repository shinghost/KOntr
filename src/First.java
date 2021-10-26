public class First {

    public static boolean checkNum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("проверим несколько сумм: ");
        System.out.println(checkNum(7, 9));
        System.out.println(checkNum(10,98));
        System.out.println(checkNum(5, 5));
        System.out.println(checkNum(1, 2));
    }
}
