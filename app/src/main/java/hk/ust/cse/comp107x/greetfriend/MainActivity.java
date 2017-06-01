package hk.ust.cse.comp107x.greetfriend;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;


public class MainActivity extends ListActivity {
    String [] names;
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        names = getResources().getStringArray(R.array.friends);

        setListAdapter(new ArrayAdapter<String>(this,R.layout.friend_item, names));

        Log.i(TAG, "in onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "in onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "in onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "in onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "in onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "in onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "in onDestroy()");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
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
        switch(item.getItemId()) {
            case R.id.the_play_action:
                Log.d(TAG,"Play Action Pressed !");
                return true;
            /*case R.id.the_action_demo:
                Log.d( TAG ," Help Action Pressed !");
                return true;*/
            default:
                return super.onOptionsItemSelected(item);
        }


    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent in = new Intent(this, ShowMessage.class);

        in.putExtra("message",getString(R.string.greeting) + names[(int) id] + "!" );



        startActivity(in);
    }





}
