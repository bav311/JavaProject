package andrew;

public class Person {
    private String name;
    private String address;
    private double balance;


    public String getName() {
        System.out.print("Name is ");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        System.out.print (" (lived ");
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterest (double persentRate){
        return balance * persentRate /100;
    }
}

