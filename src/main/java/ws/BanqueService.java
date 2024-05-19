package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService(name = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "conversionEuroToDh")
    public double conversionEuroToDh(@WebParam(name = "montant") double montant) {
        return montant * 11;
    }

    @WebMethod
    public Compte getCompte(int code) {
        Compte cp = new Compte();
        cp.setCode(code);
        cp.setSolde(9000);
        cp.setDateCreation(new Date());
        return cp;
    }

    @WebMethod
    public List<Compte> listComptes() {
        return List.of(new Compte(1, 9000, new Date()),
                new Compte(2, 8000, new Date()),
                new Compte(3, 7000, new Date())
                );
    }
}
