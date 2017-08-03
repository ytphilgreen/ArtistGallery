package edu.cnm.bootcamp.yolanda.artistgallery;

import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;

import java.sql.SQLException;
import java.util.List;

import edu.cnm.bootcamp.yolanda.artistgallery.entities.Artist;
import edu.cnm.bootcamp.yolanda.artistgallery.helpers.OrmHelper;

public class MainActivity extends AppCompatActivity {
    private  ImageSwitcher imageSwitcher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OrmHelper dbHelper = OpenHelperManager.getHelper(this, OrmHelper.class);
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        db.close();
        setContentView(R.layout.activity_main);



        }

    @Override
    protected void onDestroy() {
        OpenHelperManager.releaseHelper();
        super.onDestroy();
    }
}
