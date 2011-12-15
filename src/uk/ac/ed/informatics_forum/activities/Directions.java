package uk.ac.ed.informatics_forum.activities;

import uk.ac.ed.informatics_forum.R;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class Directions extends TabActivity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.directions);
        
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabs = (TabHost) findViewById(R.id.tabhost1);        
        tabs.setup();
        
        /*TabHost.TabSpec spec = tabs.newTabSpec("0");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Hotels");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("1");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Last Minute");
        tabs.addTab(spec);*/
        

        
        
    }
}
