package com.medbac.carte_fidelite.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;


import activity.carte_fidelite.medbac.com.cartefidelite.R;

/**
 * Created by Mohamed Nouira on 05/04/2015.
 */
public class ListPromotion extends Activity implements OnTabChangeListener {

    TabHost view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_promorion);
        view = (TabHost)findViewById(R.id.tabhost_promotion);
        view.setOnTabChangedListener(this);
        view.setup();
        addTab("Tab1","Tab 1",R.drawable.user34,R.id.tab1_promotion);
        addTab("Tab2","Tab 2",R.drawable.home82,R.id.tab2_promotion);
    }

    private void addTab(String tag, String title, int icon, int content){
        TabHost.TabSpec spec = view.newTabSpec(tag);
        spec.setIndicator(title, getResources().getDrawable(icon));
        spec.setContent(content);
        view.addTab(spec);
    }

    @Override
    public void onTabChanged(String tabId) {
        Toast.makeText(this, tabId, Toast.LENGTH_SHORT).show();
    }

}