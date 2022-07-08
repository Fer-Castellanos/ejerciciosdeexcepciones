package ejerciciosDeExcepciones;
/**
 *
 * ESTA CLASE HEREDA DE LA CLASE EXCEPTION
 */
public class MiPropiaExcepcion extends ClasePrincipalwithThrows{

    // Creamos una variable a nivel de clase

    private String mensajeError;

    // Creamos un constructor sin parametros pero
    // En el constructor le asignamos un mensaje
    // a la variable mensajeDeError. En este caso,
    // En este primer constructor vamos a asignarle
    // a la variable mensajeDeError el mensaje: Error1

    public MiPropiaExcepcion(){
        this.mensajeError="Error 1";

    }

    // Creamos un constructor que recibirá un parámetro
    // de tipo String y le asignaremos a la variable
    // mensajeDeError el valor del parametro. Este parametro
    // es un mensaje que el usuario introducirá por teclado
    // desde el método main


    public MiPropiaExcepcion(String introduceMensaje){
        // Asignamos el valor del paramentro a la variable mensajeError
        this.mensajeError=introduceMensaje;
    }
    // Sobreescribimos el metodo getMessage de la clase Exception

    public String getMensajeError() {
        return mensajeError;
    }
}
