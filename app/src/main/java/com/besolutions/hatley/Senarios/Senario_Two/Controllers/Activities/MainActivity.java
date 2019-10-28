package com.besolutions.hatley.Senarios.Senario_Two.Controllers.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.besolutions.hatley.R;
import com.besolutions.hatley.Senarios.Senario_Two.Controllers.Activities.Home_Fragment;
import com.besolutions.hatley.Senarios.Senario_Two.Controllers.Activities.Notification_Fragment;
import com.besolutions.hatley.Senarios.Senario_Two.Controllers.Activities.Request_Fragment;
import com.besolutions.hatley.Senarios.Senario_Two.Controllers.Activities.Setting_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    Toolbar toolbar;
    private AppBarConfiguration mAppBarConfiguration;
    BottomNavigationView navigation;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.appBar);
        setSupportActionBar(toolbar);



        navigation = findViewById(R.id.navigation);
        fragmentManager = getSupportFragmentManager();
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

        Home_Fragment home_fragment = new Home_Fragment();
        loadFragment(home_fragment);

        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:

                        Home_Fragment home_fragment = new Home_Fragment();
                        loadFragment(home_fragment);
                        return true;

                    case R.id.request:

                        Request_Fragment request_fragment = new Request_Fragment();
                        loadFragment(request_fragment);
                        return true;


                    case R.id.notification:
                        Notification_Fragment notification_fragment = new Notification_Fragment();
                        loadFragment(notification_fragment);
                        return true;


                    case R.id.setting:
                        Setting_Fragment setting_fragment = new Setting_Fragment();
                        loadFragment(setting_fragment);
                        return true;


                    default:
                        return true;

                }


            }
        });

    }

    private void loadFragment(Fragment fragment) {

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.personal) {


        } else if (id == R.id.share) {



        } else if (id == R.id.promoCode) {



        } else if (id == R.id.payment) {



        } else if (id == R.id.faq) {



        } else if (id == R.id.orders) {


        } else if (id == R.id.savedPlaces) {



        } else if (id == R.id.star) {



        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


}
