package com.bukatoko.id;

import android.view.MenuItem;
import android.view.animation.Animation;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
	

	AppBarConfiguration appBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		Toolbar toolbar = findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		toolbar.setTitleTextColor(getResources().getColor(R.color.white));
		
		BottomNavigationView bottomNav = findViewById(R.id.bottom_nav);
	    appBar = new AppBarConfiguration.Builder(R.id.nav_home, R.id.nav_katalog, R.id.nav_chat, R.id.nav_promosi, R.id.nav_aplikasi).build();
		
		NavController navControl = Navigation.findNavController(this,R.id.navHost);
		NavigationUI.setupActionBarWithNavController(this,navControl, appBar);
		NavigationUI.setupWithNavController(bottomNav, navControl);
   	 }
		
	
	}
