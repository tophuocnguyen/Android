package com.ToPhuocNguyen.counter;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class ToPhuocNguyen extends Activity {

	TextView HT;
	RadioButton U,D;
	Button Tinh;
	int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        HT = (TextView)findViewById(R.id.tvHienthi);
        U = (RadioButton)findViewById(R.id.radioUp);
        D = (RadioButton)findViewById(R.id.radioDown);
        Tinh = (Button)findViewById(R.id.btnTinh);
        Tinh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				if(U.isChecked())
				{
					count++;
				}
				if(D.isChecked()){
					count--;
				}
				HT.setText(String.valueOf(count));
			}
		});
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
}