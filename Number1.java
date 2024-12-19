import java.util.Scanner; 
public class Number1
{ 
    public static void main(String[] args) 
    { 
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter A value of N:\t"); 
            int n = sc.nextInt(); 
            for(int i=1;i<=n;i++) 
            { 
                if(i%2!=0) 
                { 
                    System.out.print(i + " "); 
                } 
            }
        } 
    } 
} 