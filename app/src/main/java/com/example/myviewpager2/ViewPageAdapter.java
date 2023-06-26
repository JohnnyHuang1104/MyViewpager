package com.example.myviewpager2;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPageAdapter extends FragmentStateAdapter {
    public ViewPageAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        //切換Fragment
        switch(position){
            case 0:
                return new FragmentA();
            case 1:
                return new FragmentB();
            default:
                return new FragmentC();
        }
    }

    @Override
    public int getItemCount() {
        //設定頁數
        return 3;
    }
}
