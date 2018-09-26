package com.shwepinle.spice;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {

    private ImageButton next;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next = findViewById(R.id.next_button);
        text = findViewById(R.id.debug_text_1);


    }

    @Override
    protected void onStart() {
        super.onStart();
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SPICE", "Next buttton clicked");
                Intent intent = new Intent(MainActivity.this, second_tab.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
