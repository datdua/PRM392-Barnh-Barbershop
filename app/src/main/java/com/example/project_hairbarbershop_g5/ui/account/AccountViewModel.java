package com.example.project_hairbarbershop_g5.ui.account;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public AccountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Trang tài khoản cắt tóc");
    }

    public LiveData<String> getText() {
        return mText;
    }
}