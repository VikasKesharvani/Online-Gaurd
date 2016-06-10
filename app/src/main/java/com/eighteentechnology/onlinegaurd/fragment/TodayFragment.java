package com.eighteentechnology.onlinegaurd.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.eighteentechnology.onlinegaurd.R;
import com.eighteentechnology.onlinegaurd.activity.MainActivity;
import com.eighteentechnology.onlinegaurd.adapter.RecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikas on 6/7/2016.
 */
public class TodayFragment  extends Fragment {
    private RecyclerView mRecycleView;
    private int recyclerItemPosition;

    private List<String> mList=new ArrayList<>();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.today_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findIdSetLisner(view);
        mList.add("");
        mList.add("");
        mList.add("");



         if (mRecycleView != null) {
             LinearLayoutManager mLinearLayoutManager = new LinearLayoutManager(getContext());
             mLinearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
             mRecycleView.setNestedScrollingEnabled(false);
             mRecycleView.setHasFixedSize(true);
             mRecycleView.setItemAnimator(new DefaultItemAnimator());
             mRecycleView.setLayoutManager(mLinearLayoutManager);

             mRecycleView.setVisibility(View.VISIBLE);
             RecyclerViewAdapter rcAdapter = new RecyclerViewAdapter(getActivity(), mList);
             mRecycleView.setAdapter(rcAdapter);

            final GestureDetector mGestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {

                @Override
                public boolean onSingleTapUp(MotionEvent e) {
                    return true;
                }

            });
             mRecycleView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
                @Override
                public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
                    View child = rv.findChildViewUnder(e.getX(), e.getY());
                    if (child != null && mGestureDetector.onTouchEvent(e)) {
                        recyclerItemPosition=rv.getChildLayoutPosition(child);
                        //startActivity(new Intent(getActivity(), MainActivity.class));


                        return true;
                    }
                    return false;
                }

                @Override
                public void onTouchEvent(RecyclerView rv, MotionEvent e) {

                }

                @Override
                public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

                }
            });
        }
    }

    private void findIdSetLisner(View view)
    {
        mRecycleView = (RecyclerView) view.findViewById(R.id.recycle_view);
    }

    @Override
    public void onResume() {
        super.onResume();
        mRecycleView.getLayoutManager().scrollToPosition(recyclerItemPosition-1);
    }
}
