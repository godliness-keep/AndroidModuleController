package com.godliness.android.modulecontroller.video;

import android.graphics.drawable.Drawable;
import android.widget.SeekBar;

import com.godliness.android.base.controller.BaseControllerBar;

/**
 * Created by godliness on 2020-03-31.
 *
 * @author godliness
 */
public abstract class BaseVideoControllerBar extends BaseControllerBar {

    public boolean isSameOrientation(int currentOrientation) {
        return currentOrientation == getScreenOrientation();
    }

    public abstract void updatePlayWidgetDrawable(Drawable drawable);

    public abstract void onProgressChanged(int position, int percent, String current, String end);

    public abstract void bindSeekBarChangeListener(SeekBar.OnSeekBarChangeListener callback);

    public abstract void bindControllerBarListener(OnControllerBarListener callback);

    public abstract void enableDragprogress(boolean drag);

    public abstract int getScreenOrientation();

    /**
     * Show switch of current bar
     */
    public void enableSwitchScreenOrientation(boolean enable) {

    }

    public interface OnControllerBarListener {

        /**
         * Play or pause
         */
        void onPlay();

        /**
         * On switch orientation event
         */
        void onOrientation();

        /**
         * On switch speed event
         */
        void onSpeed();

        /**
         * On switch definition event
         */
        void onDefinition();

        /**
         * On switch catalog event
         */
        void onCatalog();
    }

}
