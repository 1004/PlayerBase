/*
 * Copyright 2017 jiajunhui<junhui_jia@163.com>
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.kk.taurus.playerbase.inter;

import android.content.Context;
import android.view.View;

import com.kk.taurus.playerbase.callback.CoverObserver;
import com.kk.taurus.playerbase.setting.CoverData;

/**
 * Created by Taurus on 2017/3/24.
 */

public interface ICover {

    int COVER_LEVEL_LOW = 0;
    int COVER_LEVEL_MEDIUM = 1;
    int COVER_LEVEL_HIGH = 2;

    View initCoverLayout(Context context);
    void setCoverEnable(boolean enable);
    void setCoverVisibility(int visibility);
    void onRefreshCoverData(CoverData data);
    View getView();
    int getCoverLevel();
    CoverObserver getCoverObserver();
}
