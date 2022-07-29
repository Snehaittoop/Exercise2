import java.util.Scanner;

public class Fibnocci {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter first number");
        int a= input.nextInt();
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println("enter the number of elements");
        int n = input.nextInt();
        System.out.println("first "+n+" terms in fibnocci");
        for(int i=1;i<=n;i++) {
            System.out.println(a + " ");

            int c = a + b;
            a = b;
            b = c;

        }





    }

}
