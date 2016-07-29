package pk.smallapps.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button moviesAppButton;
    Button stockAppButton;
    Button biggerAppButton;
    Button materialAppButton;
    Button obquitousAppButton;
    Button capstoneAppButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        moviesAppButton = (Button) findViewById(R.id.button_popular_movies);
        stockAppButton = (Button) findViewById(R.id.button_stock_hawk);
        biggerAppButton = (Button) findViewById(R.id.button_build_it_bigger);
        materialAppButton = (Button) findViewById(R.id.button_material);
        obquitousAppButton = (Button) findViewById(R.id.button_go_ubiquitous);
        capstoneAppButton = (Button) findViewById(R.id.button_capstone);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id){
            case R.id.button_popular_movies:
                Toast.makeText(MainActivity.this,"This button will launch my popular movies app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_stock_hawk:
                Toast.makeText(MainActivity.this,"This button will launch my stock hawk app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_build_it_bigger:
                Toast.makeText(MainActivity.this,"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_material:
                Toast.makeText(MainActivity.this,"This button will launch my make your app material app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_go_ubiquitous:
                Toast.makeText(MainActivity.this,"This button will launch my go ubiquitous app!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_capstone:
                Toast.makeText(MainActivity.this,"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        moviesAppButton.setOnClickListener(this);
        stockAppButton.setOnClickListener(this);
        biggerAppButton.setOnClickListener(this);
        materialAppButton.setOnClickListener(this);
        obquitousAppButton.setOnClickListener(this);
        capstoneAppButton.setOnClickListener(this);
    }
}
