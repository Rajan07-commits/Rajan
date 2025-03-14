package Lab_Programs;

public class Lab006 {
    public static void main(String[] args) {
        int a = 10;
        int b =20;

        System.out.println(++a + a++ + a++);
        // ++a - > A -> ExpA = 11 -> a=11
        // a++ -> B -> ExpB = 11 -> a=12
        // a++ -> C -> ExpC = 12 -> a=13

        //ExpA + ExpB+ ExpC = 11+11+12 = 34

        System.out.println(--b + b++ + b--);
        // --b - > A -> ExpA = 19 -> b=19
        // b++ -> B -> ExpB = 19 -> b=20
        // b-- -> C -> ExpC = 20 -> b=19

        //ExpA + ExpB+ ExpC = 19+19+20 = 58
    }
}
