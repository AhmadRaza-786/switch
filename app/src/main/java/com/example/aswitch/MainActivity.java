package com.example.aswitch;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Switch switchPassword;
    private ToggleButton toggleName;
    private TextView mTextView;
    private CheckBox mCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        switchPassword = findViewById(R.id.switchPassword);
        toggleName = findViewById(R.id.toggleName);
        mTextView = findViewById(R.id.textResult);
        mCheckBox = findViewById(R.id.checkBox);

        onClickListner();
    }

    public void onClickListner() {
        switchPassword.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    mTextView.setText("Checkbox on");
                } else {
                    mTextView.setText("Checkbox off");
                }
            }
        });
    }

    public void sending(View view) {
        if (toggleName.isChecked()) {
            mTextView.setText("Toggle on");
        } else  {
            mTextView.setText("Toggle off");
        }
    }
}