package andrew;

public class Account {
    private String name;
    private String address;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.equals("")) { //запрет пустых строк
            this.name = name;
        } else System.out.println("Ошибка! Вы забыли задать имя");
    }

    public String getAddress() {
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

//    public void display() {
//        System.out.print(name + ", ");
//        System.out.print("живет в доме №" + address + ", ");
//        System.out.print("имеет на счету $" + balance);
//    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100;
    }

}