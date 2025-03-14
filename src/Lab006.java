public class Lab006 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);

        // ++a - > A -> ExpA = 11 -> a=11
        // a++ -> B -> ExpB = 11 -> a=12
        // a++ -> C -> ExpC = 12 -> a=13

        //ExpA + ExpB+ ExpC = 11+11+12 = 34
    }
}
