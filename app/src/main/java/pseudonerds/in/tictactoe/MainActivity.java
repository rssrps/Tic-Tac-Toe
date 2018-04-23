package pseudonerds.in.tictactoe;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageView pos1,pos2,pos3,pos4,pos5,pos6,pos7,pos8,pos9,turn,board;
    private int i = 0;  // 0 means O turn, 1 means X turn
    private int array[];
    private Animation in,out,in1;
    private TextView textview,label;
    private Button replay;
    private String result;
    private ImageView symbol;
    private int absolute=0;
    private MediaPlayer winner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Bundle b;
        b = getIntent().getExtras();

        if(b.getString("home","no").equals("no")){
            Intent i = new Intent(MainActivity.this, home.class);
            startActivity(i);
            finish();
        }
        */

        winner = MediaPlayer.create(this, R.raw.bell);
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
        symbol = (ImageView) findViewById(R.id.symbol);
        textview = (TextView) findViewById(R.id.textview);
        label = (TextView) findViewById(R.id.label);
        replay = (Button) findViewById(R.id.replay);


        replay.setVisibility(View.INVISIBLE);
        label.setVisibility(View.INVISIBLE);
        symbol.setVisibility(View.INVISIBLE);

        in = new AlphaAnimation(0.0f, 1.0f);
        in.setDuration(250);

        out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(500);

        in1 = new AlphaAnimation(0.0f, 1.0f);
        in1.setDuration(1000);



        pos1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[0] == -1) {

                    array[0] = i;
                    pos1.startAnimation(in);
                    if (i == 0)
                        pos1.setImageResource(R.drawable.o);
                    else
                        pos1.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }
            }
        });

        pos2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[1] == -1) {
                    array[1] = i;
                    pos2.startAnimation(in);
                    if (i == 0)
                        pos2.setImageResource(R.drawable.o);
                    else
                        pos2.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }
            }
        });

        pos3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[2] == -1) {

                    array[2] = i;
                    pos3.startAnimation(in);
                    if (i == 0)
                        pos3.setImageResource(R.drawable.o);
                    else
                        pos3.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }

            }
        });

        pos4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[3] == -1) {
                    array[3] = i;
                    pos4.startAnimation(in);
                    if (i == 0)
                        pos4.setImageResource(R.drawable.o);
                    else
                        pos4.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }
            }
        });

        pos5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[4] == -1) {

                    array[4] = i;
                    pos5.startAnimation(in);
                    if (i == 0)
                        pos5.setImageResource(R.drawable.o);
                    else
                        pos5.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }
            }
        });

        pos6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(array[5]==-1){
                array[5] = i;
                    pos6.startAnimation(in);
                if(i == 0)
                    pos6.setImageResource(R.drawable.o);
                else
                    pos6.setImageResource(R.drawable.x);

                checkGameOver();
                i = (i + 1 ) % 2;
                    updateTurn();
                }
            }
        });

        pos7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[6] == -1) {
                    array[6] = i;
                    pos7.startAnimation(in);
                    if (i == 0)
                        pos7.setImageResource(R.drawable.o);
                    else
                        pos7.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }
            }
        });

        pos8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (array[7] == -1) {
                    array[7] = i;
                    pos8.startAnimation(in);
                    if (i == 0)
                        pos8.setImageResource(R.drawable.o);
                    else
                        pos8.setImageResource(R.drawable.x);

                    checkGameOver();
                    i = (i + 1) % 2;
                    updateTurn();
                }
            }
        });

        pos9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(array[8]==-1){
                array[8] = i;
                    pos9.startAnimation(in);
                if(i == 0)
                    pos9.setImageResource(R.drawable.o);
                else
                    pos9.setImageResource(R.drawable.x);

                checkGameOver();
                i = (i + 1 ) % 2;
                    updateTurn();
                }
            }
        });


        replay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                for(int j=0;j<9;j++)
                    array[j]=-1;

                i=0;
                updateTurn();
                absolute=0;

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
                replay.startAnimation(out);
                label.setVisibility(View.INVISIBLE);
                label.startAnimation(out);
                symbol.setVisibility(View.INVISIBLE);
                symbol.startAnimation(out);

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

    private void checkGameOver() {

        absolute++;

        if(array[0]==array[1]&&array[1]==array[2]&&array[2]!=-1)
            done();

        if(array[3]==array[4]&&array[4]==array[5]&&array[5]!=-1)
            done();

        if(array[6]==array[7]&&array[7]==array[8]&&array[8]!=-1)
        done();

        if(array[0]==array[3]&&array[3]==array[6]&&array[6]!=-1)
        done();

        if(array[1]==array[4]&&array[4]==array[7]&&array[7]!=-1)
        done();

        if(array[2]==array[5]&&array[5]==array[8]&&array[8]!=-1)
        done();

        if(array[0]==array[4]&&array[4]==array[8]&&array[8]!=-1)
        done();

        if(array[2]==array[4]&&array[4]==array[6]&&array[6]!=-1)
        done();

        if(array[0]!=-1&&array[1]!=-1&&array[2]!=-1&&array[3]!=-1&&array[4]!=-1&&array[5]!=-1&&array[6]!=-1&&array[7]!=-1&&array[8]!=-1) {
            absolute =20;
            done();
        }
    }

    private void done() {

        if(absolute ==20) {
            result = "Draw!";
            symbol.setImageResource(R.drawable.transparent);
        }
        else if(absolute%2==1) {
            symbol.setImageResource(R.drawable.o);
            result = "Player       won!";
            winner.start();
        }
        else {
            symbol.setImageResource(R.drawable.x);
            result = "Player       won!";
            winner.start();
        }

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
        symbol.setVisibility(View.VISIBLE);
        symbol.startAnimation(in1);

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
