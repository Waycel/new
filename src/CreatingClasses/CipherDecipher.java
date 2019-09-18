/*
Design a Cipher / Decipher Class according to  requirements listed below
Attributes
Input String
Number(s) to Shift
Constructors
Without parameter
With parameter
Methods
show Current String
cipher
deCipher

 */

package CreatingClasses;

public class CipherDecipher {
    private String toCipher;
    private int shift;

    CipherDecipher(){
        this.toCipher="WE LOVE JAVA";
        this.shift=1;
    }
    CipherDecipher(String toCipher, int shift){
        this.toCipher= toCipher;
        this.shift= shift;

    }
    public int getShift() {
        return shift;
    }
    public String getToCipher(){
        return toCipher;
    }
    public void displayCurrentString(){
        System.out.println(this.toCipher);
    }
    public String cipher(){
        String ciphered="";
        int temp;
        for(int i=0; i<this.toCipher.length(); i++){
            temp= this.toCipher.charAt(i);
            temp= temp+ this.shift;
            ciphered= ciphered + (char) temp;

        }
        return ciphered;
    }
    public String deCipher(String toDecipher){
        String deCiphered= "";
        int temp;
        for ( int i=0; i<toDecipher.length(); i++){
            temp= toDecipher.charAt(i);
            temp = temp- this.shift;
            deCiphered= deCiphered +(char) temp;
        }
        return deCiphered;
    }


}
