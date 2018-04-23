package pseudonerds.in.tictactoe;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class home extends AppCompatActivity {

    private Animation out;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final TextView player1, player2;


        player1 = (TextView) findViewById(R.id.player1);
        player2 = (TextView) findViewById(R.id.player2);
        out = new AlphaAnimation(1.0f, 0.0f);
        out.setDuration(400);

        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //player2.startAnimation(out);
                Intent i = new Intent(home.this,cpu.class);
                // i.putExtra("home","yes");
                Bundle bundle = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                        android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
                startActivity(i,bundle);
            }
        });

        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //player2.startAnimation(out);
                Intent i = new Intent(home.this,MainActivity.class);
               // i.putExtra("home","yes");
                Bundle bundle = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),
                        android.R.anim.fade_in, android.R.anim.fade_out).toBundle();
                startActivity(i,bundle);
            }
        });

    }

    @Override public void onBackPressed() { super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
