package com.niit.android.ui.index;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.niit.android.databinding.FragmentIndexBinding;


public class IndexFragment extends Fragment {

    private FragmentIndexBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        IndexViewModel indexViewModel =
                new ViewModelProvider(this).get(IndexViewModel.class);

        binding = FragmentIndexBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textIndex;
        indexViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}