package med.example.test.beritaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage1 (View viev){
        Intent intent = new Intent(this, berita1.class);
        startActivity(intent);
    }

    public void sendMessage2 (View viev){
        Intent intent = new Intent(this, berita2.class);
        startActivity(intent);
    }
    public void sendMessage3 (View viev){
        Intent intent = new Intent(this, berita3.class);
        startActivity(intent);
    }

    }

