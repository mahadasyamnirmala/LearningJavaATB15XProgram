package ex_06_ternaryoperator;

public class Lab066_interview_maxoftwo {
    public static void main(String[] args)
    {
        int x=300;
        int y=500;

        int value= (x>y)? x: y;
        System.out.println("Max value" + value);
        int value1= (x<y)? x: y;
        System.out.println("min value"+ value1);
    }
}
