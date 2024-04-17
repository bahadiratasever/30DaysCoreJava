package CoreJava30Days.Day01;

public class Ders2_Concatenation {
    public static void main(String[] args) {
        // Concatenation = Birleştirme

        /*

        "+" sembolü iki sayı arasında kullanılırsa TOPLAMA işlemi gerçekleşir.
        iki adet String veya bir String bir int değer arasında kullanılırsa "CONCATENATION" olur.
        !NOT: Concatenation işlemlerinde matematik işlem önceliği kullanılır!

        */

        //ÖRNEK:
        String z = "fıstık";
        int x = 6;
        int y = 13;

        System.out.println(z+x+y);//fıstık613
        System.out.println(z+(x+y));//fıstık19
        System.out.println(z+x*y);//fıstık78
        System.out.println(x+y+z);//19fıstık
    }
}
