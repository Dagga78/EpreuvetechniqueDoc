/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import model.SystemeBancaire;

/**
 *
 * @author jerom
 */
@Startup
@Singleton(mappedName = "MessagesHolderBean")
public class SystemeBancaireBean {

    private static Map<String, SystemeBancaire> sb;

    @PostConstruct
    private void init() {
        this.sb = new HashMap<>();
        sb.put("2222222222222222", new SystemeBancaire("Jouet", "Jerome", "2222222222222222", "09/11", "700", 750.f));
        sb.put("3333333333333333", new SystemeBancaire("Dahlem", "Romain", "3333333333333333", "08/11", "702", 1000.f));
        sb.put("4444444444444444", new SystemeBancaire("Gibert", "Clément", "4444444444444444", "07/11", "706",1500.f));

    }

    public SystemeBancaire verifpaiement(String nomproprio, String prenomproprio, String cardNumber, String cardDate, String cardCrypto, Float prix) {
        System.out.println("system" + sb.get(cardNumber));
        SystemeBancaire systemofUser = sb.get(cardNumber);
        if (systemofUser != null) {
            if (systemofUser.getNomproprio().equals(nomproprio) && systemofUser.getPrenomproprio().equals(prenomproprio) && systemofUser.getCardNumber().equals(cardNumber) && systemofUser.getCardCrypto().equals(cardCrypto)) {
                if (systemofUser.getSolde() >= prix) {
                    System.out.println("Dans le panier");
                    return sb.get(cardNumber);
                } else {
                    System.out.println("Solde insufisants");
                    return null;
                }
            } else {
                System.out.println("aucun systeme bancaire trouvé");
                return null;
            }
        } else {
            System.out.println("aucun systeme bancaire trouvé");
            return null;
        }

    }

}
