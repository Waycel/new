package CreatingClasses;

public class Shapes {
    char symbol;
    int width;
    int height;
    Shapes(){
        this.symbol= '*';
        this.width= 10;
        this.height= 10;
    }
    Shapes (char mySymbol, int myWidth, int myHeight){
        this.symbol= mySymbol;
        this.height= myHeight;
        this.width= myWidth;
    }
    public void printPyramid(){
        System.out.println("");
        for(int i=1; i<this.height; i++){
            for( int j= 1; j<i; j++){
                System.out.print( this.symbol);
            }
            System.out.println();
        }
    }
    public void printRectangle(){
        System.out.println("");
        for( int i=1; i<this.height; i++){
            for( int j=1; j<this.width; j++){
                System.out.print( this.symbol);
            }
            System.out.println();
        }
    }
    public void printRectangle(char symbol){
        System.out.println("");
        for( int i=1; i<this.height; i++){
            for( int j=1; j<this.width; j++){
                System.out.print( symbol);
            }
            System.out.println();
        }
    }

}
