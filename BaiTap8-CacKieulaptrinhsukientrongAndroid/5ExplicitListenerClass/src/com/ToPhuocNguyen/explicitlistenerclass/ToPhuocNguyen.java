package com.ToPhuocNguyen.explicitlistenerclass;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class ToPhuocNguyen extends Activity {

	EditText a, b, c;
	TextView kq;
	Button TT,Giai,Thoat;
	DecimalFormat LamTron=new DecimalFormat("#.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        a=(EditText) findViewById(R.id.txtA);
        b=(EditText) findViewById(R.id.txtB);
        c=(EditText) findViewById(R.id.txtC);
        kq=(TextView) findViewById(R.id.txtKQ);
        TT=(Button) findViewById(R.id.btnLL);
        Giai=(Button) findViewById(R.id.btnGiai);
        Thoat=(Button) findViewById(R.id.btnThoat);
        TT.setOnClickListener(new MyEvent());
        Giai.setOnClickListener(new MyEvent());
        Thoat.setOnClickListener(new MyEvent());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
    public  class MyEvent implements OnClickListener{

    	public void TiepTuc()
        {
        	a.setText("");
        	b.setText("");
        	c.setText("");
        	kq.setText("");
        	a.requestFocus();
        }
        
        public void GiaiPT()
        {
        	try{
        		double da = Double.parseDouble(a.getText().toString());
            	double db = Double.parseDouble(b.getText().toString());
            	double dc = Double.parseDouble(c.getText().toString());
            	
            	if(da == 0)
            		if(db == 0)
            			if(dc == 0)
            				kq.setText("PT vô số nghiệm!");
            			else kq.setText("PT vô nghiệm!");
            		else kq.setText("PT có 1 nghiệm:o x= " + LamTron.format(-dc/db));
            	else
            	{
            		double delta = Math.pow(db, 2) - 4*da*dc;
            		
            		if(delta<0) kq.setText("PT vô nghiệm!");
            		
            		else if(delta==0) kq.setText("PT có nghiệm kép: x1 = x2 = " + LamTron.format(-db/(2*da)));
            		
            		else {
            			
            		double	x1 = (-db - Math.sqrt(delta))/(2*da);
            		double	x2 = (-db+ Math.sqrt(delta))/(2*da);
            			kq.setText("PT có 2 nghiệm: x1 = " + LamTron.format(x1) + ", x2 = " + LamTron.format(x2));
            		}
            		
            	}
        	}
        	catch(Exception e)
        	{
        		kq.setText("Lỗi dữ liệu nhập!");
        	}
        }
        
        public void Thoat()
        {
        	finish();
        }
		@Override
		public void onClick(View chon) {
			// TODO Auto-generated method stub
			if(chon == TT) this.TiepTuc();
			if(chon == Giai) this.GiaiPT();
			if(chon == Thoat) this.Thoat();
			
		}
    	
    }

}
