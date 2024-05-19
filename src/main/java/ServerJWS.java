import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        String url = "http://localhost:8080/";
        Endpoint.publish(url, new BanqueService());
        System.out.println("Web service started at: " + url);
    }
}
