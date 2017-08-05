package rbac.kadkanang.myrbac;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import rbac.kadkanang.myrbac.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add Fragment

        if (savedInstanceState == null){
            MainFragment mainFrement = new MainFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.mainContainer,mainFrement)
                .commit();

        }


    } // Main Method

}  //Main Class
