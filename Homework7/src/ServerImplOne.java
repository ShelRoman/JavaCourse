import java.util.Date;
import java.util.LinkedList;

public class ServerImplOne implements Server {
    private LinkedList<Client> clients;

    ServerImplOne() {
        this.clients = new LinkedList<>();
    }

    @Override
    public void register(Client client) {
        this.clients.add(client);
    }

    public void process() {
        for (Client client : clients) {
            client.update(new Date());

        }
    }
}
