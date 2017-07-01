package com.template.sergioghdev.templateapplication.application.main;

import com.template.sergioghdev.templateapplication.domain.entities.XXX;
import com.template.sergioghdev.templateapplication.domain.entities.ZZZ;

/**
 * Created by sergio on 30/06/17.
 */

public interface IMainInteractor {
    void attachPresenter(IMainPresenter presenter);
    void detachPresenter();
    void start();
    void stop();
    XXX getModelXXX();
    ZZZ getModelZZZ();
}
