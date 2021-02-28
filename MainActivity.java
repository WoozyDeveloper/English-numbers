package ro.adionofrei.myfirstapp;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import ro.adionofrei.myfirstapp.R;

public class MainActivity extends Activity{
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b30,b40,b50,b60,b70,b80,b90,b100,b1000,b10000,b100000,b1000000,b1000000000,b1000000000000;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button)findViewById(R.id.button1);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);
        b6 = (Button)findViewById(R.id.button6);
        b7 = (Button)findViewById(R.id.button7);
        b8 = (Button)findViewById(R.id.button8);
        b9 = (Button)findViewById(R.id.button9);
        b10 = (Button)findViewById(R.id.button10);
        b11 = (Button)findViewById(R.id.button11);
        b12 = (Button)findViewById(R.id.button12);
        b13 = (Button)findViewById(R.id.button13);
        b14 = (Button)findViewById(R.id.button14);
        b15 = (Button)findViewById(R.id.button15);
        b16 = (Button)findViewById(R.id.button16);
        b17 = (Button)findViewById(R.id.button17);
        b18 = (Button)findViewById(R.id.button18);
        b19 = (Button)findViewById(R.id.button19);
        b20 = (Button)findViewById(R.id.button20);
        b30 = (Button)findViewById(R.id.button30);
        b40 = (Button)findViewById(R.id.button40);
        b50 = (Button)findViewById(R.id.button50);
        b60 = (Button)findViewById(R.id.button60);
        b70 = (Button)findViewById(R.id.button70);
        b80 = (Button)findViewById(R.id.button80);
        b90 = (Button)findViewById(R.id.button90);
        b100 = (Button)findViewById(R.id.button100);
        b1000 = (Button)findViewById(R.id.button1000);
        b1000000 = (Button)findViewById(R.id.button1000000);
        b1000000000 = (Button)findViewById(R.id.button1000000000);
        b1000000000000 = (Button)findViewById(R.id.button1000000000000);
        txt=(TextView)findViewById(R.id.textView2);
    }
    public void go1(View v){txt.setText("one");}
    public void go2(View v){txt.setText("two");}
    public void go3(View v){txt.setText("three");}
    public void go4(View v){txt.setText("four");}
    public void go5(View v){txt.setText("five");}
    public void go6(View v){txt.setText("six");}
    public void go7(View v){txt.setText("seven");}
    public void go8(View v){txt.setText("eight");}
    public void go9(View v){txt.setText("nine");}
    public void go10(View v){txt.setText("ten");}
    public void go11(View v){txt.setText("eleven");}
    public void go12(View v){txt.setText("twelve");}
    public void go13(View v){txt.setText("thirteen");}
    public void go14(View v){txt.setText("fourteen");}
    public void go15(View v){txt.setText("fifteen");}
    public void go16(View v){txt.setText("sixteen");}
    public void go17(View v){txt.setText("seventeen");}
    public void go18(View v){txt.setText("eighteen");}
    public void go19(View v){txt.setText("nineteen");}
    public void go20(View v){txt.setText("twenty");}
    public void go30(View v){txt.setText("thirty");}
    public void go40(View v){txt.setText("forty");}
    public void go50(View v){txt.setText("fifty");}
    public void go60(View v){txt.setText("sixty");}
    public void go70(View v){txt.setText("seventy");}
    public void go80(View v){txt.setText("eighty");}
    public void go90(View v){txt.setText("ninety");}
    public void go100(View v){txt.setText("one hundred");}
    public void go1000(View v){txt.setText("one thousand");}
    public void go1000000(View v){txt.setText("one million");}
    public void go1000000000(View v){txt.setText("one billion");}
    public void go1000000000000(View v){txt.setText("one trillion");}
}