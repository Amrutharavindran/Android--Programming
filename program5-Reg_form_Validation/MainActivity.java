package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fName, lName, password;
    RadioButton male, female;
    Button submit;
    RadioGroup genderGrp;
    Switch newMem;
    CheckBox check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fName=findViewById(R.id.fname);
        lName=findViewById(R.id.n2);
        male=findViewById(R.id.male);
        female=findViewById(R.id.female);
        submit=findViewById(R.id.button);
        genderGrp=findViewById(R.id.grp);
        newMem=findViewById(R.id.switch1);
        check=findViewById(R.id.checkBox);
        password=findViewById(R.id.pwd);
    }

    public void submit(View view) {
        if (validate()){
            Toast.makeText(MainActivity.this, "Registraton successfull", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "some data is invalid", Toast.LENGTH_SHORT).show();
        }

    }


    public boolean validate() {
        boolean isValid = false;
        String firstname,lastname;
        firstname=fName.getText().toString();
        lastname=lName.getText().toString();

        if (firstname.equals("")) {
            Toast.makeText(this, "First name is empty", Toast.LENGTH_SHORT).show();
        } else if (lastname.equals("")) {
            Toast.makeText(this, "Last  name is empty", Toast.LENGTH_SHORT).show();
        } else if (!male.isChecked() && !female.isChecked()) {
            Toast.makeText(this, "Please choose gender", Toast.LENGTH_SHORT).show();
        } else if (password.length() < 6) {
            Toast.makeText(this, "Password must have at least 6 letters", Toast.LENGTH_SHORT).show();
        } else if (!newMem.isChecked()) {
            Toast.makeText(this, "New user", Toast.LENGTH_SHORT).show();
        } else if (!check.isChecked()) {
            Toast.makeText(this, "Please agree to the terms and conditions", Toast.LENGTH_SHORT).show();
        } else {
            isValid = true;
        }
        return isValid;
    }
}