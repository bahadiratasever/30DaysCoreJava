package CoreJava30Days.Day02;

public class Ders1_Operators {

    public static void main(String[] args) {
         /*Aritmetik Operatörler:
    Toplama (+), çıkarma (-), çarpma (*), bölme (/) ve mod (kalan) alma (%) operatörleri aritmetik işlemler
    için kullanılır.*/

        int x = 5;
        int y = 3;
        int toplam = x + y; // 5 + 3 = 8
        int fark = x - y;   // 5 - 3 = 2
        int carpim = x * y; // 5 * 3 = 15
        int bolum = x / y;  // 5 / 3 = 1 (int bölme, kesirli kısmı atar)
        int mod = x % y;    // 5 % 3 = 2 (5'in 3'e bölümünden kalan)
        System.out.println(mod);

        //NOT: Java'da iki tam sayının bölümü her zaman tam sayı sonucu verir. Sonuç tam sayı olmasa bile Java
        //sonucun ondalık kısmını silerek sadece tam sayı olan kısmını verir.

        //NOT: Matematiksel işlemlerde farklı data tipleri kullanılırsa sonuç her zaman en büyük olan data
        // tipinde çıktı verir

        //DATA türlerinin küçükten büyüğe sıralanışı: byte - short - int - long - float - double

        double z = 88;
        int w = 10;
        System.out.println(z / w);//8.8

        //--------------------------------------

   /*   Atama Operatörleri:
        Değişkenlere değer atamak için kullanılır. Örneğin, = (atama), += (toplama ve atama), -= (çıkarma ve atama) gibi.*/

        int atama = 5;
        atama += 3; // x = x + 3; (x şimdi 8)
        System.out.println(atama);

        //--------------------------------------

        /*Karşılaştırma Operatörleri:
        İki değeri karşılaştırmak için kullanılır. Örneğin, == (eşit mi), != (eşit değil mi), > (büyük mü), < (küçük mü),
        >= (büyük veya eşit mi), <= (küçük veya eşit mi) gibi.*/

        //int x = 5;
        //int y = 3;
        boolean esitMi = (x == y); // false
        boolean buyukMu = (x > y);  // true
        boolean kucukMu = (x < y);  // false
        System.out.println(kucukMu);

        //---------------------------------------

      /*  Mantıksal Operatörler:
        Mantıksal işlemler yapmak için kullanılır. Örneğin, && (ve), || (veya), ! (değil) gibi.*/

        boolean a = true;
        boolean b = false;
        boolean andSonucu = (a && b); // false
        boolean orSonucu = (a || b);  // true
        boolean notSonucu = !a;       // false
        System.out.println(notSonucu);

        //---------------------------------------

       /* Artırma ve Azaltma Operatörleri:
        Değişkenin değerini artırmak veya azaltmak için kullanılır. Örneğin, ++ (bir arttırma), -- (bir azaltma) gibi.*/

        //int x = 5;
        x++; // x = x + 1; (x artık 6)
        //int y = 3;
        y--; // y = y - 1; (y şimdi 2)
        System.out.println(y);//2

        //----------------------------------------

        /*Koşullu Operatör (Ternary Operatörü):
        Üç operand alan tek operatördür. Bir koşul ifadesini değerlendirir ve sonuca bağlı olarak iki farklı ifadeyi
        döndürür. Örneğin, condition ? expr1 : expr2 gibi.*/

        int AlininBoyu = 175;
        int AyseninBoyu = 162;
        String max = (AlininBoyu > AyseninBoyu) ? "ali uzun" : "ayşe uzun"; // (175 > 162) true ise "ali uzun", değilse "ayşe uzun" seçer
        System.out.println(max);


    }

}
