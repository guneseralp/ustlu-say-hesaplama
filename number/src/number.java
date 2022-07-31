import java.util.Scanner;

public class number {
    public static void main(String[] args) {
        Scanner inp= new Scanner (System.in);
        int n,k;
        System.out.print("Enter The Number: ");
        n= inp.nextInt();
        System.out.print("Second Number: ");
        k=inp.nextInt();
        int total=1;
        for (int i=1; i<=k; i++){
            total *= n;
        }
        System.out.print("Answer: "+total);
        }

    }

