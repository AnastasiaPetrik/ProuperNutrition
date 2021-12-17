package edu.nuzp.proupernutrition.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText, mText2, mText3, mText4;

    private String[] text = {"Ингридиенты", "Блюда", "Страны", "Повара"};

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue(text[0]);
        mText2 = new MutableLiveData<>();
        mText2.setValue(text[1]);
        mText3 = new MutableLiveData<>();
        mText3.setValue(text[2]);
        mText4 = new MutableLiveData<>();
        mText4.setValue(text[3]);
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getText2() {
        return mText2;
    }
    public LiveData<String> getText3() {
        return mText3;
    }
    public LiveData<String> getText4() {
        return mText4;
    }
}