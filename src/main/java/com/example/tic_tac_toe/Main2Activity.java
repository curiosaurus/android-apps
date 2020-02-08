package com.example.tic_tac_toe;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
public class Main2Activity extends AppCompatActivity {
    EditText player1;
    EditText player2;
    Button button_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        player1 = findViewById(R.id.Player1name);
        player2 = findViewById(R.id.Player2name);
        button_start = findViewById(R.id.button_start);
        button_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  player1_name = player1.getText().toString();
                String  player2_name = player2.getText().toString();
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                intent.putExtra("P1_Name",player1_name);
                intent.putExtra("P2_Name",player2_name);
                startActivity(intent);
            }
        });
    }
}