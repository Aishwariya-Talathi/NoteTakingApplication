package edu.csulb.android.note_with_photo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class List_Activity extends AppCompatActivity {
Button button1=(Button)findViewById(R.id.Button1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(List_Activity.this, Add_Photo.class);
                startActivity(intent);
            }
        });
    }
}
