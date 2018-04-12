package com.tecsup.guerra.entrenamiento1;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private EditText entrada_d;
    private Button ciudadaes_d, cercad_d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        entrada_d=(EditText) findViewById(R.id.entrada);
        ciudadaes_d=(Button) findViewById(R.id.ciudades);


        ciudadaes_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lanzarActivity2(v,entrada_d.getText().toString());
            }
        });



    }

    public  void lanzarActivity2(View v,String texto){
        Intent i= new Intent(this,Main3Activity.class);
        if (texto.equals("")||texto.equals(null)){
            i.putExtra("texto","TEXTO VACIO");
        }else{
            i.putExtra("texto",texto);
            startActivity(i);
        }
    }
}
