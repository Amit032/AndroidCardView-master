package com.delaroystudios.cardview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.delaroystudios.cardview.Fragments.BREAD;
import com.delaroystudios.cardview.Fragments.BURGER;
import com.delaroystudios.cardview.Fragments.CHICKENS;
import com.delaroystudios.cardview.Fragments.CHOCOLATE;
import com.delaroystudios.cardview.Fragments.COOKIES;
import com.delaroystudios.cardview.Fragments.DESSERTS;
import com.delaroystudios.cardview.Fragments.DRINKS;
import com.delaroystudios.cardview.Fragments.HOME;
import com.delaroystudios.cardview.Fragments.PIZZA;
import com.delaroystudios.cardview.Fragments.SALAD;

class TabsPagerAdapter extends FragmentPagerAdapter{

    public TabsPagerAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
                HOME home = new HOME();
                return home;
            case 1:
                DRINKS drinks = new DRINKS();
                return drinks;
            case 2:
                SALAD salad = new SALAD();
                return salad;
            case 3:
                CHICKENS chickens = new CHICKENS();
                return chickens;
            case 4:
                CHOCOLATE chocolate = new CHOCOLATE();
                return chocolate;
            case 5:
                COOKIES cookies = new COOKIES();
                return cookies;
            case 6:
                BREAD bread = new BREAD();
                return bread;
            case 7:
                BURGER burger = new BURGER();
                return burger;
            case 8:
                PIZZA pizza = new PIZZA();
                return pizza;
            case 9:
                DESSERTS desserts = new DESSERTS();
                return desserts;
                default:
                    return null;
        }
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public CharSequence getPageTitle(int position) {

        switch (position)
        {
            case 0:
                return null;
            case 1:
                return "DRINKS";
            case 2:
                return "SALAD";
            case 3:
                return "CHICKENS";
            case 4:
                return "CHOCOLATE";
            case 5:
                return "COOKIES";
            case 6:
                return "BREAD";
            case 7:
                return "BURGER";
            case 8:
                return "PIZZA";
            case 9:
                return "DESSERTS";
                default:
                    return null;
        }
    }
}
