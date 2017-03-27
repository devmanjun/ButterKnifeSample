package com.mvs.butterknifesample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class LauncherActivity extends AppCompatActivity {
    @BindView(R.id.tv_test) TextView sampleTextView;//Binds textview to the variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        ButterKnife.bind(this);//Initializes butter knife
        init();

    }

    private void init() {
        sampleTextView.setText("Test");
    }

    @OnClick(R.id.bt_button)//No need for explicit call to @Bind button
    public void submitProcess()
    {
        Toast.makeText(LauncherActivity.this, "Button clicked", Toast.LENGTH_SHORT).show();
        sampleTextView.setText("Text Changed");
    }
}
