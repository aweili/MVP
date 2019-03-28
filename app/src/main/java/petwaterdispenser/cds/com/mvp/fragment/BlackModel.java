package petwaterdispenser.cds.com.mvp.fragment;

import com.cheng.simplemvplibrary.Model;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 14:07
 */
public interface BlackModel extends Model {
    String getDataFromHWW();

    void stopRequest();
}
