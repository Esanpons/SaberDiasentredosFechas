package es.aesva.saberdiasentredosfechas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.buttonCalcular).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fechas fechas = new Fechas();

                EditText fecha1 = (EditText) findViewById(R.id.fecha1);
                EditText fecha2 = (EditText) findViewById(R.id.fecha2);
                TextView resultado = (TextView) findViewById(R.id.textViewResultado);

                String fecha_hoy = fecha1.getText().toString();
                String fecha_siguiente = fecha2.getText().toString();

                String diferencia = Integer.toString(fechas.diferenciaDiasEntre2fechas(fecha_hoy, fecha_siguiente));

                String añadirUnAño = fechas.añadirUnAño(fecha_siguiente);

                String diferenciaUnañoMas = Integer.toString(fechas.diferenciaDiasEntre2fechas(fecha_hoy, añadirUnAño));

                String textoFinal = "Diferencia entre " + fecha_hoy + " y " + fecha_siguiente + " es: " + diferencia + "\n" + "\n" + "Diferencia entre " + fecha_hoy + " y " + añadirUnAño + " es: " + diferenciaUnañoMas;

                resultado.setText(textoFinal);

            }
        });
    }



}
