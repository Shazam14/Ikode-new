package ikona.ikode;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.devspark.robototextview.widget.RobotoButton;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        RobotoButton aboutappbutton = (RobotoButton)findViewById(R.id.AboutApp);
        aboutappbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent iaboutapp = new Intent(About.this, AboutUs.class);
                startActivity(iaboutapp);
            }
        });

    }




}
