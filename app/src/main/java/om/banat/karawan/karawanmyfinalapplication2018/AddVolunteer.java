package om.banat.karawan.karawanmyfinalapplication2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AddVolunteer extends AppCompatActivity {

    private EditText etvName;
    private EditText etvLastNamr;
    private EditText etvAge;
    private EditText etvPlaceLiving;
    private EditText etvPhone;
    private EditText etvEmail;
    private FirebaseAuth auth;
    private FirebaseUser user;
    private Button btvShare;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_volunteer);
        etvName=(EditText)findViewById(R.id.etvName);
        etvLastNamr=(EditText)findViewById(R.id.etvLastNamr);
        etvAge=(EditText)findViewById(R.id.etvAge);
        etvPlaceLiving=(EditText)findViewById(R.id.etvPlaceLiving);
        etvPhone=(EditText)findViewById(R.id.etvPhone);
        etvEmail=(EditText)findViewById(R.id.etvEmail);
        btvShare=(Button) findViewById(R.id.btvShare);
        auth = FirebaseAuth.getInstance();
        user = auth.getCurrentUser();
        FirebaseUser firebaseUser;
        firebaseUser = auth.getCurrentUser();

        btvShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),VolunteerFragment.class);
                startActivity(i);
                dataHandler();
            }
        });
    }
      private void dataHandler(){
        String Name=etvName.getText().toString();
        String LastName=etvLastNamr.getText().toString();
        String Age=etvAge.getText().toString();





      }

}

