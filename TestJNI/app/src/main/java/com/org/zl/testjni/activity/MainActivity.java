package com.org.zl.testjni.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.org.zl.testjni.R;
import com.org.zl.testjni.base.BaseActivity;
import com.org.zl.testjni.presenter.MainPresenter;
import com.org.zl.testjni.view.MianCallBack;

public class MainActivity extends BaseActivity implements MianCallBack ,TextWatcher , AdapterView.OnItemSelectedListener{
    private TextView textEnd;
    private EditText firstText,secondText;
    private Spinner spinner;
    private MainPresenter presenter;
    private int position = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter();
        presenter.attach(this);
        initControls();//初始化控件
    }

    @Override
    public void textChange(int num) {
        if(textEnd == null){
            return;
        }
        textEnd.setText(""+num);
    }

    private void initControls() {
        textEnd = (TextView) findViewById(R.id.end);
        firstText = (EditText) findViewById(R.id.first);firstText.addTextChangedListener(this);
        secondText = (EditText) findViewById(R.id.second);secondText.addTextChangedListener(this);
        spinner = (Spinner) findViewById(R.id.spinner);spinner.setOnItemSelectedListener(this);
    }
    //如果运算符号发生了改变
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        this.position = position;
        toPresenter();
    }

    @Override//如果输入框的数值发生了改变
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        toPresenter();
    }
    //推送给Presenter数据处理
    private void toPresenter(){
        if(TextUtils.isEmpty(firstText.getText().toString()) || TextUtils.isEmpty(secondText.getText().toString())){
            return;
        }
        if(secondText.getText().toString().equals("0")){
            return;
        }
        int i = Integer.parseInt(firstText.getText().toString());
        int j = Integer.parseInt(secondText.getText().toString());
        presenter.TextSet(i,j,position);
    }
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
    @Override
    public void afterTextChanged(Editable s) {}
    @Override
    public void onNothingSelected(AdapterView<?> parent) {}
}
