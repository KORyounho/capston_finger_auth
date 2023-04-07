package chosun.our.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ReginsterActivity extends AppCompatActivity {
    private EditText et_id, et_email, et_pass, et_age,  et_name, et_phonenumber;
    private RadioGroup gender_group;
    private RadioButton radio_gender;
    private Spinner spinner_usertype;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabase = database.getReference();
    Button btn_register;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reginster);
        et_id = findViewById(R.id.id_user);
        et_email = findViewById(R.id.emailTexT);
        et_pass = findViewById(R.id.id_pass);
        et_age = findViewById(R.id.id_age);
        et_phonenumber = findViewById(R.id.id_phone_number);
        et_name = findViewById(R.id.id_name);

        spinner_usertype = findViewById(R.id.User_Type);
        gender_group = findViewById(R.id.genderGroup);
        radio_gender = findViewById(gender_group.getCheckedRadioButtonId());

        btn_register = (Button)findViewById(R.id.memregister);
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReginsterActivity.this, License_register.class);
                Member member = new Member(
                        et_id.getText().toString(),
                        et_email.getText().toString(),
                        et_pass.getText().toString(),
                        et_name.getText().toString(),
                        et_age.getText().toString(),
                        radio_gender.getText().toString(),
                        spinner_usertype.getSelectedItem().toString(),
                        et_phonenumber.getText().toString());

                mDatabase.child("User").child(et_id.getText().toString()).setValue(member);
                startActivity(intent);

            }
        });
    }
    public void
}