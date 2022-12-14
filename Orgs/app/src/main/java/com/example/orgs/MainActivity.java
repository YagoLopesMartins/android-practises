package com.example.orgs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Toast.makeText(this, "Bem vindo", Toast.LENGTH_LONG).show();
//        View view = new TextView(this);
//                view.setText("");
//        setContentView(view);
        setContentView(R.layout.activity_main);

        TextView title =  findViewById(R.id.title);
            title.setText("Cesta de frutas");
        TextView description =  findViewById(R.id.description);
            description.setText("Orange, apple, banana");
        TextView price =  findViewById(R.id.price);
            price.setText("25,99");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        List<String> alunoa = new ArrayList<>(Arrays.asList("1", "2", "3"));


    }

}
