package om.banat.karawan.karawanmyfinalapplication2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddVolunteer extends AppCompatActivity {

    private EditText etvName;
    private EditText etvLastNamr;
    private EditText etvAge;
    private EditText etvPlaceLiving;
    private EditText etvPhone;
    private EditText etvEmail;
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






    }
}
