//package lessons.First;
//
//import java.util.Scanner;
//
//public class homework4 {
//    public static void main(String[] args) {
//        /* 1. Tapşırıq – 1–3 arası rəqəmə görə rəng
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1,2 və 3 ədədlərindən birini daxil edin: ");
//        int colour = scanner.nextInt();
//
//        switch (colour){
//            case 1:
//                System.out.println("Qırmızı");
//                break;
//            case 2:
//                System.out.println("Yaşıl");
//                break;
//            case 3:
//                System.out.println("Mavi");
//                break;
//
//
//        /// Switch Expressions
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("1,2 və 3 ədədlərindən birini daxil edin: ");
//        int colour = scanner.nextInt();
//        String rengAdi = switch (colour) {
//            case 1 -> "Qırmızı";
//            case 2 -> "Yaşıl";
//            case 3 -> "Mavi";
//            default -> "Səhv seçim! Yalnız 1, 2 və ya 3 daxil edilməlidir.";
//        };         System.out.println("sizin reng " + rengAdi);
//
//
//
//
//        2. Tapşırıq – Avtomobil növü
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("1,2,3 və 4 ədədlərindən birini daxil edin: ");
////        int car = scanner.nextInt();
////
////        switch (car){
////            case 1:
////                System.out.println("Sedan");
////                break;
////            case 2:
////                System.out.println("SUV");
////                break;
////            case 3:
////                System.out.println("Sport");
////                break;
////            case 4:
////                System.out.println("Elektrikli");
////                break;
////
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("1,2,3 və 4 ədədlərindən birini daxil edin: ");
////        int car = scanner.nextInt();
////        String carName = switch (car){
////
////            case 1 -> "sedan";
////            case 2 -> "suv";
////            case 3 -> "sport";
////            case 4 -> "elektrikli";
////            default -> "Səhv seçim! Yalnız 1, 2 və ya 3 daxil edilməlidir.";
////        };
////        System.out.println("sizin masin " + carName);
//
//         4 3. Tapşırıq – Məhsul qiyməti
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Məhsul kodunu daxil edin (A, B, C): ");
////        String code = scanner.next().toUpperCase();
//
////        switch (code){
////            case "A":
////                System.out.println("Məhsul: Su Qiymət: 1.5 AZN");
////                break;
////            case "B":
////                System.out.println("Məhsul: Çörək Qiymət: 1 AZN");
////                break;
////            case "C":
////                System.out.println("Məhsul: Süd Qiymət: 2 AZN");
////                break;
////            default:
////                System.out.println("Daxil edilən kod uyğun deyil.");
////        }
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.print("Məhsul kodunu daxil edin (A, B, C): ");
////        String code = scanner.next().toUpperCase();
////
////        String codeName = switch (code){
////            case "A" -> "Məhsul: Su Qiymət: 1.5 AZN";
////            case "B" -> "Məhsul: Çörək Qiymət: 1 AZN";
////            case "C" -> "Məhsul: Süd Qiymət: 2 AZN";
////            default -> "Daxil edilən kod uyğun deyil.";
////
////        };
////        System.out.println(codeName);
//
//          4. Tapşırıq – Ay nömrəsi ilə fəsil tap
//
////        Scanner scanner = new Scanner(System.in);
////        System.out.println("Ededi daxil (1-12) araliginda ");
////        int eded = scanner.nextInt();
////
////        switch (eded){
////            case 12: case 1: case 2:
////                System.out.println( "Qış fəsili ");
////                break;
////            case 3: case 4: case 5:
////                System.out.println( "Yaz fəsili ");
////                break;
////            case 6: case 7: case 8:
////                System.out.println( "Yay fəsili ");
////                break;
////            case 9: case 10: case 11:
////                System.out.println( "Payız fəsili ");
////                break;
////            default:
////                System.out.println("Daxil edilən eded düzgün deyil");
////
////
////
////        }
//
//     5. Tapşırıq – İmtahan qiyməti
//
//
////        Scanner scanner =  new Scanner(System.in);
////        System.out.println("Imtahan hərfini daxil edin");
////        String herf = scanner.next().toUpperCase();
////
////        switch (herf){
////            case "A":
////                System.out.println("Sizin qiymet Əladır");
////                break;
////            case "B":
////                System.out.println("Sizin qiymet Çox Yaxşıdır");
////                break;
////            case "C":
////                System.out.println("Sizin qiymet Yaxşıdır");
////                break;
////            case "D":
////                System.out.println("Sizin qiymet Qənaətbəxşdir");
////                break;
////            case "F":
////                System.out.println("Sizin qiymet Kafidir");
////                break;
////            default:
////                System.out.println("Düzgü herf daxil edin");
////        }
//
//     6. Tapşırıq – ATM menyusu
//
//
////        Scanner scanner =  new Scanner(System.in);
////        System.out.println("Imtahan hərfini daxil edin");
////        String herf = scanner.next().toUpperCase();
////
////        String herfName = switch (herf){
////            case "A" -> "Sizin qiymet Əladır";
////            case "B" -> "Sizin qiymet Çox Yaxşıdır";
////            case "C" -> "Sizin qiymet Yaxşıdır";
////            case "D" -> "Sizin qiymet Qənaətbəxşdir";
////            case "F" -> "Sizin qiymet Kafidir";
////            default -> "Düzgü herf daxil edin";
////        };
////        System.out.println(herfName);
//
//
////        Scanner scanner =  new Scanner(System.in);
////        System.out.println("Seçim daxil edin");
////        int number = scanner.nextInt();
////
////        switch (number){
////            case 1:
////                System.out.println("Balansa bax");
////                break;
////            case 2:
////                System.out.println("Pul çıxarr");
////                break;
////            case 3:
////                System.out.println("SPul yatır");
////                break;
////            case 4:
////                System.out.println("Kartı çıxar");
////                break;
////            default:
////                System.out.println("Düzgü eded daxil edin");
////        }
////
////        Scanner scanner =  new Scanner(System.in);
////        System.out.println("Seçim daxil edin");
////        int number = scanner.nextInt();
////
////        String numberName = switch (number){
////            case 1 -> "Balansa bax";
////            case 2 -> "Pul çıxar";
////            case 3 -> "Pul yatır";
////            case 4 -> "Kartı çıxar";
////            default -> "Düzgün eded daxil edin";
////        };
////        System.out.println(numberName);
//
//
//        // 7. Tapşırıq – Dil koduna görə salam
//
//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Dil kodunu daxil edin");
//        String herf = scanner.next().toUpperCase();
//
//        switch (herf){
//            case "AZ":
//                System.out.println("Salamr");
//                break;
//            case "EN":
//                System.out.println("Hello");
//                break;
//            case "TR":
//                System.out.println("Merhaba");
//                break;
//            default:
//                System.out.println("Tanımadım");
//        }
//
//        Scanner scanner =  new Scanner(System.in);
//        System.out.println("Dil kodunu daxil edin");
//
//        String herf = scanner.next().toUpperCase();
//        String newHerf = switch (herf){
//            case "AZ" -> "Salam";
//            case "EN" -> "Hello";
//            case "TR" -> "Merhaba";
//            default -> "Tanımadım";
//        };
//        System.out.println(newHerf);
//
//       // 8. Tapşırıq – İdman növü
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("İdman kodunu daxil edin (F, B, V, T): ");
//        String code = scanner.nextLine().toUpperCase();
//
//        switch (code) {
//            case "F":
//                System.out.println("İdman növü: Futbol");
//                break;
//            case "B":
//                System.out.println("İdman növü: Basketbol");
//                break;
//            case "V":
//                System.out.println("İdman növü: Voleybol");
//                break;
//            case "T":
//                System.out.println("İdman növü: Tennis");
//                break;
//            default:
//                System.out.println("Yanlış idman kodu ");
//        }
//
//
//        //9. Tapşırıq – Hesab maşını
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ilk ededi daxil edin");
//        double a = scanner.nextDouble();
//        System.out.println("Ikinci ededi daxil edin");
//        double b = scanner.nextDouble();
//        System.out.println("operatoru daxil edin (+,-,/,%)");
//        String operator = scanner.next();
//
//        if ((operator == "/" || operator == "%") && b == 0){
//            System.out.println("Sıfıra bölmek olmaz");
//        }else {
//            switch (operator) {
//                case "+":
//                    System.out.println("Cavab: " + (a+b));
//                    break;
//                case "-":
//                    System.out.println("Cavab: " + (a-b));
//                    break;
//                case "*":
//                    System.out.println("Cavab: " + (a*b));
//                    break;
//                case "/":
//                    System.out.println("Cavab: " + (a/b));
//                    break;
//                case "%":
//                    System.out.println("Cavab: " + (a%b));
//                    break;
//                default:
//                    System.out.println("Düzgün operator daxil edin(+,-,/,%)");
//
//            }
//
//           }
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Fakültə kodunu daxil edin (IT, M, H, BT): ");
//        String code = scanner.nextLine().toUpperCase();
//
//        switch (code) {
//            case "IT":
//                System.out.println("Fakültə: İnformasiya Texnologiyaları");
//                System.out.println("İxtisas: Proqramlaşdırma və sistemlər");
//                break;
//
//            case "M":
//                System.out.println("Fakültə: Maliyyə");
//                System.out.println("İxtisas: Bank işi, mühasibatlıq");
//                break;
//
//            case "H":
//                System.out.println("Fakültə: Hüquq");
//                System.out.println("İxtisas: Hüquqi tənzimləmə");
//                break;
//
//            case "BT":
//                System.out.println("Fakültə: Biznes və Ticarət");
//                System.out.println("İxtisas: Marketinq, idarəetmə");
//                break;
//
//            default:
//                System.out.println("Naməlum fakültə");
//                System.out.println("İxtisas: Tanınmayan kod");
//        }
//
//
//        //12. Tapşırıq – Cüt və ya Tək
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tam eded daxil edin: ");
//        int eded = scanner.nextInt();
//
//        int qaliq = eded % 2;
//
//        switch (qaliq){
//            case 0:
//                System.out.println("ədəd cütdür");
//                break;
//            case 1:
//                System.out.println("ədəd təkdir");
//                break;
//            default:
//                System.out.println("Xəta baş verdi");
//        }
//
//
//        //13. Tapşırıq – Bal ilə keçid şərti
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Balınızı daxil edin (0–100): ");
//        int bal = scanner.nextInt();
//
//        if (bal < 0 || bal > 100){
//            System.out.println("Xəta: Bal 0–100 aralığında olmalıdır.");
//        }
//        switch (bal/10){
//            case 10: case 9: case 8: case 7: case 6: case 5:
//                System.out.println("Nəticə: Keçdi");
//                break;
//
//            case 4: case 3: case 2: case 1: case 0:
//                System.out.
//                ("Nəticə: Kəsildi");
//         */
//                break;
//
//            default:
//                System.out.println("Xəta: Bal 0–100 aralığında olmalıdır.");
//        }
//
//        */
//
//        //15. Tapşırıq – İmtahan balına görə nəticə
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("İmtahan balınızı daxil edin (0–100): ");
//        int bal = scanner.nextInt();
//
//        switch (bal / 10) {
//            case 10:
//            case 9:
//                System.out.println("Nəticə: Əla");
//                break;
//            case 8:
//                System.out.println("Nəticə: Çox yaxşı");
//                break;
//            case 7:
//                System.out.println("Nəticə: Yaxşı");
//                break;
//            case 6:
//                System.out.println("Nəticə: Qənaətbəxş");
//                break;
//            case 5: case 4: case 3: case 2: case 1: case 0:
//                System.out.println("Nəticə: Kafi deyil");
//                break;
//            default:
//                System.out.println("Bal 0–100 aralığında olmalıdır.");
//        }
//
//
//
//
//
//
//
//    }
//}
//
