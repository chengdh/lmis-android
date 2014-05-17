
package com.lmis.app.mobile.support;

import android.accounts.AccountsException;
import android.app.Activity;

import com.lmis.app.mobile.auth.ApiKeyProvider;
import com.lmis.app.mobile.support.BootstrapService;
import com.lmis.app.mobile.support.provider.UserAgentProvider;

import java.io.IOException;

import javax.inject.Inject;

/**
 * Provider for a {@link com.lmis.app.mobile.support.BootstrapService} instance
 */
public class BootstrapServiceProvider {

    @Inject ApiKeyProvider keyProvider;
    @Inject UserAgentProvider userAgentProvider;

    /**
     * Get service for configured key provider
     * <p/>
     * This method gets an auth key and so it blocks and shouldn't be called on the main thread.
     *
     * @return bootstrap service
     * @throws IOException
     * @throws AccountsException
     */
    public BootstrapService getService(final Activity activity)
            throws IOException, AccountsException {
        return new BootstrapService(keyProvider.getAuthKey(activity), userAgentProvider);
    }
}
