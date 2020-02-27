package com.zthd.sportstravel.common.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.zthd.sportstravel.common.mvp.BaseModel;
import com.zthd.sportstravel.common.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Description: <BaseMvpFragment><br>
 * Author:      mxdl<br>
 * Date:        2018/1/15<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public abstract class BaseMvpFragment<M extends BaseModel,V,P extends BasePresenter<M,V>> extends BaseFragment {
   @Inject
    protected P mPresenter;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        injectPresenter();
        if(mPresenter != null){
            mPresenter.injectLifecycle(mActivity);
        }
    }

    @Override
    public void onDestroy() {
        if(mPresenter != null){
            mPresenter.detach();
        }
        super.onDestroy();
    }
    public abstract void injectPresenter();
}
