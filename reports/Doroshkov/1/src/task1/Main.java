import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int [] arr_input = new int[args.length];
        for(int i=0; i<args.length;i++)
        {
            arr_input[i] = Integer.parseInt(args[i]);
        }
        int amount_1 = 0, amount_2 = 0, amount_3 = 0; // номер зависит от количества цифр в числе 1 - однозначное 2- двузначное 3- трехзначное
        for (int i=0; i<arr_input.length;i++){
            if((arr_input[i]/100) > 0)
            {
                amount_3+=1;
            } else if ((arr_input[i]/10)>0) {
                amount_2+=1;
            }else{
                amount_1+=1;
            }
        }

        System.out.printf("Hello and welcome in lab1 please enter nouns: \n");
        Scanner keyboard = new Scanner(System.in);
        System.out.println(amount_3+" трехзначные\n"+amount_2+" двузначные\n"+amount_1+" однозначные\n");
        int myint = keyboard.nextInt();
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}