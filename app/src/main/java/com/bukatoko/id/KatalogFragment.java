package com.bukatoko.id;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.ui.NavigationUI;
import androidx.fragment.app.Fragment;

public class KatalogFragment extends Fragment{
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		View view = inflater.inflate(R.layout.fragment_katalog, container, false);
		setHasOptionsMenu(true);
		return view;
	}
	
		@Override
		public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
		inflater.inflate(R.menu.create_menu,menu);
		super.onCreateOptionsMenu(menu,inflater);
	}
	
	
	
		
}