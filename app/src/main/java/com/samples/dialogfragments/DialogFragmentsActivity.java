package com.samples.dialogfragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class DialogFragmentsActivity extends Activity implements View.OnClickListener{

    Fragment1 fragment1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_fragments);
    }


    @Override
    public void onClick(View view) {
        fragment1 = new Fragment1("Are you sure you want to exit?");
        fragment1.show(getFragmentManager(), "dialog");
    }

    public void doPositiveClick() {
        this.finish();
    }

    public void doNegativeClick(){

    }
}
