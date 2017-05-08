package com.valdroide.dartandhensonexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.f2prateek.dart.Dart;
import com.f2prateek.dart.InjectExtra;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Hello extends AppCompatActivity {

    @InjectExtra
    String nombre;
    @InjectExtra
    String mensaje;
    @InjectExtra
    boolean showToast;
    @BindView(R.id.text)
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        ButterKnife.bind(this);
        Dart.inject(this);
        text.setText("ASI: " + nombre + "mensarje: " + mensaje);
        if (showToast)
            Toast.makeText(this, "SI", Toast.LENGTH_LONG).show();
    }
}
