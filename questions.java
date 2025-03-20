import java.util.*;

class questions {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Pattern 1
        // for (int i=1; i<=5;i++){
        //     for (int j = 1; j <=4; j++) {
        //         if(i==1 || j==1 || i==5 || j==4){
        //             System.out.print(" *");
        //         }                
        //         else{
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
    
        // Pattern 2

        
        // int n= sc.nextInt();

        // for(int i=1; i<=n;i++){
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(" *");
                
        //     }
        //     System.out.println();
        // }

        // Pattern 3

        // int n= sc.nextInt();

        // for (int i = n; i>=1; i--) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(" *");               
        //     }
        //     System.out.println();
            
        // }
    
        // Pattern 4

        int n= sc.nextInt();
        for (int i = 1; i <=n; i++) {
            //inner loop
            for (int j = 1; j<=n-i;  j++) {
                System.out.print("  ");
            }
            //inner loop 
            for (int j = 1; j <=i; j++) {
                    System.out.print(" *");              
            }
            System.out.println();
        }
    }
}
