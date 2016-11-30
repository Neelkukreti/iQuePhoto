package net.iquesoft.iquephoto.mvp.presenters.fragment;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

import net.iquesoft.iquephoto.mvp.models.Sticker;
import net.iquesoft.iquephoto.mvp.models.StickersSet;
import net.iquesoft.iquephoto.mvp.views.fragment.ShowStickersView;

import java.util.ArrayList;
import java.util.List;

@InjectViewState
public class ShowStickersFragmentPresenter extends MvpPresenter<ShowStickersView> {
    private List<Sticker> mStickers;
    private List<StickersSet> mStickersSets = StickersSet.getStickersSetsList();

    public void setupStickersSet(int position) {
        mStickers = new ArrayList<>(mStickersSets.get(position).getStickers());

        getViewState().setupAdapter(mStickers);
    }
}
