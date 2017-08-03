package edu.cnm.bootcamp.yolanda.artistgallery.helpers;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;

import java.sql.SQLException;

import edu.cnm.bootcamp.yolanda.artistgallery.R;
import edu.cnm.bootcamp.yolanda.artistgallery.entities.Artist;

public class List extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}

    //test info
   // public class ListActivity extends AppCompatActivity {

    //    @Override
      //  protected void onCreate(Bundle savedInstanceState){
    //        super.onCreate(savedInstanceState);
        //    setContentView(R.layout.activity_test);
          //  try{
            //    List<Artist> Artists = DatabaseHelper.ArtistDao.getInstance().query(
              //  DatabaseHelper.ArtistDao.getInstance().queryBuilder().prepare()

                //);
              //  ArrayAdapter<Artist> Adapter = new ArrayAdapter<> (this, R.layout.activity_listview, credentials);
              //  ((ListView) findViewbyId(R.id.queryList)).setAdapter(adapter);

         //   } catch (SQLException ex){
           //     ex.printStackTrace();
      //      }

    //    }
  //  }

//}
