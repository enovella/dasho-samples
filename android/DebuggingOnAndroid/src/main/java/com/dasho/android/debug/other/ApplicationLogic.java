/* Copyright 2018 PreEmptive Solutions, LLC. All Rights Reserved.
 *
 * This source is subject to the Microsoft Public License (MS-PL).
 * Please see the LICENSE.txt file for more information.
 */
package com.dasho.android.debug.other;

import android.content.Context;

/**
 * This class could contain some business logic.
 * It is used for the Debug Check.
 */
public class ApplicationLogic {

    private boolean myBoolean = false;
    private static boolean usingDashO=false;//Used to verify DashO has been run correctly.
    private Context context;

    public ApplicationLogic(Context context) {
        this.context = context;
    }

    /**
     * This could be some logic run during application initialization or at some
     * other time.
     *
     * @return A variable which will ultimately be set by the debug detection.
     */
    public boolean someApplicationLogic() {
        return myBoolean;
    }



    private void setupVars(boolean b) {
        usingDashO=true;
        myBoolean=b;
    }

    /**
     * DebugDetection requires this method.
     *
     * @return The original application's context.
     */
    public Context getApplicationContext() {
        return context;
    }

    public static boolean usingDashO() {
        return usingDashO;
    }

}