
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour systemeBancaire complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="systemeBancaire">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cardCrypto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nomproprio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomproprio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="solde" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "systemeBancaire", propOrder = {
    "cardCrypto",
    "cardDate",
    "cardNumber",
    "nomproprio",
    "prenomproprio",
    "solde"
})
public class SystemeBancaire {

    protected String cardCrypto;
    protected String cardDate;
    protected String cardNumber;
    protected String nomproprio;
    protected String prenomproprio;
    protected Float solde;

    /**
     * Obtient la valeur de la propri�t� cardCrypto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCrypto() {
        return cardCrypto;
    }

    /**
     * D�finit la valeur de la propri�t� cardCrypto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCrypto(String value) {
        this.cardCrypto = value;
    }

    /**
     * Obtient la valeur de la propri�t� cardDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardDate() {
        return cardDate;
    }

    /**
     * D�finit la valeur de la propri�t� cardDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardDate(String value) {
        this.cardDate = value;
    }

    /**
     * Obtient la valeur de la propri�t� cardNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * D�finit la valeur de la propri�t� cardNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Obtient la valeur de la propri�t� nomproprio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomproprio() {
        return nomproprio;
    }

    /**
     * D�finit la valeur de la propri�t� nomproprio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomproprio(String value) {
        this.nomproprio = value;
    }

    /**
     * Obtient la valeur de la propri�t� prenomproprio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrenomproprio() {
        return prenomproprio;
    }

    /**
     * D�finit la valeur de la propri�t� prenomproprio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrenomproprio(String value) {
        this.prenomproprio = value;
    }

    /**
     * Obtient la valeur de la propri�t� solde.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSolde() {
        return solde;
    }

    /**
     * D�finit la valeur de la propri�t� solde.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSolde(Float value) {
        this.solde = value;
    }

}
