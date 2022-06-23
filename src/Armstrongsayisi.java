import java.util.Scanner;

public class Armstrongsayisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");

        int number = input.nextInt();
        int bassNumber = 0 , tempNumber = number;
        int basValue ;
        int result =0;
        int basPow;
        while (tempNumber != 0){
            tempNumber/=10;
            bassNumber++;

        }
        tempNumber = number;

        while (tempNumber != 0){
            basValue = tempNumber%10;
            basPow = 1;
            for (int i =1;i<=bassNumber;i++){
                 basPow *=basValue;
            }
            result+=basPow;

            tempNumber/=10;
        }
        System.out.println(result);



        /*
        int a =2566 ,basamakSayisi=0,numberCounter =0;


        while (a != 0){
            numberCounter++;
            a=a/10;

        }
        int b =2451 ;
        int c =b%10;

        int sub = 2 ,  sup = 5;
        int result = 1 ;
        for (int i = 1 ; i <=sup ;i++){
            result *= sub ;
        }


        System.out.println(result);


    }
}
         */
    }
}