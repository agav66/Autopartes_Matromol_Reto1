package usa.sesion1.myfirstgui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Matromol SAS");
        getSupportActionBar().setSubtitle("Seleccione un producto");
        getSupportActionBar().setLogo(R.drawable.matromol_icon);
        getSupportActionBar().setDisplayUseLogoEnabled(true);



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
            case R.id. Lleva a Pagina Servicios:
                //Aquí va todo el código que se ejecuta al momentar de seleccionar esta opción de Menú
                Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción Servicios", Toast.LENGTH_LONG).show();
            case R.id.Sucursales:
                //Aquí va todo el código que se ejecuta al momento de seleccionar esta opción de Menú
                Toast.makeText(getApplicationContext(), "Usted ha seleccionado la opción Sucursales", Toast.LENGTH_LONG).show();
            case R.id.resetpass:

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
            Intent intent = new Intent(getApplicationContext(), Servicios.class);
            startActivity(intent);
        }
        if(id == R.id.sucursales){
            Intent intent = new Intent(getApplicationContext(), Sucursales.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}