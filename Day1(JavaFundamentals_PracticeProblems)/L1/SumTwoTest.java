package practiceprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumTwoTest {
//    public static void main(String[] args){
//        float a,b, result;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter the first number: ");
//        a=scanner.nextFloat();
//        System.out.println("Enter the second number: ");
//        b=scanner.nextFloat();
//        result=practiceprograms.SumTwo.add(a,b);
//        System.out.println("The result is: "+result);
//    }

    //Faster method
    public static void main(String[] args) throws IOException{
        BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the first number: ");
        float a= Float.parseFloat(reader.readLine());
        System.out.println("Enter the second number: ");
        float b= Float.parseFloat(reader.readLine());
        float result= SumTwo.add(a,b);
        System.out.println("The result is: "+result);
    }
}
