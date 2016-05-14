package org.anderson.cafeteriaadn;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Lab1Cafe extends AppCompatActivity {
    private EditText txtPedir;
    private Button btnpedir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab1_cafe);
        txtPedir=(EditText) findViewById(R.id.txtPedir);
        btnpedir=(Button) findViewById(R.id.btnpedir);
        btnpedir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Click en pedido", Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
