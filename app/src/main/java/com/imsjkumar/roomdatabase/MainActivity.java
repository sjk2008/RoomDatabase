package com.imsjkumar.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.imsjkumar.roomdatabase.entityClass.UserModel;

public class MainActivity extends AppCompatActivity {
    EditText phoneEdt, nameEdt, addressEdt;
    Button saveBtn, getData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveBtn = findViewById(R.id.saveBtn);
        nameEdt = findViewById(R.id.nameEdt);
        phoneEdt = findViewById(R.id.phoneEdt);
        addressEdt = findViewById(R.id.addressEdt);
        getData = findViewById(R.id.getBtn);

        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
        getData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GetData.class);
                startActivity(intent);
            }
        });
    }

    private void saveData() {
        String name_Txt = nameEdt.getText().toString().trim();
        String phone_Txt = phoneEdt.getText().toString().trim();
        String address_Txt = addressEdt.getText().toString().trim();


        UserModel model = new UserModel();
        model.setAddress(address_Txt);
        model.setName(name_Txt);
        model.setPhoneno(phone_Txt);
        DatabaseClass.getDatabase(getApplicationContext()).getDao().insertAllData(model);

        nameEdt.setText("");
        phoneEdt.setText("");
        addressEdt.setText("");
        Toast.makeText(this, "Data saved Successful", Toast.LENGTH_SHORT).show();

    }
}