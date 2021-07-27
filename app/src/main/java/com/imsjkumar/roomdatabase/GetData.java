package com.imsjkumar.roomdatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.imsjkumar.roomdatabase.adapter.UserAdapter;

public class GetData extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get);
        recyclerView = findViewById(R.id.recyclerView);

        getData();

    }

    private void getData() {
        recyclerView.setAdapter(new UserAdapter(getApplicationContext(),
                DatabaseClass.getDatabase(getApplicationContext()).getDao().getAllData()));
    }
}