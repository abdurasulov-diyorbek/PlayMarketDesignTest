package android.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView rating1 = findViewById(R.id.rating1);
        rating1.setText("4.5\u2605  179 MB");

        TextView rating2 = findViewById(R.id.rating2);
        rating2.setText("4.2\u2605  80 MB");

        TextView rating3 = findViewById(R.id.rating3);
        rating3.setText("4.1\u2605  324 MB");

        TextView rating4 = findViewById(R.id.rating4);
        rating4.setText("4.3\u2605  57 MB");

        TextView rating5 = findViewById(R.id.rating5);
        rating5.setText("4.4\u2605  42 MB");

        TextView rating6 = findViewById(R.id.rating6);
        rating6.setText("4.2\u2605  45 MB");

        TextView rating7 = findViewById(R.id.rating7);
        rating7.setText("4.5\u2605  713 MB");

        TextView rating8 = findViewById(R.id.rating8);
        rating8.setText("4.4\u2605  434 MB");
        TextView rating9 = findViewById(R.id.rating9);
        rating9.setText("4.5\u2605  65 MB");

        ImageButton settingsButton = findViewById(R.id.settings_button);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SettingsActivity.class);
                startActivity(intent);
            }
        });




       // SearchView searchView = findViewById(R.id.searchView);
        //searchView.setQueryHint("Search for apps & games");

        TabLayout tablayout = findViewById(R.id.tabLayout);
        tablayout.addTab(tablayout.newTab().setText("For You"));
        tablayout.addTab(tablayout.newTab().setText("Top charts"));
        tablayout.addTab(tablayout.newTab().setText("Premium"));
        tablayout.addTab(tablayout.newTab().setText("Categories"));
        tablayout.addTab(tablayout.newTab().setText("Editors` Choice"));
    }
}