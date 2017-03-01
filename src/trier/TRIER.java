
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
        burst.add(3); burst.
        
        priority.add(3);
        priority.add(4);
        priority.add(2);
        priority.add(1);
        priority.add(3);    
        
        count = 0;
        
        
        int temp;
        
        
        count = count + arrival.get(0);
         
        sort(arrival,burst);
            System.out.println(arrival);
            System.out.println(burst);
        /*for(int i=0 ; i<processes; i++){
            for(int j=0;j<processes;j++){
                if(arrival.get(i)>arrival.get(j))
                {System.out.println(i+" "+j);
                    temp=q.get(j);      
                    q.set(j, q.get(i)); 
                    q.set(i, temp);     
                    temp=arrival.get(j);       
                    arrival.set(j, arrival.get(i));     System.out.print(arrival.get(j));
                    arrival.set(i, temp);       System.out.print(arrival.get(i));
                    temp=burst.get(j);     
                    burst.set(j, burst.get(i));     System.out.print(burst.get(j));
                    burst.set(i, temp);     System.out.println(burst.get(i));
                    
                }
            }
        }
        
        for(int j=0;j<processes;j++){
            bt=bt+burst.get(j);
            min=burst.get(j);
            for(int i=j;i<processes;i++){
                if (bt>=arrival.get(i) && burst.get(i)<min){
                    temp=q.get(j);
                    q.set(j, q.get(i));
                    q.set(i, temp);
                    temp=arrival.get(i);
                    arrival.set(j, arrival.get(i));
                    arrival.set(i, temp);
                    
                    temp=burst.get(j);
                    burst.set(j, burst.get(i));
                    burst.set(i, temp);
                }
            }
           // j++;
            System.out.println("next");
            System.out.println(burst + "  "+ arrival);
        }*/
        
        
        
        
        
         for (int i = 0; i < processes; i++){
        rt.add(count); System.out.print(" ("+rt.get(i)+") ");
        // System.out.print(" | ");                    for (int j = 1; j <= burst.get(i); j++){
                        
                        
                        System.out.print((i+1)+"<");
                        count++;
                       if(arrival.contains(count)){
                            if(burst.get(j+1) > burst.get(j)){
                            temp = count;
                            arrival.set(arrival.indexOf(count), arrival.get(j+1));
                            arrival.set(j+1, temp);
                            temp = count;
                            arrival.set(arrival.indexOf(count), arrival.get(j+1));
                            arrival.set(j+1, temp);
                            System.out.print("burst: "+burst.get(j+1) +" || "+ burst.get(j)+" ");
                            System.out.println("arrival: "+arrival.get(j)+ " || "+ arrival.get(j+1));
                            System.out.println("temp: "+ count);
                            System.out.println(">>");
                            System.out.print("burst: "+burst.get(i+1) +" || "+ burst.get(i)+" ");
                            System.out.println("arrival: "+arrival.get(i)+ " || "+ arrival.get(i+1));
                            System.out.println("*****************************************");
                            System.out.println("*****************************************");
                        }
                       }
                    }
                
                            //}
                    System.out.print(" | ");
                  //  tf.add(count);
                } System.out.println(" ("+count+") \n");

                
        
        
        
        /*
        System.out.println("PROCESS \t\t Waiting Time \t\t Turn Around Time");
        for(int i = 0; i < processes; i++){
            wt.add(rt.get(i)-arrival.get(i));
            tat.add(tf.get(i)-arrival.get(i));
            System.out.println((i+1)+" \t\t\t " + (wt.get(i))+" \t\t\t "+(tat.get(i)));
        }
            System.out.println("  \t\t\t " + (tot(wt))+" \t\t\t "+(tot(tat)));
        */}
        catch(Exception e){
            System.out.println("\nMay mali ka: " +e+" "+ e.getMessage());
        }
    }
    
    public static double tot(ArrayList<Integer> arr){
    double sum = 0;
    
    for (int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
    }
    
    return sum/arr.size();
    }
    
    public static double totrt(ArrayList<Integer> arr){
        double sum = 0;
        for (int i = 0; i < arr.size(); i++){
            sum = sum + arr.get(i);
        }
        return sum;
    }
    
    public static ArrayList<Integer> sort(ArrayList<Integer> arr,ArrayList<Integer> arr1) {
		int temp;
		for (int i = 0; i < arr.size() - 1; i++) {
 
			for (int j = 1; j < arr.size() - i; j++) {
				if (arr.get(j-1) > arr.get(j)) {
					temp = arr.get(j-1);
                                        arr.set(j-1, arr.get(j));
                                        arr.set(j, temp);
                                        temp = arr1.get(j-1);
                                        arr1.set(j-1, arr1.get(j));
                                        arr1.set(j, temp);
                                }
			}
                        
                        //System.out.println("Iteration " + (i + 1) + ": " + arr);
		}
		return arr;
	}
   
}



