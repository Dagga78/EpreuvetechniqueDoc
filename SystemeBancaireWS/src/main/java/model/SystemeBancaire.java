/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author jerom
 */
public class SystemeBancaire implements Serializable{
    String nomproprio;
    String prenomproprio;
    String cardNumber;
    String cardDate;
    String cardCrypto;
    Float solde;

    public SystemeBancaire(String nomproprio, String prenomproprio, String cardNumber, String cardDate, String cardCrypto, Float solde) {
        this.nomproprio = nomproprio;
        this.prenomproprio = prenomproprio;
        this.cardNumber = cardNumber;
        this.cardDate = cardDate;
        this.cardCrypto = cardCrypto;
        this.solde = solde;
    }

    public SystemeBancaire() {
    }

    public String getNomproprio() {
        return nomproprio;
    }

    public String getPrenomproprio() {
        return prenomproprio;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardDate() {
        return cardDate;
    }

    public String getCardCrypto() {
        return cardCrypto;
    }

    public Float getSolde() {
        return solde;
    }

    public void setNomproprio(String nomproprio) {
        this.nomproprio = nomproprio;
    }

    public void setPrenomproprio(String prenomproprio) {
        this.prenomproprio = prenomproprio;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }

    public void setCardCrypto(String cardCrypto) {
        this.cardCrypto = cardCrypto;
    }

    public void setSolde(Float solde) {
        this.solde = solde;
    }
    
    
   
}
