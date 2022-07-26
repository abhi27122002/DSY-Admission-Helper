package com.aashviit.DSEAssistant.ui.home.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.aashviit.DSEAssistant.R;
import com.aashviit.DSEAssistant.ui.home.cap3.Cap3_2018;
import com.aashviit.DSEAssistant.ui.home.cap3.Cap3_2019;

public class SectionsPagerAdapter3 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_2, R.string.tab_text_1};
    private final Context mContext;

    public SectionsPagerAdapter3(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment=new Cap3_2019();
                break;

            case 1:
                fragment=new Cap3_2018();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }
}