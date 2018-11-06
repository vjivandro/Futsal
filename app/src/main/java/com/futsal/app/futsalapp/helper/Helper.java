package com.futsal.app.futsalapp.helper;

import com.futsal.app.futsalapp.R;

import java.util.ArrayList;
import java.util.List;

public class Helper {

    public static List<MenuModel> getInfoAplikasi(){

        List<MenuModel> listInfo = new ArrayList<MenuModel>();
        listInfo.add(new MenuModel("Profil", R.mipmap.ic_profile));
        listInfo.add(new MenuModel("Developer", R.mipmap.ic_dev));
        listInfo.add(new MenuModel("Analyst", R.mipmap.ic_analyst));
        listInfo.add(new MenuModel("About", R.mipmap.ic_about));
        return listInfo;
    }

    public static List<MenuModel> getMenuDashboard() {
        List<MenuModel> lisDashboard = new ArrayList<MenuModel>();
        lisDashboard.add(new MenuModel("Materi", R.mipmap.ic_book));
        lisDashboard.add(new MenuModel("Latihan", R.mipmap.ic_latihan));
        lisDashboard.add(new MenuModel("Tentang", R.mipmap.ic_info_app));
        lisDashboard.add(new MenuModel("Petunjuk", R.mipmap.ic_petunjuk));
        return lisDashboard;
    }


    public static List<RuleModel> getRuleApp() {

        List<RuleModel> ruleModels = new ArrayList<RuleModel>();
        ruleModels.add(new RuleModel(R.string.MenuSejarah, "Menu berisi Materi tentang Sejarah Futsal", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.FutsalLaw, "Menu kumpulan teknik - teknik dasar Futsal", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.TataCara, "Menu kumpulan teknik - teknik dasar Futsal", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.Video, "Menu berisi video yang terintegrasi dengan Youtube", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.Profil, "Menu profil pembuat aplikasi", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.Developer, "AlertDialog Developer Mobile Android", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.Analyst, "AlertDialog Analyst", R.mipmap.ic_info));
        ruleModels.add(new RuleModel(R.string.About, "Menu berisi Tentang Aplikasi", R.mipmap.ic_info));
        return ruleModels;

    }

}
