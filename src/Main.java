import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        var tiempoNoAnemico = new TiempoNoAnemico();

        //------------------IMPRESIÓN TIEMPO NO ANÉMICO-------------
        System.out.println(tiempoNoAnemico.fechaHoyFormatoCorto());
        System.out.println(tiempoNoAnemico.fechaHoyFormatoLargo());
        System.out.println(" ");


        var tiempoAnemico = new TiempoAnemico();
        //------------------IMPRESIÓN TIEMPO ANÉMICO-------------
        System.out.println(tiempoAnemico.obtenerFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println(tiempoAnemico.obtenerFecha().format(DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy")));
    }
}