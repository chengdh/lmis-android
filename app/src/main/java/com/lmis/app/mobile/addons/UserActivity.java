package com.lmis.app.mobile.addons;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.lmis.app.mobile.R;
import com.lmis.app.mobile.support.User;
import com.lmis.app.mobile.support.activity.BootstrapActivity;
import com.squareup.picasso.Picasso;

import butterknife.InjectView;

import static com.lmis.app.mobile.support.Constants.Extra.USER;

public class UserActivity extends BootstrapActivity {

    @InjectView(R.id.iv_avatar) protected ImageView avatar;
    @InjectView(R.id.tv_name) protected TextView name;

    private User user;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.user_view);

        if (getIntent() != null && getIntent().getExtras() != null) {
            user = (User) getIntent().getExtras().getSerializable(USER);
        }

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Picasso.with(this).load(user.getAvatarUrl())
                .placeholder(R.drawable.gravatar_icon)
                .into(avatar);

        name.setText(String.format("%s %s", user.getFirstName(), user.getLastName()));

    }


}
