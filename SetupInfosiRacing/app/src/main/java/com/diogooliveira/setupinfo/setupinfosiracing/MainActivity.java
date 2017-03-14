package com.diogooliveira.setupinfo.setupinfosiracing;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.titleText) TextView titleText;
    @Bind(R.id.descriptionText) TextView principalText;
    @Bind(R.id.configsRadio) RadioGroup configRadio;

    @Bind(R.id.toeInOut) RadioButton toeInOut;
    @Bind(R.id.antirollbar) RadioButton antirollbar;
    @Bind(R.id.rideheight) RadioButton rideheight;
    @Bind(R.id.damper) RadioButton spring;
    @Bind(R.id.differential) RadioButton differential;


    // MP4-30 Configs //
    @Bind(R.id.tires) RadioButton tires;
    @Bind(R.id.aeropackage) RadioButton aeropackage;
    @Bind(R.id.aerocalculator) RadioButton aerocalculator;
    @Bind(R.id.frontchassi) RadioButton frontchassi;
    @Bind(R.id.frontleftrightchassi) RadioButton frontleftrightchassi;
    @Bind(R.id.rearchassi) RadioButton rearchassi;
    @Bind(R.id.rearleftrightchassi) RadioButton rearleftrightchassi;
    @Bind(R.id.dampers) RadioButton dampers;



    @Bind(R.id.backbutton)ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        backButton.setVisibility(View.GONE);

            configRadio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                principalText.setVisibility(View.VISIBLE);
                configRadio.setVisibility(View.GONE);
                backButton.setVisibility(View.VISIBLE);

                if (checkedId == toeInOut.getId()){
                    titleText.setText(R.string.toeintoeouttitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.toeintoeouttext)));
                }
                if (checkedId == antirollbar.getId()){
                    titleText.setText(R.string.antirollbartitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.antirollbartext)));
                }
                if (checkedId == spring.getId()){
                    titleText.setText(R.string.dampertitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.dampertext)));
                }
                if (checkedId == rideheight.getId()){
                    titleText.setText(R.string.rideheighttitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.rideheighttext)));
                }
                if (checkedId == differential.getId()){
                    titleText.setText(R.string.differentialtitle);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.differentialtext)));
                }
                // MP4-30//
                if (checkedId == tires.getId()){
                    titleText.setText(R.string.tiresmp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.tiresmp430text)));
                }
                if (checkedId == aeropackage.getId()){
                    titleText.setText(R.string.aeropackagemp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.aeropackagemp430text)));
                }
                if (checkedId == aerocalculator.getId()){
                    titleText.setText(R.string.aerocalculatormp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.aerocalculatormp430text)));
                }
                if (checkedId == frontchassi.getId()){
                    titleText.setText(R.string.frontchassimp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.frontchassimp430text)));
                }
                if (checkedId == frontleftrightchassi.getId()){
                    titleText.setText(R.string.frontleftandrightchassimp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.frontleftandrightchassimp430text)));
                }
                if (checkedId == rearchassi.getId()){
                    titleText.setText(R.string.rearchassimp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.rearchassimp430text)));
                }
                if (checkedId == rearleftrightchassi.getId()){
                    titleText.setText(R.string.rearleftandrightchassimp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.rearleftandrightchassimp430text)));
                }
                if (checkedId == dampers.getId()){
                    titleText.setText(R.string.dampesmp430title);
                    principalText.setText(Html.fromHtml(getResources().getString(R.string.dampersmp430text)));
                }


            }
        });

    }

    @OnClick(R.id.backbutton)
    public void CloseText(){
        backButton.setVisibility(View.GONE);
        principalText.setVisibility(View.GONE);
        configRadio.setVisibility(View.VISIBLE);
        titleText.setText("");
    }

}
