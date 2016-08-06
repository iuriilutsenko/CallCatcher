package com.example.yurich.callcatcher.PhoneCatcher;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.example.yurich.callcatcher.QueryProcessor.QueryProcessor;

public class PhoneCatchService extends Service {

    QueryProcessor queryProcessor;

    public PhoneCatchService(QueryProcessor queryProcessor) {
        this.queryProcessor = queryProcessor;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
