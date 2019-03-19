package om.banat.karawan.karawanmyfinalapplication2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class AddHajj extends AppCompatActivity {
    private EditText edName;
    private EditText edLastName;
    private EditText edAge;
    private EditText edPlaceLiving;
    private EditText edEmail;
    private EditText edphone;
    private EditText edInformation;
    private Button btShare;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hajj);
        edName = (EditText) findViewById(R.id.edName);
        edLastName = (EditText) findViewById(R.id.edLastName);
        edAge = (EditText) findViewById(R.id.edAge);
        edPlaceLiving = (EditText) findViewById(R.id.edPlaceLiving);
        edEmail = (EditText) findViewById(R.id.edEmail);
        edphone = (EditText) findViewById(R.id.edphone);
        edInformation = (EditText) findViewById(R.id.edInformation);
        btShare = (Button) findViewById(R.id.btShare);
        btShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               dataHandler();
                Intent i=new Intent(getApplicationContext(),HajjFragment.class);
                startActivity(i);
            }
        });
    }
    private void dataHandler() {



        String Name =edName.getText().toString();
        String LastName=edLastName.getText().toString();
        String Age=edAge.getText().toString();
        String PlaceLiving=edPlaceLiving.getText().toString();
        String Email=edEmail.getText().toString();
        String Phone=edphone.getText().toString();
        String Information=edInformation.getText().toString();
    }

   // FirebaseAuth auth=FirebaseAuth.getInstance();
    //



}








