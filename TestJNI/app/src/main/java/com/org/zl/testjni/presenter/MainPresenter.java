package com.org.zl.testjni.presenter;

import android.content.Context;

import com.org.zl.testjni.JNI.MyJNI;
import com.org.zl.testjni.base.BasePresenter;
import com.org.zl.testjni.view.MianCallBack;

/**
 * 作者：朱亮 on 2017/1/14 17:12
 * 邮箱：171422696@qq.com
 * ${enclosing_method}(这里用一句话描述这个方法的作用)
 */

public class MainPresenter extends BasePresenter<MianCallBack> {
    private Context context;
    private MianCallBack back;
    public void MainPresenter(Context context){
        this.context = context;
    }
    @Override
    public void attach(MianCallBack back) {
        this.back = back;
    }
    @Override
    public void disAttach(MianCallBack back) {    }
    public void TextSet(int i,int j,int position){
        int num = 0;
        switch (position){
            case 0: //" 加 "
               num =  MyJNI.add(i,j);
                break;
            case 1://" 减 "
                num = MyJNI.subtract(i,j);
                break;
            case 2://" 乘 "
                num = MyJNI.multiply(i,j);
                break;
            case 3://" 除 "
                num =  MyJNI.divide(i,j);
                break;
        }
        back.textChange(num);
    }

}

