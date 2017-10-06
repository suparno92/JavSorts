
package javsorts;

import java.util.Arrays;

public class JavSorts {

    public static void main(String[] args) {
      
      
      int []  x  = {6,4,34,45,2,1,9,4,7};
      
      
      isPalindrome("eve");
      
     //ss
    }
    
    private static void fizzbuzz(){
        
        for (int i=1; i<=100;i++){
            
            if(i%3==0 && i%5==0) System.out.println("fizzBuzz");
            else if(i%3==0) System.out.println("fizz");
            else if(i%5==0) System.out.println("Buzz");
            else System.out.println(i);
        }
        
    }
    
    private static void BubbleSort(){
        int[] arr2 = {5,8,1,6,9,2};
        int i = 0;        
        int error = 0;
        while( i<6 ){
          
            if(i == 5){
                i=0;
                if(error == 0){
                    break;
                } else{
                  error = 0;
                }
               
            }               
            if(arr2[i] > arr2[i+1]){
                error += 1;
                int big = arr2[i];
                int small = arr2[i+1];
                arr2[i+1] = big;
                arr2[i] = small;
                System.out.println(Arrays.toString(arr2));
            }    
       
        i++;
        }
 
    }   
    
    private static int[] BubbleSort(int[] a){
     int[] arr = a;
     int error = 0;
     int n = arr.length - 1;
     for (int i=0; i <= n; i++){
         if(i == n){
             break;
         }
         
         if(arr[i] > arr[i+1]){
             int big = arr[i];
             int small = arr[i+1];
             arr[i+1] = big;
             arr[i] = small;
             error++;
              System.out.println(Arrays.toString(arr));
         }
             
     }
     if(error > 0) BubbleSort(arr);
     
    return arr;        
    }
    
    
    
    private static void BinarySearch(int[] a, int t){
        
        int[] arr = a;
        boolean error = true;
        int start = 0;
        int end = a.length - 1;
        
        while (error){            
            
            int pivot = (start+end)/2;
            
                if(t < arr[pivot]){
                    end = pivot;                    
                    System.out.println(end);
                }
                if (t == arr[pivot]){
                    System.out.println(t + "---" + pivot);
                    error = false;
                }
                else if(t > arr[pivot]){
                    start = pivot;                   
                    System.out.println(end);
                }
    
        }     
     
    }
    
    public static void palindrome(String a){
        String[] arr = a.split("");
        System.out.println(Arrays.toString(arr));
        int length = arr.length;
      
    
        boolean error = false;
        
        for(int i=0; i<=length-1;){
           for(int e=length-1; e>=0;){
                if(arr[i].equals(arr[e])){

                     System.out.println(i +"--"+e); 
                   
                }
                else{
                     error = true;
                     

                }i++;e--;
               
           }
          
        }
        if (!error) System.out.print(a + " is Palindrome " );
    }
    
     public static boolean isPalindrome(String original){
        int i = original.length()-1;
        int j=0;
        while(i > j) {
            if(original.charAt(i) != original.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }
    
    
    
    
 
}
