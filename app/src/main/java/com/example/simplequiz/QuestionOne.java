package com.example.simplequiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Objects;


public class QuestionOne extends Fragment {
    public RadioButton b1,b2,b3,b4;
    RadioGroup group;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.question_one, container, false);
        b1 = view.findViewById(R.id.option1Of1);
        b2 = view.findViewById(R.id.option2Of1);
        b3 = view.findViewById(R.id.option3Of1);
        b4 = view.findViewById(R.id.option4Of1);
        group = view.findViewById(R.id.group1);
        return view;
    }
}
