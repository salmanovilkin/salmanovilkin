package lessons.First;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        ///1. Sadə Parol Yoxlanması
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Parolu daxil edin:");
        String parol  = scanner.nextLine();

        if (parol.equals("adminq123")){
            System.out.println("Girişə icazə verildi");
        } else {
            System.out.println("Girşe icazə verilmədi");
        }
        scanner.close();


        ///2. Məktəb Qiymətləndirmə


        Scanner scanner = new Scanner(System.in);
        System.out.println("Imtahan balını daxil daxil edin:");
        int bal = scanner.nextInt();

        if (bal >= 91 && bal <= 100) {
            System.out.println("Sizin qiymətiniz: A");
        } else if (bal >= 81 && bal <= 90) {
            System.out.println("Sizin qiymətiniz: B");
        } else if (bal >= 71 && bal <= 80) {
            System.out.println("Sizin qiymətiniz: C");
        } else if (bal >= 61 && bal <= 70) {
            System.out.println("Sizin qiymətiniz: D");
        } else if (bal >= 51 && bal <= 60) {
            System.out.println("Sizin qiymətiniz: E");
        } else if (bal >= 0 && bal <= 50) {
            System.out.println("Sizin qiymətiniz: F");
        } else {
            System.out.println("Düzgün ədəd daxil edin (0-100 arası)");
        }

        scanner.close();


        /// 3.Mağaza endirim

        Scanner scanner= new Scanner(System.in);
        System.out.println("Alış veriş məbləğini daxil edin:");
        int mebleg = scanner.nextInt();
        System.out.println("Vip müşterisiz (Beli/Xeyr)");
        String vip = scanner.next();

        if ( vip.contains("Beli")) {
            System.out.println("Size 20% endirim tetbiq olundu");
        } else if (vip.contains("Xeyr") && mebleg >= 200) {
            System.out.println("Size 10% endirim tetbiq olundu");
        }else if (vip.contains("Xeyr") && mebleg >= 100){
            System.out.println("Size 5% endirim tetbiq olundu");
        } else {
            System.out.println(" Sizə endirim yoxdur");
        }


        //4. Elektrik Sayğac Hesabı


        Scanner scanner= new Scanner(System.in);
        System.out.println("Elektrik miqdarı (kVt) daxil edin:");

        int electric = scanner.nextInt();
        double odenis = 0;
        if (electric >= 0 && electric <= 100){
            odenis = electric * 0.10;
            System.out.println("Sizin mebleg " + odenis + "AZN");
        } else if (electric >= 101 && electric <= 300) {
            odenis = electric * 0.15;
            System.out.println("Sizin mebleg " + odenis + "AZN");
        }else if (electric >= 301) {
            odenis = electric * 0.20;
            System.out.println("Sizin mebleg " + odenis + "AZN");
        } else {
            System.out.println("Düzgün ədəd daxil edin");
        }

        //5. Geometrik Fiqur Sahəsi


        Scanner scanner= new Scanner(System.in);
        System.out.println("Fiqur növünü daxil edin (Kvadrat,Düzbucaqlı,Dairə):");
        String figur = scanner.nextLine();

        if (figur.contains("Kvadrat")){
            System.out.println("Kavadratin terefini daxil edin");
            int a = scanner.nextInt();
            int cavab = a*a;
            System.out.println("Kvadratin sahesi " + cavab);
        } else if (figur.contains("Düzbucaqlı")){
            System.out.println("Düzbucaqlının enini daxil edin");
            int b = scanner.nextInt();
            System.out.println("Düzbucaqlının uzunluğunu daxil edin");
            int c = scanner.nextInt();
            int cavab = 2*(b+c);
            System.out.println("Düzbucaqlının sahesi " + cavab);
        } else if (figur.contains("Dairə")){
            System.out.println("Dairənin radiusunu daxil edin");
            int r = scanner.nextInt();
            double pi = 3.14;
            double cavab = 2*pi*r;
            System.out.println("Dairənin sahesi " + cavab);
        }else {
            System.out.println("Seçiminiz düzgün deyil");
        }



        //6. Taksi Tarif Hesabı



        //7. Bank Kredit Müraciəti

        Scanner scanner =new Scanner(System.in);
        System.out.println("Yaşıvızı daxil edin: ");
        int age = scanner.nextInt();
        System.out.println("Aylıq gəlirinizi daxil edin: ");
        int money = scanner.nextInt();
        System.out.println("iş təcrübənizi yazın: ");
        int experience = scanner.nextInt();
        System.out.println("Kredit reytinqinizi daxileedin");
        int reyting = scanner.nextInt();

        if (age >= 21 && age <= 65 && money >= 1000 && experience > 2 && reyting > 600){
            int kredit =  36 * money;
            System.out.println("Sizə verilən kredit məbləği: " + kredit);
        } else {
            System.out.println("Sizə kredit təyin olunmur");
        }



        //8. Həkim Növbəsi Sistemi
        Scanner scanner =new Scanner(System.in);
        System.out.println("Qəbul təcilidir? (Beli/Xeyr): ");
        String emergency = scanner.next();
        boolean emergencyInput = emergency.equalsIgnoreCase("Beli");

        if (emergencyInput){
            System.out.println("Xəsdəni dərhal qəbul edin");
        } else {
            System.out.println("Yaşınızı daxil edin");
            int age = scanner.nextInt();
            System.out.println("Hamiləsiz (Beli/Xeyr): ");
            String pregnant = scanner.next();
            boolean pregnantEmergency = pregnant.equalsIgnoreCase("Beli");

            if (pregnantEmergency){
                System.out.println("Qəbul müddəti: 1 saata");
            } else if (age >= 65){
                System.out.println("Qəbul müddəti: 2 saata");
            } else if (age < 16) {
                System.out.println("Qəbul müddəti: 3 saata");
            } else {
                System.out.println("Qəbul müddəti: 5 saata");
            }
        }


       //9. Onlayn Oyun Reytinq Sistemi

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ümumi oyun sayı: ");
        int totalGames = scanner.nextInt();
        System.out.print("Qazandığınız oyun sayı: ");
        int wonGames = scanner.nextInt();
        System.out.print("Ortalama xal: ");
        double avgScore = scanner.nextDouble();
        double winPercent = (wonGames * 100.0) / totalGames;
        System.out.println("Qələbə faizi: " + winPercent + "%");

        if (winPercent >= 70 && avgScore >= 85) {
            System.out.println("Reytinq: Peşəkar");
        } else if (winPercent >= 50 && avgScore >= 70) {
            System.out.println("Reytinq: Mütəxəssis");
        } else if (winPercent >= 30) {
            System.out.println("Reytinq: Orta");
        } else {
            System.out.println("Reytinq: Başlayan");


        }
        */

      //  10. Avtomobil Sığorta Hesabı

        Scanner scanner = new Scanner(System.in);
        double basePrice = 500;
        double totalPrice = basePrice;

        System.out.println("yaşınızı daxil edin");
        int age = scanner.nextInt();
        System.out.println("təcrübənizi qeyd edin");
        int experience = scanner.nextInt();
        System.out.print("Sürücülük yeri (şəhər/kənd): ");
        String location = scanner.nextLine().toLowerCase();

        System.out.print("Son zamanlar qəza etmisiniz? (bəli/xeyr): ");
        String accident = scanner.nextLine().toLowerCase();

        System.out.print("Premium paket seçilib? (bəli/xeyr): ");
        String premium = scanner.nextLine().toLowerCase();


        if (age < 25) {
            totalPrice += basePrice * 0.30;
        } else if (age > 60) {
            totalPrice += basePrice * 0.20;
        }
        if (experience < 3) {
            totalPrice += basePrice * 0.25;
        }
        if (location.equals("şəhər")) {
            totalPrice += basePrice * 0.15;
        } else if (location.equals("kənd")) {
            totalPrice -= basePrice * 0.10;
        }
        if (accident.equals("bəli")) {
            totalPrice += basePrice * 0.40;
        }
        if (premium.equals("bəli")) {
            totalPrice += basePrice * 0.50;
        }

        System.out.println("Sığorta məbləği: " + totalPrice + " AZN");
    }
}







