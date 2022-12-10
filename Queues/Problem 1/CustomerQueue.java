import java.util.LinkedList;
import java.util.Queue;

/** Class to simulate a queue of passengers. */ 
public class CustomerQueue {
// Data Fields
/** The queue of passengers. */
private Queue<Customer> theQueue;
/** The number of passengers served. */ 
private int numServed;
/** The total time passengers were waiting. */ 
private int totalWait;
/** The name of this queue. */
private String queueName;
/** The average arrival rate. */
private double arrivalRate;
// Constructor
/** Construct a CustomerQueue with the given name.
@param queueName The name of this queue 
*/
public CustomerQueue(String queueName) {
            numServed = 0;
            totalWait = 0;
            this.queueName = queueName;
            theQueue = new LinkedList<Customer>();
    }
    /** Check if a new arrival has occurred.
@param clock The current simulated time @param showAll Flag to indicate that detailed
                       data should be output
    */
public void checkNewArrival(int clock, boolean showAll) {
        if (Math.random() < arrivalRate) {
            theQueue.add(new Customer(clock));
            if (showAll) {
                System.out.println("Time is " + clock + ": " + queueName + " arrival, new queue size is " + theQueue.size());
            } 
        }
    }
/** Update statistics.
pre: The queue is not empty.
@param clock The current simulated time
@param showAll Flag to indicate whether to show detail @return Time passenger is done being served
*/
public int update(int clock, boolean showAll) {
    
    Customer nextPassenger = theQueue.remove();
    int timeStamp = nextPassenger.getArrivalTime();
    int wait = clock - timeStamp;
    totalWait += wait;
    numServed++;
    if (showAll) {
        System.out.println("Time is " + clock
                           + ": Serving "
                           + queueName
                           + " with time stamp "
                           + timeStamp);
        }
        return clock + nextPassenger.getProcessingTime();
    }
public boolean isEmpty() {
    if(theQueue.isEmpty()) {
        return true;
    }
    else {
        return false;
    }
}
//GET
public double getTotalWait() {
    return totalWait;
}
public int getNumServed() {
    return numServed;
}
public int size() {
    return theQueue.size();
}
public void setArrivalRate(double arrivalRate) {
    this.arrivalRate = arrivalRate;
}
}
