import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class TiempoNoAnemico {

    //------------------------------- ATRIBUTOS -------------------------------
    private LocalDateTime fechaHoy;
    private static final String PATRON_FECHA_CORTO = "dd/MM/yyyy";
    private static final String PATRON_FECHA_LARGO = "EEEE dd MMMM yyyy";


    //-------------------------------- MÉTODOS --------------------------------

    public String fechaHoyFormatoCorto () {
        return darFormato(PATRON_FECHA_CORTO);
    }

    public String fechaHoyFormatoLargo () {
        return darFormato(PATRON_FECHA_LARGO);
    }

    public String darFormato (String unFormato) {
        return fechaHoy.format(obtenerFormateador(unFormato));
    }

    public DateTimeFormatter obtenerFormateador(String unFormato) {
        return DateTimeFormatter.ofPattern(unFormato);
    }

    private LocalDateTime actualizarTiempo () {
        return LocalDateTime.now();
    }


    public LocalDateTime obtenerTiempoAhora () {
        return actualizarTiempo();
    }


    //----------------------------- CONSTRUCTORES -----------------------------

    public TiempoNoAnemico() {
        fechaHoy = actualizarTiempo();
    }
}
