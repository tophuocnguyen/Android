package com.ToPhuocNguyen.inlineanonymouslistener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class ToPhuocNguyen extends Activity {

	public String Can(int x){
    	switch (x)
    	{
    	    case 0 : return "Canh";
    	    case 1 : return "Tân";
    	    case 2 : return "Nhâm";
    	    case 3 : return "Quý";
    	    case 4 : return "Giái";
    	    case 5 : return "Ất";
    	    case 6 : return "Bính";
    	    case 7 : return "Đinh";
    	    case 8 : return "Mậu";
    	    case 9 : return "Kỷ";
    	    default : return "Lỗi";
    	}
    	
    }
    
    public String Chi(int x){
    	switch (x)
    	{
    	    case 0 : return "thân";
    	    case 1 : return "dậu";
    	    case 2 : return "tuất";
    	    case 3 : return "hợi";
    	    case 4 : return "tý";
    	    case 5 : return "sửu";
    	    case 6 : return "dần";
    	    case 7 : return "mẹo";
    	    case 8 : return "thìn";
    	    case 9 : return "tỵ";
    	    case 10 : return "ngọ";
    	    case 11 : return "mùi";
    	    default : return "Lỗi";
    	}
    	
    }
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);   
        Button CD = (Button) findViewById(R.id.btnCD);
        CD.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				EditText DL = (EditText) findViewById(R.id.txtDL);
				TextView AL = (TextView) findViewById(R.id.tvAL);
		    	try{
			    	int x = Integer.parseInt(DL.getText().toString());
			    	AL.setText(Can(x%10)+ " " + Chi(x%12));
		    	}
		    	catch (Exception e1)
		    	{
		    		AL.setText("Lỗi dữ liệu!");
		    	}					
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
