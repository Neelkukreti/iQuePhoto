package net.iquesoft.iquephoto.mvp.views.fragment;

import android.graphics.Paint;

import com.arellomobile.mvp.MvpView;

public interface CameraFragmentView extends MvpView {
    void changeFilter(Paint paint);

}
