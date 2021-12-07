package com.example.simplequiz;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.jetbrains.annotations.NotNull;

public class QuestionThree extends Fragment {
    public RadioButton b1,b2,b3,b4;
    RadioGroup group;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.question_three,container,false);
        b1 = view.findViewById(R.id.option1Of3);
        b2 = view.findViewById(R.id.option2Of3);
        b3 = view.findViewById(R.id.option3Of3);
        b4 = view.findViewById(R.id.option4Of3);
        group = view.findViewById(R.id.group3);
        return view;
    }
}
