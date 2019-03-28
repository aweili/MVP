package petwaterdispenser.cds.com.mvp.fragment;

import android.util.Log;

import com.cheng.simplemvplibrary.BasePresenter;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 14:08
 */
public class BlackPresenter extends BasePresenter<BlackModel, BlackView> {
    @Override
    protected void onViewDestroy() {
        Log.i("view-uninstall", "SecondActivity finished");
        if (model != null) {
            model.stopRequest();
        }
    }

    public void getData() {
        String dataFromNet = null;
        if (model != null) {
            dataFromNet = model.getDataFromHWW();
        }
        if (getView() != null) {
            getView().setTextData(dataFromNet);
            Log.i("data=",dataFromNet);
        }
    }
}
