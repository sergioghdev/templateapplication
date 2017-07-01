package com.template.sergioghdev.templateapplication.application.main.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.template.sergioghdev.templateapplication.R;
import com.template.sergioghdev.templateapplication.application.main.IMainPresenter;
import com.template.sergioghdev.templateapplication.application.main.MainPresenter;
import com.template.sergioghdev.templateapplication.domain.entities.XXX;
import com.template.sergioghdev.templateapplication.domain.entities.ZZZ;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements IMainView {

    @BindView(R.id.textViewXXX)
    TextView textViewXXX;
    @BindView(R.id.buttonXXX)
    Button buttonXXX;

    IMainPresenter presenter;

    public MainActivity() {
        this.presenter = new MainPresenter(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.presenter.attachView(this);
        this.presenter.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.presenter.stop();
        this.presenter.detachView();
    }

    //Events:

    @OnClick(R.id.buttonXXX)
    public void onButtonXXXClicked() {
        this.presenter.onButtonXXXClicked();
    }

    //IMainView methods:

    @Override
    public void showElements() {
        textViewXXX.setVisibility(View.VISIBLE);
        buttonXXX.setVisibility(View.VISIBLE);

        this.presenter.onElementsShowed();
    }

    @Override
    public void hideElements() {
        textViewXXX.setVisibility(View.INVISIBLE);
        buttonXXX.setVisibility(View.INVISIBLE);
    }

    @Override
    public void setXXX(XXX xxx) {
        textViewXXX.setText(xxx.getStringXXXResourceID());
    }

    @Override
    public void setZZZ(ZZZ zzz) {
        textViewXXX.setText(zzz.getStringZZZResourceID());
    }
}
