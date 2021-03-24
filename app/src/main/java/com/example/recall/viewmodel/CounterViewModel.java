package com.example.recall.viewmodel;

import android.view.View;

import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel
{
    private int counter = 5;
    public int getCounter()
    {
        return counter;
    }
    public void setCounter(int counter)
    {
        this.counter = counter;
    }

} // CounterViewModel closed
