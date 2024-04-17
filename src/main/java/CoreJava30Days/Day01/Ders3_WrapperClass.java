package CoreJava30Days.Day01;

public class Ders3_WrapperClass {
    public static void main(String[] args) {

        /* Java'da primitive veri tiplerine ek özellikler kazandırarak yeni bir yapı oluşturulur.
           Bu yapıya "wrapper class" denir.

           Wrapper sınıflar, Java'nın primitive veri tiplerini nesne olarak temsil etmek için kullanılan sınıflardır.
           Bu özellik, primitive veri tiplerini koleksiyonlarda (örneğin ArrayList gibi) kullanabilmek için oldukça
           yararlıdır, çünkü Java'da koleksiyonlar sadece Object referans türlerini kabul eder.

           Girilen veriler üzerinde metod kullanımını sağlar. */

        // Wrapper'lar büyük harfle başlar çünkü bunlar sınıflardır.
        // Primitive        :   char      - boolean - byte - short - int         - long  - float  - double
        // Wrapper class   : Character   - Boolean - Byte - Short - Integer     - Long  - Float  - Double

                int i = 12;
        // i. yazıldığında metodlar erişilemez.

                Integer k = 12;
        // k. yazıldığında metodlar erişilebilir çünkü bu bir sınıftır.

        // Autoboxing - Unboxing
        /* Java'da primitive (ilkel) veri tipleri ile wrapper sınıfları arasında otomatik dönüşüm sağlayan
           autoboxing ve unboxing mekanizmaları bulunmaktadır. Autoboxing, primitive bir türü otomatik olarak
           onun wrapper sınıfına çevirir; örneğin, int'i Integer'a dönüştürür. Unboxing ise tam tersi bir işlem yapar,
           Integer'ı int'e dönüştürür. Her ikisi de otomatik olarak gerçekleşir. */

        // Örnek 1: Primitive int'i wrapper Integer'a dönüştürme (Autoboxing)

                int num = 13;

                Integer wrapperNum = num;

        // Örnek 2: Wrapper Byte'ı primitive byte'a dönüştürme (Unboxing)
                Byte s = 19;
                byte primitiveS = s;


    }
}
