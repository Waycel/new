package CreatingClasses;

public class CipherDecipherTest {
    public static void main(String[] args) {
        CipherDecipher myWord= new CipherDecipher();
        String ciphered=myWord.cipher();
        System.out.println(ciphered);
        System.out.println(myWord.deCipher(ciphered));

        CipherDecipher myCipher = new CipherDecipher("Java is Fun",4);
        String ciphered2 = myCipher.cipher();
        System.out.println(ciphered2);
        System.out.println(myCipher.deCipher(ciphered));



    }
}
