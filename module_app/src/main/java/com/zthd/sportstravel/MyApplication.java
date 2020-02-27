package com.zthd.sportstravel;

import com.zthd.sportstravel.api.base.RetrofitManager;
import com.zthd.sportstravel.common.BaseApplication;

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        RetrofitManager.init(this);
    }
}
