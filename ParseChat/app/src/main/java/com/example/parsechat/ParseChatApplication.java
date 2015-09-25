package com.example.parsechat;

import android.app.Application;

import com.parse.Parse;

public class ParseChatApplication extends Application{

	@Override
	public void onCreate() {
		super.onCreate();
		// Enable Local Datastore.
		Parse.enableLocalDatastore(this);
		Parse.initialize(this, "h3sFu47kpX6UOPtyfPT5zLAeeEaG3vBx35dNMTx3", "TvxM9Sbm5kEYm1gkFzsjZ7ZeMOJCbSRrCpQAKj89");

	}
}
