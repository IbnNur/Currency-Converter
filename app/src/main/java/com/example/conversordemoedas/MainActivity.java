package com.example.conversordemoedas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    EditText et_Valor;
    Button bt_Converte;
    TextView tv_Valor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_Valor = findViewById(R.id.et_ValorEm);
        bt_Converte = findViewById(R.id.bt_Converter);
        tv_Valor = findViewById(R.id.tv_ValorConvertido);

        bt_Converte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Double valor = Double.parseDouble(et_Valor.getText().toString());

                DecimalFormat arredondar = new DecimalFormat("#.##");

               Double valorMet = Double.parseDouble(arredondar.format(valor*63.83));

               tv_Valor.setText(String.valueOf(valorMet)+"MZN");
            }
        });
    }
}