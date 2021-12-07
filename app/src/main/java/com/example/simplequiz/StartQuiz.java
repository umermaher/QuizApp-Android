package com.example.simplequiz;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class StartQuiz extends AppCompatActivity implements ResultDialog.ResultDialogListener {
    public static Button nextBtn;

    public QuestionOne one;
    public QuestionTwo two;
    public QuestionThree three;
    public QuestionFour four;
    public QuestionFive five;

    public int count=1,radioId;
    public static int score=0;
    public RadioButton checkedBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_quiz);
        nextBtn=findViewById(R.id.next);
        one=new QuestionOne();
        loadFragment(one);
//        Fragments introduce modularity and reusability into your activity’s UI by allowing you to divide the UI into discrete chunks.
    }

    public void loadFragment(Fragment f){
        FragmentManager fm=getSupportFragmentManager();
        //FragmentManager is the class responsible for performing actions on your app's fragments,
        // such as adding, removing, or replacing them, and adding them to the back stack.
        FragmentTransaction ft=fm.beginTransaction();//API for performing a set of Fragment operations.
        ft.replace(R.id.frame,f); //Replace UI's layout with Fragment f
        ft.commit(); //signals to the FragmentManager that all operations have been added to the transaction.
    }

    public void onClick(View v) {
        count++;
        try {
            if (count == 2) {
                    radioId = one.group.getCheckedRadioButtonId();
                    setCheckedBtn("Michael Faraday");
                    two = new QuestionTwo();
                    loadFragment(two);
            }
            else if (count == 3) {
                radioId = two.group.getCheckedRadioButtonId();
                setCheckedBtn("CPU");
                three = new QuestionThree();
                loadFragment(three);
            }
            else if (count == 4) {
                radioId = three.group.getCheckedRadioButtonId();
                setCheckedBtn("Version Control Software");
                four = new QuestionFour();
                loadFragment(four);
            }
            else if (count == 5) {
                radioId = four.group.getCheckedRadioButtonId();
                setCheckedBtn("8848 km");
                five = new QuestionFive();
                loadFragment(five);
                nextBtn.setText("Submit");
                nextBtn.setBackgroundColor(Color.DKGRAY);

            }
             else if (count == 6) {
                radioId = five.group.getCheckedRadioButtonId();
                setCheckedBtn("Elon Musk");
                showDialog();
            } else
                showDialog();
        } catch (Exception e) {
            Toast.makeText(this, "Select option", Toast.LENGTH_SHORT).show();
            count--;
        }
    }

    public void showDialog(){
        ResultDialog result = new ResultDialog();
        result.show(getSupportFragmentManager(), "Finished");
    }
    public void setCheckedBtn(String s){
        checkedBtn = findViewById(radioId);
        if (checkedBtn.getText().toString().equals(s))
            score++;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        count=1;
        score=0;
    }
    @Override
    public void onOkClick() {
        score=0;
        Intent i=new Intent(StartQuiz.this,MainActivity.class);
        startActivity(i);
    }
}