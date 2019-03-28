package petwaterdispenser.cds.com.mvp;

import com.cheng.simplemvplibrary.BaseMvpActivity;
import com.cheng.simplemvplibrary.BasePresenter;
import com.cheng.simplemvplibrary.Model;
import com.cheng.simplemvplibrary.View;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 12:00
 */
public abstract class BaseActivity<M extends Model, V extends View, P extends BasePresenter> extends BaseMvpActivity<M, V, P> {
}
