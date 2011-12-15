package uk.ac.ed.informatics_forum.activities;

import uk.ac.ed.informatics_forum.R;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class FoodAndDrink extends TabActivity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);

        setContentView(R.layout.directions);
        
        TabHost tabs = getTabHost();      
        tabs.setup();
        
        TabHost.TabSpec spec = tabs.newTabSpec("0");
        spec.setContent(R.id.tab1);
        spec.setIndicator("From Airport");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("1");
        spec.setContent(R.id.tab2);
        spec.setIndicator("From Waverley station");
        tabs.addTab(spec);
        
        spec = tabs.newTabSpec("3");
        spec.setContent(R.id.taxi_tab);
        spec.setIndicator("By Taxi");
        tabs.addTab(spec);
    }
}
