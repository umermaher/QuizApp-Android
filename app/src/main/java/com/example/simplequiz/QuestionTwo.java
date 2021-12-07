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

public class QuestionTwo extends Fragment {
    public RadioButton b1,b2,b3,b4,b5;
    RadioGroup group;
    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @org.jetbrains.annotations.NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.question_two,container,false);
        b1=view.findViewById(R.id.option1Of2);
        b2=view.findViewById(R.id.option2Of2);
        b3=view.findViewById(R.id.option3Of2);
        b4=view.findViewById(R.id.option4Of2);
        b5=view.findViewById(R.id.option5Of2);
        group=view.findViewById(R.id.group2);
        return view;
    }
}
