package com.niit.android.ui.mv;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.niit.android.databinding.FragmentMvBinding;

public class MvFragment extends Fragment {

    private FragmentMvBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MvViewModel mvViewModel =
                new ViewModelProvider(this).get(MvViewModel.class);

        binding = FragmentMvBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textMv;
        mvViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}