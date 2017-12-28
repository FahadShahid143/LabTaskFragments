package com.example.fahadshahid.labtaskfragments;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity implements FragmentA.OnSampleFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onButtonPressed(String message) {
        TextView txtMessage = (TextView) findViewById(R.id.updatedText);
        txtMessage.setText(message);
    }
}






