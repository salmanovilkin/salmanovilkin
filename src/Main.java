import MethodClass.JavaMethods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //JavaMethods.yazSalam();
        //JavaMethods.yazAd("Ilkin");
        //JavaMethods.cemEt(9,8);
//        int hesabla = JavaMethods.hesabla(11,23);
//        System.out.println("Cavab:" + hesabla);
//        int kvadrat = JavaMethods.kvadrat(8);
//        System.out.println("Cavab: " + kvadrat);
//        String Ad = JavaMethods.tamAd("ilkin ", "salmanov");
//        System.out.println(Ad);

//        int hesabla = JavaMethods.ferq();
//        System.out.println("Cavab: " +hesabla);

        JavaMethods methods = new JavaMethods();
        String netice = methods.yoxlaCutTek();
        System.out.println("Nəticə: " + netice);
    }
}
