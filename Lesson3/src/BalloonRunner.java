import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class BalloonRunner {
    static Logger log = Logger.getLogger("Ballon runner");

    private static void setUpFileLogge() {
        FileHandler handler = null;
        try {
            handler = new FileHandler("julLog.log");
            handler.setFormatter(new SimpleFormatter());
            handler.setLevel(Level.ALL);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        setUpFileLogge();
        log.info("Hello world");
        Balloon ball = new Balloon();
        System.out.println(ball.getColor());
    }
}
