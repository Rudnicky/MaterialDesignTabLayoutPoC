package com.example.materialdesigntablayoutpoc.activities;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.materialdesigntablayoutpoc.R;
import com.example.materialdesigntablayoutpoc.adapters.ViewPagerAdapter;
import com.example.materialdesigntablayoutpoc.fragments.FirstFragment;
import com.example.materialdesigntablayoutpoc.fragments.SecondFragment;
import com.example.materialdesigntablayoutpoc.fragments.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    private final int[] ICONS = new int[] {
        R.drawable.img_sad_cloud,
        R.drawable.img_snowflake,
        R.drawable.img_storm
    };

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Adding fragments
        adapter.addFragment(new FirstFragment(), "Today");
        adapter.addFragment(new SecondFragment(), "5 Days");
        adapter.addFragment(new ThirdFragment(), "By City");

        // Setting up Adapter
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        // Adding images
        tabLayout.getTabAt(0).setIcon(ICONS[0]);
        tabLayout.getTabAt(1).setIcon(ICONS[1]);
        tabLayout.getTabAt(2).setIcon(ICONS[2]);
    }
}
