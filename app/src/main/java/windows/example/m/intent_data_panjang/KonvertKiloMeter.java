package windows.example.m.intent_data_panjang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KonvertKiloMeter extends AppCompatActivity implements View.OnClickListener{

    private EditText satuan;
    private TextView buttonhasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konvert_to_kilometer);

        Button btnHitung  = findViewById(R.id.hitung);

        satuan = findViewById(R.id.satuan);
        buttonhasil = findViewById(R.id.hasil);

        btnHitung.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId()== R.id.hitung);
        Intent data = new Intent();
        double hasil = Double.parseDouble(satuan.getText().toString())*0.000001000000;

        data.setData(Uri.parse(String.valueOf(hasil)));

        buttonhasil.setText(String.format("P. %s", String.valueOf(hasil)));
        setResult(RESULT_OK, data);

        finish();


    }
}