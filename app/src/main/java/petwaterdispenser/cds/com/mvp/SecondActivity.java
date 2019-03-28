package petwaterdispenser.cds.com.mvp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import petwaterdispenser.cds.com.mvp.fragment.BlankFragment;
import petwaterdispenser.cds.com.mvp.fragment.BlankFragment2;
import petwaterdispenser.cds.com.mvp.fragment.BlankFragment3;

/**
 * @author WeiLi
 * @description:
 * @date :2019/3/27 14:05
 */
public class SecondActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener{

    private BlankFragment blankFragment;
    private BlankFragment2 blankFragment2;
    private BlankFragment3 blankFragment3;
    private Fragment currentFragment;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        blankFragment = new BlankFragment();
        blankFragment2 = new BlankFragment2();
        blankFragment3 = new BlankFragment3();
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.fragment, blankFragment).commit();
        currentFragment = blankFragment;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    public void button1(View view) {
        if (currentFragment != blankFragment) {
            fragmentManager.beginTransaction().hide(currentFragment).show(blankFragment).commit();
            currentFragment = blankFragment;
        }
    }

    public void button2(View view) {
        if (currentFragment != blankFragment2) {
            if (blankFragment2.isAdded()) {
                fragmentManager.beginTransaction().hide(currentFragment).show(blankFragment2).commit();
            } else {
                fragmentManager.beginTransaction().hide(currentFragment).add(R.id.fragment, blankFragment2).commit();
            }
            currentFragment = blankFragment2;
        }
    }

    public void button3(View view) {
        if (currentFragment != blankFragment3) {
            if (blankFragment3.isAdded()) {
                fragmentManager.beginTransaction().hide(currentFragment).show(blankFragment3).commit();
            } else {
                fragmentManager.beginTransaction().hide(currentFragment).add(R.id.fragment, blankFragment3).commit();
            }
            currentFragment = blankFragment3;
        }
    }

}
