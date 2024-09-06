public class Fraction{
    public static void main(String[] args){
        int num1stNum = 1;
        int num1stDen = 2;
        int num2ndNum = 2;
        int num2ndDen = 5;

        System.out.println("The sum of " + num1stNum + "/" + num1stDen + " + " + num2ndNum + "/" + num2ndDen + " = " +  (num1stNum * num2ndDen + num2ndNum * num1stDen) + "/" + (num1stDen * num2ndDen));
    }
}