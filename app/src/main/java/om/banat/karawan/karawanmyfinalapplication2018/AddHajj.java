package om.banat.karawan.karawanmyfinalapplication2018;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.jar.Attributes;

public class AddHajj extends AppCompatActivity {
    private EditText edName;
    private EditText edLastName;
    private EditText edAge;
    private EditText edPlaceLiving;
    private EditText edEmail;
    private EditText edphone;
    private EditText edInformation;
    private Button btShare;
    DatabaseReference databaseAddHajj;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_hajj);
        databaseAddHajj = FirebaseDatabase.getInstance().getReference("Hajj");


        edName = findViewById(R.id.edName);
        edLastName = findViewById(R.id.edLastName);
        edAge = findViewById(R.id.edAge);
        edPlaceLiving = findViewById(R.id.edPlaceLiving);
        edEmail = findViewById(R.id.edEmail);
        edphone = findViewById(R.id.edphone);
        edInformation = findViewById(R.id.edInformation);
        btShare = findViewById(R.id.btShare);
        // auth=FirebaseAuth.getInstance();
        //user=auth.getCurrentUser();
        btShare.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                dataHandler();
//                Intent i = new Intent(getApplicationContext(), HajjFragment.class);
//                startActivity(i);
            }
        });
    }

    private void dataHandler() {

    }

    private void AddHajj() {
        String Name = edName.getText().toString();
        String LastName = edLastName.getText().toString();
        String Age = edAge.getText().toString();
        String PlaceLiving = edPlaceLiving.getText().toString();
        String Email = edEmail.getText().toString();
        String Phone = edphone.getText().toString();
        String Information = edInformation.getText().toString();


        boolean isok = true;
        if (edName.length() == 0) {
            edName.setError("you have to write a name ");
            isok = false;


        }
        if (edLastName.length() == 0) {
            edLastName.setError("you have to write a family");
            isok = false;
        }
        if (edAge.length() == 0) {
            edAge.setError("you have to write age");
            isok = false;
        }
        if (edPlaceLiving.length() == 0) {
            edPlaceLiving.setError("you have to write place Living");

            if (isok) {
                Hajj hajj = new Hajj();

                hajj.setName(edName);
                hajj.setLastName(edLastName);
                hajj.setAge(edAge);
                hajj.setPlaceLiving(edPlaceLiving);
                hajj.setEmail(edPlaceLiving);
                hajj.setPhone(edphone);
                hajj.setInformation(edInformation);



                //FirebaseAuth auth=FirebaseAuth.getInstance();
                //profile.setOwner(auth.getCurrentUser().getEmail());

                DatabaseReference reference = FirebaseDatabase.getInstance().getReference();

                String key = reference.child("MyBook").push().getKey();
                Hajj.setKey(key);
                reference.child("MyBook").child(key).setValue(hajj).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task1) {
                        if (task1.isSuccessful()) {
                          // Toast.makeText(AddHajj().this,"add successed",Toast.LENGTH_SHORT. show);
                            Intent i = new Intent(AddHajj.this, HajjFragment.class);
                            startActivity(i);
                        } else {
                            Toast.makeText(AddHajj.this, "add failed" + task1.getException().getMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                });

            }
        }


    }
}

















