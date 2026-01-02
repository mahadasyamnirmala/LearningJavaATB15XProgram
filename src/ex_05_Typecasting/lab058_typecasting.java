package ex_05_Typecasting;

public class lab058_typecasting {
    public static void main(String[] args){
        // example-58
        byte b  = 10;
        int a = b;  //  Valid syntax - Implicit - Casting Widening - JVM/ JAVA (not cry b'coz no data loss)
        int a1 = (int)b;  //  Valid syntax - Explicit - Widening -bydefault java can do itself we need not mention external.

        // example 59
        int val = 300;
        //  0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 0 0 1 0 1 1 0 0
//        byte b = val; // Implicit Narrowing // data loss
        byte b2 = (byte)val; // Explicit Narrowing // data loss
        System.out.println(b2);
        // 0 0 1 0 1 1 0 0         // 0 + 0 + 32 + 0 + 8 + 4 + 0 + 0 = **44.**
        //**(00101100)₂ = (0 × 2⁷) + (0 × 2⁶) + (1 × 2⁵) + (0 × 2⁴) + (1 × 2³) + (1 × 2²) + (0 × 2¹) + (0 × 2⁰) = (44)₁₀**


        // example 60
        long phone = 987654321l;
//        short s = phone; // Narrowing - implicit.
        short s1 = (short) phone; // Narrowing - Explicit.

        // example 61
        int course = 100;
        float course_GST = 18.45f;
//        int total = course+ NSRT_GST; // Narrowing - Implicit. //  data loss
//        int total = course+ (int)NSRT_GST; // Narrowing - Explicit. // no data loss
//        System.out.println(total);

        float total2 = course+ course_GST; // widening  - Implicit // no data loss
        float total3 = (float) course+ course_GST; // widening  - Explicit // no data loss
        System.out.println(total2);

        // example 61

        char ch1 = 'A';
        int ascii = ch1; // Widening

        int num = 66; // Narrow
        char letter = (char) num;

    }


}
