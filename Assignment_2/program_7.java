public class PowerTable {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        System.out.println("-------------------");

        int a = 1;
        int b = 2;
        int result1 = (int) Math.pow(a++, b++);
        System.out.println(a + "\t" + b + "\t" + result1);

        int result2 = (int) Math.pow(a++, b++);
        System.out.println(a + "\t" + b + "\t" + result2);

        int result3 = (int) Math.pow(a++, b++);
        System.out.println(a + "\t" + b + "\t" + result3);

        int result4 = (int) Math.pow(a++, b++);
        System.out.println(a + "\t" + b + "\t" + result4);

        int result5 = (int) Math.pow(a++, b++);
        System.out.println(a + "\t" + b + "\t" + result5);
    }
}

