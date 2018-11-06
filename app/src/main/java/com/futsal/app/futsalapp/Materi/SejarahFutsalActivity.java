package com.futsal.app.futsalapp.Materi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.futsal.app.futsalapp.R;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;
import com.shockwave.pdfium.PdfDocument;

import java.util.List;

public class SejarahFutsalActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_futsal);

    }
}
