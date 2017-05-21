package com.example.ToPhuocNguyen;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class PhuocNguyen extends Activity {
 ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_to_phuoc_nguyen);
        lv = (ListView) findViewById(R.id.ListViewSinhVien);
        ArrayList<SinhVien> mangsinhvien = new ArrayList<SinhVien>();
        mangsinhvien.add(new SinhVien("Nguyễn Như ý", 1996));
        mangsinhvien.add(new SinhVien("Mai Chí Tài", 1998));
        mangsinhvien.add(new SinhVien("Đinh Viết Đệ", 1997));
        mangsinhvien.add(new SinhVien("Nguyễn Trịnh Khánh Toàn", 1996));
        mangsinhvien.add(new SinhVien("Phan Ngọc vỹ", 1995));
        mangsinhvien.add(new SinhVien("Tô phước nguyên", 1996));
        mangsinhvien.add(new SinhVien("Đỗ Mạnh Phương", 1993));
        
        ListAdapter adapter = new ListAdapter(
        		PhuocNguyen.this, 
        		R.layout.dongsinhvien, mangsinhvien);
        lv.setAdapter(adapter);
        }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.to_phuoc_nguyen, menu);
        return true;
    }
    
}
