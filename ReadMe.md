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
15. Add the following XML snippet:
        <string name="quote_bang">Bazinga!</string>
        <string name="quote_seinfeld">Hello Neuman</string>
        <string name="quote_friends">How you Doin?</string>
        <string name="quote_mother">Suit Up!</string>
16. Expand the Res Folder in the Project View, then expand the layouts folder
17. Open activity_main.xml
18. Change "android.support.constraint.ConstraintLayout" to "RelativeLayout"
19. Delete the entire TextView element
20. Add the following XML Snippet inside the RelativeLayout