package com.example.screen23;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class Screen23 extends Activity{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        ToggleButton tBtn = (ToggleButton)findViewById(R.id.togglebutton);
        
        final Context a=this;
        
        ((ToggleButton)findViewById(R.id.togglebutton)).setOnCheckedChangeListener(new OnCheckedChangeListener(){
        	public void onCheckedChanged(CompoundButton btn, boolean isChecked) {
        		Toast.makeText(a, (btn.isChecked() ? "Checked" : "Unchecked"), Toast.LENGTH_SHORT).show();
        	}
        });
    }
}