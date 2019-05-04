package com.rohit170004onlineclothingshopping;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import Adapter.ViewPagerAdapter;
import Fragments.LoginFragment;
import Fragments.RegisterFragment;

public class ViewPagerActivity extends AppCompatActivity  {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_view_pager);

                viewPager=findViewById(R.id.viewpager);
                tabLayout=findViewById(R.id.tabId);

                ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager());

                viewPagerAdapter.addFragment(new LoginFragment(),"Login");
                viewPagerAdapter.addFragment(new RegisterFragment(),"Register");

                viewPager.setAdapter(viewPagerAdapter);
                tabLayout.setupWithViewPager(viewPager);

        }
    }

