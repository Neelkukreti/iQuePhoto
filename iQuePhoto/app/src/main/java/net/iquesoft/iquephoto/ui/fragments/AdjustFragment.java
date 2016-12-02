package net.iquesoft.iquephoto.ui.fragments;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.arellomobile.mvp.MvpAppCompatFragment;
import com.arellomobile.mvp.presenter.InjectPresenter;

import net.iquesoft.iquephoto.adapter.AdjustAdapter;
import net.iquesoft.iquephoto.R;
import net.iquesoft.iquephoto.mvp.models.Adjust;
import net.iquesoft.iquephoto.mvp.presenters.fragment.AdjustPresenter;
import net.iquesoft.iquephoto.mvp.views.fragment.AdjustView;
import net.iquesoft.iquephoto.ui.activities.EditorActivity;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class AdjustFragment extends MvpAppCompatFragment implements AdjustView {
    @InjectPresenter
    AdjustPresenter presenter;

    private List<Adjust> mAdjustList = Adjust.getAdjustList();

    private Unbinder mUnbinder;

    @BindView(R.id.adjustRecyclerView)
    RecyclerView recyclerView;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_adjust, container, false);

        mUnbinder = ButterKnife.bind(this, view);

        AdjustAdapter adapter = new AdjustAdapter(mAdjustList);

        adapter.setOnAdjustClickListener(adjust ->
                ((EditorActivity) getActivity())
                        .setupFragment(SliderControlFragment.newInstance(adjust.getCommand()))
        );

        recyclerView.setLayoutManager(new LinearLayoutManager(null, LinearLayout.HORIZONTAL, false));

        recyclerView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }

    @OnClick(R.id.adjustBack)
    public void onClickBack() {
        // TODO: editorActivityView.navigateBack(true);
    }
}
