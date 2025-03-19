package practiceprograms;

public class DivPensEqually {
    public static void main(String[] args) {
        int pens = 14, numofstudents = 3, numofdistpens,numofnondistpens;
    numofdistpens=pens/numofstudents;
    numofnondistpens=pens%numofstudents;
    System.out.println("The Pen Per Student is "+numofdistpens+" and the remaining pens not distributed is "+ numofnondistpens);
    }
}
