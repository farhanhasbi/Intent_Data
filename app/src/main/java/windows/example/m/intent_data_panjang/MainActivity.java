package windows.example.m.intent_data_panjang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int req_code = 17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Button konvertpanjang = findViewById(R.id.meter);
        Button konvertpanjangg = findViewById(R.id.kilometer);

        konvertpanjang.setOnClickListener(this);
        konvertpanjangg.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.meter:
                Intent konvert_Yen =new Intent(MainActivity.this,KonvertMeter.class);
                startActivityForResult(konvert_Yen, req_code);
                break;
            case R.id.kilometer:
                Intent konvert_Pounds =new Intent(MainActivity.this,KonvertKiloMeter.class);
                startActivityForResult(konvert_Pounds, req_code);
                break;


        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == req_code){
            if (resultCode == RESULT_OK){
                TextView hasil = findViewById(R.id.view);
                hasil.setText(data.getData().toString());

            }
        }
    }
}

