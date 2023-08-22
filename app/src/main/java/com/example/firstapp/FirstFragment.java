package com.example.firstapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment {
    OnDataSend onDataSend;
    String text;
    public FirstFragment(OnDataSend onDataSend) {
        this.onDataSend = onDataSend;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        text = getArguments().getString("TEXT_DATA");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        /*TextView textView = view.findViewById(R.id.text);

        textView.setText(text);*/


         Button btn = view.findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onDataSend.onData(100000);
                /*FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                SecFragment secFragment = new SecFragment();
                Bundle bundle = new Bundle();
                bundle.putInt("DATA", 100000);
                secFragment.setArguments(bundle);
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.container, secFragment).commit();*/

            }
        });
    }

    public interface OnDataSend{
        void onData(int data);

    }
}