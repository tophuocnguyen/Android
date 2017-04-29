package com.ToPhuocNguyen.activityislistener;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class ToPhuocNguyen extends Activity implements OnClickListener{
	EditText Ten, ChieuCao,CanNang, BMI, ChuanDoan;
	Button Tinh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        Tinh=(Button) findViewById(R.id.btnBMI);
        Tinh.setOnClickListener(this);
        ChieuCao=(EditText) findViewById(R.id.txtCC);
    	CanNang=(EditText) findViewById(R.id.txtCN);
    	BMI=(EditText) findViewById(R.id.txtBMI);
    	ChuanDoan=(EditText) findViewById(R.id.txtCD);
    	

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
    
    @Override
	public void onClick(View arg0) {
    	DecimalFormat LamTron=new DecimalFormat("#.0");
    	try  
        {  
    	
    		double dCao= Double.parseDouble(ChieuCao.getText().toString());
    		double dCanNang=Double.parseDouble(CanNang.getText().toString());
    		double dBMI = dCanNang/Math.pow(dCao, 2);
           if(dBMI>35) {
        	   BMI.setText(LamTron.format(dBMI)+"");
        	   ChuanDoan.setText("Người béo phì độ 3");
           }
           else if(dBMI>=30) {
        	   BMI.setText(LamTron.format(dBMI)+"");
        	   ChuanDoan.setText("Người béo phì độ 2");
           }
           else if(dBMI>=25) {
        	   BMI.setText(LamTron.format(dBMI)+"");
        	   ChuanDoan.setText("Người béo phì độ 1");
           }
           else if(dBMI>=18) {
        	   BMI.setText(LamTron.format(dBMI)+"");
        	   ChuanDoan.setText("Người bình thường");
           }else{
        	   BMI.setText(LamTron.format(dBMI)+"");
        	   ChuanDoan.setText("Người gầy");
           }
        	   
        }  
        catch(Exception e)  
        {  
        	BMI.setText("Lỗi dữ liệu");
     	   ChuanDoan.setText("Lỗi dữ liệu");
        }  
	}

    
}
