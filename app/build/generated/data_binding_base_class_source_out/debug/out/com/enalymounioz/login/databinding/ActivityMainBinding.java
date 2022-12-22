// Generated by view binder compiler. Do not edit!
package com.enalymounioz.login.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.enalymounioz.login.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnLogin;

  @NonNull
  public final Button btnRegister;

  @NonNull
  public final ProgressBar prgbar;

  @NonNull
  public final TextInputEditText txtInputUsername;

  @NonNull
  public final TextInputLayout txtLayPassSignup;

  @NonNull
  public final TextInputLayout txtLayUsernameAdd;

  @NonNull
  public final TextInputEditText txtPass;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnLogin,
      @NonNull Button btnRegister, @NonNull ProgressBar prgbar,
      @NonNull TextInputEditText txtInputUsername, @NonNull TextInputLayout txtLayPassSignup,
      @NonNull TextInputLayout txtLayUsernameAdd, @NonNull TextInputEditText txtPass) {
    this.rootView = rootView;
    this.btnLogin = btnLogin;
    this.btnRegister = btnRegister;
    this.prgbar = prgbar;
    this.txtInputUsername = txtInputUsername;
    this.txtLayPassSignup = txtLayPassSignup;
    this.txtLayUsernameAdd = txtLayUsernameAdd;
    this.txtPass = txtPass;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_login;
      Button btnLogin = ViewBindings.findChildViewById(rootView, id);
      if (btnLogin == null) {
        break missingId;
      }

      id = R.id.btn_register;
      Button btnRegister = ViewBindings.findChildViewById(rootView, id);
      if (btnRegister == null) {
        break missingId;
      }

      id = R.id.prgbar;
      ProgressBar prgbar = ViewBindings.findChildViewById(rootView, id);
      if (prgbar == null) {
        break missingId;
      }

      id = R.id.txtInput_username;
      TextInputEditText txtInputUsername = ViewBindings.findChildViewById(rootView, id);
      if (txtInputUsername == null) {
        break missingId;
      }

      id = R.id.txtLay_pass_signup;
      TextInputLayout txtLayPassSignup = ViewBindings.findChildViewById(rootView, id);
      if (txtLayPassSignup == null) {
        break missingId;
      }

      id = R.id.txtLay_usernameAdd;
      TextInputLayout txtLayUsernameAdd = ViewBindings.findChildViewById(rootView, id);
      if (txtLayUsernameAdd == null) {
        break missingId;
      }

      id = R.id.txt_pass;
      TextInputEditText txtPass = ViewBindings.findChildViewById(rootView, id);
      if (txtPass == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, btnLogin, btnRegister, prgbar,
          txtInputUsername, txtLayPassSignup, txtLayUsernameAdd, txtPass);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
