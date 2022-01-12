package andrew;

public class DemoPerson {
    public static void main(String[] args) {

        Person myPerson = new Person();
        myPerson.setName("Jon");
        myPerson.setAddress(" (Los Angeles, 22 street, 225b) ");
        myPerson.setBalance(22.9);


        Person yourPerson = new Person();
        yourPerson.setName("Alabama");
        yourPerson.setAddress(" (New York, 5 avenu, 11a) ");
        yourPerson.setBalance(13.7);

        System.out.print(myPerson.getName());
        System.out.print(myPerson.getAddress());
        System.out.print("на счету - $" + myPerson.getBalance());
        System.out.print("--- %"+ myPerson.getInterest(5));
        System.out.print(" процентная ставка");





    }
}
