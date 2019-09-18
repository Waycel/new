package MyExamples;

public class BreakContinue {
    public static void main(String[] args) {
        for(int i=0; i<10; i++){
            System.out.println("First");
            if( i==5){
                //break;
                continue;

            }
            System.out.println(i);
        }
        System.out.println("Every Time");
    }
}
