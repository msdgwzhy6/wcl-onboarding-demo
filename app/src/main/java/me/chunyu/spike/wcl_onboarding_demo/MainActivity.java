package me.chunyu.spike.wcl_onboarding_demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.main_b_onboard_center) Button mBOnboardCenter;
    @Bind(R.id.main_b_onboard_placeholder) Button mBOnboardPlaceholder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mBOnboardCenter.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, OnboardingCenterActivity.class)));

        mBOnboardPlaceholder.setOnClickListener(v ->
                startActivity(new Intent(MainActivity.this, OnboardingPlaceholderActivity.class)));
    }
}
