import java.util.Scanner;

public class bubblesort {
    static void bubble(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            boolean flag = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp;
                    flag = true;
                }
            }
            if( flag == false){
                return;
            }
        }
    }
    static void printarray(int[] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of unsorted array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
    
        System.out.println("Enter the all the element of array");
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("unsorted array");
        printarray(arr);
        bubble(arr, n);
        System.out.println("sorted array");
        printarray(arr);
        
    }
}
