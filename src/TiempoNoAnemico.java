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

    private String darFormato (String unPatron) {
        return this.fechaHoy.format(obtenerFormateador(unPatron));
    }

    private DateTimeFormatter obtenerFormateador(String unPatron) {
        return DateTimeFormatter.ofPattern(unPatron);
    }

    private LocalDateTime actualizarTiempo () {
        return LocalDateTime.now();
    }

     //----------------------------- CONSTRUCTORES -----------------------------

    public TiempoNoAnemico() {
        this.fechaHoy = actualizarTiempo();
    }
}
