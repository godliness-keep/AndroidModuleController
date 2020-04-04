package com.godliness.android.modulecontroller.video;

import android.support.annotation.Nullable;
import android.view.ViewGroup;

import com.godliness.android.base.controller.BaseControllerBar;
import com.godliness.android.base.controller.BaseStateBar;

/**
 * Created by godliness on 2020-03-31.
 *
 * @author godliness
 */
public final class VideoController extends BaseVideoController<TitleBar, BaseVideoControllerBar, StateBar> {

    private TitleBar mTitleBar;
    private BaseVideoControllerBar mControllerBar;

    protected VideoController(ViewGroup host) {
        super(host);
    }

    /**
     * Return controller title bar
     *
     * @return {@link BaseControllerBar}
     */
    @Nullable
    @Override
    protected TitleBar createTitleBar() {
        if (!screenOrientationFromPortrait()) {
            if (mTitleBar == null) {
                mTitleBar = new TitleBar();
            }
            return mTitleBar;
        }
        return null;
    }

    /**
     * Return controller bottom bar
     *
     * @return {@link BaseControllerBar}
     */
    @Nullable
    @Override
    protected BaseVideoControllerBar createBottomBar() {
        return getControllerBar();
    }

    @Override
    protected boolean switchBottomBar() {
        return true;
    }

    /**
     * Return controller state bar
     *
     * @return {@link BaseStateBar}
     */
    @Nullable
    @Override
    protected StateBar createStateBar() {
        return new StateBar();
    }

    /**
     * Register related events
     *
     * @param isClick register/unregister
     */
    @Override
    protected void regEvent(boolean isClick) {

    }

    private BaseVideoControllerBar getControllerBar() {
        if (mControllerBar == null) {
            mControllerBar = createControllerBar();
        } else {
            if (!mControllerBar.isSameOrientation(getConfigurationOrientation())) {
                mControllerBar = createControllerBar();
            }
        }
        return mControllerBar;
    }

    private BaseVideoControllerBar createControllerBar() {
        if (screenOrientationFromPortrait()) {
            return new PortraitBar();
        }
        return new LandscapeBar();
    }
}
