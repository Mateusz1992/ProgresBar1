package com.example.mateusz.progresbar1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import it.michelelacorte.elasticprogressbar.ElasticDownloadView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ElasticDownloadView mElasticDownloadView;
        mElasticDownloadView = (ElasticDownloadView)findViewById(R.id.elastic_download_view);
        int i = 0;
//Call startIntro() to start animation
        mElasticDownloadView.startIntro();
        while(i < 101){

                for(int j = 0; j < 100000; j++);
                mElasticDownloadView.setProgress(i);
                i++;


        }
        mElasticDownloadView.fail();

    }
}
