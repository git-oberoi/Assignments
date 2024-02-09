package Assignment_6;

public class Program_6_2 {
    
    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
        }

        public static void main(String args[]){
            for (int i=1; i<=100; i++){
                System.out.printf("%-6d", getPentagonalNumber(i));
                if(i%10==0){
                    System.out.println();
                }
            }
           
        }
 
    }

