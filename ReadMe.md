# Introduction to Android

## Create and Run a Simple App
 1. Open Android Studio
 2. Start A New Android Studio Project
 3. Name it "Hello"
 4. Change the domain to ladev.com
 5. Change the location as you wish
 6. Next
 7. Choose the defaults for Target Android Devices (Phone and Tablet Only)
 8. Next
 9. Choose an Empty Activity
10. Next
11. Leave the defaults
12. Next
13. Finish (Wait)
14. Expand the Res Folder in the Project View, then expand the Layouts folder
15. Open activity_main.xml
16. Click the Hello World TextView
17. In the Properties Pane, change the text to something different.
18. In the main Toolbar, click the Run button

## Create the Catch Phrase App
 1. Open Android Studio
 2. Start A New Android Studio Project
 3. Name it "CatchPhrase" (no spaces)
 4. Change the domain to ladev.com
 5. Change the location as you wish
 6. Next
 7. Choose the defaults for Target Android Devices (Phone and Tablet Only)
 8. Next
 9. Choose an Empty Activity
10. Next
11. Leave the defaults
12. Next
13. Finish (Wait)
14. Expand the Res Folder in the Project View, then expand the values folder
15. Open strings.xml
16. Add the following XML snippet:

        <string name="quote_bang">Bazinga!</string>
        <string name="quote_seinfeld">Hello Neuman</string>
        <string name="quote_friends">How you Doin?</string>
        <string name="quote_mother">Suit Up!</string>
        
17. Expand the Res Folder in the Project View, then expand the layouts folder
18. Open activity_main.xml
19. Change "android.support.constraint.ConstraintLayout" to "RelativeLayout"
20. Delete the entire TextView element
21. Add the following XML Snippet inside the RelativeLayout

        <Button
            android:id="@+id/bang"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="60dp"
            android:layout_marginTop="100dp"
            android:text="@string/quote_bang"/>
        <Button
            android:id="@+id/friend"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignTop="@id/bang"
            android:layout_toRightOf="@id/bang"
            android:layout_marginLeft="50dp"
            android:text="@string/quote_friends"/>
        <Button
            android:id="@+id/mother"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_alignLeft="@id/bang"
            android:layout_below="@id/bang"
            android:layout_marginTop="50dp"
            android:text="@string/quote_mother"/>
        <Button
            android:id="@+id/seinfeld"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginLeft="50dp"
            android:layout_toRightOf="@id/bang"
            android:layout_below="@id/bang"
            android:layout_marginTop="50dp"
            android:text="@string/quote_seinfeld"/>

22. Right-Click the com.ladev.catchphrase package in the Project pane
23. Add a new Empty Activity
24. Name it Display
25. Finish
26. Open activity_display.xml
27. Change "android.support.constraint.ConstraintLayout" to "RelativeLayout"
28. Add a TextView

	    <TextView
            android:id="@+id/phrase"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerHorizontal="true"
            android:layout_centerVertical="true"
            android:textSize="36sp"/>

29. Open MainActivity.java
30. Create a private inner class for handling button taps

        private class ButtonListener implements View.OnClickListener {
            @Override
            public void onClick(View v) {
        
                Button button = (Button) v;
        
                String phrase = button.getText().toString();
        
                Intent displayIntent = new Intent(MainActivity.this, Display.class);
                displayIntent.putExtra("phrase", phrase);
                startActivity(displayIntent);
            }
        }

31. Wire up each button to an instance of the ButtonListener class in the onCreate method below the layout inflation:

        Button bangButton = (Button) findViewById(R.id.bang);
        bangButton.setOnClickListener(new ButtonListener());

        Button friendButton = (Button) findViewById(R.id.friend);
        friendButton.setOnClickListener(new ButtonListener());

        Button seinfeldButton = (Button) findViewById(R.id.seinfeld);
        seinfeldButton.setOnClickListener(new ButtonListener());

        Button motherButton = (Button) findViewById(R.id.mother);
        motherButton.setOnClickListener(new ButtonListener());
        
32. Open Display.java
33. Retrieve the data from the intent and load it into the TextView

        Intent intent = getIntent();

        String phrase = intent.getStringExtra("phrase");

        TextView display = (TextView) findViewById(R.id.phrase);
        display.setText(phrase);
        
34. Try the app in the emulator or device