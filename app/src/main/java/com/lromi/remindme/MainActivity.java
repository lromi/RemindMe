package com.lromi.remindme;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toolbar;

/**
 * Created by lromi on 31.10.2016.
 */

public class MainActivity extends Activity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initToolbar();
    }
    private void initToolbar(){

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return false;
            }
        });

        toolbar.inflateMenu(R.menu.menu);

    }


}
