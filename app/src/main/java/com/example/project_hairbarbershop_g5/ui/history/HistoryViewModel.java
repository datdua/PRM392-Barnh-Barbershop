package com.example.project_hairbarbershop_g5.ui.history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HistoryViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HistoryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Trang lịch sử dc cắt tóc");
    }

    public LiveData<String> getText() {
        return mText;
    }
}