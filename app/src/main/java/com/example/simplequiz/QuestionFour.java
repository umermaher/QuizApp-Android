package com.example.simplequiz;

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

public class QuestionFour extends Fragment {
    public RadioButton b1,b2,b3,b4;
    RadioGroup group;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.question_four,container,false);
        b1 = view.findViewById(R.id.option1Of4);
        b2 = view.findViewById(R.id.option2Of4);
        b3 = view.findViewById(R.id.option3Of4);
        b4 = view.findViewById(R.id.option4Of4);
        group = view.findViewById(R.id.group4);
        return view;
    }
}
