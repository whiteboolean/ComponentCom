package com.frame.myapplication.component;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.billy.cc.core.component.CCUtil;
import com.billy.cc.core.component.IComponent;
import com.frame.myapplication.MainActivity;

public class LifecycleComponent implements IComponent {
    @Override
    public String getName() {
        return "lifecycleComponent";
    }

    @Override
    public boolean onCall(CC cc) {

        String actionName = cc.getActionName();
        switch (actionName){
            case "MainActivity":
                CCUtil.navigateTo(cc, MainActivity.class);
                CC.sendCCResult(cc.getCallId(), CCResult.success());
                return false;
            default:
                CC.sendCCResult(cc.getCallId(), CCResult.errorUnsupportedActionName());
                return false;
        }

    }
}
