package com.cmware.dbsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;

public class EntryListActivity extends FragmentActivity
        implements EntryListFragment.Callbacks {

    private boolean mTwoPane;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry_list);

        if (findViewById(R.id.entry_detail_container) != null) {
            mTwoPane = true;
            ((EntryListFragment) getSupportFragmentManager()
                    .findFragmentById(R.id.entry_list))
                    .setActivateOnItemClick(true);
        }
    }

    @Override
    public void onItemSelected(String id) {
        if (mTwoPane) {
            Bundle arguments = new Bundle();
            arguments.putString(EntryDetailFragment.ARG_ITEM_ID, id);
            EntryDetailFragment fragment = new EntryDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.entry_detail_container, fragment)
                    .commit();

        } else {
            Intent detailIntent = new Intent(this, EntryDetailActivity.class);
            detailIntent.putExtra(EntryDetailFragment.ARG_ITEM_ID, id);
            startActivity(detailIntent);
        }
    }
}
