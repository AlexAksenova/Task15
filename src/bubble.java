import java.util.Arrays;
import java.util.Scanner;

public class bubble {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива = ");
        int len = scanner.nextInt();
        int [] mass = new int[len];
        for (int i = 0; i < len; i++)
        {
            System.out.printf("Введите число для массива %d = ", i);
            mass[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(mass));

        int changeCounter;
        do {
            changeCounter=0;
            for (int i = 0; i < mass.length-1; i++) {
                if (mass[i]>mass[i+1]) {
                    int tempo=mass[i];
                    mass[i]=mass[i+1];
                    mass[i+1]=tempo;
                    changeCounter++;
                }
            }
        } while (changeCounter>0);

        System.out.println(Arrays.toString(mass));
    }
}


