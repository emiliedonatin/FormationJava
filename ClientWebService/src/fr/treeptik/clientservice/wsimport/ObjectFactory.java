
package fr.treeptik.clientservice.wsimport;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.treeptik.clientservice.wsimport package. 
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

    private final static QName _RegisterEmployeResponse_QNAME = new QName("http://webservice.treeptik.fr/", "registerEmployeResponse");
    private final static QName _RegisterEmploye_QNAME = new QName("http://webservice.treeptik.fr/", "registerEmploye");
    private final static QName _Exception_QNAME = new QName("http://webservice.treeptik.fr/", "Exception");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.treeptik.clientservice.wsimport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link RegisterEmployeResponse }
     * 
     */
    public RegisterEmployeResponse createRegisterEmployeResponse() {
        return new RegisterEmployeResponse();
    }

    /**
     * Create an instance of {@link RegisterEmploye }
     * 
     */
    public RegisterEmploye createRegisterEmploye() {
        return new RegisterEmploye();
    }

    /**
     * Create an instance of {@link Employe }
     * 
     */
    public Employe createEmploye() {
        return new Employe();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmployeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.treeptik.fr/", name = "registerEmployeResponse")
    public JAXBElement<RegisterEmployeResponse> createRegisterEmployeResponse(RegisterEmployeResponse value) {
        return new JAXBElement<RegisterEmployeResponse>(_RegisterEmployeResponse_QNAME, RegisterEmployeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterEmploye }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.treeptik.fr/", name = "registerEmploye")
    public JAXBElement<RegisterEmploye> createRegisterEmploye(RegisterEmploye value) {
        return new JAXBElement<RegisterEmploye>(_RegisterEmploye_QNAME, RegisterEmploye.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.treeptik.fr/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

}
