package pseudonerds.in.tictactoe;

import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cpu extends AppCompatActivity {

    private ImageView pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,turn,board;
    private int i = 0;  // 0 means O turn, 1 means X turn
    private int array[], chance = 0;
    private Animation in,out,in1;
    private TextView textview,label;
    private Button replay;
    private int pos,over=0,absolute=0;
    private String result;
    private MediaPlayer winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cpu);

        array = new int[]{ -1, -1, -1, -1, -1, -1, -1, -1, -1 };

        pos1 = (ImageView)findViewById(R.id.pos1);
        pos2 = (ImageView)findViewById(R.id.pos2);
        pos3 = (ImageView)findViewById(R.id.pos3);
        pos4 = (ImageView)findViewById(R.id.pos4);
        pos5 = (ImageView)findViewById(R.id.pos5);
        pos6 = (ImageView)findViewById(R.id.pos6);
        pos7 = (ImageView)findViewById(R.id.pos7);
        pos8 = (ImageView)findViewById(R.id.pos8);
        pos9 = (ImageView)findViewById(R.id.pos9);
        turn = (ImageView)findViewById(R.id.turn);
        board = (ImageView)findViewById(R.id.board);
        textview = (TextView) findViewById(R.id.textview);
        label = (TextView) findViewById(R.id.label);
        replay = (Button) findViewById(R.id.replay);

        winner = MediaPlayer.create(this, R.raw.bell);

        replay.setVisibility(View.INVISIBLE);
        label.setVisibility(View.INVISIBLE);

        in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(250);

        out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(500);

        in1 = new AlphaAnimation(0.0f, 1.0f);
        in1.setDuration(1000);



        pos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[0] == -1 && i==0) {

                    array[0] = 0;
                    pos1.startAnimation(in);
                    pos1.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[1] == -1 && i==0) {

                    array[1] = 0;
                    pos2.startAnimation(in);
                    pos2.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[2] == -1 && i==0) {

                    array[2] = 0;
                    pos3.startAnimation(in);
                    pos3.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[3] == -1 && i==0) {

                    array[3] = 0;
                    pos4.startAnimation(in);
                    pos4.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[4] == -1 && i==0) {

                    array[4] = 0;
                    pos5.startAnimation(in);
                    pos5.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[5] == -1 && i==0) {

                    array[5] = 0;
                    pos6.startAnimation(in);
                    pos6.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[6] == -1 && i==0) {

                    array[6] = 0;
                    pos7.startAnimation(in);
                    pos7.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });

        pos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[7] == -1 && i==0) {

                    array[7] = 0;
                    pos8.startAnimation(in);
                    pos8.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                        makeMove();

                }
            }
        });

        pos9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[8] == -1 && i==0) {

                    array[8] = 0;
                    pos9.startAnimation(in);
                    pos9.setImageResource(R.drawable.o);

                    checkGameOver();
                    i = 1;
                    chance = chance + 2;
                    updateTurn();
                    if(over == 0)
                    makeMove();

                }
            }
        });



        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int j=0;j<9;j++)
                    array[j]=-1;

                i=0;
                chance = 0;
                over = 0;
                absolute = 0;
                updateTurn();

                board.startAnimation(in);
                pos1.startAnimation(in);
                pos2.startAnimation(in);
                pos3.startAnimation(in);
                pos4.startAnimation(in);
                pos5.startAnimation(in);
                pos6.startAnimation(in);
                pos7.startAnimation(in);
                pos8.startAnimation(in);
                pos9.startAnimation(in);
                turn.startAnimation(in);
                textview.startAnimation(in);

                replay.setVisibility(View.INVISIBLE);
                label.setVisibility(View.INVISIBLE);
                replay.startAnimation(out);
                label.startAnimation(out);

                board.setVisibility(View.VISIBLE);
                pos1.setVisibility(View.VISIBLE);
                pos2.setVisibility(View.VISIBLE);
                pos3.setVisibility(View.VISIBLE);
                pos4.setVisibility(View.VISIBLE);
                pos5.setVisibility(View.VISIBLE);
                pos6.setVisibility(View.VISIBLE);
                pos7.setVisibility(View.VISIBLE);
                pos8.setVisibility(View.VISIBLE);
                pos9.setVisibility(View.VISIBLE);
                turn.setVisibility(View.VISIBLE);
                textview.setVisibility(View.VISIBLE);

                pos1.setImageResource(R.drawable.transparent);
                pos2.setImageResource(R.drawable.transparent);
                pos3.setImageResource(R.drawable.transparent);
                pos4.setImageResource(R.drawable.transparent);
                pos5.setImageResource(R.drawable.transparent);
                pos6.setImageResource(R.drawable.transparent);
                pos7.setImageResource(R.drawable.transparent);
                pos8.setImageResource(R.drawable.transparent);
                pos9.setImageResource(R.drawable.transparent);

            }
        });



    }

    private void makeMove() {

        pos = -1;

        if(chance == 2){

            if(array[4]==-1)
                pos = 4;
            else
                pos = 0;
        }

        else if(chance == 4){

            if(array[4]==0&&array[2]==0)
                pos = 6;
            else if(array[4]==0&&array[1]==0)
                pos = 7;
            else if(array[4]==0&&array[6]==0)
                pos = 2;
            else if(array[4]==0&&array[3]==0)
                pos = 5;
            else if(array[4]==0&&array[5]==0)
                pos = 3;
            else if(array[4]==0&&array[7]==0)
                pos = 1;
            else if(array[4]==0&&array[8]==0)
                pos = 2;


            else if(array[0]==0&&array[3]==0)
                pos = 6;
            else if(array[0]==0&&array[6]==0)
                pos = 3;
            else if(array[3]==0&&array[6]==0)
                pos = 0;

            else if(array[0]==0&&array[1]==0)
                pos = 2;
            else if(array[0]==0&&array[2]==0)
                pos = 1;
            else if(array[1]==0&&array[2]==0)
                pos = 0;

            else if(array[6]==0&&array[7]==0)
                pos = 8;
            else if(array[6]==0&&array[8]==0)
                pos = 7;
            else if(array[7]==0&&array[8]==0)
                pos = 6;

            else if(array[2]==0&&array[5]==0)
                pos = 8;
            else if(array[2]==0&&array[8]==0)
                pos = 5;
            else if(array[5]==0&&array[8]==0)
                pos = 2;


            else if(array[7]==0&&array[2]==0)
                pos = 8;

            else if(array[2]==0&& array[6]==0)
                pos=7;

        }

        else if(chance == 6){

            if(array[0]==0&&array[1]==0&&array[2]==-1)
                pos=2;
            else if(array[0]==0&&array[2]==0&&array[1]==-1)
                pos=1;
            else if(array[1]==0&&array[2]==0&&array[0]==-1)
                pos=0;

            if(array[6]==0&&array[4]==0&&array[2]==-1)
                pos=2;
            else if(array[6]==0&&array[2]==0&&array[4]==-1)
                pos=4;
            else if(array[2]==0&&array[4]==0&&array[6]==-1)
                pos=6;

            else if(array[1]==0&&array[4]==0&&array[7]==-1)
                pos=7;
            else if(array[0]==0&&array[7]==0&&array[4]==-1)
                pos=4;
            else if(array[4]==0&&array[7]==0&&array[0]==-1)
                pos=0;

            else if(array[3]==0&&array[4]==0&&array[5]==-1)
                pos=5;
            else if(array[3]==0&&array[5]==0&&array[4]==-1)
                pos=4;
            else if(array[4]==0&&array[5]==0&&array[3]==-1)
                pos=3;

            else if(array[6]==0&&array[7]==0&&array[8]==-1)
                pos=8;
            else if(array[6]==0&&array[8]==0&&array[7]==-1)
                pos=7;
            else if(array[7]==0&&array[8]==0&&array[6]==-1)
                pos=6;

            else if(array[0]==0&&array[3]==0&&array[6]==-1)
                pos=6;
            else if(array[0]==0&&array[6]==0&&array[3]==-1)
                pos=3;
            else if(array[3]==0&&array[6]==0&&array[0]==-1)
                pos=0;

            else if(array[2]==0&&array[5]==0&&array[8]==-1)
                pos=8;
            else if(array[2]==0&&array[8]==0&&array[5]==-1)
                pos=5;
            else if(array[5]==0&&array[8]==0&&array[2]==-1)
                pos=2;


            else if(array[1]==0&&array[2]==0&&array[0]==-1)
                pos=0;
            else if(array[0]==0&&array[1]==0&&array[2]==-1)
                pos=2;





            else if(array[0]==1&&array[1]==1&&array[2]==-1)
                pos=2;
            else if(array[0]==1&&array[2]==1&&array[1]==-1)
                pos=1;
            else if(array[1]==1&&array[2]==1&&array[0]==-1)
                pos=0;

            else if(array[3]==1&&array[4]==1&&array[5]==-1)
                pos=5;
            else if(array[3]==1&&array[5]==1&&array[4]==-1)
                pos=4;
            else if(array[4]==1&&array[5]==1&&array[3]==-1)
                pos=3;

            else if(array[6]==1&&array[7]==1&&array[8]==-1)
                pos=8;
            else if(array[6]==1&&array[8]==1&&array[7]==-1)
                pos=7;
            else if(array[7]==1&&array[8]==1&&array[6]==-1)
                pos=6;


            else if(array[0]==1&&array[3]==1&&array[6]==-1)
                pos=6;
            else if(array[0]==1&&array[6]==1&&array[3]==-1)
                pos=3;
            else if(array[3]==1&&array[6]==1&&array[0]==-1)
                pos=0;

            else if(array[1]==1&&array[4]==1&&array[7]==-1)
                pos=7;
            else if(array[1]==1&&array[7]==1&&array[4]==-1)
                pos=4;
            else if(array[4]==1&&array[7]==1&&array[1]==-1)
                pos=1;

            else if(array[2]==1&&array[5]==1&&array[8]==-1)
                pos=8;
            else if(array[2]==1&&array[8]==1&&array[5]==-1)
                pos=5;
            else if(array[5]==1&&array[8]==1&&array[2]==-1)
                pos=2;


            else if(array[0]==1&&array[4]==1&&array[8]==-1)
                pos=8;
            else if(array[0]==1&&array[8]==1&&array[4]==-1)
                pos=4;
            else if(array[4]==1&&array[8]==1&&array[0]==-1)
                pos=0;

            else if(array[2]==1&&array[4]==1&&array[6]==-1)
                pos=6;
            else if(array[2]==1&&array[6]==1&&array[4]==-1)
                pos=4;
            else if(array[4]==1&&array[6]==1&&array[2]==-1)
                pos=2;


            else if(array[4]==1&&array[3]==-1&&array[5]==-1)
                pos=3;
            else if(array[4]==1&&array[1]==1&&array[7]==-1)
                pos=1;


        }

        else if(chance ==8){

            if(array[1]==0&&array[4]==0&&array[7]==-1)
                pos=7;
            else if(array[0]==0&&array[7]==0&&array[4]==-1)
                pos=4;
            else if(array[4]==0&&array[7]==0&&array[0]==-1)
                pos=0;

            else if(array[3]==0&&array[4]==0&&array[5]==-1)
                pos=5;
            else if(array[3]==0&&array[5]==0&&array[4]==-1)
                pos=4;
            else if(array[4]==0&&array[5]==0&&array[3]==-1)
                pos=3;

            else if(array[0]==0&&array[1]==0&&array[2]==-1)
                pos=2;
            else if(array[0]==0&&array[2]==0&&array[1]==-1)
                pos=1;
            else if(array[1]==0&&array[2]==0&&array[0]==-1)
                pos=0;

            else if(array[6]==0&&array[7]==0&&array[8]==-1)
                pos=8;
            else if(array[6]==0&&array[8]==0&&array[7]==-1)
                pos=7;
            else if(array[7]==0&&array[8]==0&&array[6]==-1)
                pos=6;

            else if(array[0]==0&&array[3]==0&&array[6]==-1)
                pos=6;
            else if(array[0]==0&&array[6]==0&&array[3]==-1)
                pos=3;
            else if(array[3]==0&&array[6]==0&&array[0]==-1)
                pos=0;

            else if(array[2]==0&&array[5]==0&&array[8]==-1)
                pos=8;
            else if(array[2]==0&&array[8]==0&&array[5]==-1)
                pos=5;
            else if(array[5]==0&&array[8]==0&&array[2]==-1)
                pos=2;



            if(array[0]==1&&array[1]==1&&array[2]==-1)
                pos=2;
            else if(array[0]==1&&array[2]==1&&array[1]==-1)
                pos=1;
            if(array[1]==1&&array[2]==1&&array[0]==-1)
                pos=0;



            else if(array[0]==0&&array[6]==0&&array[3]==-1)
                pos=3;
            else if(array[0]==0&&array[3]==0&&array[6]==-1)
                pos=6;
            else if(array[3]==0&&array[6]==0&&array[0]==-1)
                pos=0;

            else if(array[0]==0&&array[1]==0&&array[2]==-1)
                pos=2;
            else if(array[0]==0&&array[2]==0&&array[1]==-1)
                pos=1;
            else if(array[1]==0&&array[2]==0&&array[0]==-1)
                pos=0;

            else if(array[2]==0&&array[5]==0&&array[8]==-1)
                pos=8;
            else if(array[2]==0&&array[8]==0&&array[5]==-1)
                pos=5;
            else if(array[5]==0&&array[8]==0&&array[2]==-1)
                pos=2;

            else if(array[6]==0&&array[7]==0&&array[8]==-1)
                pos=8;
            else if(array[6]==0&&array[8]==0&&array[7]==-1)
                pos=7;
            else if(array[7]==0&&array[8]==0&&array[6]==-1)
                pos=6;



        }

        if(pos==-1)
            for(int it=0;it<9;it++)
               if(array[it]==-1)
                   pos=it;

        if(pos!=-1)
         array[pos] = 1;

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                if(pos==0) {
                    pos1.setImageResource(R.drawable.x);
                    pos1.startAnimation(in);
                }
                else if(pos==1) {
                    pos2.setImageResource(R.drawable.x);
                    pos2.startAnimation(in);
                }
                else if(pos==2) {
                    pos3.setImageResource(R.drawable.x);
                    pos3.startAnimation(in);
                }
                else if(pos==3) {
                    pos4.setImageResource(R.drawable.x);
                    pos4.startAnimation(in);
                }
                else if(pos==4) {
                    pos5.setImageResource(R.drawable.x);
                    pos5.startAnimation(in);
                }
                else if(pos==5) {
                    pos6.setImageResource(R.drawable.x);
                    pos6.startAnimation(in);
                }
                else if(pos==6) {
                    pos7.setImageResource(R.drawable.x);
                    pos7.startAnimation(in);
                }
                else if(pos==7) {
                    pos8.setImageResource(R.drawable.x);
                    pos8.startAnimation(in);
                }
                else {
                    pos9.setImageResource(R.drawable.x);
                    pos9.startAnimation(in);
                }

                checkGameOver();
                i = 0;
                updateTurn();

               // movesound.start();

                //Do something after 100ms
            }
        }, 300);



    }


    private void checkGameOver() {

        absolute = absolute + 1;

        if(array[0]==array[1]&&array[1]==array[2]&&array[2]!=-1)
            done();

        else if(array[3]==array[4]&&array[4]==array[5]&&array[5]!=-1)
            done();

        else if(array[6]==array[7]&&array[7]==array[8]&&array[8]!=-1)
            done();

        else if(array[0]==array[3]&&array[3]==array[6]&&array[6]!=-1)
            done();

        else if(array[1]==array[4]&&array[4]==array[7]&&array[7]!=-1)
            done();

        else if(array[2]==array[5]&&array[5]==array[8]&&array[8]!=-1)
            done();

        else if(array[0]==array[4]&&array[4]==array[8]&&array[8]!=-1)
            done();

        else if(array[2]==array[4]&&array[4]==array[6]&&array[6]!=-1)
            done();

        else if(array[0]!=-1&&array[1]!=-1&&array[2]!=-1&&array[3]!=-1&&array[4]!=-1&&array[5]!=-1&&array[6]!=-1&&array[7]!=-1&&array[8]!=-1) {
            absolute=20;
            done();
        }
    }

    private void done() {

        over = 1;

        if(absolute ==20)
            result = "Draw!";
        else if(absolute%2==1) {
            result = "You won!";
            winner.start();
        }
        else
            result = "You lost!";

        board.startAnimation(out);
        pos1.startAnimation(out);
        pos2.startAnimation(out);
        pos3.startAnimation(out);
        pos4.startAnimation(out);
        pos5.startAnimation(out);
        pos6.startAnimation(out);
        pos7.startAnimation(out);
        pos8.startAnimation(out);
        pos9.startAnimation(out);
        turn.startAnimation(out);
        textview.startAnimation(out);

        replay.setVisibility(View.VISIBLE);
        replay.startAnimation(in1);
        label.setText(result);
        label.setVisibility(View.VISIBLE);
        label.startAnimation(in1);

        board.setVisibility(View.INVISIBLE);
        pos1.setVisibility(View.INVISIBLE);
        pos2.setVisibility(View.INVISIBLE);
        pos3.setVisibility(View.INVISIBLE);
        pos4.setVisibility(View.INVISIBLE);
        pos5.setVisibility(View.INVISIBLE);
        pos6.setVisibility(View.INVISIBLE);
        pos7.setVisibility(View.INVISIBLE);
        pos8.setVisibility(View.INVISIBLE);
        pos9.setVisibility(View.INVISIBLE);
        turn.setVisibility(View.INVISIBLE);
        textview.setVisibility(View.INVISIBLE);

    }

    private void updateTurn(){

        if(i==0)
            turn.setImageResource(R.drawable.o);
        else
            turn.setImageResource(R.drawable.x);

    }

    @Override public void onBackPressed() { super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

}
