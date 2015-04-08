package com.airsystem.sample.git.app;

import com.airsystem.sample.git.app.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author Budi Oktaviyan Suryanto (budi.oktaviyan@icloud.com)
 */
public class MainActivity extends Activity implements OnClickListener {
	private TextView mTextView;
	private Button mButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btn_submit: {
			if (!TextUtils.isEmpty(mTextView.getText())) {
				Toast.makeText(this, mTextView.getText(), Toast.LENGTH_SHORT).show();
			}
			break;
		}
		}
	}

	private void initView() {
		mTextView = (TextView) findViewById(R.id.et_text);
		mButton = (Button) findViewById(R.id.btn_submit);
		mTextView.setOnClickListener(this);
		mButton.setOnClickListener(this);
	}
}