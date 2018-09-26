package com.shwepinle.spice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class second_tab extends Activity {

    private ImageButton back;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_tab);

        back = findViewById(R.id.back_button);
        text = findViewById(R.id.debug_text_2);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("SPICE", "back button pressed.");
                Intent intent = new Intent(second_tab.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });
    }
}
