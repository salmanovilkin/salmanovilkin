package MethodClass;

import java.util.Scanner;

public class JavaMethods {

    //1. Tapşırıq:
    //Metodun adı `yazSalam` olsun. Heç bir parametr almasın. Sadəcə ekrana belə yazsın:
    //Salam, Java!
    public static void yazSalam() {
        System.out.println("Salam, Java!");
    }
    //2. Tapşırıq:
    //Metodun adı `yazAd` olsun və `String ad` parametrini alsın. Məsələn:
    //yazAd("Anar");
    public  static  void yazAd(String ad) {
        System.out.println("Sənin adın: " + ad);
    }
    //3. Tapşırıq:
    //Metodun adı `cemEt` olsun. `int a, int b` parametrləri alsın və `System.out.println` ilə
    //cəmini göstərsin.
    public static void cemEt (int a, int b){
        System.out.println("Cavab: " + (a+b));
    } 

    // 4. Tapşırıq:
    //Metod `int cemEt(int a, int b)` şəklində olsun. Ədədləri qəbul edib, cəmi geri qaytarsın.
    //Nəticəni `main`də çap et.

    public static int hesabla (int a, int b){
        return a+b;
    }

    //5. Tapşırıq:
    //Metod `int kvadrat(int n)` şəklində olsun. Verilən ədədin kvadratını hesablayıb return
    //etsin.

    public static int kvadrat (int a){
        return a*a;
    }
    //6. Tapşırıq:
    //`String tamAd(String ad, String soyad)` metodu yaz. İki parametr alıb ad və soyadı
    //birləşdirsin, return etsin.
    public static String tamAd(String ad, String soyad){
        return  ad+soyad;
    }

//    7. Tapşırıq:
//Metod `int ferq()` olsun. Heç parametr almasın. `Scanner` ilə istifadəçidən 2 ədəd alıb
//fərqini qaytarsın.

    public static int ferq(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci ədədi daxil edin: ");
        int a = scanner.nextInt();

        System.out.print("İkinci ədədi daxil edin: ");
        int b = scanner.nextInt();
        return a - b;
    }
    //8. Tapşırıq:
    // Metod `String yoxlaCutTek(int n)` olsun. Ədəd cütdürsə “CÜT”, yoxsa “TƏK” sözünü
    //return etsin.

    public String yoxlaCutTek() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir ədəd daxil edin: ");
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            return "CÜT";
        } else {
            return "TƏK";
        }
    }


    }



 