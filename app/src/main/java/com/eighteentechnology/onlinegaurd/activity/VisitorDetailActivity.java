package com.eighteentechnology.onlinegaurd.activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.eighteentechnology.onlinegaurd.R;
import com.eighteentechnology.onlinegaurd.adapter.PagerAdapter;
import com.eighteentechnology.onlinegaurd.util.Redirections;

public class VisitorDetailActivity extends AppCompatActivity {
   private  CollapsingToolbarLayout collapsingToolbarLayout;
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private ImageView mBackGroundImage;
    private   Toolbar toolbar;
    private   Bitmap bitmap;
    private TextView mDayTextView;
    private TextView mDateTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitor_detail);
     toolbar = (Toolbar) findViewById(R.id.toolbar);
        mBackGroundImage=(ImageView) findViewById(R.id.background_image);

        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
       toolbar.setTitle("");

       // setSupportActionBar(toolbar);
        setSupportActionBar(toolbar);
        bitmap = ((BitmapDrawable)mBackGroundImage.getDrawable()).getBitmap();
        mDayTextView=(TextView) findViewById(R.id.day);
        mDateTextView=(TextView) findViewById(R.id.date);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        tabLayout = (TabLayout) findViewById(R.id.tabs);
        FragmentManager manager = getSupportFragmentManager();
        PagerAdapter adapter = new PagerAdapter(manager);
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(3);
        tabLayout.setupWithViewPager(viewPager);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTabsFromPagerAdapter(adapter);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // startActivity(new Intent(VisitorDetailActivity.this, VisitorActivity.class));
                Redirections.redirectToVisitorFormActivity(VisitorDetailActivity.this);

            }
        });
        //collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(android.R.color.transparent));
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar);
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = true;
            int scrollRange = -1;

            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                if (scrollRange == -1) {
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + verticalOffset == 0) {
                    //collapsingToolbarLayout.setTitle("");
                    mDayTextView.setText("");
                   mDateTextView.setText("");
                    tabLayout.setTabMode(TabLayout.MODE_FIXED);
                    isShow = true;


                } else if(isShow) {
                    tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
                    mDayTextView.setText("Wednesday");
                    mDateTextView.setText("June ,08 2016");
//                    collapsingToolbarLayout.setTitle("Vikas");
//                    collapsingToolbarLayout.setExpandedTitleMarginStart(20);
//                    collapsingToolbarLayout.setExpandedTitleMarginBottom(100);
//                    collapsingToolbarLayout.setCollapsedTitleGravity(Gravity.VERTICAL_GRAVITY_MASK);

                    isShow = false;
                }
            }
        });
        Palette.from(bitmap).maximumColorCount(3).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                // Get the "vibrant" color swatch based on the bitmap
                Palette.Swatch vibrant = palette.getVibrantSwatch();
                if (vibrant != null) {
                    // Set the background color of a layout based on the vibrant color
                    // containerView.setBackgroundColor(vibrant.getRgb());
                    // Update the title TextView with the proper text color
                    //titleView.setTextColor(vibrant.getTitleTextColor());
                   // toolbar.setBackgroundColor(palette.getVibrantColor(vibrant.getRgb()));
                    collapsingToolbarLayout.setContentScrimColor(vibrant.getRgb());
                    collapsingToolbarLayout.setStatusBarScrimColor(vibrant.getRgb());
                }
            }
        });


    }

}
