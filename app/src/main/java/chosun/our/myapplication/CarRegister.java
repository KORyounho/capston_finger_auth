package chosun.our.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CarRegister extends AppCompatActivity {
    EditText car_num, car_nick, car_option;
    Spinner car_name;
    Button btn_car_register;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference mDatabase = database.getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_register);
        car_num = findViewById(R.id.Car_number);
        car_nick = findViewById(R.id.Car_nickname);
        car_option = findViewById(R.id.Car_option);
        car_name = findViewById(R.id.cartype);
        btn_car_register = findViewById(R.id.carregister);
        btn_car_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //로그인한 id 받아와서 AddCar() 만들기
            }
        });
    }
}