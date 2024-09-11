package com.example.myapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private CustomCircleView customCircleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customCircleView = findViewById(R.id.customCircleView);
        customCircleView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showColorSelectionDialog();
            }
        });
    }

    private void showColorSelectionDialog() {
        final String[] colors = {"Vermelho", "Verde", "Azul"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecione cor");
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        customCircleView.setCircleColor(Color.RED);
                        break;
                    case 1:
                        customCircleView.setCircleColor(Color.GREEN);
                        break;
                    case 2:
                        customCircleView.setCircleColor(Color.BLUE);
                        break;
                }
            }
        });
        builder.show();
    }
}
