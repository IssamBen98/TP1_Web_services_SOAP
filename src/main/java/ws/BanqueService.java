package ws;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.* ;

// POJO : un terme technique qui designe une simple classe java

@WebService(serviceName = "BanqueWS")
public class BanqueService
{
    @WebMethod(operationName = "Convertir")
    public double conversion(@WebParam(name = "Montant") double st)
    { return st*10.54 ;}

    @WebMethod(operationName = "Consulter")
    public compte getCompte(@WebParam(name = "Code") int code)
    {
        return new compte(code,Math.random()*1998,new Date());
    }

    @WebMethod(operationName = "listComptes")
    public List<compte> listComptes()
    {
        return List.of(
                new compte(1,Math.random()*1998,new Date()),
                new compte(2,Math.random()*1998,new Date()),
                new compte(3,Math.random()*1998,new Date())
                );
    }
}
