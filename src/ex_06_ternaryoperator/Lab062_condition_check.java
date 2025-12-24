package ex_06_ternaryoperator;

public class Lab062_condition_check {
    public static void main(String[] args)
    {
        /* Remembering points are:
        data type(left side) == checks the expression1, exp2(right side)

        */
        // try for string data type (62 program)
        int a =10;
        String age = (a>20)?"true":"false";
        System.out.println(age);

        // try for boolean (63 program)
        boolean age1=(a>20)? true: false;
        System.out.println(age1);

        // try for positive or negative (64 program)
        int p = -11;
        String positive_neg_number = (p>0)? "Positive Number" : "Negative Number";
        System.out.println("Given Number Is :" + positive_neg_number);

        // try for     (65 program)
        int marks = 30;
        String result  = (marks >=40) ? "PASS" : "FAIL";
        System.out.println(result);

        // try for     (66 program)
        int number=33;
        String getnumber=(number%2 ==0)? "Even" : "Odd";
        System.out.println("Given number is :" + getnumber);
    }
}
