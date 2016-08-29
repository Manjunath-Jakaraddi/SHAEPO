package android.memgame;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.provider.SyncStateContract;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class start extends AppCompatActivity implements ActualStart {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }
    public void run(View v){
        int i=0,count=0;
        ImageView imageAnim =  (ImageView) findViewById(R.id.image);
        AnimationDrawable animation = new AnimationDrawable();
        if(v.getId()==R.id.start1){
            while(count<5) {
                Random rn = new Random();
                int random = rn.nextInt(5) + 1;
                a.push(random);
                switch (random) {
                    case 1:
                        animation.addFrame(getResources().getDrawable(R.drawable.fin1), 1000);
                        break;
                    case 2:
                        animation.addFrame(getResources().getDrawable(R.drawable.fin2), 1000);
                        break;
                    case 3:
                        animation.addFrame(getResources().getDrawable(R.drawable.fin3), 1000);
                        break;
                    case 4:
                        animation.addFrame(getResources().getDrawable(R.drawable.fin4), 1000);
                        break;
                    case 5:
                        animation.addFrame(getResources().getDrawable(R.drawable.fin5), 1000);
                        break;
                }
                count++;
            }
            animation.setOneShot(true);
            imageAnim.setBackgroundDrawable(animation);

            // start the animation!
            animation.start();
        }else if(v.getId()==R.id.answer){
            animation.stop();
            Intent play = new Intent(this,play.class);
            //Bundle bundle=new Bundle();
            //bundle.putIntegerArrayList("array",a);
            startActivity(play);
        }
    }
}
