package edu.cnm.bootcamp.yolanda.artistgallery.entities;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;
import java.sql.Timestamp;

/**
 * Created by ali on 7/26/2017.
 */

@DatabaseTable (tableName = "ARTWORK")
public class Artwork {

    @DatabaseField (columnName = "ARTWORK_ID", generatedId  = true)
    private int id;

    @DatabaseField (columnName = "NAME", width = 100, unique = true)
    private String name;

    @DatabaseField (columnName = "ARTIST_ID", canBeNull = false, foreign = true)
    private Artist artist;

    @DatabaseField (columnName = "DESCRIPTION")
    private String description;

    @DatabaseField (columnName = "CREATED", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP",
       format = "yyyy-MM-dd HH:mm:ss", readOnly = true)

    private Timestamp created;



    public Artwork(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }


}
