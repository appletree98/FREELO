package sg.edu.rp.c346.freelo;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static android.R.attr.defaultValue;
import static android.R.attr.name;
import static sg.edu.rp.c346.freelo.R.drawable.riven1;
import static sg.edu.rp.c346.freelo.R.id.image;

public class MainActivity extends AppCompatActivity {
    TextView rank1;
    TextView role1;
    Spinner rank;
    Spinner role;
    Button lockIn;

    ArrayList<String> alRank = new ArrayList<String>();
    ArrayAdapter<String> aaRank;

    ArrayList<String> alRole = new ArrayList<String>();
    ArrayAdapter<String> aaRole;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity.", "onCreate() called.");
        Log.e("MainActivity.", "onCreate() called.");

        rank1 = (TextView) findViewById(R.id.rank1);
        role1 = (TextView) findViewById(R.id.role1);

        aaRank = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, alRank);
        aaRole = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_dropdown_item, alRole);


        rank = (Spinner) findViewById(R.id.rank);
        role = (Spinner) findViewById(R.id.role);
        lockIn = (Button) findViewById(R.id.lockIn);

        String[] strRank = getResources().getStringArray(R.array.rank);
        alRank.addAll(Arrays.asList(strRank));
        rank.setAdapter(aaRank);

        String[] strRole = getResources().getStringArray(R.array.role);
        alRole.addAll(Arrays.asList(strRole));
        role.setAdapter(aaRole);


        lockIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] strRank = getResources().getStringArray(R.array.rank);
                String[] strRole = getResources().getStringArray(R.array.role);
                alRank.addAll(Arrays.asList(strRank));
                alRole.addAll(Arrays.asList(strRole));
                if ((rank.getSelectedItemPosition() == 0) && (role.getSelectedItemPosition()==0)) { //ba = bronze adc
                    Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                    intent.putExtra("ba","Sivir");
                    intent.putExtra("ba1","Vayne");
                    startActivity(intent);
                } else if((rank.getSelectedItemPosition() == 1) && (role.getSelectedItemPosition()==1)) { //ss = silver support
                    Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                    intent.putExtra("ss","Nami");
                    intent.putExtra("ss1","Leona");
                    startActivity(intent);
                } else if((rank.getSelectedItemPosition() == 2) && (role.getSelectedItemPosition()==2)) {
                    Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                    intent.putExtra("gm","Aurelion Sol");
                    intent.putExtra("gm1","Twisted Fate");
                    startActivity(intent);
                } else if((rank.getSelectedItemPosition() == 3) && (role.getSelectedItemPosition()==3)) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("pj","Sejuani");
                    intent.putExtra("pj1","Vi");
                    startActivity(intent);
                } else if((rank.getSelectedItemPosition() == 4) && (role.getSelectedItemPosition()==4)) {
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        intent.putExtra("dt","Riven");
                        intent.putExtra("dt1","Shen");
                        startActivity(intent);
                } else if((rank.getSelectedItemPosition() == 7) && (role.getSelectedItemPosition()==0)) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("c1","Warwick");
                    intent.putExtra("c2","MaoKai");
                    startActivity(intent);
                } else {
                    Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                    intent.putExtra("champName1","Cho'Gath");
                    intent.putExtra("champName2","Yasuo");
                    startActivity(intent);
                }
                aaRank.notifyDataSetChanged();
                aaRole.notifyDataSetChanged();

            }
        });
    }
}