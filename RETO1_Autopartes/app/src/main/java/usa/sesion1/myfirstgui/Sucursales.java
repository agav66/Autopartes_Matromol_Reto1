package usa.sesion1.myfirstgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Sucursales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sucursales);

        getSupportActionBar().setTitle("Sucursales");
        getSupportActionBar().setSubtitle("A comtinuacion nuestras sucursales:");
    }
}