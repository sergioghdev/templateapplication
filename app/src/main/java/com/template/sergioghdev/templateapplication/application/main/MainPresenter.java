package com.template.sergioghdev.templateapplication.application.main;

import android.content.Context;

import com.template.sergioghdev.templateapplication.application.main.ui.IMainView;
import com.template.sergioghdev.templateapplication.domain.entities.XXX;
import com.template.sergioghdev.templateapplication.domain.entities.ZZZ;

/**
 * Created by sergio on 1/07/17.
 */

public class MainPresenter implements IMainPresenter {
    Context context;

    IMainView view;
    IMainInteractor interactor;
    int nClicks;

    public MainPresenter(Context context) {
        this.context = context;
        this.interactor = new MainInteractor(context);
        this.nClicks = 0;
    }

    //IMainPresenter methods:

    @Override
    public void attachView(IMainView view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public void start() {
        interactor.attachPresenter(this);
        interactor.start();

        this.nClicks = 0;

        if (isViewAttached()) {
            view.showElements();
        }
    }

    @Override
    public void stop() {
        interactor.stop();
        interactor.detachPresenter();
    }

    @Override
    public void onElementsShowed() {
        setZZZorXXXByClicks();
    }

    @Override
    public void onButtonXXXClicked() {
        nClicks++;
        setZZZorXXXByClicks();
    }

    //Private methods:

    private void setZZZorXXXByClicks() {
        if (nClicks % 2 == 0) {
            setZZZ();
        } else {
            setXXX();
        }
    }

    private void setXXX() {
        XXX xxx = interactor.getModelXXX();
        if (isViewAttached()) {
            view.setXXX(xxx);
        }
    }

    private void setZZZ() {
        ZZZ zzz = interactor.getModelZZZ();
        if (isViewAttached()) {
            view.setZZZ(zzz);
        }
    }

    private boolean isViewAttached() {
        return view != null;
    }
}
