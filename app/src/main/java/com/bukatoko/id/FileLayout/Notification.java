package com.bukatoko.id.FileLayout;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import com.bukatoko.id.MainActivity;
import com.bukatoko.id.R;

public class Notification extends AppCompatActivity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_notifications);
		
		Toolbar toolbar = findViewById(R.id.toolbarNotif);
		toolbar.setTitle("Notifikasi");
		setSupportActionBar(toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		toolbar.setNavigationIcon(R.drawable.ic_back);
		
		}
		@Override
		public boolean onSupportNavigateUp(){
			onBackPressed();
			return true;
		}
		
	}