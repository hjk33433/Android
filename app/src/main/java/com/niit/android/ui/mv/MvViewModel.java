package com.niit.android.ui.mv;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MvViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public MvViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is mv fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}