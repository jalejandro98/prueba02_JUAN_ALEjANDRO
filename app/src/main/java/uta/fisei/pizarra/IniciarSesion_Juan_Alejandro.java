package uta.fisei.pizarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IniciarSesion_Juan_Alejandro extends AppCompatActivity {

    private Button button_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion_juan_alejandro);

        button_ingresar = findViewById(R.id.button_JUAN);

        button_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(IniciarSesion_Juan_Alejandro.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}