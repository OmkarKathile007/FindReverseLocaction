import java.util.*;
import java.lang.*;
import java.io.*;

//
// import java.util.*;
// import java.io.*;

// class Location{
//     public static void main (String[] args){
//         Scanner sc=new Scanner(System.in);
//         int T=sc.nextInt(); // Number of test cases
//         sc.nextLine(); // Consume the newline character left by nextInt()

//         while(T-->0){
//             int n=sc.nextInt(); // Number of directions
//             sc.nextLine(); // Consume the newline character left by nextInt()
//             String[] arr=new String[n];

//             // Reading directions
//             for(int i=0;i<n;i++){
//                 arr[i]=sc.nextLine();
//             }

//             // To hold reversed directions
//             String[] reversedDirections = new String[n];

//             // The first direction in reversed order should be "Begin"
//             reversedDirections[0] = arr[n-1].replaceFirst("Left", "Begin").replaceFirst("Right", "Begin").replaceFirst("Begin", "Begin");

//             // Reversing and swapping Left/Right for all subsequent directions
//             for(int i=1; i<n; i++){
//                 if(arr[n-i-1].startsWith("Left")){
//                     reversedDirections[i] = "Right" + arr[n-i-1].substring(4);
//                 } else if(arr[n-i-1].startsWith("Right")){
//                     reversedDirections[i] = "Left" + arr[n-i-1].substring(5);
//                 }
//             }

//             // Printing the reversed directions
//             for(String direction : reversedDirections){
//                 System.out.println(direction);
//             }
//             System.out.println(); // Print a blank line after each test case
//         }
//         sc.close();
//     }
// }




class ReverseLocDest_to_Source
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        while(T-->0){
            int n=sc.nextInt();
            // String arr[]=new String[n];
            sc.nextLine();
            String[] arr=new String[n];

            for(int i=0;i<n;i++){
                String str=sc.nextLine();
                arr[i]=str+"";
            }

            StringBuilder sb=new StringBuilder("");
            // sb.append("B");
            for(int i=0;i<arr.length;i++){
                if(arr[i].charAt(0)=='L'){
                    sb.append("L");
                }
                else if(arr[i].charAt(0)=='R'){
                    sb.append("R");
                }
            }
            sb.reverse();
            StringBuilder s=new StringBuilder("");
            s.append("B");

            for(int i=0;i<sb.length();i++){
                if(sb.charAt(i)=='L'){
                    s.append("R");
                }
                else if(sb.charAt(i)=='R'){
                    s.append("L");
                }
            }
            String[] Rev=new String[n];
            Rev[0]=new String("Begin on ");

            for(int i=1;i<s.length();i++){
                if(s.charAt(i)=='L'){
                    Rev[i]=new String("Left on ");
                }
                else if(s.charAt(i)=='R'){
                    Rev[i]=new String("Right on ");
                }

            }
            int o=0;
            for(int i=n-1;i>=0;i--){
                if(arr[i].charAt(0)=='L'){
                   Rev[o++]+=arr[i].substring(8);
                }
                else{
                    Rev[o++]+=arr[i].substring(9);
                }
            }

            for(int i=0;i<s.length();i++){
                
                System.out.println(Rev[i]+" ");
            }
            



            

            

            System.out.println();


   
    }
}
}