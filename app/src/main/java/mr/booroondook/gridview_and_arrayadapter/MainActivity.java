package mr.booroondook.gridview_and_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private String[] lastNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lastNames = getResources().getStringArray(R.array.last_names);
        textView = findViewById(R.id.text_view);
        GridView gridView = findViewById(R.id.grid_view);

        gridView.setAdapter(new ArrayAdapter<>(this, R.layout.grid_cell, lastNames));
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(lastNames[position]);
            }
        });
    }
}
