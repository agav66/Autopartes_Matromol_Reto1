package usa.sesion1.myfirstgui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Productos");
        getSupportActionBar().setSubtitle("Seleccione un producto");
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


        /* Para lograrlo vamos a comenzar a desarrollar una primera versión de una App móvil
        que muestre una tienda de Autopartes, cuyos productos se puedan visualizar a través de una
        primera pantalla con una interfaz gráfica que presente los datos de forma agradable a los usuarios.
         Para lograrlo este primer diseño de pantalla debe contener:

        4. Un logo personalizado de acceso a la App desplegado en el dispositivo móvil y
        que le de identidad a la App.


        */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.opcionesdemenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        /*
        switch (item.getItemId()){
            case R.id.opcrearcuenta:
                //Aquí va todo el código que se ejecuta al momentar de seleccionar esta opción de Menú
                Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción Crear cuenta", Toast.LENGTH_LONG).show();
            case R.id.opgoogle:
                //Aquí va todo el código que se ejecuta al momentar de seleccionar esta opción de Menú
                Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción Iniciar con Google", Toast.LENGTH_LONG).show();
            case R.id.resetpass:
                //Aquí va todo el código que se ejecuta al momentar de seleccionar esta opción de Menú
                Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción Reset Pass", Toast.LENGTH_LONG).show();
            case R.id.initelefono:
                //Aquí va todo el código que se ejecuta al momentar de seleccionar esta opción de Menú
                Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción Iniciar por telefono", Toast.LENGTH_LONG).show();
            default:
                return super.onOptionsItemSelected(item);
        }
        */
         int id = item.getItemId();
         if(id == R.id.productos){
             //Intent intent = new Intent(getApplicationContext(), CrearCuenta.class);
             //startActivity(intent);
         }
        if(id == R.id.servicios){
            Intent intent = new Intent(getApplicationContext(), GoogleActivity.class);
            startActivity(intent);
        }
        if(id == R.id.sucursales){
            Intent intent = new Intent(getApplicationContext(), ResetearClave.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}