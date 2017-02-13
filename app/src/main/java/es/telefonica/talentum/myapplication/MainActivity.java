package es.telefonica.talentum.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.activity_main___text_view)TextView textViewWelcome;
    @BindView(R.id.activity_main___button_happy)ImageView buttonHappy;
    @BindView(R.id.activity_main___button_normal)ImageView buttonNormal;
    @BindView(R.id.activity_main___button_sad)ImageView buttonSad;

    private static final int HAPPY_BUTTON = 0;
    private static final int NORMAL_BUTTON = 1;
    private static final int SAD_BUTTON = 2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ImageView[]buttons = {
                buttonSad,
                buttonNormal,
                buttonHappy,
        };


        buttonHappy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        buttonSad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
