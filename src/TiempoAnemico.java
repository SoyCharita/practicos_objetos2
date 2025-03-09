import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;


public class TiempoAnemico {

    //------------------------------- ATRIBUTOS -------------------------------
    private LocalDateTime fechaHoy;

    //-------------------------------- MÉTODOS --------------------------------

    public LocalDateTime obtenerFecha () {
        return fechaHoy ;
    }

    //----------------------------- CONSTRUCTORES -----------------------------

    public TiempoAnemico () {
        fechaHoy= now ();
    }
}