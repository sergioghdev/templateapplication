package com.template.sergioghdev.templateapplication.application.main;

import com.template.sergioghdev.templateapplication.application.main.ui.IMainView;

/**
 * Created by sergio on 30/06/17.
 */

public interface IMainPresenter {
    void attachView(IMainView view);
    void detachView();
    void start();
    void stop();
    void onElementsShowed();
    void onButtonXXXClicked();
}
