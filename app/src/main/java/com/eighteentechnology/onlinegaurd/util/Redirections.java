package com.eighteentechnology.onlinegaurd.util;

import android.app.Activity;
import android.content.Intent;

import com.eighteentechnology.onlinegaurd.R;
import com.eighteentechnology.onlinegaurd.activity.VisitorActivity;
import com.eighteentechnology.onlinegaurd.activity.VisitorDetailActivity;
import com.eighteentechnology.onlinegaurd.activity.VisitorBadgeActivity;


public class Redirections {

	
	
	
//	public static void redirectToMessageDetails(Activity redirectFromActivity) {
//		Intent redirectMe = new Intent(redirectFromActivity, MessageDetails.class);
//
//		redirectFromActivity.startActivity(redirectMe);
//		redirectFromActivity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//
//	}
	
	
	public static void redirectToVisitorFormActivity(Activity redirectFromActivity) {
		Intent redirectMe = new Intent(redirectFromActivity, VisitorActivity.class);

		redirectFromActivity.startActivity(redirectMe);
		redirectFromActivity.overridePendingTransition(R.anim.slide_in_left,
				R.anim.slide_out_right);

	}
	
	
	
	
//	public static void redirectToForgotPassword(Activity redirectFromActivity) {
//		Intent redirectMe = new Intent(redirectFromActivity, ForgetPassword.class);
//
//		redirectFromActivity.startActivity(redirectMe);
//		redirectFromActivity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//
//	}
	

//	public static void redirectToLogin(Activity registerActivity) {
//
//
//		Intent redirectMe = new Intent(registerActivity, LoginActivity.class);
//
//		registerActivity.startActivity(redirectMe);
//		registerActivity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//
//	}

//	public static void redirectToRegister(Activity loginActivity,String ToActivate) {
//		// TODO Auto-generated method stub
//
//
//
//		Intent redirectMe = new Intent(loginActivity, Register.class);
//		redirectMe.putExtra("ToActivate",ToActivate);
//		loginActivity.startActivity(redirectMe);
//		loginActivity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//	}

	public static void redirectToVisitorDetail(Activity activity) {
		// TODO Auto-generated method stub
		Intent redirectMe = new Intent(activity, VisitorDetailActivity.class);

		activity.startActivity(redirectMe);
		activity.overridePendingTransition(R.anim.slide_in_left,
				R.anim.slide_out_right);
	}

	public static void redirectToBadgeActivity(Activity activity) {
		// TODO Auto-generated method stub
		Intent redirectMe = new Intent(activity, VisitorBadgeActivity.class);

		activity.startActivity(redirectMe);
		activity.overridePendingTransition(R.anim.slide_in_left,
				R.anim.slide_out_right);
	}
	
	
//	public static void redirectToReplyMessage(Activity activity) {
//		// TODO Auto-generated method stub
//		Intent redirectMe = new Intent(activity, MessageReply.class);
//
//		activity.startActivity(redirectMe);
//		activity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//	}

//	public static void redirectToProductDetails(Activity activity) {
//		// TODO Auto-generated method stub
//		Intent redirectMe = new Intent(activity, ProductDetails.class);
//
//		activity.startActivity(redirectMe);
//		activity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//	}

	

//	public static void redirectToSendMessage(Activity activity) {
//		// TODO Auto-generated method stub
//		Intent redirectMe = new Intent(activity, SendMessage.class);
//
//		activity.startActivity(redirectMe);
//		activity.overridePendingTransition(R.anim.slide_in_left,
//				R.anim.slide_out_right);
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
