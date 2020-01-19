package Deepakroda7.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class dice_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_3);

        Button roll= findViewById(R.id.roll);

        final ImageView left_dice=(ImageView) findViewById(R.id.leftimage);
        final ImageView right_dice=(ImageView) findViewById(R.id.rightimage);
        final ImageView bottom_dice=(ImageView) findViewById(R.id.bottomimage);

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

                int genrated3=randomgenerator.nextInt(6);
                bottom_dice.setImageResource((arr[genrated3]));
            }
        });


    }

}
