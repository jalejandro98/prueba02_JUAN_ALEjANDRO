package uta.fisei.pizarra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class IniciarSesion_Juan_Alejandro extends AppCompatActivity {

    private Button button_ingresar;
    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion_juan_alejandro);

        button_ingresar = findViewById(R.id.button_JUAN);
        et1 = findViewById(R.id.editText1_JUAN);
        et2 = findViewById(R.id.editText2_JUAN);

    }

    public void onClickIngresar(View view){
        Intent intent = new Intent(this, MainActivity.class);
        if (et1.equals("Juan") && et2.equals("123")
         || et1.equals("Mario") && et2.equals("12345")) {
            startActivity(intent);
        }
    }
}