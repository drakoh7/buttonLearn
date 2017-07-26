package ru.alexandr.pc.buttonhello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button mCrowsCounterButton;
    private int mCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCrowsCounterButton = (Button) findViewById(R.id.buttonCrowsCounter);
    }

    public void onClick(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.textView);
        helloTextView.setText("Hello Kitty!");
    }
}
