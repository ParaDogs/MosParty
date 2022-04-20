package com.paradogs.mosparty.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.paradogs.mosparty.R;
import com.paradogs.mosparty.databinding.ActivityMainBinding;
import com.paradogs.mosparty.fragments.DiscountsFragment;
import com.paradogs.mosparty.fragments.EventsFragment;
import com.paradogs.mosparty.fragments.HomeFragment;
import com.paradogs.mosparty.fragments.ProfileFragment;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new HomeFragment());
        binding.bottomNavigation.setOnItemSelectedListener(this::onNavigationItemSelected);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_main, fragment);
        fragmentTransaction.commit();
    }

    private boolean onNavigationItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.nav_home)
                replaceFragment(new HomeFragment());
        if (item.getItemId() == R.id.nav_events)
                replaceFragment(new EventsFragment());
        if (item.getItemId() == R.id.nav_discounts)
                replaceFragment(new DiscountsFragment());
        if (item.getItemId() == R.id.nav_profile)
                replaceFragment(new ProfileFragment());
        return true;
    }
}