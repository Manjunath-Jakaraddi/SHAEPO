package android.memgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Stack;


public class play extends AppCompatActivity implements ActualStart {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }
    public void select(View v){
        final TextView change=(TextView)findViewById(R.id.win);
        final TextView changeSubmit=(TextView)findViewById(R.id.s1);
        int winCount=0;
        //Bundle bundle=getIntent().getExtras();
        //ArrayList b = new ArrayList();
        //a=bundle.getIntegerArrayList("array");
        //Stack stk=new Stack();
        if(v.getId()==R.id.b1){
            b.push(1);
        }else if(v.getId()==R.id.b2){
            b.push(2);
        }else if(v.getId()==R.id.b3){
            b.push(3);
        }else if(v.getId()==R.id.b4){
            b.push(4);
        }else if(v.getId()==R.id.b5){
            b.push(5);
        }else {
            if (v.getId() == R.id.s1) {
                changeSubmit.setText("--Play Again--");
                int i=4;
                while (i>=0){
                if(a.pop()==b.pop())
                winCount++;
                 i--;
                }
                if(winCount==0)
                change.setText("0 correct, are you memory impaired?");
                else if(winCount==1)
                change.setText("1 correct, you need to work hard!");
                else if(winCount==2)
                    change.setText("2 correct, not bad!");
                else if(winCount==3)
                    change.setText("3 correct, keep going!!");
                else if(winCount==4)
                    change.setText("4 correct, almost there!");
                else change.setText("5 correct, exceptional!");
            }
        }

        }
    }

