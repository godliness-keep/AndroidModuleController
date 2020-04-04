package com.godliness.android.modulecontroller.video;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

/**
 * Created by godliness on 2020-03-31.
 *
 * @author godliness
 */
public final class PortraitBar extends BaseVideoControllerBar {

    /**
     * Return layout id of current bar
     *
     * @return layout id
     */
    @Override
    protected int getBarLayoutId() {
        return 0;
    }

    /**
     * Initializes current bar resource
     */
    @Override
    protected void initBar() {

    }

    /**
     * Register event
     *
     * @param event state
     */
    @Override
    public void regEvent(boolean event) {

    }

    @Override
    public void updatePlayWidgetDrawable(Drawable drawable) {

    }

    @Override
    public void onProgressChanged(int position, int percent, String current, String end) {

    }

    @Override
    public void bindSeekBarChangeListener(SeekBar.OnSeekBarChangeListener callback) {

    }

    @Override
    public void bindControllerBarListener(OnControllerBarListener callback) {

    }

    @Override
    public void enableDragprogress(boolean drag) {

    }

    @Override
    public int getScreenOrientation() {
        return Configuration.ORIENTATION_PORTRAIT;
    }
}
