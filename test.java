import java.util.Scanner;

public class test {

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        System.out.println("Ust Bulma : " + result);
        return result;
    }


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);


                System.out.print("Taban Degerini Giriniz :");
                int taban = scan.nextInt();
                System.out.print("Us Degerini Giriniz :");
                int us = scan.nextInt();


                        if (power(taban,us) == 0){
                            System.out.println("Ilk Sayi 0'dan Farkli Olmalidir");
                        }
            }
        }













