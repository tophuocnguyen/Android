package com.ToPhuocNguyen.viewsubclassing;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.LinearLayout;


public class ToPhuocNguyen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        Button nut = new Button(this){
        	public boolean performClick(){
        		return false;
        	}
        };
        nut.setText("Nut");
        LinearLayout layout = (LinearLayout) findViewById(R.id.tv1);
        layout.addView(nut);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
    
}
