package com.example.scrollleftdelete;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link BlankFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment extends Fragment {
    static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_TYPE = "type";
    private static final String ARG_LIMITED = "limited";
    //notice
    private static final String TAG = "zxt";
    private RecyclerView mLv;
    private List<String> mDatas;
    AreaInfoAdapter mAreaInfoAdapter;




    public BlankFragment() {
        // Required empty public constructor
    }


    public static BlankFragment newInstance(String type, boolean limited) {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TYPE, type);
        args.putBoolean(ARG_LIMITED, limited);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        mLv = view.findViewById(R.id.rv);
        initDatas();

        mAreaInfoAdapter = new AreaInfoAdapter(this.getContext(), mDatas);
        mLv.setAdapter(mAreaInfoAdapter);
        LinearLayoutManager lm = new LinearLayoutManager(getContext());
        lm.setOrientation(RecyclerView.VERTICAL);
        mLv.setLayoutManager(lm);
        return view;
    }
    private void initDatas() {
        mDatas = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            mDatas.add("1");
        }
    }


}
