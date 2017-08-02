package sg.edu.rp.c346.freelo;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static sg.edu.rp.c346.freelo.R.drawable.riven1;
import static sg.edu.rp.c346.freelo.R.id.image;
import static sg.edu.rp.c346.freelo.R.id.rank;
import static sg.edu.rp.c346.freelo.R.id.role;
import static sg.edu.rp.c346.freelo.R.id.text;
import static sg.edu.rp.c346.freelo.R.id.webView;

public class Main2Activity extends AppCompatActivity {


    ImageButton champ1;
    ImageButton champ2;
    TextView textViewChamp1;
    TextView textViewChamp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        champ1 = (ImageButton) findViewById(R.id.champ1);
        champ2 = (ImageButton) findViewById(R.id.champ2);
        textViewChamp1 = (TextView) findViewById(R.id.textViewChamp1);
        textViewChamp2 = (TextView) findViewById(R.id.textViewChamp2);

        final Intent intentReceived = getIntent();
        Bundle bd = intentReceived.getExtras();


        if (bd != null) {
            if ((intentReceived.hasExtra("ba")) && (intentReceived.hasExtra("ba1"))) {
                champ1.setImageResource(R.drawable.sivir_thumb_img);
                champ2.setImageResource(R.drawable.vayne);
                String getName = (String) bd.get("ba");
                String getName2 = (String) bd.get("ba1");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }else if ((intentReceived.hasExtra("ss")) && (intentReceived.hasExtra("ss1"))) {
                champ1.setImageResource(R.drawable.nami_thumb_img);
                champ2.setImageResource(R.drawable.leona_thumb_img);
                String getName = (String) bd.get("ss");
                String getName2 = (String) bd.get("ss1");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }else if ((intentReceived.hasExtra("gm")) && (intentReceived.hasExtra("gm1"))) {
                champ1.setImageResource(R.drawable.aurelion_sol_thumb_img);
                champ2.setImageResource(R.drawable.twisted_fate_thumb_img);
                String getName = (String) bd.get("gm");
                String getName2 = (String) bd.get("gm1");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }else if ((intentReceived.hasExtra("pj")) && (intentReceived.hasExtra("pj1"))) {
                champ1.setImageResource(R.drawable.sejuani_thumb_img);
                champ2.setImageResource(R.drawable.vi_thumb_img);
                String getName = (String) bd.get("pj");
                String getName2 = (String) bd.get("pj1");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }else if ((intentReceived.hasExtra("dt")) && (intentReceived.hasExtra("dt1"))) {
                champ1.setImageResource(R.drawable.riven1);
                champ2.setImageResource(R.drawable.shen_thumb_img);
                String getName = (String) bd.get("dt");
                String getName2 = (String) bd.get("dt1");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }else if ((intentReceived.hasExtra("c1")) && (intentReceived.hasExtra("c2"))) {
                champ1.setImageResource(R.drawable.warwick);
                champ2.setImageResource(R.drawable.maokai);
                String getName = (String) bd.get("c1");
                String getName2 = (String) bd.get("c2");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }else{
                champ1.setImageResource(R.drawable.chogath);
                champ2.setImageResource(R.drawable.yasuo);
                String getName = (String) bd.get("champName1");
                String getName2 = (String) bd.get("champName2");
                textViewChamp1.setText(getName);
                textViewChamp2.setText(getName2);

            }

        }
        champ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intentReceived.hasExtra("ba")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                    //String url = "http://www.lolking.net/guides/369216";
                    //intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/sivir/statistics/adc"));
                    startActivity(intent);
                }   else if (intentReceived.hasExtra("ss")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/nami/statistics/support"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("gm")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/aurelionsol/statistics/mid"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("pj")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/sejuani/statistics/jungle"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("dt")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/riven/statistics/top"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("c1")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/warwick/statistics/jungle"));

                    startActivity(intent);
                }   else {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/chogath/statistics/jungle"));

                    startActivity(intent);
                }
            }
        });
        champ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (intentReceived.hasExtra("ba1")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/vayne/statistics/adc"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("ss1")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/leona/statistics/support"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("gm1")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/twistedfate/statistics/mid"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("pj1")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/vi/statistics/jungle"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("dt1")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/shen/statistics/top"));

                    startActivity(intent);
                }   else if (intentReceived.hasExtra("c2")==true) {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/maokai/statistics/top"));

                    startActivity(intent);
                }   else {
                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
//                    String url = "www.lolking.net/guides/623";
//                    intent.putExtra("url",url);
                    intent.setData(Uri.parse("https://na.op.gg/champion/yasuo/statistics/top"));

                    startActivity(intent);
                }
            }
        });
    }
}
