package com.futsal.app.futsalapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.futsal.app.futsalapp.Materi.SejarahFutsalActivity;
import com.futsal.app.futsalapp.Tentang.DeskripsiActivity;
import com.futsal.app.futsalapp.Tentang.InfoActivity;
import com.futsal.app.futsalapp.Tentang.ProfilActivity;
import com.futsal.app.futsalapp.helper.MenuModel;

import java.util.List;

import static com.futsal.app.futsalapp.helper.Helper.getInfoAplikasi;

public class TentangActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        List<MenuModel> info = getInfoAplikasi();

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        InfoAppAdapter appAdapter = new InfoAppAdapter(info, this);
        recyclerView.setAdapter(appAdapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(linearLayoutManager);

    }

    private class InfoAppAdapter extends RecyclerView.Adapter<InfoAppAdapter.ViewHolder>{

        List<MenuModel> listInfo;
        Context context;

        public InfoAppAdapter(List<MenuModel> listInfo, Context context) {
            this.listInfo = listInfo;
            this.context = context;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_infoapp, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.title_tv.setText(listInfo.get(position).getTitle());
            holder.imageView.setImageResource(listInfo.get(position).getImage());
        }

        @Override
        public int getItemCount() {
            return listInfo.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

            TextView title_tv;
            ImageView imageView;

            public ViewHolder(View itemView) {
                super(itemView);

                title_tv = (TextView) itemView.findViewById(R.id.tv_title);
                imageView = (ImageView) itemView.findViewById(R.id.iv_imageview);

                itemView.setOnClickListener(this);
            }

            @Override
            public void onClick(View v) {
                if (getPosition() == 0) {
                    startActivity(new Intent(v.getContext(), ProfilActivity.class));
                } else if (getPosition() == 1) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(TentangActivity.this);
                    builder.setTitle("Mobile Developer");
                    builder.setIcon(R.drawable.developer);
                    builder.setMessage("Juris Vassa Ivandro, S.Kom\n082143594666\nvjdevmobile@gmail.com");
                    builder.setPositiveButton("Oke", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });
                    builder.show();
                } else if (getPosition() == 2) {
                    startActivity(new Intent(v.getContext(), InfoActivity.class));
                }
            }
        }
    }
}
