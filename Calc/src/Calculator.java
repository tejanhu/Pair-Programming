import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator {

    ArrayList<Integer> numarr = new ArrayList<>();
    String result = "";
    boolean testing4=false;

    public Calculator() {

    }


    public void findCombinations(int n1, int n2, int n3) {
        numarr.clear();
        numarr.add(n1);
        numarr.add(n2);
        numarr.add(n3);

        iterateArray(numarr);
        if(result.equals("")&&!testing4){
            System.out.println("ERROR!!!");
        }
    }

    public void findCombinations(int n1, int n2, int n3, int n4) {
        testing4 = true;
        threeFromFour(n1, n2, n3, n4);
        if(result.equals("")){
            System.out.println("ERROR!!!");
        }
    }

    public void iterateArray(ArrayList<Integer> numarr) {
        ArrayList<Integer> numarrCopy = new ArrayList<>();
        for (int i = 0; i < numarr.size(); i++) {
            for (Integer n : numarr) {
                numarrCopy.add(n);
            }
            numarrCopy.remove(numarr.get(i));
            test(numarr.get(i), numarrCopy.get(0), numarrCopy.get(1));
            test(numarr.get(i), numarrCopy.get(1), numarrCopy.get(0));

            numarrCopy.clear();


        }
    }



    public void threeFromFour(int num, int num2, int num3, int num4) {
        findCombinations(num, num2, num3);
        findCombinations(num, num2, num4);
        findCombinations(num, num3, num4);
        findCombinations(num2, num3, num4);
    }

    public void test(int a, int b, int c) {
        double doubleA, doubleB, doubleC;
        doubleA = a;
        doubleB = b;
        doubleC = c;
        String result = "";


        if ((doubleA / doubleB) == doubleC) {
            System.out.println((int) doubleA + "/" + (int) doubleB + "= " + (int) doubleC);
            result += (int) doubleA + "/" + (int) doubleB + "= " + (int) doubleC;
        }
        if ((doubleA * doubleB) == doubleC) {
            System.out.println((int) doubleA + "*" + (int) doubleB + "= " + (int) doubleC);
            result += (int) doubleA + "*" + (int) doubleB + "= " + (int) doubleC;
        }
        if ((doubleA + doubleB) == doubleC) {
            System.out.println((int) doubleA + "+" + (int) doubleB + "= " + (int) doubleC);
            result += (int) doubleA + "+" + (int) doubleB + "= " + (int) doubleC;
        }
        if ((doubleA - doubleB) == doubleC) {
            System.out.println((int) doubleA + "-" + (int) doubleB + "= " + (int) doubleC);
            result += (int) doubleA + "-" + (int) doubleB + "= " + (int) doubleC;
        }


    }

}
