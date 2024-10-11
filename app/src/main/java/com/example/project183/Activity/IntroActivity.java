package com.example.project183.Activity;

import android.content.Intent;
import android.os.Bundle;

import com.example.project183.databinding.ActivityIntroBinding;

public class IntroActivity extends BaseActivity {
    ActivityIntroBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.goBtn.setOnClickListener(v -> startActivity(new Intent(IntroActivity.this, HomeActivity.class)));

    }
}