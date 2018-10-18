package om.banat.karawan.karawanmyfinalapplication2018;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {
    private EditText etFirstName;
    private EditText etLastName;
    private  EditText etPhone;
    private  EditText etEmail;
    private EditText etpassword;
    private FirebaseAuth auth;
    private FirebaseUser user;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etFirstName=(EditText)findViewById(R.id.etFirstName) ;
        etLastName=(EditText)findViewById(R.id.etLastName);
        etPhone=(EditText)findViewById(R.id. etPhone);
        etEmail=(EditText)findViewById(R.id. etEmail);
        etpassword=(EditText)findViewById(R.id.etPassword);
        auth = FirebaseAuth.getInstance();
        user=auth.getCurrentUser();
        FirebaseUser firebaseUser;
        firebaseUser = auth.getCurrentUser();
        btnSave=(Button) this.<View>findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        dataHandler();

    }

    private void dataHandler() {
        boolean isok=true;
        String email=  etEmail.getText().toString();
        String password=  etpassword.getText().toString();
        String firstName=etFirstName.getText().toString();
        String lastName=  etLastName.getText().toString();
        String phone=  etPhone.getText().toString();
        if (email.length() < 4 || email.indexOf('@')<0 || email.indexOf('.')<0)
        {
            etEmail.setError("wrong Email");
            {
                isok = false;

            }
            if (password.length() < 8) {
                etpassword.setError("Have to be least 8 char");
                isok = false;
            }
            if (isok) {


            }
        }

        else
            etEmail.setError("wrong Email");
        {
            isok = false;

        }
        if (password.length() < 8) {
            etpassword.setError("Have to be least 8 char");
            isok = false;
        }


    }



    FirebaseAuth.AuthStateListener authStateListener = new FirebaseAuth.AuthStateListener() {

        @Override
        public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
            //4.
            FirebaseUser user = firebaseAuth.getCurrentUser();
            if (user != null) {
                //user is signed in
                Toast.makeText(SignUpActivity.this, "user is signed in.", Toast.LENGTH_SHORT).show();

            } else {
                //user signed out
                Toast.makeText(SignUpActivity.this, "user signed out.", Toast.LENGTH_SHORT).show();


            }

        }
    };
}




