package com.devbrackets.android.recyclerextdemo.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A Fragment for demonstrating a horizontal reorder adapter
 */
public class ReorderListHorizontalFragment extends ReorderListFragment {
    public static ReorderListHorizontalFragment newInstance() {
        return new ReorderListHorizontalFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        orientation = LinearLayoutManager.HORIZONTAL;
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
