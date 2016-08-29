package android.memgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dosomething(View v){
        Intent i = new Intent();
        if(v.getId()==R.id.start){
            i.setClassName("android.memgame","android.memgame.start");
            startActivity(i);
        }
        else if(v.getId()==R.id.info){
            i.setClassName("android.memgame","android.memgame.dss");
            startActivity(i);
        }
        else if(v.getId()==R.id.exit){
            finish();
        }
    }
}
