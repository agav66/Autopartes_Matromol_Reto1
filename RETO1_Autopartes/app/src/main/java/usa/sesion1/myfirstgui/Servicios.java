package usa.sesion1.myfirstgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Servicios extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicios);

        getSupportActionBar().setTitle("Servicios");
        getSupportActionBar().setSubtitle("A comtinuacion nuestros servicios:");

    }
}