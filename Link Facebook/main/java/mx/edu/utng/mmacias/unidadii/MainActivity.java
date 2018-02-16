package mx.edu.utng.mmacias.unidadii;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnFacebook=(Button) findViewById(R.id.btnFacebook);
        btnFacebook.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        //El brindamos el dato necesario a Uri
        Uri uriUrl = Uri.parse("https://www.facebook.com/Josefa2015/?fref=ts");
        //Especificamos la accion a realizar con el ACTION_VIEW
        //para que elija lo mas razonable
        Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(intent);
    }
}
