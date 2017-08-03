package edu.cnm.bootcamp.yolanda.artistgallery.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.sql.Timestamp;

/**
 * Created by ali on 7/26/2017.
 */

@DatabaseTable(tableName = "ARTIST")
public class Artist {

    @DatabaseField (columnName = "ARTIST_ID", generatedId = true)
    private int id;

    @DatabaseField (columnName = "NAME", width = 100, unique = true)
    private String name;

    @DatabaseField (columnName = "URL", width = 255)
    private String url;

    @DatabaseField (columnName = "CREATED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP",
            format = "yyyy-MM-dd HH:mm:ss", readOnly = true)
    private Timestamp created;

    @DatabaseField (columnName = "UPDATED")
    private Timestamp updated;




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public Timestamp getCreated() {
        return created;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }


    public Artist(){

    }

}


