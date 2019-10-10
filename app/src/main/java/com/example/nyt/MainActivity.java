package com.example.nyt;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Not needed here anymore
//    private ImageView bookmarkButton1;
//    private ImageView bookmarkButton2;
//    private ImageView shareButton1;
//    private ImageView shareButton2;
//    private TextView headline1;
//    private TextView headline2;
//    private TextView details1;
//    private TextView details2;
//    boolean button1State = false;
//    boolean button2State = false;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ArticleAdapter articleAdapter = new ArticleAdapter();

        // We wrote our setData method to be like a setter, so we give our ArrayList from
        // FakeDatabase to the Adapter.
        articleAdapter.setData(FakeDatabase.getAllArticles());
        recyclerView.setAdapter(articleAdapter);

        // We don't need any of this stuff below here anymore
        // We've automated it by writing our custom Adapter
        // Look at the code in ArticleAdapter onBindViewHolder, and compare it what we used to have
        // here.

//        ConstraintLayout article1 = findViewById(R.id.article1);
//        ConstraintLayout article2 = findViewById(R.id.article2);
//
//        headline1 = article1.findViewById(R.id.newsHeadline);
//        headline2 = article2.findViewById(R.id.newsHeadline);
//        details1 = article1.findViewById(R.id.newsDetails);
//        details2 = article2.findViewById(R.id.newsDetails);
//
//        bookmarkButton1 = article1.findViewById(R.id.newsSaveButton);
//        bookmarkButton2 = article2.findViewById(R.id.newsSaveButton);
//
//        shareButton1 = article1.findViewById(R.id.newsShareButton);
//        shareButton2 = article2.findViewById(R.id.newsShareButton);
//
//
//        // Getting objects from the FakeDatabase and filling in the TextViews with data
//        final Article articleObject1 = FakeDatabase.getArticleById(4);
//        final Article articleObject2 = FakeDatabase.getArticleById(3);
//        articleObject1.setImageDrawableId(R.drawable.news_headline_photo); // don't worry about images for now
//        articleObject2.setImageDrawableId(R.drawable.news_headline_photo);
//
//        headline1.setText(articleObject1.getHeadline());
//        headline2.setText(articleObject2.getHeadline());
//
//        details1.setText(articleObject1.getSummary());
//        details2.setText(articleObject2.getSummary());
//
//        // Clicking on the article to go to detail activity
//        article1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ArticleDetailActivity.class);
//                intent.putExtra("ArticleID", articleObject1.getArticleID());
//                startActivity(intent);
//            }
//        });
//
//        article2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getApplicationContext(), ArticleDetailActivity.class);
//                intent.putExtra("ArticleID", articleObject2.getArticleID());
//                startActivity(intent);
//            }
//        });
//
//        // Bookmark buttons
//        bookmarkButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Click1 Registered", Toast.LENGTH_SHORT).show();
//                if(!button1State) {
//                    bookmarkButton1.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                } else {
//                    bookmarkButton1.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                }
//
//                button1State = !button1State;
//            }
//        });
//
//        bookmarkButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "Click2 Registered", Toast.LENGTH_SHORT).show();
//                if(!button2State) {
//                    bookmarkButton2.setImageResource(R.drawable.ic_bookmark_black_24dp);
//                } else {
//                    bookmarkButton2.setImageResource(R.drawable.ic_bookmark_border_black_24dp);
//                }
//
//                button2State = !button2State;
//            }
//        });
//
//        // Share button implicit intents
//        shareButton1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                intent.putExtra(Intent.EXTRA_TEXT, articleObject1.getHeadline());
//                intent.setType("text/plain");
//                startActivity(intent);
//            }
//        });
//
//        shareButton2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Intent.ACTION_SEND);
//
//                intent.putExtra(Intent.EXTRA_TEXT, articleObject2.getHeadline());
//                intent.setType("text/plain");
//                startActivity(intent);
//            }
//        });

    }
}
