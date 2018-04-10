package com.example.awesomefat.dungeonsanddatastructures;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buildDungeon();
    }

    private void buildDungeon()
    {
        Player p = new Player("Mike");
        Room s120 = new Room("S120", "S120 Classroom");
        Room csHallway = new Room("CS Hallway", "The CS Hallway");
        Exit s120_csHallway = new Exit(s120, csHallway);

        s120.addPlayer(p);

        s120.addExit("north", s120_csHallway);
        csHallway.addExit("south", s120_csHallway);
        s120.takeExit("north");
        s120.takeExit("west");
        csHallway.takeExit("south");

        TextView description= new TextView(this);
        description.setText(csHallway.toString());

        ScrollView characters = new ScrollView(this);
        TextView charactersTV = new TextView(this);
        charactersTV.setText(s120.getPlayer.toString);
        TextView roomName = new TextView(this);
        Button east = new Button(this);
        Button west = new Button(this);
        Button south = new Button(this);
        Button north = new Button(this);



        if(roomName == 'csHallway')
        {
            north.setVisibility(View.VISIBLE);
            east.setVisibility(View.GONE);
            west.setVisibility(View.GONE);
            south.setVisibility(View.GONE);
        }


    }
}
