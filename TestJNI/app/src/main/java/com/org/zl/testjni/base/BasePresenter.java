package com.org.zl.testjni.base;

/**
 * 作者：朱亮 on 2017/1/14 17:13
 * 邮箱：171422696@qq.com
 * ${enclosing_method}(这里用一句话描述这个方法的作用)
 */

public abstract class BasePresenter<E> {
    protected abstract void attach(E e);
    protected abstract void disAttach(E e);
}
