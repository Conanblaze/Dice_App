package Deepakroda7.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one,two,three;
        one=findViewById(R.id.dice1);
        two=findViewById(R.id.dice2);
        three=findViewById(R.id.dice3);

        TextView Text_creator;
        Text_creator=findViewById(R.id.editText2);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("1-DICE");
                Intent dice1=new Intent(getApplicationContext(),dice_1.class);
                startActivity(dice1);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("2-DICE");
                Intent dice2=new Intent(getApplicationContext(),dice_2.class);
                startActivity(dice2);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("3-DICE");
                Intent dice3=new Intent(getApplicationContext(),dice_3.class);
                startActivity(dice3);
            }
        });

        Text_creator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creator= new Intent(getApplicationContext(),creator_Activity.class);
                startActivity(creator);
            }
        });
    }
}
