package com.template.sergioghdev.templateapplication.application.main;

import android.content.Context;

import com.template.sergioghdev.templateapplication.R;
import com.template.sergioghdev.templateapplication.domain.entities.XXX;
import com.template.sergioghdev.templateapplication.domain.entities.ZZZ;

/**
 * Created by sergio on 1/07/17.
 */

public class MainInteractor implements IMainInteractor {
    IMainPresenter presenter;
    Context context;

    public MainInteractor(Context context) {
        this.context = context;
    }

    //IMainInteractor methods:

    @Override
    public void attachPresenter(IMainPresenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void detachPresenter() {
        this.presenter = null;
    }

    @Override
    public void start() {
        //TODO: suscribe to broadcasts
    }

    @Override
    public void stop() {
        //TODO: unsuscribe to broadcasts
    }

    @Override
    public XXX getModelXXX() {
        XXX mockXXX = new XXX();
        mockXXX.setStringXXXResourceID(R.string.stringXXX);

        return mockXXX;
    }

    @Override
    public ZZZ getModelZZZ() {
        ZZZ mockZZZ = new ZZZ();
        mockZZZ.setStringZZZResourceID(R.string.stringZZZ);

        return mockZZZ;
    }
}
