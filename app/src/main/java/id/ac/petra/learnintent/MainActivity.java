package id.ac.petra.learnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button b1;
    Button b2;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.myButton);
        b2 = findViewById(R.id.shareButton);
        i = new Intent(MainActivity.this,SecondActivity.class);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("text1","Dari Main Activity");
                i.putExtra("angka1",108);
                startActivity(i);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(Intent.ACTION_SEND);
                i2.putExtra(i2.EXTRA_TEXT,"Hello .....");
                i2.setType("text/plain");
                startActivity(Intent.createChooser(i2,"Share ke: "));
            }
        });
    }
}