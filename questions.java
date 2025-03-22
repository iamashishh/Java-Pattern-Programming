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

        // int n= sc.nextInt();
        // for (int i = 1; i <=n; i++) {
        //     //inner loop
        //     for (int j = 1; j<=n-i;  j++) {
        //         System.out.print("  ");
        //     }
        //     //inner loop 
        //     for (int j = 1; j <=i; j++) {
        //             System.out.print(" *");              
        //     }
        //     System.out.println();
        // }

        // Pattern 5
    
        // int n = sc.nextInt();

        // for (int i = 1; i <=n; i++) {
            
        //     //inner loop 

        //     for (int j = 1; j <=i; j++) {
        //         System.err.print(" "+j);                
        //     }
        //     System.out.println();
        // }
        
        // Pattern 6

        // int n= sc.nextInt();

        // for (int i = n; i >=1; i--) {
        // //inner loop
        
        // for (int j = 1; j <=i; j++) {
        //     System.out.print(j);
        // }
        // System.out.println();
        // }

        // Pattern 7(floyd Triangle)

        // int n = sc.nextInt();
        // int count = 1;
        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(" "+count);
        //         count++;
        //     }
        //     System.out.println();
            
        // }

        //Pattern 8 (0-1 triangle)

        // int n= sc.nextInt();

        // for (int i = 1; i <=n; i++) {
        //     for (int j = 1; j <=i; j++) {
        //         int sum = i+j;
        //         if(sum%2==0){
        //             System.out.print(" 1");
        //         }
        //         else{
        //             System.out.print(" 0");
        //         }
        //     }

        //     System.out.println();
        // }

        // Pattern 9 (butterfly pattern)

        // int n = sc.nextInt();
        // sc.close();

        // //upper part
        // for (int i = 1; i <=n; i++) {
        //     //1 part
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(" *");
        //     }       
        //     //spaces
        //     for (int j = 1; j <=2*(n-i); j++) {
        //         System.out.print("  ");
        //     }    
        //     //2nd part star
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(" *");
        //     }

        //     System.out.println();
        // }
        // //lower part
        // for (int i = n; i>=1; i--) {
        //     //1 part
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(" *");
        //     }       
        //     //spaces
        //     for (int j = 1; j <=2*(n-i); j++) {
        //         System.out.print("  ");
        //     }    
        //     //2nd part star
        //     for (int j = 1; j <=i; j++) {
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }
        
        // pattern 10 (solid rhombus)

        int n= sc.nextInt();
        sc.close();

        for (int i =1; i <=n; i++) {

            // spaces
            for (int j = 1; j <=(n-i); j++) {
                System.out.print(" ");
                
            }
            //star
            for (int j = 1; j <=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
