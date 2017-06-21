package com.samples.dialogfragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/**
 * Created by use on 20.06.17.
 */
public class Fragment1 extends DialogFragment {

    public Fragment1(String title) {
        Bundle bundle = new Bundle();
        bundle.putString("title", title);
        setArguments(bundle);
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        String title = getArguments().getString("title");

        return new AlertDialog.Builder(getActivity())
                .setIcon(android.R.drawable.btn_plus)
                .setTitle(title)
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((DialogFragmentsActivity)getActivity()).doPositiveClick();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        ((DialogFragmentsActivity)getActivity()).doNegativeClick();
                    }
                }).create();
    }
}
