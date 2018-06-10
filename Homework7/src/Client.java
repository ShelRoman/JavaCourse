import java.util.Date;

class Client {
    private static int clientCount;
    private Date date;
    private int id;

    Client() {
        clientCount++;
        this.id = clientCount;
    }

    void update(Date date) {
        this.date = date;
        printDate();
    }

    private void printDate() {
        System.out.println("This is client " + this.id + ". Its date - " + this.date);
    }
}
