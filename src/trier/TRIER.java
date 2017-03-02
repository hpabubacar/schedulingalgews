
package trier;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TRIER {
        
    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        int processes, choice, count, min, bt=0;
        ArrayList<Integer> arrival= new ArrayList<Integer>();
        ArrayList<Integer> burst= new ArrayList<Integer>();
        ArrayList<Integer> priority= new ArrayList<Integer>();
        ArrayList<Integer> rt= new ArrayList<Integer>();
        ArrayList<Integer> tf= new ArrayList<Integer>();
        ArrayList<Integer> tat= new ArrayList<Integer>();
        ArrayList<Integer> wt= new ArrayList<Integer>();
        ArrayList<Integer> q= new ArrayList<Integer>();
        

        Scanner scan = new Scanner(System.in);
        try{
        System.out.print("Enter number of processes: ");
        processes = 5;
        
        /*for(int i=1; i <= processes; i++){
            System.out.println("Process " + i);
            System.out.print("Arrival Time " + i + ": ");
            arrival.add(scan.nextInt());         
            System.out.print("Burst Time " + i + ": ");
            burst.add(scan.nextInt());        
            System.out.print("Priority Level " + i + ": ");
            priority.add(scan.nextInt());     
        }*/
        arrival.add(0);
        arrival.add(1);
        arrival.add(2);
        arrival.add(3);
        arrival.add(4);
        for (int i = 1; i<=processes;i++){
            q.add(i);
        }
        
        burst.add(4);
        burst.add(9);
        burst.add(2);
        burst.add(5);
        burst.add(3); 
        
        priority.add(3);
        priority.add(4);
        priority.add(2);
        priority.add(1);
        priority.add(3);    
        
        count = 0;
        
        
        int temp;
        
        
        count = count + arrival.get(0);
         
        sortb(arrival,burst);
            //System.out.println(arrival);
            //System.out.println(burst);
            System.out.print("Ghantt Chart: ");
            for (int i = 0; i < processes; i++){
                rt.add(count); System.out.print(" ("+rt.get(i)+") ");
                System.out.print(" | ");
                sort(burst);
               // System.out.print(arrival.get(i));
               // System.out.println("burst.get(i)"+burst.get(i));
                for (int j = 1; j <= burst.get(i); j++)
                {
                    System.out.print((i+1));   
                    count++;
                }
                    System.out.print(" | ");
                    tf.add(count);
                    
                } System.out.println(" ("+count+") \n");
        
        
        
        
        System.out.println("PROCESS \t\t Waiting Time \t\t Turn Around Time");
        for(int i = 0; i < processes; i++){
            wt.add(rt.get(i)-arrival.indexOf(burst.get(i)));
            tat.add(tf.get(i)-arrival.get(i));
            System.out.println((i+1)+" \t\t\t " + (wt.get(i))+" \t\t\t "+(tat.get(i)));
        }
            System.out.println("  \t\t\t " + (tot(wt))+" \t\t\t "+(tot(tat)));
        }
        catch(Exception e){
            System.out.println("\nMay mali ka: " +e+" "+ e.getMessage());
        }
    }
    
    public static double tot(ArrayList<Integer> arr){
    double sum = 0;
    
    for (int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
    }
    
    return sum;
    }
    
    public static double totrt(ArrayList<Integer> arr){
        double sum = 0;
        for (int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
        }
        return sum;
    }
    
    public static void sortb(ArrayList<Integer> arr,ArrayList<Integer> arr2) {
		int temp;
		for (int i = 0; i < arr.size() - 1; i++) {
 
			for (int j = 1; j < arr.size() - i; j++) {
				if (arr.get(j-1) > arr.get(j)) {
					temp = arr.get(j-1);
                                        arr.set(j-1, arr.get(j));
                                        arr.set(j, temp);
                                        temp = arr2.get(j-1);
                                        arr2.set(j-1, arr2.get(j));
                                        arr2.set(j, temp);
                                }
			}
                        
                        //System.out.println("Iteration " + (i + 1) + ": " + arr);
		}
		//return arr;
                
	}
    
    public static void sort(ArrayList<Integer> arr) {
		int temp;
		for (int i = 0; i < arr.size() - 1; i++) {
 
			for (int j = 2; j < arr.size() - i; j++) {
				if (arr.get(j-1) > arr.get(j)) {
					temp = arr.get(j-1);
                                        arr.set(j-1, arr.get(j));
                                        arr.set(j, temp);
                                }
			}
                        
                        //System.out.println("Iteration " + (i + 1) + ": " + arr);
		}
		//return arr;
                
	}
   
}



