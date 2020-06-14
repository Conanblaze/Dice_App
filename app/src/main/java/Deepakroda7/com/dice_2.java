package Deepakroda7.com;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class dice_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_2);

        Button roll= findViewById(R.id.roll);

        final ImageView left_dice=(ImageView) findViewById(R.id.leftimage);
        final ImageView right_dice=(ImageView) findViewById(R.id.rightimage);

        final int[] arr = {   R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
                R.drawable.a5,
                R.drawable.a6       };

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Roll","Dice App making Roll");

                Random randomgenerator = new Random();

                int genrated1=randomgenerator.nextInt(6);
                left_dice.setImageResource(arr[genrated1]);

                int genrated2=randomgenerator.nextInt(6);
                right_dice.setImageResource(arr[genrated2]);

            }
        });

        TextView creator_text=findViewById(R.id.editText2);
        creator_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent creator=new Intent(getApplicationContext(),creator_Activity.class);
                startActivity(creator);
            }
        });
    }
}
