public class switches{
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        Scanner scan = new Scanner(System.In);
        ch=scan.Int();
        System.out.println("Enter your choice");
        System.out.println("--------------------");
        System.out.println("1]Addition\n2]Substraction\n3]Division\n4]Multipliacton");
        System.out.println("--------------------");
        switch(ch)
        case 1:
        System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
        break;
        case 2:
        System.out.println("Substraction of"+a+"and"+b+"is"+(a-b));
        break;
        case 3:
        System.out.println("Division of"+a+"and"+b+"is"+(a/b));
        break;
        case 4:
        System.out.println("Multiplication of"+a+"and"+b+"is"+(a*b));
        default;
        System.out.println("Invalid choice");
    }
}