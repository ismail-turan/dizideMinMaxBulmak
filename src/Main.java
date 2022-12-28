import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers={1,3,5,6,55,4,77,11,-30,-15};
        int min=numbers[0];
        int max=numbers[0];
        for (int i:numbers){
            if (i<min){
                min=i;
            }
            if (i>max){
                max=i;
            }
        }
        System.out.println("Max :"+max);
        System.out.println("Min :"+min);

        // Girilen değerden büyük en küçük sayi
        int[] newNumber=Arrays.copyOf(numbers,numbers.length);
        Arrays.sort(newNumber);
        Scanner scanner=new Scanner(System.in);
        System.out.print("Hangi sayıdan büyük olan en küçük sayı ? :");
        int a=scanner.nextInt();
        for (int i:newNumber){
            if (i>a){
                System.out.println(i);
                break;
            }
        }
        System.out.print("Hangi sayıdan küçük olan en büyük sayı ? :");
        int b=scanner.nextInt();
        for (int i=newNumber.length-1;i>=0;i--){
            if (newNumber[i]<b){
                System.out.println(newNumber[i]);
                break;
            }
        }


    }
}