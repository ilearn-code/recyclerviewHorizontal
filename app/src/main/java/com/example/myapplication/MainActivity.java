package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Recycler View objects
    RecyclerView recyclerView;
    RecyclerView recyclerView2;
    RecyclerView recyclerView3;

    // Array list for recycler view data source
    ArrayList<String> source;

    // Layout Managers
    RecyclerView.LayoutManager RecyclerViewLayoutManager;
    RecyclerView.LayoutManager RecyclerViewLayoutManager2;
    RecyclerView.LayoutManager RecyclerViewLayoutManager3;

    // Adapter classes objects
    adapter2 adapter;
    adapter2 adapter2;
    adapter2 adapter3;

    // Linear Layout Managers
    LinearLayoutManager HorizontalLayout;
    LinearLayoutManager HorizontalLayout2;
    LinearLayoutManager HorizontalLayout3;

    View ChildView;
    int RecyclerViewItemPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
        recyclerView2 = findViewById(R.id.recyclerview2);
        recyclerView3 = findViewById(R.id.recyclerview3);

        recyclerView.setPadding(40, 0, 140, 0);
        recyclerView2.setPadding(40, 0, 140, 0);
        recyclerView3.setPadding(40, 0, 140, 0);

        // Set Layout Managers on Recycler Views
        RecyclerViewLayoutManager = new LinearLayoutManager(getApplicationContext());
        RecyclerViewLayoutManager2 = new LinearLayoutManager(getApplicationContext());
        RecyclerViewLayoutManager3 = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(RecyclerViewLayoutManager);
        recyclerView2.setLayoutManager(RecyclerViewLayoutManager2);
        recyclerView3.setLayoutManager(RecyclerViewLayoutManager3);

        // Adding items to RecyclerView ArrayList
        AddItemsToRecyclerViewArrayList();

        // Creating Adapters
        adapter = new adapter2(source);
        adapter2 = new adapter2(source);
        adapter3 = new adapter2(source);

        // Set Horizontal Layout Managers for Recycler Views
        HorizontalLayout = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        HorizontalLayout2 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);
        HorizontalLayout3 = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.HORIZONTAL, false);

        recyclerView.setLayoutManager(HorizontalLayout);
        recyclerView2.setLayoutManager(HorizontalLayout2);
        recyclerView3.setLayoutManager(HorizontalLayout3);

        // Set Adapters on Recycler Views
        recyclerView.setAdapter(adapter);
        recyclerView2.setAdapter(adapter2);
        recyclerView3.setAdapter(adapter3);
    }

    // Function to add items in RecyclerView.
    public void AddItemsToRecyclerViewArrayList()
    {
        // Adding items to ArrayList
        source = new ArrayList<>();
        source.add("gfg");
        source.add("is");
        source.add("best");
        source.add("site");
        source.add("for");
        source.add("interview");
        source.add("preparation");
    }
}
