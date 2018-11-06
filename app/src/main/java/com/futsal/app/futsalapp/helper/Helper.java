package com.futsal.app.futsalapp.helper;

import com.futsal.app.futsalapp.R;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<MenuModel> getInfoAplikasi(){

        List<MenuModel> listInfo = new ArrayList<MenuModel>();
        listInfo.add(new MenuModel("Profil", R.mipmap.ic_profile));
        listInfo.add(new MenuModel("Deskripsi Aplikasi", R.mipmap.ic_deskrip));
        listInfo.add(new MenuModel("About", R.mipmap.ic_about));
        return listInfo;
    }

    public static List<MenuModel> getMenuDashboard() {
        List<MenuModel> lisDashboard = new ArrayList<MenuModel>();
        lisDashboard.add(new MenuModel("Materi", R.mipmap.ic_analyst_circle));
        lisDashboard.add(new MenuModel("Latihan", R.mipmap.ic_latihan_circle));
        lisDashboard.add(new MenuModel("Tentang", R.mipmap.ic_info_circle));
        lisDashboard.add(new MenuModel("Petunjuk", R.mipmap.ic_petunjuk_circle));
        return lisDashboard;
    }

}
