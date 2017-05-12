package com.ToPhuocNguyen.onclickinxml;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ToPhuocNguyen extends Activity {

	EditText a, b;
	Button S;
	TextView KQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        
    }
    
    public void Tong2so(View v)
    {
    	try{
    		
    		a = (EditText) findViewById(R.id.txtA);
            b = (EditText) findViewById(R.id.txtB);
            S = (Button) findViewById(R.id.btnTong);
            KQ = (TextView) findViewById(R.id.kq);
            
			int ia = Integer.parseInt(a.getText().toString());
			int ib = Integer.parseInt(b.getText().toString());
			int ikq = ia+ib;
			KQ.setText(ikq + "");
			}
			catch (Exception e1){
				KQ.setText("lỗi dữ liệu");
			}


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
    
}
