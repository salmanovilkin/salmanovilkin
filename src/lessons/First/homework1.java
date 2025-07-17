package lessons.First;
//homework
public class homework1 {
    public static void main(String[] args) {
        //1. Bir dəyişən yaradıb ona fayl ölçüsünü yaz (məsələn, 120). Konsola çıxar.
        int fileSize = 120;
        System.out.println("Fayl ölçüsü: " + 120 + " MB");

        //2.Məzuniyyət ilini saxlayan dəyişən yarat və çap et.
        int graduationYear = 2016;
        System.out.println("Məzuniyyət ili: " + graduationYear);

        //3.İstifadəçi ID-sini saxlayan dəyişən yarat və çap et.
        int userId = 861600;
        String userFin = "6J2NPDV";
        System.out.println("User ID: " + userId + " " + "User FIN: " + userFin);

        //4.Dünya əhalisi üçün dəyişən yarat və böyük bir rəqəm saxla.
        long population = 8000000000L;
        System.out.println("Dünya əhalisinin sayı: " + population);

        //5.Temperaturu onluq ədəd kimi saxlayan dəyişən yarat və çap et.
        double temperatur = 36.6;
        System.out.println("Istilik derecesi " + temperatur);

        //6.Bank hesabındakı məbləği saxlayan dəyişən yarat və çap et.
        float amountBalance = 15690.89F;
        System.out.println("Bank hesabindki mebleğ: " + amountBalance);

        //7.Adının ilk hərfini saxlayan dəyişən yarat və çap et.
        String name = "Ilkin";
        char ilkHerf = 'I';
        System.out.println("Ad: " + name + "Ilk herf: " + ilkHerf);

        //8.‘İşləyir?’ sualına uyğun boolean dəyişən yarat və çap et.
        boolean status = false;
        if (status){
            System.out.println("işləyir?"+"beli");
        }else{
            System.out.println("işləyir? "+"xeyr");
        }

        //9. Yaşını saxlayan dəyişən yarat və çap et.
        byte yash = 25;
        System.out.println("Yaşım: " + yash);



        //type casting
        //10.int → double avtomatik çevrilməsi nümunəsi yaz və nəticəni çap et.
        int value = 34;
        double myValue=value;
        System.out.println(myValue);

        //11.double → int manual çevrilməsi yaz və onluq hissənin itirildiyini göstər.
        double myDouble = 99.78;
        int myInt = (int)myDouble;
        System.out.println(myInt);

        //12.long → int çevrilməsi zamanı sərhəd aşımı nəticəsini göstər.
        long myLong = 1234567891L;
        int myInt2= (int)myLong;
        System.out.println(myInt2);

        // 14. short → byte manual çevrilməsi yaz və nəticəni analiz et.
        short myShort = 12345;
        byte myByte = (byte) myShort;
        System.out.println(myByte);

        // 15. byte → int avtomatik çevrilməsini göstər.
        byte myByte2= 127;
        int myInt3= myByte2;
        System.out.println(myInt3);

        //16.float → int çevrilməsi ilə onluq hissənin necə itdiyini göstər.
        float myFloat= 1234567.89F;
        int myInt4=(int)myFloat;
        System.out.println(myInt4);


        // Məhsulun adı (String tipində)
        String productName = "Apple iPhone 15";

        //18.Mağaza məhsulu üçün aşağıdakı məlumatları saxlayan dəyişənlər yarat və konsola
        // Məhsulun sayı
        int product = 25;

        // Qiyməti
        double productPrice = 2399.99;

        // Stokda olub-olmaması
        boolean isInStock = true;

        // Konsola çıxarış
        System.out.println("Məhsulun adı: " + productName);
        System.out.println("Məhsulun sayı: " + product);
        System.out.println("Məhsulun qiyməti: " + productPrice + " AZN");
        System.out.println("Stokda var? " + isInStock);

        //19. Şagirdin məlumatlarını saxlayan proqram yaz:
        String ad = "Ilkin";
        int yas = 25;
        double qiymet = 90.3;
        boolean kecid = qiymet > 50;

        System.out.println("Şagirdin adı: " + ad);
        System.out.println("Yaşı: " + yas);
        System.out.println("Aldığı qiymət: " + qiymet);
        System.out.println("Keçib? " + kecid);

        //20. Hava haqqında məlumatları saxlayan dəyişənlər yarat və konsola çıxar:
        double temperatur2 = 36.6;
        boolean rain = false;
        String sky = "sunny";

        System.out.println("Istilik: " + temperatur2 +"C");
        System.out.println("Hava durumu " + sky);
        System.out.println("yağış? " +rain);

        //21. Avtomobil üçün aşağıdakı məlumatları saxla və konsola çıxar:
        String carModel = "BMW";
        int manufactureYear = 2006;
        int km = 170000;
        int price = 27000;

        System.out.println("Model: " + carModel);
        System.out.println("Istehsal ili: " + manufactureYear );
        System.out.println("Yurus: " + km);
        System.out.println("Qiymet: " + price);

        //22.Kitabxana sistemində kitab məlumatlarını saxla:
        String bookName = "Xemse";
        String writer = "Nizami";
        int pages = 230;
        boolean movcuddurmu = true ;

        System.out.println("kitab adi: " + bookName);
        System.out.println("Yazici: "+ writer);
        System.out.println("Sehifeler: " + pages);
        System.out.println("Movcudluq: " + movcuddurmu);

        //23. Telefon haqqında məlumatları saxlayan proqram yaz:
        String phoneName = "Iphone";
        String phoneModel = "15 Pro max";
        int phoneMemory = 256;
        int phonePrice = 2600;


        System.out.println("Marka: " + phoneName);
        System.out.println("Model: " + phoneModel);
        System.out.println("Yaddaş: " + phoneMemory);
        System.out.println("Qiymet:" + phonePrice);

        //24. Film haqqında məlumatları saxlayan dəyişənlər yarat və çap et:
        String filmName = "Godfather";
        String filmJanr = "Dram";
        int time = 1970;
        float imdb = 8.0F;


        System.out.println("Filmin adı: " + filmName);
        System.out.println("Janr: " + filmJanr);
        System.out.println("Çıxış ili: " + time);
        System.out.println("IMDB reytinqi: " + imdb);

        //25. Restoran masası üçün rezervasiya sistemində istifadə olunacaq dəyişənlər yaz:
        String userName = "Ilkin";
        int number = 13;
        int people = 8 ;
        boolean reservation = true;

        System.out.println("Müştərinin adı: " + userName);
        System.out.println("Masa nömrəs: " + number);
        System.out.println("Nəfər sayı" +  people);
        System.out.println("Rezervasiya aktivdir? " + reservation);




    }
}
