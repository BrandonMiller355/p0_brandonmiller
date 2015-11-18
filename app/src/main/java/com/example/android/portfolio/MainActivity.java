package com.example.android.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//TODO:Delete this stuff
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            String[] myApps = {
                    "SPOTIFY STREAMER",
                    "SCORES APP",
                    "LIBRARY APP",
                    "BUILD IT BIGGER",
                    "XYZ READER",
                    "CAPSTONE: MY OWN APP"
            };

            ArrayAdapter<String> myDataAdapter;

            myDataAdapter = new ArrayAdapter<String>(getActivity(), //TODO: see if can change that to rootView instead, since we know it
                    R.layout.list_item_appname,
                    R.id.list_item_appname_button,
                    myApps
            );

            //FrameLayout framelayout_main = (FrameLayout) findViewById(R.id.framelayout_main);
            ListView listview_apps = (ListView) rootView.findViewById(R.id.listview_apps);

            listview_apps.setAdapter(myDataAdapter);

            return rootView;
        }

//        public View onCreateView2(LayoutInflater inflater, ViewGroup container,
//                                 Bundle savedInstanceState) {
//            View testView = inflater.inflate(R.layout.fragment_test, container, false);
//            return testView;
//        }
    }
}
