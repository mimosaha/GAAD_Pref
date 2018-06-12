package view.edit.input.gaad_preference;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences sharedPreferences = getSharedPreferences("DEMO",
//                MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.putString("Name_Key", "Mimo S");
//        editor.commit();
//
//        Log.v("MIMO_SAHA::", "Name: " + sharedPreferences.getString("Name_Key", null));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu_op, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.preferences: {
                Intent intent = new Intent();
                intent.setClassName(this, getPackageName() + ".SecondAc");
                startActivity(intent);
                return true;
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
