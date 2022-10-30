import jakarta.xml.ws.* ;
import ws.*;

public class ServeurJWS
{
    public static void main(String[] args)
    {
        // 0.0.0.0 : adresse IP quelconque appartenant au même reseau local du serveur web
     Endpoint.publish("http://0.0.0.0:9092/",new BanqueService());
     System.out.println("Web service deploye sur 0.0.0.0:9092");
    }
}
