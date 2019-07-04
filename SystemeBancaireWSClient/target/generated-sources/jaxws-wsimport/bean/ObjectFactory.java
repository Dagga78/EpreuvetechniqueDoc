
package bean;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the bean package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Verifpaiement_QNAME = new QName("http://bean/", "verifpaiement");
    private final static QName _VerifpaiementResponse_QNAME = new QName("http://bean/", "verifpaiementResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: bean
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link VerifpaiementResponse }
     * 
     */
    public VerifpaiementResponse createVerifpaiementResponse() {
        return new VerifpaiementResponse();
    }

    /**
     * Create an instance of {@link Verifpaiement }
     * 
     */
    public Verifpaiement createVerifpaiement() {
        return new Verifpaiement();
    }

    /**
     * Create an instance of {@link SystemeBancaire }
     * 
     */
    public SystemeBancaire createSystemeBancaire() {
        return new SystemeBancaire();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Verifpaiement }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean/", name = "verifpaiement")
    public JAXBElement<Verifpaiement> createVerifpaiement(Verifpaiement value) {
        return new JAXBElement<Verifpaiement>(_Verifpaiement_QNAME, Verifpaiement.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VerifpaiementResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bean/", name = "verifpaiementResponse")
    public JAXBElement<VerifpaiementResponse> createVerifpaiementResponse(VerifpaiementResponse value) {
        return new JAXBElement<VerifpaiementResponse>(_VerifpaiementResponse_QNAME, VerifpaiementResponse.class, null, value);
    }

}
