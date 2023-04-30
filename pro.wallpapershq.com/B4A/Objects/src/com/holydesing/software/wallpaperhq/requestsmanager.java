package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class requestsmanager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.requestsmanager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.requestsmanager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public com.holydesing.software.wallpaperhq.main _main = null;
public com.holydesing.software.wallpaperhq.starter _starter = null;
public com.holydesing.software.wallpaperhq.activity2 _activity2 = null;
public com.holydesing.software.wallpaperhq.themecolors _themecolors = null;
public com.holydesing.software.wallpaperhq.viewer _viewer = null;
public com.holydesing.software.wallpaperhq.b4xpages _b4xpages = null;
public com.holydesing.software.wallpaperhq.b4xcollections _b4xcollections = null;
public com.holydesing.software.wallpaperhq.httputils2service _httputils2service = null;
public com.holydesing.software.wallpaperhq.xuiviewsutils _xuiviewsutils = null;
public String  _cancelrequest(String _url,com.holydesing.software.wallpaperhq.httpjob _job) throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Public Sub CancelRequest (URL As String, Job As Ht";
 //BA.debugLineNum = 43;BA.debugLine="Log(\"Add HU2_PUBLIC is missing from the build con";
__c.LogImpl("933882146","Add HU2_PUBLIC is missing from the build configuration. Can't cancel request.",0);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 5;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
