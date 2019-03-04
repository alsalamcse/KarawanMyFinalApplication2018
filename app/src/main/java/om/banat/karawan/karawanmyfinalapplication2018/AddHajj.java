package om.banat.karawan.karawanmyfinalapplication2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddHajj extends AppCompatActivity {
private EditText edName;
private EditText edLastName;
private EditText edAge;
private EditText edPlaceLiving;
private EditText edphone;
private EditText edEmail;
private Button btShare;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hajj);
       edName=(EditText) findViewById(R.id.edName);
       edLastName=(EditText)findViewById(R.id. edLastName);
        edAge=(EditText)findViewById(R.id.edAge);
        edPlaceLiving=(EditText)findViewById(R.id.edPlaceLiving);
        edphone=(EditText)findViewById(R.id.edphone);
        edEmail=(EditText)findViewById(R.id. edEmail);
        btShare=(Button)findViewById(R.id.btShare);

    }
}
