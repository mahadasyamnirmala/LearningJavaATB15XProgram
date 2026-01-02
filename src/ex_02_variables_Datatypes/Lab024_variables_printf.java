package ex_02_variables_Datatypes;

public class Lab024_variables_printf {

    public static void main(String[] args) {
//        System.out.println("It will add a newline");
//
//        System.out.print("It will not add a newline");

        byte a = 10;
//        System.out.println("Value of a is -> "+a);
//        System.out.print("Value of a is -> "+a);
        System.out.printf("Value of a is %d", a);
        // %d -> int, byte, long, short, - data type
        // %s -> String
        // %f -> float, double,
        // %b ->boolean

        int aa = 100;
        int bb = 121;
        System.out.printf("Formatting the aa = %d and b = %d", aa, bb);

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d\n", table, table*1);
        System.out.printf("%dx2=%d\n", table, table*2);
        System.out.printf("%dx3=%d\n", table, table*3);
        System.out.printf("%dx4=%d\n", table, table*4);
        System.out.printf("%dx5=%d\n", table, table*5);

        // ex:26 constants or final

        int a26 = 10;
        a26 = 20;
        System.out.println(a26);

        final float PI = 3.14f;
        //PI = 3.122f;
        System.out.println(PI);

        // ex:27,28: local variable, multivariables
        // ex29:

        int _ = 10;
        int $ = 10;
        // int @ = 10;
         //System.out.println(_); // underscore giving error
        System.out.println($);

        //ex:30

        //class name ----> we can give with starting _asdasdsfd.java, _.java, nirmala.java,nir_m_a$la.java
        // all are accepted.






    }
}
