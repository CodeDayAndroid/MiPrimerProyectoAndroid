package com.coditec.miprimerproyectoandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private TextView txtMiTexto;
    private Button btnMiBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMiTexto = (TextView)findViewById(R.id.txtMiTexto);
        btnMiBoton = (Button)findViewById(R.id.btnMiBoton);
        btnMiBoton.setOnClickListener(this);
        txtMiTexto.setOnClickListener(this);
    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = i  tem.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btnMiBoton){
            txtMiTexto.setText("Cambie mi texto");

        }else if(view.getId()==R.id.txtMiTexto){
            Toast.makeText(this, "Hola!", Toast.LENGTH_SHORT).show();
        }
    }
}
