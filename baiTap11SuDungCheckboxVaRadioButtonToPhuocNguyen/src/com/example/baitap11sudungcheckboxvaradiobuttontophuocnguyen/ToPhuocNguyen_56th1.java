package com.example.baitap11sudungcheckboxvaradiobuttontophuocnguyen;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class ToPhuocNguyen_56th1 extends Activity {
	CheckBox xembongda, xemphimkiemhiep,didulich, tukimotminh;
	Button vote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_phuoc_nguyen);
        xembongda = (CheckBox)findViewById(R.id.cbbong);
        xemphimkiemhiep = (CheckBox)findViewById(R.id.cbphim);
        didulich = (CheckBox)findViewById(R.id.cbdi);
        tukimotminh = (CheckBox)findViewById(R.id.cbtu);
        vote = (Button) findViewById(R.id.btvote);
        vote.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				ThongTinCheckBox();
			}
		});
    } 
    
    public void ThongTinCheckBox()
    {
    	String ketqua="";
    	if(xembongda.isChecked())
    		ketqua += xembongda.getText() + "\n";
    	if(xemphimkiemhiep.isChecked())
    		ketqua += xemphimkiemhiep.getText()+ "\n";
    	if(didulich.isChecked())
    		ketqua += didulich.getText()+ "\n";
    	if(tukimotminh.isChecked())
    		ketqua += tukimotminh.getText()+ "\n";
    	if(ketqua.length()=="".length())
    		ketqua="Không có nội dung hiển thị";
    	else ketqua = "------------------------------------------- \n" + ketqua;
    	AlertDialog.Builder builder=new AlertDialog.Builder(this);
    	builder.setTitle("Thông tin đã nhập!");
    	builder.setPositiveButton("�?óng", new DialogInterface.OnClickListener() {
    		@Override
    		public void onClick(DialogInterface dialog, int which) {
    		// TODO Auto-generated method stub
    		dialog.cancel();
    		}
    		});
    	builder.setMessage(ketqua);//thiết lập nội dung
    	builder.create().show();//hiển thị Dialog

    }
    public void ChuyenLayout(View v)
    {
    	Intent chuyen = new Intent(ToPhuocNguyen_56th1.this,VD2_ToPhuocNguyen_56th1.class);
    	startActivity(chuyen);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen_, menu);
        return true;
    }
    
}
