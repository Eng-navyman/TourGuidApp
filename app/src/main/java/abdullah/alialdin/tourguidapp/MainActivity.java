package abdullah.alialdin.tourguidapp;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.view_pager);
        CategoryAdapter adapter = new CategoryAdapter(this, getSupportFragmentManager(), 0);
        viewPager.setAdapter(adapter);
        tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();
    }

    private void setupTabIcons() {
        tabLayout.getTabAt(0).setIcon(R.drawable.hotels);
        tabLayout.getTabAt(1).setIcon(R.drawable.historical);
        tabLayout.getTabAt(2).setIcon(R.drawable.museum);
        tabLayout.getTabAt(3).setIcon(R.drawable.restaurant);
    }
}