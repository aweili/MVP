package petwaterdispenser.cds.com.mvp.fragment;

import com.cheng.simplemvplibrary.BaseMvpFragment;
import com.cheng.simplemvplibrary.BasePresenter;
import com.cheng.simplemvplibrary.Model;
import com.cheng.simplemvplibrary.View;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 14:11
 */
public abstract class BaseFragment<M extends Model, V extends View, P extends BasePresenter> extends BaseMvpFragment<M, V, P> {
}
