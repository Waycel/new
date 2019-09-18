//100'den 1'e kadar olan tek sayılar
//0 ile 100 arasında hem 3'e hem de 7'ye bölünebilen sayılar
//2 4 8 16 32 2'nin üstleri
// 1'den 5'e kadar 5'e bölünebilen sayılar
package MyExamples;

public class Loops {
    public static void main(String[] args) {
        //100'den 1'e kadar olan tek sayılar
        for( int i= 99; i>1;i-=2){ // 1 den 20 ye kadar olan tek sayıları bastırmak istiyorsak eğer.
            // i=i+2 aslında i-=2 demek
            System.out.print(" "+i); // i+1 i'yi bir arttır demek.
        }
        for(int i=0; i<50; i++){
            System.out.println(""+ (100-(2*i+1)));
        }
        //0 ile 100 arasında hem 3'e hem de 7'ye bölünebilen sayılar
        for(int i=1; i<100; i++){
            if(i%3==0 && i%7==0){
                System.out.print(" "+ i);

            }
        }
        //2 4 8 16 32 2'nin üstleri
        for( int i=1; i<100; i*=2){
            System.out.println( ""+i);
        }
        // 1'den 5'e kadar 5'e bölünebilen sayılar
        for ( int i=1; i<=5; i++){
            if(i%5==0)
                System.out.print(i);

        }

    }

}
