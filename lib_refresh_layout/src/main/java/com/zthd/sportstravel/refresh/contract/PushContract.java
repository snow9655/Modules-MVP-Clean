package com.zthd.sportstravel.refresh.contract;

/**
 * Description: <上拉加载更多的协议><br>
 * Author:      mxdl<br>
 * Date:        2019/2/25<br>
 * Version:     V1.0.0<br>
 * Update:     <br>
 */
public interface PushContract {
    /**
     * 手指上滑下滑的回调
     * @param enable
     */
    void onPushEnable(boolean enable);

    /**
     * 手指松开的回调
     */
    void onLoadMore();
}
