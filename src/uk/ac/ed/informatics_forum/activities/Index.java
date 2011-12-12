package uk.ac.ed.informatics_forum.activities;

import uk.ac.ed.informatics_forum.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Index extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setButtonListeners();
    }
    
    private void setButtonListeners(){
    	// Directions button opens directions view
    	Button directions = (Button) findViewById(R.id.button_directions);
    	directions.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Directions.class);
                startActivityForResult(myIntent, 0);
            }
        });
    	
    	// Food Drink button opens food and drink view
    	Button food_drink = (Button) findViewById(R.id.button_food_drink);
    	food_drink.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), FoodAndDrink.class);
                startActivityForResult(myIntent, 0);
            }
        });
    	
    	// Hotels button opens hotels view
    	Button hotels = (Button) findViewById(R.id.button_hotels);
    	hotels.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Hotels.class);
                startActivityForResult(myIntent, 0);
            }
        });
    	
    	// Practical Info button opens practical view
    	Button practical = (Button) findViewById(R.id.button_practical_info);
    	practical.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), PracticalInformation.class);
                startActivityForResult(myIntent, 0);
            }
        });
    	
    	// Planner button opens planner view
    	Button planner = (Button) findViewById(R.id.button_planner);
    	planner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(), Planner.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}