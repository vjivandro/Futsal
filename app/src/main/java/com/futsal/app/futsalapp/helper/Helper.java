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
        ruleModels.add(new RuleModel("1",R.string.story_video, "Storyboard Pembuatan Video", R.mipmap.ic_storyboard));
        ruleModels.add(new RuleModel("2",R.string.story_aplikasi, "Storyboard Pembuatan Aplikasi", R.mipmap.ic_storyboard));
        ruleModels.add(new RuleModel("3",R.string.MenuSejarah, "Menu berisi Materi tentang Sejarah Futsal", R.mipmap.ic_materi));
        ruleModels.add(new RuleModel("4",R.string.FutsalLaw, "Menu kumpulan teknik - teknik dasar Futsal", R.mipmap.ic_materi));
        ruleModels.add(new RuleModel("5",R.string.TataCara, "Menu kumpulan teknik - teknik dasar Futsal", R.mipmap.ic_cara));
        ruleModels.add(new RuleModel("6",R.string.Video, "Menu berisi video yang terintegrasi dengan Youtube", R.mipmap.ic_video));
        ruleModels.add(new RuleModel("7",R.string.Profil, "Menu profil pembuat aplikasi", R.mipmap.ic_profile));
        ruleModels.add(new RuleModel("8",R.string.Developer, "AlertDialog Developer Mobile Android", R.mipmap.ic_dev));
        ruleModels.add(new RuleModel("9",R.string.Analyst, "AlertDialog Analyst", R.mipmap.ic_analyst));
        ruleModels.add(new RuleModel("10",R.string.About, "Menu berisi Tentang Aplikasi", R.mipmap.ic_about));
        return ruleModels;

    }

}
