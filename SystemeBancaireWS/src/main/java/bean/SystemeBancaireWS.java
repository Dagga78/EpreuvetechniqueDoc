/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import javax.inject.Inject;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import model.SystemeBancaire;

/**
 *
 * @author jerom
 */
@WebService(serviceName = "SystemeBancaireWS")
public class SystemeBancaireWS {

    @Inject
    SystemeBancaireBean systemeBancaireBean;

    @WebMethod(operationName = "verifpaiement")
    public SystemeBancaire verifpaiement(@WebParam(name = "nomproprio") String nomproprio, @WebParam(name = "prenomproprio") String prenomproprio, @WebParam(name = "cardNumber") String cardNumber, @WebParam(name = "cardDate") String cardDate, @WebParam(name = "cardCrypto") String cardCrypto, @WebParam(name = "prix") Float prix) {
        return systemeBancaireBean.verifpaiement(nomproprio, prenomproprio, cardNumber, cardDate, cardCrypto, prix);

    }

}
