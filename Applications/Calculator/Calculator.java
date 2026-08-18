import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstnum=sc.nextInt();

        System.out.println("Enter second number:");
        int secondnum=sc.nextInt();

        System.out.println("enter the operator(+,-,*,/):");
        char operator=sc.next().charAt(0);
     switch(operator)
        {

         case '+':
                System.out.println("Addition:"+(firstnum+secondnum));
                break;
         case '-':
                System.out.println("Subtraction:"+(firstnum-secondnum));
                break;
        case '*':
                System.out.println("Multiplication:"+(firstnum*secondnum));
                break;
        case '/':
                if(secondnum!=0)
                System.out.println("division:"+(firstnum/secondnum));
                else
                System.out.println("Cannot divide by zero");
                break;
        default:
            System.out.println("Invalid operator");
        }
    }
}