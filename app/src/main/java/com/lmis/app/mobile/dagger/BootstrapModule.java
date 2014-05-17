package com.lmis.app.mobile.dagger;

import android.accounts.AccountManager;
import android.content.Context;

import com.lmis.app.mobile.base.login.BootstrapAuthenticatorActivity;
import com.lmis.app.mobile.auth.LogoutService;
import com.lmis.app.mobile.addons.timer.TimerService;
import com.lmis.app.mobile.addons.BootstrapTimerActivity;
import com.lmis.app.mobile.support.activity.MainActivity;
import com.lmis.app.mobile.addons.checkin.CheckInsListFragment;
import com.lmis.app.mobile.support.fragment.NavigationDrawerFragment;
import com.lmis.app.mobile.addons.news.NewsActivity;
import com.lmis.app.mobile.addons.news.NewsListFragment;
import com.lmis.app.mobile.addons.UserActivity;
import com.lmis.app.mobile.addons.UserListFragment;
import com.squareup.otto.Bus;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Dagger module for setting up provides statements.
 * Register all of your entry points below.
 */
@Module(
        complete = false,

        injects = {
                BootstrapApplication.class,
                BootstrapAuthenticatorActivity.class,
                MainActivity.class,
                BootstrapTimerActivity.class,
                CheckInsListFragment.class,
                NavigationDrawerFragment.class,
                NewsActivity.class,
                NewsListFragment.class,
                UserActivity.class,
                UserListFragment.class,
                TimerService.class
        }
)
public class BootstrapModule {

    @Singleton
    @Provides
    Bus provideOttoBus() {
        return new Bus();
    }

    @Provides
    @Singleton
    LogoutService provideLogoutService(final Context context, final AccountManager accountManager) {
        return new LogoutService(context, accountManager);
    }

}
