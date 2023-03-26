package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EntryActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntryActivity.this,WebViewTest.class);
                Bundle bd = new Bundle();
                TextView text= (TextView) findViewById(R.id.input1) ;
                String url = text.getText().toString();
                System.out.println(url);
                bd.putString("url",url);
                intent.putExtras(bd);
                startActivity(intent);
            }
        });
    }
}
