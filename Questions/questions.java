import java.util.*;

class questions {
    public static void main(String args[]) {
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

        Scanner sc = new Scanner(System.in);
        
        int n= sc.nextInt();

        for(int i=1; i<=n;i++){
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
                
            }
            System.out.println();
        }

    }
}
