
import java.util.Scanner;

public class Array {
    public static int findSecondLargest(int[] arr){

        
        int Largest = arr[0];
        int SecondLargest = arr[0];

        for(int i=1;i<=arr.length;i++){
         
            if(arr[i] > Largest){
                SecondLargest = Largest;
                Largest = arr[i];
        }
            else if (arr[i] > SecondLargest && arr[i] != Largest){
                SecondLargest = arr[i];
            }
        }
        return SecondLargest;
       
    }
}

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();

    }

    int statement = findSecondLargest(arr); 

    System.out.println("SecondLargest" + statement);
    sc.close();
}


