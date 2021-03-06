package com.taurus.playerbaselibrary.holder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.kk.taurus.uiframe.v.ContentHolder;
import com.taurus.playerbaselibrary.R;
import com.taurus.playerbaselibrary.bean.VideosInfo;


/**
 * Created by Taurus on 2017/3/28.
 */

public class HomeHolder extends ContentHolder<VideosInfo> {

    private RadioGroup mRadioGroup;
    private OnMainPageListener onMainPageListener;

    public HomeHolder(Context context,OnMainPageListener onMainPageListener) {
        super(context);
        this.onMainPageListener = onMainPageListener;
    }

    @Override
    public void onCreate() {
        setContentView(R.layout.activity_home);
        mRadioGroup = getViewById(R.id.radioGroup);
    }

    public View getContainer(){
        return mRootView.findViewById(R.id.container);
    }

    @Override
    public void onHolderCreated() {
        super.onHolderCreated();
        mRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb_online_video:
                        if(onMainPageListener!=null){
                            onMainPageListener.onSwitchOnlineVideos();
                        }
                        break;

                    case R.id.rb_local_video:
                        if(onMainPageListener!=null){
                            onMainPageListener.onSwitchLocalVideos();
                        }
                        break;

                    case R.id.rb_local_video_play_go:
                        if(onMainPageListener!=null){
                            onMainPageListener.onSwitchLocalVideosPlayGo();
                        }
                        break;

                    case R.id.rb_input_url:
                        if(onMainPageListener!=null){
                            onMainPageListener.onSwitchInputUrl();
                        }
                        break;
                }
            }
        });
    }

    public interface OnMainPageListener{
        void onSwitchOnlineVideos();
        void onSwitchLocalVideos();
        void onSwitchLocalVideosPlayGo();
        void onSwitchInputUrl();
    }

}
