
package bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour verifpaiement complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="verifpaiement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nomproprio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenomproprio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCrypto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "verifpaiement", propOrder = {
    "nomproprio",
    "prenomproprio",
    "cardNumber",
    "cardDate",
    "cardCrypto",
    "prix"
})
public class Verifpaiement {

    protected String nomproprio;
    protected String prenomproprio;
    protected String cardNumber;
    protected String cardDate;
    protected String cardCrypto;
    protected Float prix;

    /**
     * Obtient la valeur de la propriété nomproprio.
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
     * Définit la valeur de la propriété nomproprio.
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
     * Obtient la valeur de la propriété prenomproprio.
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
     * Définit la valeur de la propriété prenomproprio.
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
     * Obtient la valeur de la propriété cardNumber.
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
     * Définit la valeur de la propriété cardNumber.
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
     * Obtient la valeur de la propriété cardDate.
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
     * Définit la valeur de la propriété cardDate.
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
     * Obtient la valeur de la propriété cardCrypto.
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
     * Définit la valeur de la propriété cardCrypto.
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
     * Obtient la valeur de la propriété prix.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPrix() {
        return prix;
    }

    /**
     * Définit la valeur de la propriété prix.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPrix(Float value) {
        this.prix = value;
    }

}
