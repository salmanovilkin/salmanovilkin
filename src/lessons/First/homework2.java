package lessons.First;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        ///1. İstifadəçidən adını daxil etməsini istəyin və onu salamlayın.
       /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adıvızı daxil edin:");
        String name = scanner.nextLine();
        System.out.println("Salam: " + name);

        */

        ///2. İstifadəçidən yaşını daxil etməsini istəyin və doğum ilini hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yaşınızı daxil edin: ");
        int yash = scanner.nextInt();
        System.out.println("ili daxil edin: ");
        int year = scanner.nextInt();
        int bornYear = year - yash;
         System.out.println("Doğum ili: " + bornYear);
        */

        /// 3. İki tam ədəd daxil etdirin və onların cəmini hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki eded daxil edin: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a + b;
        System.out.println("Cavab: " + c);
        */
        ///
        /// 4. Boy metr və çəki kq daxil etdirin və BMI-ni hesablayın.
        /*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu daxil edin: ");
        double height = scanner.nextDouble();
        System.out.println("Çəkinizi daxil edin: ");
        double weight = scanner.nextDouble();

        double bmi = weight/height * height;

        System.out.println("Sizin BMI: " + bmi);
        */

        //5. Əmək haqqını və vergi faizini daxil etdirin, təmiz maaşı hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Əmək haqqını daxil edin: ");
        double emekHaqqı= scanner.nextDouble();
        System.out.println("Vergi faizini daxil edin: ");
        double vergi= scanner.nextDouble();
        double maas = emekHaqqı - vergi;
        System.out.println("Sizin net maas: " + maas);
        */

        //6. İki ədəd daxil etdirin və fərqini tapın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("iki eded daxil edin: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a-b;

        System.out.println("Cavab: " + c);
        */

        /// 7. İstifadəçidən bir ədəd alıb onun kvadratını hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin: ");
        int a = scanner.nextInt();
        int c = a*a;
        System.out.println("ededin kvadrati: " + c);
        */

        /// 8. E-mail daxil etdirin və @ simvolunun olub-olmadığını yoxlayın.
         /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("email daxil edin: ");
        String email = scanner.next();
        System.out.println(email.contains("@"));
        */

        /// 9. Tələbə adı və qiymətini daxil etdirin və keçib-keçmədiyini müəyyən edin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("telebe adini ve qiymetini daxil edin daxil edin: ");
        String name = scanner.next();
        int point = scanner.nextInt();
        boolean finish = point >= 51;

        System.out.println("Siz imtahandan kecmisiniz " + name + finish);
        */

        ///10. Daxil olunan ədədin tək yoxsa cüt olduğunu göstərin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("eded daxil edin daxil edin: ");
        int number = scanner.nextInt();
        boolean cut = number % 2==0;;
        boolean tek = number % 2 !=0;;

        System.out.println(" edec cutdur " + cut);
        System.out.println(" edec tekdir " + tek);
        */

        ///11. Sürət və vaxt daxil etdirin, məsafəni hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sürəti daxil edin: ");
        int speed = scanner.nextInt();
        System.out.print("Vaxtı daxil edin saat: ");
        int time = scanner.nextInt();
        int distance = speed * time;
        System.out.println("Məsafə: " + distance + " km");
         */

        /// 12. İstifadəçidən ailə vəziyyəti haqqında məlumat alın (true/false).
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ailə vəziyyətiniz (evlisinizsə evli, subaysınızsa subay daxil edin): ");
        boolean aileVezyeti = scanner.nextBoolean();
        System.out.println("Ailə vəziyyətiniz: " + aileVezyeti);
        */

        //13. Temperatur dəyəri daxil etdirin və onun müsbət və ya mənfi olduğunu göstərin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("temperaturu daxil edin: ");
        int temp = scanner.nextInt();
        boolean musbet = temp > 0;
        boolean menfi = temp < 0;
        boolean sifirdir = temp == 0;
        System.out.println("hava  bu gun musbetdir " + musbet);
        System.out.println("hava  bu gun menfidir " + menfi);
        System.out.println("hava  bu gun sifirdir " + sifirdir);
        */

        /// 14. Bank kartı nömrəsini daxil etdirin və onun 16 rəqəmli olub-olmadığını yoxlayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bank kartı nömrəsini daxil edin: ");
        String cardNumber = scanner.nextLine();
        boolean isValid = cardNumber.length() == 16;
        System.out.println("Kart nömrəsi 16 rəqəmlidir? " + isValid);
        */

        ///15. Radius daxil etdirin və dairənin çevrəsini hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("radiusu daxil edin: ");
        int radius = scanner.nextInt();
        float pi = 3.1416f;
        float cavab = 2 * pi * radius;
        System.out.println("Cavab:" + cavab);
        */

        //16. Sevdiyi rəngi soruşun və cavabı çap edin.

        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Rengi daxil edin: ");
        String colour = scanner.nextLine();
        System.out.println("en sevdiyiniz reng" + colour);
        */

        //17. İki ədəd daxil etdirin və onların hasilini göstərin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("ededleri daxil edin: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = a * b;

        System.out.println("Cavab: " + c);
        */

        //18. İmtahan verdiyi fənn sayını və hər birindən aldığı balı daxil etdirin, ortalamasını hesablayın.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("fenleri daxil edin: ");

        int fenn = scanner.nextInt();
        System.out.println("Ballari daxil edin");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int ortalama = (a+b+c+d)/fenn;
        System.out.println("Cavab " + ortalama);
        */

        ///19.İstifadəçidən bir ədəd alın və onun modulunu (Math.abs) göstərin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("eded daxil edin: ");
        int number = scanner.nextInt();

        System.out.println("Ededin modulu: " +Math.abs(number));

        */

        //20. Həftənin gününü daxil etdirin və istirahət günü olub olmadığını bildirin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Həftənin gününü daxil edin: ");
        String day = scanner.nextLine();

        boolean istirahet =  day.equals("şənbə") || day.equals("bazar");
        System.out.println(istirahet);

        */

        //21. İstifadəçidən bir ədəd alıb onu 10-a bölərək nəticəni göstərin.
         /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir eded daxil edin: ");

        int a = scanner.nextInt();
        int b = a/10;

        System.out.println("Cavab: " + b);

        */

       // 22. İstifadəçidən bir simvol daxil etməsini istəyin və onu çap edin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir simvol daxil edin: ");

        String simvol = scanner.next();
        System.out.println("Cavab: " + simvol);
        */

        //23. Ad və soyad daxil etdirin və tam adı birləşdirilmiş formada göstərin.
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Adınızı daxil edin: ");
        String name = scanner.next();
        System.out.print("Soyadınızı daxil edin: ");
        String surname = scanner.next();

        String fullName = name + surname;

        System.out.println(fullName);
        */

       // 24. Parol daxil etdirin və onun uzunluğunu yoxlayın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Parolunuzu daxil edin: ");

        String parol = scanner.nextLine();
        System.out.println(parol.length());

































    }
}
