package com.lmis.app.mobile.addons.news;

import android.os.Bundle;
import android.widget.TextView;

import com.lmis.app.mobile.R;
import com.lmis.app.mobile.addons.news.News;
import com.lmis.app.mobile.support.activity.BootstrapActivity;

import butterknife.InjectView;

import static com.lmis.app.mobile.support.Constants.Extra.NEWS_ITEM;

public class NewsActivity extends BootstrapActivity {

    private News newsItem;

    @InjectView(R.id.tv_title) protected TextView title;
    @InjectView(R.id.tv_content) protected TextView content;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.news);

        if (getIntent() != null && getIntent().getExtras() != null) {
            newsItem = (News) getIntent().getExtras().getSerializable(NEWS_ITEM);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        setTitle(newsItem.getTitle());

        title.setText(newsItem.getTitle());
        content.setText(newsItem.getContent());

    }

}
