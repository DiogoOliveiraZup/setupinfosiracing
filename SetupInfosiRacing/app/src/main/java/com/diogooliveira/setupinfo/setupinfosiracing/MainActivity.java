package com.diogooliveira.setupinfo.setupinfosiracing;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.titleText) TextView titleText;
    @Bind(R.id.descriptionText) TextView principalText;
    @Bind(R.id.configsRadio) RadioGroup configRadio;

    @Bind(R.id.toeInOut) RadioButton toeInOut;
    @Bind(R.id.antirollbar) RadioButton antirollbar;
    @Bind(R.id.rideheight) RadioButton rideheight;
    @Bind(R.id.spring) RadioButton spring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            configRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == toeInOut.getId()){
                    titleText.setText(R.string.toeintoeouttitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.toeintoeouttext)));
                }
                if (checkedId == antirollbar.getId()){
                    titleText.setText(R.string.antirollbartitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.antirollbartext)));
                }
                if (checkedId == spring.getId()){
                    titleText.setText(R.string.springtitle);
                    principalText.setText(R.string.springtext);
                }
                if (checkedId == rideheight.getId()){
                    titleText.setText(R.string.rideheighttitle);
                    principalText.setText(R.string.rideheighttext);
                }

            }
        });

    }
}
