package petwaterdispenser.cds.com.mvp;


import com.cheng.simplemvplibrary.Model;

import java.util.List;

import io.reactivex.Observable;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 13:52
 */
public interface MainModel extends Model {
    /**
     * 从网络获取数据
     *
     * @return
     */
    Observable<List<User>> getDataFromNet();

    String getDataFromString();

    /**
     * 停止请求
     */
    void stopRequest();
}
