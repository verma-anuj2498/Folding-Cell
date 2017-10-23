# Folding-Cell

# Uses ramotion Folding cell


<a href="https://imgflip.com/gif/1y4c57"><img src="https://i.imgflip.com/1y4c57.gif" title="made at imgflip.com"/></a>


# Requirements

Android 4.0 



# For installation 

1. add this dependency in your gradle(app) file

 `compile 'com.ramotion.foldingcell:folding-cell:1.2.1'`


2. Add `com.ramotion.foldingcell.FoldingCell` in your activity_layout.xml

`
<com.ramotion.foldingcell.FoldingCell
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/folding_cell"
    android:layout_width="match_parent"
    android:layout_height="wrap_content">
​
        <FrameLayout
            android:id="@+id/cell_content_view"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:background="@android:color/holo_green_dark"
            android:visibility="gone">
            <TextView
                android:layout_width="match_parent"
                android:layout_height="250dp" />
        </FrameLayout>
​
        <FrameLayout
            android:id="@+id/cell_title_view"
            android:layout_width="match_parent"
            android:layout_height="wrap_content">
            
          # // here you can add your own widgets but make sure not to add margin attributes in them
            
            
        </FrameLayout>
​
</com.ramotion.foldingcell.FoldingCell>

`


3. Now Come to java class

```
 final FoldingCell abc= (FoldingCell) findViewById(R.id.folding_cell);
        abc.initialize(1000, Color.LTGRAY, 2);      // instead of LTGRAY you can give color of your choice
        abc.initialize(30, 1000, Color.LTGRAY, 2);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abc.toggle(false);
            }
        });
        
        ```
