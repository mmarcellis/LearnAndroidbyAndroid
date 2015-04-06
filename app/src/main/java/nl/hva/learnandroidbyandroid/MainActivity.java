package nl.hva.learnandroidbyandroid;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {


private Button buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);

        LinearLayout.LayoutParams rlp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);


        //this is the activity context
        Button btnTag = new Button(this);

        btnTag.setText("Button");

        Button btnTagExplain = new Button(this);

        btnTagExplain.setText("Explain");


     //   add button to the layout
        linearLayout.addView(btnTag);
        linearLayout.addView(btnTagExplain);

        btnTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast toast =  Toast.makeText(getApplicationContext(),"hallo1",Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        btnTagExplain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "Toast toast =  Toast.makeText(getApplicationContext(),\"hallo1\",Toast.LENGTH_SHORT)";

                Toast toast =  Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        setContentView(linearLayout,rlp);

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
