package co.com.test.exceptions;

public class BotonOCampoNoDisponibleException extends AssertionError {

    public static final String MENSAJE_BOTON_NO_DISPONIBLE = "No se pudo localizar el botón agregar al carrito";


    public BotonOCampoNoDisponibleException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
