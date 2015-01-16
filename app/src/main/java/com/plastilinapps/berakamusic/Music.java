package com.plastilinapps.berakamusic;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import fragments.FriendsFragment;
import fragments.ProfileFragment;
import fragments.TopListFragment;


public class Music extends Activity implements ActionBar.TabListener{
    private Fragment[] fragments = new Fragment[]{
            new TopListFragment(),
            new FriendsFragment(),
            new ProfileFragment()
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        setTabs();
        FragmentManager manager = getFragmentManager();
        FragmentTransaction fragmentTransaction = manager.beginTransaction();

        for(Fragment fragment: fragments){
            fragmentTransaction.add(R.id.main_music, fragment).hide(fragment);
        }
        fragmentTransaction.show(fragments[0]).commit();

    }
    private void setTabs(){
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.addTab(actionBar.newTab().setText("TopList").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Friends").setTabListener(this));
        actionBar.addTab(actionBar.newTab().setText("Profile").setTabListener(this));
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
        for(Fragment fragment: fragments){
            fragmentTransaction.hide(fragment);
        }
        fragmentTransaction.show(fragments[tab.getPosition()]);

    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {

    }
}
