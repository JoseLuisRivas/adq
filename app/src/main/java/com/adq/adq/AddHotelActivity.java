package com.adq.adq;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.adq.adq.utils.TextChangedListener;


public class AddHotelActivity extends ActionBarActivity {

    private EditText txtNombrePropiedad, txtDireccionPropiedad, txtEstadoPropiedad,txtMunicipioPropiedad,
            txtTelefonoPropiedad, txtGeoPropiedad, txtNombreContacto, txtTelefonoContacto;

    private Button bntAgregarPropiedad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hotel);

        inicializarComponetesUI();

    }

    private void inicializarComponetesUI() {

         txtNombrePropiedad = (EditText) findViewById(R.id.tv_propiedad_nombre);
         txtDireccionPropiedad = (EditText) findViewById(R.id.tv_propiedad_direccion);
         txtEstadoPropiedad = (EditText) findViewById(R.id.tv_propiedad_departamento);
         txtMunicipioPropiedad = (EditText) findViewById(R.id.tv_propiedad_municipio);
         txtTelefonoPropiedad = (EditText) findViewById(R.id.tv_propiedad_telefono);
         txtGeoPropiedad = (EditText) findViewById(R.id.tv_propiedad_geolocalizacion);
         txtNombreContacto = (EditText) findViewById(R.id.tv_propiedad_nombre_contacto);
         txtTelefonoContacto = (EditText) findViewById(R.id.tv_propiedad_telefono_contacto);



        // llamo a el metoco que creamos para hacer el no tener que llamar el metodo wathcher directamente

//        txtNombrePropiedad.addTextChangedListener((TextChangeListener) onTextChanged);


        txtNombrePropiedad.addTextChangedListener(new TextChangedListener(){


            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                //super.onTextChanged(s, start, before, count);
                // Este metodo se va a ejecutar cada que hagamos click a algo
                // si se escribe una letra, un espacio en blanco, si se borra un texto


                // obtengo una isntancia del boton
                bntAgregarPropiedad = (Button) findViewById(R.id.bnt_propiedad_add);
                // le decimos que active el boton

                // optenemos la secuencia de caracteres y que la comvierta a cadena
                // y le quitamos los espacios en blanco con trim
                // verificamos que este vacia - Si no esta vacia se activa el boton
//                bntAgregarPropiedad.setEnabled(!seq.toString().trim().isEmpty());
                bntAgregarPropiedad.setEnabled(!s.toString().trim().isEmpty());

            }
        });

    }

    public void onClick(View view) {

        // Sitring.format para concatenar cadenas
        String msg = String.format("Me presionaron", txtNombrePropiedad.getText());
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        limpiarCampos();

        // desactivamos el boton cuando el usuario haya terminado de agregar el contato
        try{
            bntAgregarPropiedad.setEnabled(false);
        }catch(NullPointerException e){
            System.out.println("Excepció llençada");
        }




    }

    private void limpiarCampos() {

        // metodo para limpiar los campos

        txtNombrePropiedad.getText().clear();
        txtDireccionPropiedad.getText().clear();
        txtEstadoPropiedad.getText().clear();
        txtMunicipioPropiedad.getText().clear();
        txtTelefonoPropiedad.getText().clear();
        txtGeoPropiedad.getText().clear();
        txtNombreContacto.getText().clear();
        txtTelefonoContacto.getText().clear();

        // luego llevamos el foco hasta el camopo nombre
        txtNombreContacto.requestFocus();
    }



    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_hotel, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    */
}
