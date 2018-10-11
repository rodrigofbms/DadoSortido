package figueiredo.rodrigo.androiddadosortido;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    TextView editNumber;
    Random rnd = new Random();
    ArrayList<Integer> pictures = new ArrayList<>();
    Integer number = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pictures.add(R.drawable.dice1);
        pictures.add(R.drawable.dice2);
        pictures.add(R.drawable.dice3);
        pictures.add(R.drawable.dice4);
        pictures.add(R.drawable.dice5);
        pictures.add(R.drawable.dice6);
        editNumber =findViewById(R.id.number);
        image = findViewById(R.id.image);
        final Button button1 =  findViewById(R.id.button1);
        final Button button2 =  findViewById(R.id.button2);
        final Button button3 =  findViewById(R.id.button3);


        setContentView(R.layout.activity_main);
    }


    public void button1Click(View view){
        Integer aleatory;
        aleatory = rnd.nextInt(6);
        image.setImageResource(pictures.get(aleatory));
        number += aleatory+1;
        editNumber.setText(number);

    }

    public void button2Click(View view){

    }

    public void button3Click(View view){
        image.setImageResource(pictures.get(0));
        number = 0;
        editNumber.setText(number);
    }
}
