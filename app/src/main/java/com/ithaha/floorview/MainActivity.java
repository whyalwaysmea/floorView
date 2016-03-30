package com.ithaha.floorview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloorView floorsParent = (FloorView) findViewById(R.id.floors_parent);

        ArrayList<Comment> commentArrayList = new ArrayList<>();
        commentArrayList.add(new Comment("heihei", "嘿嘿嘿，我是评论2", 2));
        commentArrayList.add(new Comment("haha", "哈哈哈，我是评论1", 1));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论3", 3));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论4", 4));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论5", 5));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论6", 6));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论7", 7));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论8", 8));
        commentArrayList.add(new Comment("wowo", "喔喔喔，我是评论9", 9));


        Collections.sort(commentArrayList);

        SubComments subComments = new SubComments(commentArrayList);
        floorsParent.setComments(subComments);
        floorsParent.setFactory(new SubFloorFactory());
        floorsParent.setBoundDrawer(getResources().getDrawable(R.drawable.bg_comment));
        floorsParent.init();

    }


}
