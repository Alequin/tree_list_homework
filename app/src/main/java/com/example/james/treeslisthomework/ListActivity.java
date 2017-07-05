package com.example.james.treeslisthomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ListViewCompat;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView listView = (ListView) findViewById(R.id.list_view);
        TreeListAdapter treeAdapter = new TreeListAdapter(this, TreesDatabase.getTrees());
        listView.setAdapter(treeAdapter);
    }

    public void onClickTreeListItem(View listItem){
        
    }
}
