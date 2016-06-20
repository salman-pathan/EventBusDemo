package com.codiodes.eventbusdemo;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.codiodes.eventbusdemo.event.IncrementScoreEvent;

import org.greenrobot.eventbus.EventBus;


/**
 * A simple {@link Fragment} subclass.
 */
public class IncrementFragment extends Fragment {

    Button mBtnIncrement;
    public IncrementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_increment, container, false);
        mBtnIncrement = (Button) view.findViewById(R.id.btn_increment);
        mBtnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IncrementScoreEvent event = new IncrementScoreEvent(1);
                EventBus.getDefault().post(event);
            }
        });
        return view;
    }

}
