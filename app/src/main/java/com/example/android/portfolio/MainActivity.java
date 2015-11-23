package com.example.android.portfolio;

import android.content.Context;
//import android.net.Uri;
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
//import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
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

        // Uncomment this later if settings become used.
        //noinspection SimplifiableIfStatement
        /*if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    public void toastMessageSpotify(View view) {
        //source here derived from: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        String toastMessage = "This button will launch my Spotify Streamer app!";

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastMessageScores(View view) {
        //source here derived from: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        String toastMessage = "This button will launch my Scores app!";

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastMessageLibrary(View view) {
        //source here derived from: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        String toastMessage = "This button will launch my Library app!";

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastMessageBigger(View view) {
        //source here derived from: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        String toastMessage = "This button will launch my Build it Bigger app!";

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastMessageReader(View view) {
        //source here derived from: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        String toastMessage = "This button will launch my XYZ Reader app!";

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void toastMessageCapstone(View view) {
        //source here derived from: http://developer.android.com/guide/topics/ui/notifiers/toasts.html
        String toastMessage = "This button will launch my Capstone app!";

        Toast toast = Toast.makeText(getApplicationContext(), toastMessage, Toast.LENGTH_SHORT);
        toast.show();
    }
}
