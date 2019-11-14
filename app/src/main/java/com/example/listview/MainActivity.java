package com.example.listview;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends Activity {

    private ListView listaItens;
    private String[] itens = {"notebook", "celular", "mochila", "caderno",
            "lapis", "borracha", "caneta azul", "caneta amarela",
            "caneta azul", "caneta amarela", "caneta azul",
            "caneta amarela", "caneta azul", "caneta amarela",
            "caneta azul", "caneta amarela", "caneta azul",
            "caneta amarela", "caneta azul", "caneta amarela",
            "caneta azul", "caneta amarela"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaItens = findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaItens.setAdapter(adaptador);

        listaItens.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int indice = position;
                String valorEscolhido = (String) listaItens.getItemAtPosition(indice);
                Toast.makeText(getApplicationContext(), valorEscolhido, Toast.LENGTH_LONG).show();
            }
        });

    }
}
