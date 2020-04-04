package com.godliness.android.modulecontroller.video;

import android.view.ViewGroup;

import com.godliness.android.base.controller.BaseControllerBar;
import com.godliness.android.base.controller.BaseStateBar;
import com.godliness.android.base.controller.BaseTemplateController;

/**
 * Created by godliness on 2020-03-31.
 *
 * @author godliness
 */
public abstract class BaseVideoController<TitleBar extends BaseControllerBar, BottomBar extends BaseVideoControllerBar, StateBar extends BaseStateBar>
        extends BaseTemplateController<TitleBar, BottomBar, StateBar> {

    protected BaseVideoController(ViewGroup host) {
        super(host);
    }

    @Override
    protected void initTemplate() {

    }
}
