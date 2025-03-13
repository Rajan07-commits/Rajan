package Lab_Programs;

public class Lab004 {
    public static void main(String[] args) {
        int course = 118;
        float GST = 18.45f;

      //  int Sum = course+GST; No Implicit Narrowing;

        int Sum = course + (int)GST; // Narrowing cuz float value typecast into integer

        System.out.println(Sum); //data loss occur in Explicit Narrowing

        float Sum1 = course + GST; // Widening cuz integer value typecast into float

        System.out.println(Sum1); // No data loss in implicit widening

    }
}
