// Generated code from Butter Knife. Do not modify!
package com.example.crack_jack.movielistingapp;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Menu_ViewBinding implements Unbinder {
  private Menu target;

  private View view2131230756;

  @UiThread
  public Menu_ViewBinding(Menu target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Menu_ViewBinding(final Menu target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.btn_list, "field 'btn_list' and method 'btn'");
    target.btn_list = Utils.castView(view, R.id.btn_list, "field 'btn_list'", Button.class);
    view2131230756 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.btn(p0);
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    Menu target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.btn_list = null;

    view2131230756.setOnClickListener(null);
    view2131230756 = null;
  }
}
