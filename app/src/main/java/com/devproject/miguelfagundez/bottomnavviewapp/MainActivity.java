package com.devproject.miguelfagundez.bottomnavviewapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.devproject.miguelfagundez.bottomnavviewapp.fragments.Camera;
import com.devproject.miguelfagundez.bottomnavviewapp.fragments.Forum;
import com.devproject.miguelfagundez.bottomnavviewapp.fragments.Home;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    // Members
    private BottomNavigationView bottomNavigationView;

    // Fragments
    private Home home;
    private Forum forum;
    private Camera camera;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupFragments();
        setupViews();
    }

    private void setupFragments() {
        home = new Home();
        forum = new Forum();
        camera = new Camera();
    }

    private void setupViews() {
        bottomNavigationView = findViewById(R.id.bottom_nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.forum);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.home:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.slide_in, R.anim.slide_out)
                        .replace(R.id.layout_container, home)
                        .commit();
                return true;

            case R.id.forum:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.slide_in, R.anim.slide_out)
                        .replace(R.id.layout_container, forum)
                        .commit();
                return true;
            case R.id.camera:
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(R.anim.slide_in, R.anim.slide_out)
                        .replace(R.id.layout_container, camera)
                        .commit();
                return true;
        }

        return false;
    }
}
