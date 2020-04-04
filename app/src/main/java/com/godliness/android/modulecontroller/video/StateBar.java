package com.godliness.android.modulecontroller.video;

import android.view.View;

import com.godliness.android.base.controller.BaseStateBar;

/**
 * Created by godliness on 2020-03-31.
 *
 * @author godliness
 */
public final class StateBar extends BaseStateBar {

    /**
     * Return layout id of current bar
     *
     * @return layout id
     */
    @Override
    public int getBarLayoutId() {
        return 0;
    }

    /**
     * Initialize current bar
     */
    @Override
    public void initBar() {

    }

    /**
     * Register event
     *
     * @param event state
     */
    @Override
    public void regEvent(boolean event) {

    }

    /**
     * Callbacks when an load error occurs
     *
     * @param extra extra params
     */
    @Override
    public void onError(int extra) {

    }

    /**
     * Callbacks when switch load state
     *
     * @param loading state
     */
    @Override
    public void onLoading(boolean loading) {

    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {

    }
}
