package petwaterdispenser.cds.com.mvp.fragment;

import android.util.Log;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 14:26
 */
public class BlackModelImpl implements BlackModel {
    @Override
    public String getDataFromHWW() {
        return "data from net";
    }

    @Override
    public void stopRequest() {
        Log.i("model-stopped", "BlackModelImpl stop request...");
    }
}
