package com.hishatech.android.hishabeats;

import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.hishatech.android.hishabeats.slidetab.SlidingTabLayout;

/**
 * Created by smithkev on 2/13/2015.
 */
public class ButtonSettingsActivity extends ActionBarActivity {

    // Declaring Your View and Variables


    ViewPager pager;
    ButtonViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {AppConstants.frag_ButtonAction,
            AppConstants.frag_ButtonColor};
    int Numboftabs = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttonsettings);

        // Creating The ViewPagerAdapter and Passing Fragment Manager,
        // Titles fot the Tabs and Number Of Tabs.
        adapter = new ButtonViewPagerAdapter(getSupportFragmentManager(),
                Titles, Numboftabs);

        // Assigning ViewPager View and setting the adapter
        pager = (ViewPager) findViewById(R.id.pager);
        pager.setAdapter(adapter);

        // Assiging the Sliding Tab Layout View
        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        // tabs.setDistributeEvenly(true); // To make the Tabs Fixed set this
        // true, This makes the tabs Space Evenly in Available width

        // Setting the ViewPager For the SlidingTabsLayout
        tabs.setViewPager(pager);


    }
}
