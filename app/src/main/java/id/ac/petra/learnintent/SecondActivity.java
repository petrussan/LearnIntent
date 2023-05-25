package id.ac.petra.learnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    Intent iFrom;
    String s1;
    int a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        iFrom = getIntent();
        s1 = iFrom.getExtras().getString("text1");
        a1 = iFrom.getExtras().getInt("angka1");
        Toast t = Toast.makeText(this,
                "Received String: "+s1+"\n Received number: "+a1,
                Toast.LENGTH_LONG);
        t.show();
    }
}