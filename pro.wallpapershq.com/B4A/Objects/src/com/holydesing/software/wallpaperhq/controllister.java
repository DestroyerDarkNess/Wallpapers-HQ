package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class controllister extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.controllister");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.controllister.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public int _locationx = 0;
public int _locationy = 0;
public int _separationx = 0;
public int _separationy = 0;
public int _xsizecupon = 0;
public int _ysizecupon = 0;
public int _margenp_x = 0;
public int _margenp_y = 0;
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
public String  _add(anywheresoftware.b4a.objects.ScrollViewWrapper _containercontrol,anywheresoftware.b4a.objects.ConcreteViewWrapper _controlex,boolean _limitedlocation) throws Exception{
anywheresoftware.b4a.objects.ConcreteViewWrapper _thelastcontrol = null;
int _newpostx = 0;
int _newposty = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public Sub Add( ContainerControl As ScrollView, Co";
 //BA.debugLineNum = 24;BA.debugLine="If Not (ContainerControl = Null) Then";
if (__c.Not(_containercontrol== null)) { 
 //BA.debugLineNum = 25;BA.debugLine="ControlEx.Visible = False";
_controlex.setVisible(__c.False);
 //BA.debugLineNum = 27;BA.debugLine="Dim TheLastControl As View = GetLastView(Contain";
_thelastcontrol = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
_thelastcontrol = _getlastview(_containercontrol);
 //BA.debugLineNum = 33;BA.debugLine="If TheLastControl.IsInitialized = False Then ' T";
if (_thelastcontrol.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 44;BA.debugLine="ContainerControl.Panel.AddView(ControlEx, Marge";
_containercontrol.getPanel().AddView((android.view.View)(_controlex.getObject()),_margenp_x,_margenp_y,_controlex.getWidth(),_controlex.getHeight());
 //BA.debugLineNum = 50;BA.debugLine="XSizeCupon = ContainerControl.Width - (MargenP_";
_xsizecupon = (int) (_containercontrol.getWidth()-(_margenp_x+_controlex.getWidth()));
 //BA.debugLineNum = 51;BA.debugLine="YSizeCupon = ContainerControl.Height - (MargenP";
_ysizecupon = (int) (_containercontrol.getHeight()-(_margenp_y+_controlex.getHeight()));
 }else {
 //BA.debugLineNum = 55;BA.debugLine="Dim NewPostX As Int = 0";
_newpostx = (int) (0);
 //BA.debugLineNum = 56;BA.debugLine="Dim NewPostY As Int = 0";
_newposty = (int) (0);
 //BA.debugLineNum = 58;BA.debugLine="If LimitedLocation = False Then '";
if (_limitedlocation==__c.False) { 
 //BA.debugLineNum = 60;BA.debugLine="NewPostX = TheLastControl.Left + TheLastContr";
_newpostx = (int) (_thelastcontrol.getLeft()+_thelastcontrol.getWidth()+_separationx);
 //BA.debugLineNum = 61;BA.debugLine="NewPostY = TheLastControl.Top";
_newposty = _thelastcontrol.getTop();
 }else {
 //BA.debugLineNum = 65;BA.debugLine="If XSizeCupon >= (ControlEx.Width + Separatio";
if (_xsizecupon>=(_controlex.getWidth()+_separationx)) { 
 //BA.debugLineNum = 67;BA.debugLine="NewPostX = TheLastControl.Left + TheLastContr";
_newpostx = (int) (_thelastcontrol.getLeft()+_thelastcontrol.getWidth()+_separationx);
 //BA.debugLineNum = 68;BA.debugLine="NewPostY = TheLastControl.Top";
_newposty = _thelastcontrol.getTop();
 }else {
 //BA.debugLineNum = 72;BA.debugLine="NewPostX = MargenP_Y";
_newpostx = _margenp_y;
 //BA.debugLineNum = 73;BA.debugLine="NewPostY = TheLastControl.Top + TheLastContro";
_newposty = (int) (_thelastcontrol.getTop()+_thelastcontrol.getHeight()+_separationy);
 };
 };
 //BA.debugLineNum = 82;BA.debugLine="LocationX = NewPostX";
_locationx = _newpostx;
 //BA.debugLineNum = 83;BA.debugLine="LocationY = NewPostY";
_locationy = _newposty;
 //BA.debugLineNum = 89;BA.debugLine="ContainerControl.Panel.AddView(ControlEx, Locat";
_containercontrol.getPanel().AddView((android.view.View)(_controlex.getObject()),_locationx,_locationy,_controlex.getWidth(),_controlex.getHeight());
 //BA.debugLineNum = 91;BA.debugLine="TheLastControl = GetLastView(ContainerControl)";
_thelastcontrol = _getlastview(_containercontrol);
 //BA.debugLineNum = 96;BA.debugLine="XSizeCupon = ContainerControl.Width - (TheLastC";
_xsizecupon = (int) (_containercontrol.getWidth()-(_thelastcontrol.getLeft()+_containercontrol.getPanel().GetView((int) (0)).getWidth()));
 //BA.debugLineNum = 97;BA.debugLine="YSizeCupon = ContainerControl.Height - (TheLast";
_ysizecupon = (int) (_containercontrol.getHeight()-(_thelastcontrol.getTop()+_containercontrol.getPanel().GetView((int) (0)).getHeight()));
 };
 //BA.debugLineNum = 101;BA.debugLine="ControlEx.Visible = True";
_controlex.setVisible(__c.True);
 };
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private LocationX As Int = 4";
_locationx = (int) (4);
 //BA.debugLineNum = 5;BA.debugLine="Private LocationY As Int = 4";
_locationy = (int) (4);
 //BA.debugLineNum = 7;BA.debugLine="Private SeparationX As Int = 4";
_separationx = (int) (4);
 //BA.debugLineNum = 8;BA.debugLine="Private SeparationY As Int = 4";
_separationy = (int) (4);
 //BA.debugLineNum = 10;BA.debugLine="Private XSizeCupon As Int = 0";
_xsizecupon = (int) (0);
 //BA.debugLineNum = 11;BA.debugLine="Private YSizeCupon As Int = 0";
_ysizecupon = (int) (0);
 //BA.debugLineNum = 13;BA.debugLine="Public MargenP_X As Int = 4 ' As Point = New Poin";
_margenp_x = (int) (4);
 //BA.debugLineNum = 14;BA.debugLine="Public MargenP_Y As Int = 4";
_margenp_y = (int) (4);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.ConcreteViewWrapper  _getlastview(anywheresoftware.b4a.objects.ScrollViewWrapper _sview) throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _panel = null;
int _numofviews = 0;
 //BA.debugLineNum = 105;BA.debugLine="Private Sub GetLastView(SView As ScrollView) As Vi";
 //BA.debugLineNum = 106;BA.debugLine="Dim panel As Panel = SView.Panel";
_panel = new anywheresoftware.b4a.objects.PanelWrapper();
_panel = _sview.getPanel();
 //BA.debugLineNum = 107;BA.debugLine="Dim numOfViews As Int = panel.NumberOfViews";
_numofviews = _panel.getNumberOfViews();
 //BA.debugLineNum = 109;BA.debugLine="If numOfViews = 0 Then";
if (_numofviews==0) { 
 //BA.debugLineNum = 110;BA.debugLine="Return Null";
if (true) return (anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(__c.Null));
 }else {
 //BA.debugLineNum = 112;BA.debugLine="Return  panel.GetView(numOfViews - 1)";
if (true) return _panel.GetView((int) (_numofviews-1));
 };
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
