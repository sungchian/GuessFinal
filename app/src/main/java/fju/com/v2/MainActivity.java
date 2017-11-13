package fju.com.v2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int min = 1;
    int max = 100;
    Random r = new Random();
    int n = r.nextInt(100)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void guesss(View v) {

        EditText ednumber = (EditText) findViewById(R.id.ed_num);
        int s = Integer.parseInt(ednumber.getText().toString());
                if (s < min){
                    Toast.makeText(this, "please enter" + min + "~" + max, Toast.LENGTH_LONG).show();
                }
                if (s > max){
                    Toast.makeText(this, "please enter" + min + "~" + max, Toast.LENGTH_LONG).show();
        }

                if (s > n&&s>min&&s<max) {
                    max = s;
                    Toast.makeText(this, "please enter" + min + "~" + max, Toast.LENGTH_LONG).show();
                }
                if (s < n&&s>min&&s<max) {
                    min = s;
                    Toast.makeText(this, "please enter" + min + "~" + max, Toast.LENGTH_LONG).show();
                }
                if (s == n) {
                    new AlertDialog.Builder(this)
                            .setTitle("結果")
                            .setMessage("ya")
                            .setNegativeButton("ok", null)
                            .show();
                }

        }
    }

