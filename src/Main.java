import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int age;

        System.out.println("How old are you?");
        age = input.nextInt();

        if (age >= 21)
        {
            System.out.println("You will get a wristband. Enjoy the show!");
        }

    }
}