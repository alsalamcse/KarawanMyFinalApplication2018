package om.banat.karawan.karawanmyfinalapplication2018;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.SearchView;
import android.widget.Toolbar;

public class ResearchResultsHajj extends AppCompatActivity {
    //Hajj fragment
    private FloatingActionButton SearchButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research_results_hajj);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);

        SearchButton = (FloatingActionButton) findViewById(R.id.SearchButton);
        handleIntent(getIntent());
    }

    @Override
    protected void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doMySearch(query);
        }
    }

    private void doMySearch(String query) {

    }


    }


















//}


// AddButton=(FloatingActionButton)findViewById(R.id.AddButton);
// AddButton.setOnClickListener(new View.OnClickListener() {
//  @Override
//  public void onClick(View v) {
// startActivity(new Intent());

//  });
// SearchButton=(FloatingActionButton) findViewById(R.id.SearchButton);
//SearchButton.setOnClickListener(new View.OnClickListener() {
//  @Override
//public void onClick(View v) {


