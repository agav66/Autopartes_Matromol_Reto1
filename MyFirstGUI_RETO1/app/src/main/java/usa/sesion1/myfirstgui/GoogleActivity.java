package usa.sesion1.myfirstgui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GoogleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google);

        getSupportActionBar().setTitle("Inicio por Google");
        getSupportActionBar().setSubtitle("Inicia con tu cuenta de Google");

    }
}