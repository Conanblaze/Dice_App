package Deepakroda7.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class dice_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dice_1);

        Button roll= findViewById(R.id.roll);
        final ImageView dice_image=(ImageView) findViewById(R.id.dice_image);

        final int[] arr = {   R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
                R.drawable.a5,
                R.drawable.a6       };

        roll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomgenerator = new Random();

                int genrated1=randomgenerator.nextInt(6);
                dice_image.setImageResource(arr[genrated1]);

            }
        });
    }
}
