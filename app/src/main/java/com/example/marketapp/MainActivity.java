package com.example.marketapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{
    //AdapterView
    RecyclerView recyclerView;
//Data source
    List<Item> itemList;
    //Adapter
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView =findViewById(R.id.recyclerView);

        itemList=new ArrayList<>();
        Item item1=new Item(R.drawable.fruits,"Fruits","Fresh Fruits from the Garden");
        Item item2=new Item(R.drawable.vegetable,"Vegetables","Healthy Vegetables");
        Item item3=new Item(R.drawable.bread,"Bakery","Bread,Wheat and Beans");
        Item item4=new Item(R.drawable.beverages,"Beverage","Juice ,Tea ,Coffee and Soda");
        Item item5=new Item(R.drawable.milk,"Milk","Milk, Shakes and Yogurt");
        Item item6=new Item(R.drawable.popcorns,"Snacks","PopCorn ,Donut and Drinks");

        itemList.add(item1);
        itemList.add(item2);
        itemList.add(item3);
        itemList.add(item4);
        itemList.add(item5);
        itemList.add(item6);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        myAdapter =new MyAdapter(itemList);
        recyclerView.setAdapter(myAdapter);
        myAdapter.setClickListener(this);
        }

    @Override
    public void onCLick(View v, int pos) {
        Toast.makeText(this,
                "You Choose: "+itemList.get(pos).getItemName(), Toast.LENGTH_SHORT).show();


    }
}
