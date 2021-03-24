package com.example.recall;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recall.viewmodel.CounterViewModel;

import java.util.Random;


public class MainActivity extends AppCompatActivity
{

    TextView textView;
    CounterViewModel counterViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

        counterViewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        textView.setText(String.valueOf(counterViewModel.getCounter()));

    } // onCreate closed

        public void incrementText(View view)
        {
            counterViewModel.setCounter(counterViewModel.getCounter()+1);
            textView.setText(String.valueOf(counterViewModel.getCounter()));

        } // incrementText closed

    // git

} // MainActivity closed