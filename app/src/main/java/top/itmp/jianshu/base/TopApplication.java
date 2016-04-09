package top.itmp.jianshu.base;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by hz on 2016/4/5.
 */
public class TopApplication extends Application {
    private static Context mContext;
    private RefWatcher mRefWatcher;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;

       mRefWatcher = LeakCanary.install(this);
    }

    public static Context getmContext(){
        return mContext;
    }

    public static RefWatcher getRefWatcher(Context context){
        TopApplication application = (TopApplication) context.getApplicationContext();
        return application.mRefWatcher;
    }

}
