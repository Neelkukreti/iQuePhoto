package net.iquesoft.iquephoto.presenter;

import net.iquesoft.iquephoto.view.IBrightnessFragmentView;

import javax.inject.Inject;

public class BrightnessFragmentPresenterImpl implements IBrightnessFragmentPresenter {

    private IBrightnessFragmentView view;

    @Inject
    public BrightnessFragmentPresenterImpl() {

    }

    @Override
    public void init(IBrightnessFragmentView view) {
        this.view = view;
    }
}
