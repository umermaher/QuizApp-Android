package com.example.simplequiz;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import org.jetbrains.annotations.NotNull;

public class ResultDialog extends AppCompatDialogFragment {
    ResultDialogListener listener;
    @NonNull
    @NotNull
    @Override
    public Dialog onCreateDialog(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder =new AlertDialog.Builder(getActivity());

        builder.setTitle("Score").setMessage("\n   "+StartQuiz.score+"/5")
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listener.onOkClick();
                    }
                });
        return builder.create();
    }

    public interface ResultDialogListener{
        void onOkClick();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            listener=(ResultDialogListener)context;
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
