package practiceprograms;

import java.util.Scanner;

public class RunSelfProblems {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        //SI
        double simpleinterest, p, r,t;
        System.out.println("Enter the Principal, Rate and Time separated by a space: ");
        p=sc.nextDouble();r=sc.nextDouble();t=sc.nextDouble();
        simpleinterest= SelfProblems.SimpleInterest(p,r,t);
        System.out.println("The Simple Interest is: "+ simpleinterest);
        //Rectangle Perimeter
        float peri, length, width;
        System.out.println("Enter length and width of Rectangle separated by a space: ");
        length=sc.nextFloat();width=sc.nextFloat();
        peri=SelfProblems.PeriRect(length, width);
        System.out.println("Perimeter of Rectangle= "+peri);
        //PowerCalc
        double b,exp;
        System.out.println("Enter base and exponent separated by a space: ");
        b=sc.nextDouble();
        exp=sc.nextDouble();
        double power= SelfProblems.Power(b,exp);
        System.out.println(b+" raised to the power "+exp+" = "+ power);
        //3numberAverage
        double avg;
        float x,y,z;
        System.out.println("Enter three numbers separated by a space: ");
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=sc.nextFloat();
        avg=SelfProblems.Average(x,y,z);
        System.out.println("Average of the three numbers= "+avg);
        //KmstoMiles
        double distkm, distmiles;
        System.out.println("Enter distance in kilometers: ");
        distkm=sc.nextDouble();
        distmiles=SelfProblems.KmsToMiles(distkm);
        System.out.println("Converted distance in miles= "+ distmiles);
    }
}
