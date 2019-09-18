package CreatingClasses;

public class StringOperations {
    String str;
    public StringOperations(){
        this.str="Hello";

    }
    public StringOperations(String myStr){
        str= myStr;
    }
    public String reversed (){
        String reverseAttribute= "";
        for( int i= this.str.length()-1; i>=0; i-- ){
            reverseAttribute= reverseAttribute+this.str.charAt(i);
        }
        return reverseAttribute;
    }
    public String reversed(String toBeReversed){
        String reversedStr= "";
        for(int i= toBeReversed.length()-1; i>=0; i--){
            reversedStr= reversedStr+ toBeReversed.charAt(i);
        }
        return reversedStr;
    }
    public String makeOnlyFirstLetterUpper(){
        String strUpperFirst=""; // Empty String to concatenate
        char firstLetter = this.str.charAt(0); // First letter of class attribute.
        strUpperFirst= strUpperFirst+firstLetter;
        strUpperFirst=strUpperFirst.toUpperCase();
        String allLowerCase = this.str.toLowerCase();
        for(int i= 1; i<allLowerCase.length(); i++){
            strUpperFirst= strUpperFirst+ allLowerCase.charAt(i);
        }


        return strUpperFirst;
    }
    public char [] returnAsArray(){
        char[] returningArray= new char[this.str.length()];
        for (int i=0; i<this.str.length(); i++){
            returningArray[i]=this.str.charAt(i);
        }
        return returningArray;
    }
}
