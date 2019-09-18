package MyExamples;

public class ifElse {
    public static void main(String[] args) {
        int i=10;
        if(i==10){
            System.out.println("İ'nin degeri 10'dur");

        }
        else if (i<10){
            System.out.println("i'nin degeri 10'dan kucuktur");
        }
        else{
            System.out.println("i'nin degeri 10'dan farklidir");
            /*
            Else'nin anlamı:
            Yukarıdaki if'i kontrol e
            Şayet içindeki durumu sağlıyorsa altındaki sout'u çalıştır.
            Şayet sağlanmıyorsa else'yi çalıştır. iksiinden bir tanesi muhakkak çalışacak.
             */
        }

        System.out.println("Kontrolsuz!");
    }
}
