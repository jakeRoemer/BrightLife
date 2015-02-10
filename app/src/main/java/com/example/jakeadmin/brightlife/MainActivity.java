package com.example.jakeadmin.brightlife;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        Toast.makeText(MainActivity.this, "Starting Off", Toast.LENGTH_LONG).show();
    }

    public void onToggleClick(View v) {
        boolean on = ((ToggleButton) v).isChecked();
        if(on){
            //Enable LEDs
            Toast.makeText(MainActivity.this, "LEDs Enabled", Toast.LENGTH_SHORT).show();
        } else {
            //Disable LEDs
            Toast.makeText(MainActivity.this, "LEDs Disabled", Toast.LENGTH_SHORT).show();
        }
    }

    public void onProgressChanged(SeekBar v, int progress, boolean isUser) {
        TextView tv = (TextView)findViewById(R.id.percent);
        if(progress >= 50) {
            tv.setText("halfway there");
            Toast.makeText(MainActivity.this, "Getting Bright Here", Toast.LENGTH_SHORT).show();
        }
    }

    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    public void onStopTrackingTouch(SeekBar seekBar) {

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
}
