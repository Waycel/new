package CreatingClasses;

public class ElectricBill {
    private int memberID;
    private int counter;
    private String name;
    private double billAmount;

    public ElectricBill(int memberID, int counter, String name, double billAmount) {
        this.memberID = memberID;
        this.counter = counter;
        this.name = name;
        this.billAmount = billAmount;
    }


    public int getMemberID() {
        return memberID;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    void displayMemberInfo(){
        System.out.println(this.name);
        System.out.println(this.memberID);
        System.out.println(this.counter);
        System.out.println(this.billAmount);
    }
}
