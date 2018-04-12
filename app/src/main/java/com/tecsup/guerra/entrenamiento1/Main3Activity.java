package com.tecsup.guerra.entrenamiento1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.tecsup.guerra.entrenamiento1.adapters.ListaAdapter;
import com.tecsup.guerra.entrenamiento1.repositories.ListaRepository;

public class Main3Activity extends AppCompatActivity {
    private TextView lol;
    private String valor;

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ListaAdapter listaAdapter=new ListaAdapter();
        listaAdapter.setLista(ListaRepository.getListas());
        recyclerView.setAdapter(listaAdapter);


        /*lol=(TextView)findViewById(R.id.);
        Bundle datos=this.getIntent().getExtras();
        valor=datos.getString("texto");
        lol.setText(valor);*/
    }
}
