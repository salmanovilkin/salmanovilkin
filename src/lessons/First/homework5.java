package lessons.First;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        /// 1. Tapşırıq – 1-dən 10-a qədər ədədləri tərsinə çap et
//        int i =  10;
//
//        while (i >= 1){
//            System.out.println(i + " ");
//            i--;
//        }

        ///2. Tapşırıq – İstifadəçi yalnız cüt ədəd daxil edənə qədər təkrar soruş
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ədəd daxil edin ");
//        int eded;
//
//        do {
//            System.out.println("cüt eded daxil edin: ");
//            eded = scanner.nextInt();
//        } while (eded % 2 == 0){
//            System.out.println(" Program dayandi tek eded oldugu üçün");
//        }

       Scanner scanner = new Scanner(System.in);
       String daxiledilenMetn;

       do {
           System.out.println("bir söz daxil edin dayındırmaq üçün (stop) yazın: ");
           daxiledilenMetn = scanner.nextLine();
       } while (daxiledilenMetn.equals("stop"));
            System.out.println("program uğurla dayandırıldı");












    }
}
