package edu.cnm.bootcamp.yolanda.artistgallery.helpers;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.nfc.Tag;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.RuntimeExceptionDao;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

import edu.cnm.bootcamp.yolanda.artistgallery.R;
import edu.cnm.bootcamp.yolanda.artistgallery.entities.Artist;
import edu.cnm.bootcamp.yolanda.artistgallery.entities.Artwork;

/**
 * Created by ali on 7/27/2017.
 */

public class OrmHelper extends OrmLiteSqliteOpenHelper {

    private static final String DATABASE_NAME = "Artist.db";

    private static final int DATABASE_VERSION = 1;

    private Dao<Artist, Integer> artistDao = null;
    private Dao<Artwork, Integer> artworkDao = null;


    public OrmHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db, ConnectionSource connectionSource) {
        try {
            Log.i(OrmHelper.class.getName(), "onCreate");
            TableUtils.createTable(connectionSource, Artist.class);
            TableUtils.createTable(connectionSource, Artwork.class);
            populateDB();
        } catch (SQLException e) {
            Log.e(OrmHelper.class.getName(), "Can't create database", e);
            throw new RuntimeException(e);
        }
        // RuntimeExceptionDao<SimpleData, Integer> dao = getSimpleDataDao();
        // long millis = System.currentTimeMillis();
        // SimpleData simple = new SimpleData(millis);
        // dao.create(simple);
        // simple = new SimpleData(millis + 1);
        // dao.create(simple);
        // Log.i(DatabaseHelper.class.getName(), "created new entries in onCreate:" + millis);

        // }


    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {

    }

    private void populateDB() throws SQLException {

        Artist artist = new Artist();
        artist.setName("Pablo Picasso");
       getArtistDao().create(artist);

        artist = new Artist();
        artist.setName("Salavdor Dali");
        getArtistDao().create(artist);

        Artwork artwork = new Artwork();
        artwork.setArtist(artist);
        artwork.setName("persistance of vision");
        getArtworkDao().create(artwork);

    }



    public synchronized Dao<Artist,Integer> getArtistDao() throws  SQLException {
        if(artistDao == null){
            artistDao = getDao(Artist.class);
        }
        return artistDao;
    }


    public synchronized Dao<Artwork,Integer> getArtworkDao() throws  SQLException {
        if(artworkDao == null){
            artworkDao = getDao(Artwork.class);
        }
        return artworkDao;
    }
}
