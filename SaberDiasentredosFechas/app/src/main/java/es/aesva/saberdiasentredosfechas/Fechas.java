package es.aesva.saberdiasentredosfechas;

import java.util.Calendar;
import java.util.GregorianCalendar;


public class Fechas {


    public String añadirUnAño(String fecha) {

        GregorianCalendar calendar = convertir(fecha);

        calendar.add(Calendar.YEAR, 1);

        return toStringCal(calendar);
    }



    public int diferenciaDiasEntre2fechas(String fechaActual, String fechaSiguientePago) {


        GregorianCalendar date1;
        GregorianCalendar date2;

        date1 = convertir(fechaActual);
        date2 = convertir(fechaSiguientePago);


        long difms = date2.getTimeInMillis() - date1.getTimeInMillis();
        long difd = difms / (1000 * 60 * 60 * 24);

        return (int) difd;
    }


    private String toStringCal(GregorianCalendar calendar){

        String año = Integer.toString(calendar.get(Calendar.YEAR));
        String mes = Integer.toString(calendar.get(Calendar.MONTH));
        String dia = Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));

        return dia + "-" + mes + "-" +año ;
    }



    private GregorianCalendar convertir(String fecha) {
        String[] arrayFecha = fecha.split("-");

        int Y1 = Integer.parseInt(arrayFecha[2]);
        int M1 = Integer.parseInt(arrayFecha[1]);
        int D1 = Integer.parseInt(arrayFecha[0]);

        return new GregorianCalendar(Y1, M1, D1);
    }


}
