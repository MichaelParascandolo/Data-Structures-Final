import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CheckoutCounter {
    private int numSuper;
    private int numExp;
    private int numStandLines;
    private int arrivalRate;
    private int maxItems;
    private int maxSimTime;
    Queue<CustomerQueue> customerQueue = new LinkedList<CustomerQueue>();


    public void start() {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Number of items allowed in the SuperExpress line: ");

            numSuper = scan.nextInt();

            System.out.println("The number of items allowed in the express line: ");
            numExp = scan.nextInt();

            System.out.println("The number of regular lines: ");
            numStandLines = scan.nextInt();

            System.out.println("The arrival rate of customers per hour");
            arrivalRate = scan.nextInt();

            System.out.println("The maximum number of items: ");
            maxItems = scan.nextInt();

            System.out.println("The simulation time: ");
            maxSimTime = scan.nextInt();
        }
        catch(Exception inputMismatchException) {

            
        }


    }
    public int getNumSuper() {
        return numSuper;
    }
    public int getNumExp() {
        return numExp;
    }
    public int getNumStandLines() {
        return numStandLines;
    }
    public int getArrivalRate() {
        return arrivalRate;
    }
    public int getMaxItems() {
        return maxItems;
    }
    public int getMaxSimTime() {
        return maxSimTime;
    }

}
