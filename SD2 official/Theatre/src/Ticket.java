package src;

public class Ticket {
    int row;
    int seat;
    double price;

    Person person;

    public Ticket(int row, int seat, double price, Person person) {
        this.row = row;
        this.seat = seat;
        this.price = price;
        this.person = person;
    }
    public void print(){
        System.out.println("Person name: " + person.name);
        System.out.println("Person surname: "+ person.surName);
        System.out.println("Person email: "+ person.email);
        System.out.println("row: "+ row);
        System.out.println("seat "+ seat);
        System.out.println("price"+ price);
    }
}
