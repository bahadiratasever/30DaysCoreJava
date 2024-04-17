package CoreJava30Days.Day01;

public class Ders1_Variables {
    public static void main(String[] args) {


     /*
     1- Java dili STRONGLY TYPED'dır, bu nedenle Java'daki her VARIABLE belirli DATA TYPE ile ilişkilidir.
     2- * Bir developerın değişkenlere uygun değerleri atandığından emin olması gerekir.
     */

        // Sıralama şu şekildedir

        // DATA TYPE    -    VARIABLE NAME    -    ATAMA OPERATÖRÜ    -    DATA    -    ;
        String merhaba = "HELLO WORLD";
        System.out.println(merhaba);

        String merhaba2 = "HELLO WORLD";
        System.out.println(merhaba2);


        // 1-byte | 8 bit | -128 ile +127 = tam sayılar içindir.
        byte ogrenciNotu = 97;


        // 2-short | 16 bit | -32 bin ile +32 bin = tam sayılar içindir.
        short maas = 30556;


        // 3-int | 32 bit | -2 milyar ile +2 milyar = tam sayılar içindir.(sayılarda en çok kullanılan data type'dır)
        int ulkeNufus = 826985656;


        // 4-long | 64 bit | -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 = tam sayılar içindir.
        /*
        long oluştururken deger, Integerların maximum değerinden büyük ise
        sonuna "L" koymak zorundasınız, yoksa "Integer number too large“ hatası alırsınız.
        */
        long atomSayisi = 1234567891464534554L;


        // 5-float | 32 bit | ondalık sayılar içindir.
        //App'lerde özellikle fiyat değerleri için "float" kullanılır.

        /*
        Java'da ondalıklı sayılar otomatik olarak double kabul edilir.
        float olmasını istiyorsanız sonuna "f" koymalısınız.
        */
        float cikolata = 17.99f;
        float soda = 6.99f;
        System.out.println("Toplam = " + (cikolata + soda));


        // 6-double | 64 bit | ondalık sayılar içindir.
        //Daha hassas hesaplamalar için kullanılır.
        double tozAgirligi = 0.0000000039;


        // 7-char | 16 bit | karakterleri saklamak için kullanılır. | ASCII kod yapısı ile bağlantılıdır.
        //Data tek tırnak içinde yazılır. 'B' gibi.
        //Sadece tek karakter kabul eder. 'a' '5' '%' '@' gibi.
        char adBasHarfi = 'B';


        // 8-boolean | mantıksal değerleri saklamak için kullanılır | true veya false çıktısı verir.
        boolean yasi18alti = false;

        //------------------------------------------------------

        /*
        System.out.println() ve System.out.print() fonksiyonları arasındaki temel fark,
        System.out.println()'in bir satır atlayarak çıktı vermesi,
        System.out.print()'in ise aynı satırda çıktı vermeye devam etmesidir
        */

        System.out.println("Merhaba");
        System.out.println("Dünya");
        //Merhaba
        //Dünya

        System.out.print("Merhaba ");
        System.out.print("Dünya");
        //Merhaba Dünya


    }
}
