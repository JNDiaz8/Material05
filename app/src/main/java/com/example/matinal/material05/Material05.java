package com.example.matinal.material05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Material05 extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material05);

        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    private void mensaje(int resid){
        Toast.makeText(this, getText(resid), Toast.LENGTH_SHORT).show();
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){

            case R.id.barra_nuevo:mensaje (R.string.cadena_barra_nuevo);
                return true;
            default:return super.onOptionsItemSelected(item);

            case R.id.barra_editar:mensaje (R.string.cadena_barra_editar);
                return super.onOptionsItemSelected(item);

            case R.id.barra_configurar:mensaje (R.string.cadena_barra_configurar);
                return super.onOptionsItemSelected(item);

            case R.id.barra_ayuda:mensaje (R.string.cadena_barra_ayuda);
                return super.onOptionsItemSelected(item);

            case R.id.barra_acerca:mensaje (R.string.cadena_barra_acerca);
                return super.onOptionsItemSelected(item);

        }
    }
}
