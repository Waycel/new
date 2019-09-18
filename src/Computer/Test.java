package Computer;

public class Test {
    public static void main(String[] args) {
        String[] myCompSpecs = {"INTEL","2000","64"};
        Laptop myLaptop = new Laptop(myCompSpecs,16,1500,"INTEL");
        WorkStation myWorkStation = new WorkStation ();
        NetBook myNetBook = new NetBook(myCompSpecs,4,1200,"ARM",2.4);
        System.out.println(myNetBook.toString());


    }
}