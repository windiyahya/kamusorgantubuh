package simple.example.kamusorgantubuh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tmblDarah,tmblEsofagus,tmblJantung,tmblKelenjarGetahBening,tmblMata,tmblOtak,tmblPayudara;
    public static final String KEY = "Kamus_organ";
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);


//      seleksi id
        tmblDarah = findViewById (R.id.Darah);
        tmblEsofagus = findViewById (R.id.Esofagus);
        tmblJantung = findViewById (R.id.Jantung);
        tmblKelenjarGetahBening = findViewById (R.id.kelenjar_getang_bening);
        tmblMata = findViewById (R.id.mata);
        tmblOtak = findViewById (R.id.Otak);
        tmblPayudara = findViewById (R.id.payudara);
//        perintah Jika di klik
        tmblDarah.setOnClickListener (v -> organTubuh ("Darah"));
        tmblEsofagus.setOnClickListener (v -> organTubuh ("Esofagus"));
        tmblJantung.setOnClickListener (v -> organTubuh ("Jantung"));
        tmblKelenjarGetahBening.setOnClickListener (v -> organTubuh ("kelenjar getah bening"));
        tmblMata.setOnClickListener (v -> organTubuh ("Mata"));
        tmblOtak.setOnClickListener (v -> organTubuh ("Otak"));
        tmblPayudara.setOnClickListener (v -> organTubuh ("Payudara"));
    }

    public void organTubuh(String namaOrgan){
        Log.d("MAIN","Buka activity vario");
        Intent intent = new Intent (this, Kamus.class);
        intent.putExtra(KEY, namaOrgan);
        startActivity(intent);

    }
}