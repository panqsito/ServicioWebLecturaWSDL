
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.1
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Operaciones", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Operaciones {


    /**
     * 
     * @param num1
     * @param operacion
     * @param num2
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "operacionesBasicas", targetNamespace = "http://ws/", className = "ws.OperacionesBasicas")
    @ResponseWrapper(localName = "operacionesBasicasResponse", targetNamespace = "http://ws/", className = "ws.OperacionesBasicasResponse")
    @Action(input = "http://ws/Operaciones/operacionesBasicasRequest", output = "http://ws/Operaciones/operacionesBasicasResponse")
    public float operacionesBasicas(
        @WebParam(name = "num1", targetNamespace = "")
        float num1,
        @WebParam(name = "num2", targetNamespace = "")
        float num2,
        @WebParam(name = "operacion", targetNamespace = "")
        String operacion);

    /**
     * 
     * @param clave
     * @param usuario
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "login", targetNamespace = "http://ws/", className = "ws.Login")
    @ResponseWrapper(localName = "loginResponse", targetNamespace = "http://ws/", className = "ws.LoginResponse")
    @Action(input = "http://ws/Operaciones/loginRequest", output = "http://ws/Operaciones/loginResponse")
    public boolean login(
        @WebParam(name = "usuario", targetNamespace = "")
        String usuario,
        @WebParam(name = "clave", targetNamespace = "")
        String clave);

    /**
     * 
     * @param aceleracion
     * @param masa
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "leyNewton", targetNamespace = "http://ws/", className = "ws.LeyNewton")
    @ResponseWrapper(localName = "leyNewtonResponse", targetNamespace = "http://ws/", className = "ws.LeyNewtonResponse")
    @Action(input = "http://ws/Operaciones/leyNewtonRequest", output = "http://ws/Operaciones/leyNewtonResponse")
    public float leyNewton(
        @WebParam(name = "masa", targetNamespace = "")
        float masa,
        @WebParam(name = "aceleracion", targetNamespace = "")
        float aceleracion);

    /**
     * 
     * @param tiempo
     * @param distancia
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "velocidad", targetNamespace = "http://ws/", className = "ws.Velocidad")
    @ResponseWrapper(localName = "velocidadResponse", targetNamespace = "http://ws/", className = "ws.VelocidadResponse")
    @Action(input = "http://ws/Operaciones/velocidadRequest", output = "http://ws/Operaciones/velocidadResponse")
    public float velocidad(
        @WebParam(name = "distancia", targetNamespace = "")
        float distancia,
        @WebParam(name = "tiempo", targetNamespace = "")
        float tiempo);

    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://ws/", className = "ws.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://ws/", className = "ws.HelloResponse")
    @Action(input = "http://ws/Operaciones/helloRequest", output = "http://ws/Operaciones/helloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param euros
     * @return
     *     returns java.lang.Double
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "euroAdolar", targetNamespace = "http://ws/", className = "ws.EuroAdolar")
    @ResponseWrapper(localName = "euroAdolarResponse", targetNamespace = "http://ws/", className = "ws.EuroAdolarResponse")
    @Action(input = "http://ws/Operaciones/euroAdolarRequest", output = "http://ws/Operaciones/euroAdolarResponse")
    public Double euroAdolar(
        @WebParam(name = "euros", targetNamespace = "")
        double euros);

    /**
     * 
     * @param altura
     * @param base
     * @return
     *     returns float
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "areadetriangulo", targetNamespace = "http://ws/", className = "ws.Areadetriangulo")
    @ResponseWrapper(localName = "areadetrianguloResponse", targetNamespace = "http://ws/", className = "ws.AreadetrianguloResponse")
    @Action(input = "http://ws/Operaciones/areadetrianguloRequest", output = "http://ws/Operaciones/areadetrianguloResponse")
    public float areadetriangulo(
        @WebParam(name = "base", targetNamespace = "")
        float base,
        @WebParam(name = "altura", targetNamespace = "")
        float altura);

}
