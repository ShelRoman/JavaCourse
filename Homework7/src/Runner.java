
public class Runner {


    public static void main(String[] args) throws InterruptedException {
        Server server1 = new ServerImplOne();
        Server server2 = new ServerImplTwo();
        server1.register(new Client());
        server1.register(new Client());
        server2.register(new Client());
        server2.register(new Client());
        for (int i = 0; i < 10; i++) {
            server1.process();
            server2.process();
            Thread.sleep(2000);
        }
    }
}