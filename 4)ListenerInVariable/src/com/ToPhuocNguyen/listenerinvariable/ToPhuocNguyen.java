package com.ToPhuocNguyen.listenerinvariable;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ToPhuocNguyen extends Activity {
	EditText c, f;
	Button toC, toF, Clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        c=(EditText) findViewById(R.id.txtC);
        f=(EditText) findViewById(R.id.txtF);
        toC=(Button) findViewById(R.id.btnC);
        toF=(Button) findViewById(R.id.btnF);
        Clear=(Button) findViewById(R.id.btnX);
        toC.setOnClickListener(myVarListener);
        toF.setOnClickListener(myVarListener);
        Clear.setOnClickListener(myVarListener);

    }
    
    private OnClickListener myVarListener=new OnClickListener() {
    	public void onClick(View chon) {
    		if(chon == toC){
    			try{
    	    		double df = Double.parseDouble(f.getText().toString());
    	        	c.setText((df - 32)*5/9 + "") ;
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		c.setText("Lỗi dữ liệu nhập") ;
    	    	}
    		}
    		if(chon == toF){
    			try{
    	    		double dc = Double.parseDouble(c.getText().toString());
    	        	f.setText(dc*9/5 + 32 + "") ;
    	    	}
    	    	catch(Exception e)
    	    	{
    	    		f.setText("Lỗi dữ liệu nhập") ;
    	    	}
    		}
    		if(chon == Clear){
    			f.setText("") ;
    	    	c.setText("") ;
    	    	f.requestFocus();
    		}
    	}
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
    
}
