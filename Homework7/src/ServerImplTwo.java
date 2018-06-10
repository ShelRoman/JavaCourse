import java.util.Date;
import java.util.ArrayList;

public class ServerImplTwo implements Server {
    private ArrayList<Client> clients;

    ServerImplTwo() {
        this.clients = new ArrayList<>();
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
