package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class asviewpager extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.asviewpager");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.asviewpager.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public b4a.example3.customlistview _xclv_main = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_loading = null;
public int _m_currentindex = 0;
public int _lazyloading_index = 0;
public float _g_x = 0f;
public float _g_y = 0f;
public float _g_dv = 0f;
public float _g_ad = 0f;
public long _g_ms = 0L;
public boolean _isfirstmove = false;
public boolean _g_ignorepagechangedevent = false;
public boolean _g_ignorepagechangeevent = false;
public String _m_orientation = "";
public boolean _m_carousel = false;
public boolean _m_lazyloading = false;
public int _m_lazyloadingextrasize = 0;
public int _m_loadingpanelcolor = 0;
public boolean _m_backgesturegap = false;
public boolean _ismoving = false;
public boolean _g_isscrollenabled = false;
public boolean _m_ignorelazyloading = false;
public Object _tag = null;
public boolean _islazyloadingready = false;
public boolean _ishidding = false;
public boolean _oversizemode = false;
public b4a.example.dateutils _dateutils = null;
public com.holydesing.software.wallpaperhq.main _main = null;
public com.holydesing.software.wallpaperhq.activity2 _activity2 = null;
public com.holydesing.software.wallpaperhq.starter _starter = null;
public com.holydesing.software.wallpaperhq.viewer _viewer = null;
public com.holydesing.software.wallpaperhq.themecolors _themecolors = null;
public com.holydesing.software.wallpaperhq.b4xpages _b4xpages = null;
public com.holydesing.software.wallpaperhq.b4xcollections _b4xcollections = null;
public com.holydesing.software.wallpaperhq.httputils2service _httputils2service = null;
public com.holydesing.software.wallpaperhq.xuiviewsutils _xuiviewsutils = null;
public String  _addpage(anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
 //BA.debugLineNum = 414;BA.debugLine="Public Sub AddPage(LayoutPanel As B4XView,Value As";
 //BA.debugLineNum = 418;BA.debugLine="xclv_main.Add(LayoutPanel,Value)";
_xclv_main._add(_layoutpanel,_value);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return "";
}
public String  _addpageat(int _index,anywheresoftware.b4a.objects.B4XViewWrapper _layoutpanel,Object _value) throws Exception{
 //BA.debugLineNum = 424;BA.debugLine="Public Sub AddPageAt(index As Int,LayoutPanel As B";
 //BA.debugLineNum = 427;BA.debugLine="If index <= m_CurrentIndex Then";
if (_index<=_m_currentindex) { 
 //BA.debugLineNum = 428;BA.debugLine="m_CurrentIndex = m_CurrentIndex +1";
_m_currentindex = (int) (_m_currentindex+1);
 };
 //BA.debugLineNum = 438;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex)";
_xclv_main._jumptoitem(_m_currentindex);
 //BA.debugLineNum = 444;BA.debugLine="xclv_main.InsertAt(index,LayoutPanel,Value)";
_xclv_main._insertat(_index,_layoutpanel,_value);
 //BA.debugLineNum = 448;BA.debugLine="End Sub";
return "";
}
public void  _base_resize(double _width,double _height) throws Exception{
ResumableSub_Base_Resize rsub = new ResumableSub_Base_Resize(this,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_Base_Resize extends BA.ResumableSub {
public ResumableSub_Base_Resize(com.holydesing.software.wallpaperhq.asviewpager parent,double _width,double _height) {
this.parent = parent;
this._width = _width;
this._height = _height;
}
com.holydesing.software.wallpaperhq.asviewpager parent;
double _width;
double _height;
int _i = 0;
int step10;
int limit10;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 351;BA.debugLine="xpnl_Loading.BringToFront";
parent._xpnl_loading.BringToFront();
 //BA.debugLineNum = 352;BA.debugLine="xpnl_Loading.SetLayoutAnimated(0,0,0,Width + 1000";
parent._xpnl_loading.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width+parent.__c.DipToCurrent((int) (1000))),(int) (_height+parent.__c.DipToCurrent((int) (1000))));
 //BA.debugLineNum = 353;BA.debugLine="xpnl_Loading.SetVisibleAnimated(0,True)";
parent._xpnl_loading.SetVisibleAnimated((int) (0),parent.__c.True);
 //BA.debugLineNum = 355;BA.debugLine="mBase.Width = Width";
parent._mbase.setWidth((int) (_width));
 //BA.debugLineNum = 356;BA.debugLine="mBase.Height = Height";
parent._mbase.setHeight((int) (_height));
 //BA.debugLineNum = 357;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 20;
return;
case 20:
//C
this.state = 1;
;
 //BA.debugLineNum = 358;BA.debugLine="xclv_main.AsView.SetLayoutAnimated(0,xclv_main.As";
parent._xclv_main._asview().SetLayoutAnimated((int) (0),parent._xclv_main._asview().getLeft(),parent._xclv_main._asview().getTop(),parent._mbase.getWidth(),parent._mbase.getHeight());
 //BA.debugLineNum = 359;BA.debugLine="xclv_main.Base_Resize(mBase.Width,mBase.Height)";
parent._xclv_main._base_resize(parent._mbase.getWidth(),parent._mbase.getHeight());
 //BA.debugLineNum = 363;BA.debugLine="If OversizeMode = False Then";
if (true) break;

case 1:
//if
this.state = 14;
if (parent._oversizemode==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 365;BA.debugLine="For i = 0 To xclv_main.Size -1";
if (true) break;

case 4:
//for
this.state = 13;
step10 = 1;
limit10 = (int) (parent._xclv_main._getsize()-1);
_i = (int) (0) ;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 13;
if ((step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10)) this.state = 6;
if (true) break;

case 22:
//C
this.state = 21;
_i = ((int)(0 + _i + step10)) ;
if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 366;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if (true) break;

case 7:
//if
this.state = 12;
if ((parent._m_orientation).equals("Horizontal")) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 //BA.debugLineNum = 367;BA.debugLine="xclv_main.ResizeItem(i,mBase.Width)";
parent._xclv_main._resizeitem(_i,parent._mbase.getWidth());
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 369;BA.debugLine="xclv_main.ResizeItem(i,mBase.Height)";
parent._xclv_main._resizeitem(_i,parent._mbase.getHeight());
 if (true) break;

case 12:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 13:
//C
this.state = 14;
;
 if (true) break;
;
 //BA.debugLineNum = 377;BA.debugLine="If xclv_main.Size > 0 Then xclv_main.JumpToItem(m";

case 14:
//if
this.state = 19;
if (parent._xclv_main._getsize()>0) { 
this.state = 16;
;}if (true) break;

case 16:
//C
this.state = 19;
parent._xclv_main._jumptoitem(parent._m_currentindex);
if (true) break;

case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 378;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 23;
return;
case 23:
//C
this.state = -1;
;
 //BA.debugLineNum = 379;BA.debugLine="LoadingPanelHandling";
parent._loadingpanelhandling();
 //BA.debugLineNum = 384;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _checkcarousel() throws Exception{
ResumableSub_CheckCarousel rsub = new ResumableSub_CheckCarousel(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CheckCarousel extends BA.ResumableSub {
public ResumableSub_CheckCarousel(com.holydesing.software.wallpaperhq.asviewpager parent) {
this.parent = parent;
}
com.holydesing.software.wallpaperhq.asviewpager parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 839;BA.debugLine="If m_Carousel = True Then";
if (true) break;

case 1:
//if
this.state = 10;
if (parent._m_carousel==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 840;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 11;
return;
case 11:
//C
this.state = 4;
;
 //BA.debugLineNum = 841;BA.debugLine="If m_CurrentIndex = xclv_main.Size -1 Then";
if (true) break;

case 4:
//if
this.state = 9;
if (parent._m_currentindex==parent._xclv_main._getsize()-1) { 
this.state = 6;
}else if(parent._m_currentindex==0) { 
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 842;BA.debugLine="setCurrentIndex2(0)";
parent._setcurrentindex2((int) (0));
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 844;BA.debugLine="setCurrentIndex2(xclv_main.Size -1)";
parent._setcurrentindex2((int) (parent._xclv_main._getsize()-1));
 if (true) break;

case 9:
//C
this.state = 10;
;
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _checkloadingpanelvisiblity() throws Exception{
ResumableSub_CheckLoadingPanelVisiblity rsub = new ResumableSub_CheckLoadingPanelVisiblity(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CheckLoadingPanelVisiblity extends BA.ResumableSub {
public ResumableSub_CheckLoadingPanelVisiblity(com.holydesing.software.wallpaperhq.asviewpager parent) {
this.parent = parent;
}
com.holydesing.software.wallpaperhq.asviewpager parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 400;BA.debugLine="Sleep(250)";
parent.__c.Sleep(ba,this,(int) (250));
this.state = 5;
return;
case 5:
//C
this.state = 1;
;
 //BA.debugLineNum = 401;BA.debugLine="If xpnl_Loading.Visible = True And isHidding = Fa";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._xpnl_loading.getVisible()==parent.__c.True && parent._ishidding==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 402;BA.debugLine="isHidding = True";
parent._ishidding = parent.__c.True;
 //BA.debugLineNum = 403;BA.debugLine="xpnl_Loading.SetVisibleAnimated(500,False)";
parent._xpnl_loading.SetVisibleAnimated((int) (500),parent.__c.False);
 //BA.debugLineNum = 404;BA.debugLine="Sleep(600)";
parent.__c.Sleep(ba,this,(int) (600));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 //BA.debugLineNum = 405;BA.debugLine="isHidding = False";
parent._ishidding = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 147;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 148;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 149;BA.debugLine="Private mBase As B4XView 'ignore";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 150;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 156;BA.debugLine="Private xclv_main As CustomListView";
_xclv_main = new b4a.example3.customlistview();
 //BA.debugLineNum = 160;BA.debugLine="Private xpnl_Loading As B4XView";
_xpnl_loading = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 163;BA.debugLine="Private m_CurrentIndex As Int = 0'ignore";
_m_currentindex = (int) (0);
 //BA.debugLineNum = 164;BA.debugLine="Private lazyloading_index As Int = -1'ignore";
_lazyloading_index = (int) (-1);
 //BA.debugLineNum = 166;BA.debugLine="Private g_x,g_y,g_dv,g_ad As Float";
_g_x = 0f;
_g_y = 0f;
_g_dv = 0f;
_g_ad = 0f;
 //BA.debugLineNum = 167;BA.debugLine="Private g_ms As Long";
_g_ms = 0L;
 //BA.debugLineNum = 168;BA.debugLine="Private  isfirstmove As Boolean = False";
_isfirstmove = __c.False;
 //BA.debugLineNum = 177;BA.debugLine="Private g_ignorepagechangedevent As Boolean = Fal";
_g_ignorepagechangedevent = __c.False;
 //BA.debugLineNum = 178;BA.debugLine="Private g_ignorepagechangeevent As Boolean = Fals";
_g_ignorepagechangeevent = __c.False;
 //BA.debugLineNum = 179;BA.debugLine="Private m_Orientation As String";
_m_orientation = "";
 //BA.debugLineNum = 180;BA.debugLine="Private m_Carousel As Boolean";
_m_carousel = false;
 //BA.debugLineNum = 181;BA.debugLine="Private m_LazyLoading As Boolean";
_m_lazyloading = false;
 //BA.debugLineNum = 182;BA.debugLine="Private m_LazyLoadingExtraSize As Int";
_m_lazyloadingextrasize = 0;
 //BA.debugLineNum = 183;BA.debugLine="Private m_LoadingPanelColor As Int";
_m_loadingpanelcolor = 0;
 //BA.debugLineNum = 184;BA.debugLine="Private m_BackGestureGap As Boolean";
_m_backgesturegap = false;
 //BA.debugLineNum = 186;BA.debugLine="Private ismoving As Boolean = False";
_ismoving = __c.False;
 //BA.debugLineNum = 187;BA.debugLine="Private g_isScrollEnabled As Boolean = True";
_g_isscrollenabled = __c.True;
 //BA.debugLineNum = 188;BA.debugLine="Private m_IgnoreLazyLoading As Boolean = False";
_m_ignorelazyloading = __c.False;
 //BA.debugLineNum = 190;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 191;BA.debugLine="Private isLazyLoadingReady As Boolean = False";
_islazyloadingready = __c.False;
 //BA.debugLineNum = 192;BA.debugLine="Private isHidding As Boolean = False";
_ishidding = __c.False;
 //BA.debugLineNum = 195;BA.debugLine="Public OversizeMode As Boolean = False";
_oversizemode = __c.False;
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 662;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 664;BA.debugLine="xclv_main.Clear";
_xclv_main._clear();
 //BA.debugLineNum = 665;BA.debugLine="m_CurrentIndex = 0";
_m_currentindex = (int) (0);
 //BA.debugLineNum = 669;BA.debugLine="End Sub";
return "";
}
public String  _commit() throws Exception{
 //BA.debugLineNum = 517;BA.debugLine="Public Sub Commit";
 //BA.debugLineNum = 518;BA.debugLine="isLazyLoadingReady = True";
_islazyloadingready = __c.True;
 //BA.debugLineNum = 522;BA.debugLine="xclv_main.Refresh";
_xclv_main._refresh();
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 206;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 207;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 208;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 210;BA.debugLine="xpnl_Loading = xui.CreatePanel(\"\")";
_xpnl_loading = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 211;BA.debugLine="mBase.AddView(xpnl_Loading,0,0,mBase.Width,mBase.";
_mbase.AddView((android.view.View)(_xpnl_loading.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 212;BA.debugLine="xpnl_Loading.Color = xui.Color_Black";
_xpnl_loading.setColor(_xui.Color_Black);
 //BA.debugLineNum = 213;BA.debugLine="xpnl_Loading.BringToFront";
_xpnl_loading.BringToFront();
 //BA.debugLineNum = 215;BA.debugLine="m_Orientation = Props.GetDefault(\"Orientation\",\"H";
_m_orientation = BA.ObjectToString(_props.GetDefault((Object)("Orientation"),(Object)("Horizontal")));
 //BA.debugLineNum = 216;BA.debugLine="m_Carousel = Props.GetDefault(\"Carousel\",False)";
_m_carousel = BA.ObjectToBoolean(_props.GetDefault((Object)("Carousel"),(Object)(__c.False)));
 //BA.debugLineNum = 217;BA.debugLine="m_LazyLoading = Props.GetDefault(\"LazyLoading\",Fa";
_m_lazyloading = BA.ObjectToBoolean(_props.GetDefault((Object)("LazyLoading"),(Object)(__c.False)));
 //BA.debugLineNum = 218;BA.debugLine="m_LazyLoadingExtraSize = Props.GetDefault(\"LazyLo";
_m_lazyloadingextrasize = (int)(BA.ObjectToNumber(_props.GetDefault((Object)("LazyLoadingExtraSize"),(Object)(5))));
 //BA.debugLineNum = 219;BA.debugLine="m_LoadingPanelColor = xui.PaintOrColorToColor(Pro";
_m_loadingpanelcolor = _xui.PaintOrColorToColor(_props.GetDefault((Object)("LoadingPanelColor"),(Object)(_xui.Color_Black)));
 //BA.debugLineNum = 220;BA.debugLine="xpnl_Loading.Color = m_LoadingPanelColor";
_xpnl_loading.setColor(_m_loadingpanelcolor);
 //BA.debugLineNum = 221;BA.debugLine="m_BackGestureGap = Props.GetDefault(\"BackGestureG";
_m_backgesturegap = BA.ObjectToBoolean(_props.GetDefault((Object)("BackGestureGap"),(Object)(__c.False)));
 //BA.debugLineNum = 224;BA.debugLine="If xclv_main.IsInitialized = False Then";
if (_xclv_main.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 225;BA.debugLine="ini_xclv";
_ini_xclv();
 };
 //BA.debugLineNum = 234;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return "";
}
public String  _ff(float _x,float _y) throws Exception{
 //BA.debugLineNum = 703;BA.debugLine="Private Sub ff(x As Float,y As Float)";
 //BA.debugLineNum = 704;BA.debugLine="isfirstmove = True";
_isfirstmove = __c.True;
 //BA.debugLineNum = 705;BA.debugLine="g_ms=DateTime.Now";
_g_ms = __c.DateTime.getNow();
 //BA.debugLineNum = 706;BA.debugLine="g_x=X";
_g_x = _x;
 //BA.debugLineNum = 707;BA.debugLine="g_y=Y";
_g_y = _y;
 //BA.debugLineNum = 708;BA.debugLine="If m_orientation = \"Horizontal\" Then";
if ((_m_orientation).equals("Horizontal")) { 
 //BA.debugLineNum = 709;BA.debugLine="g_dv = (xclv_main.GetBase.Width)/2";
_g_dv = (float) ((_xclv_main._getbase().getWidth())/(double)2);
 }else {
 //BA.debugLineNum = 711;BA.debugLine="g_dv = (xclv_main.GetBase.Height)/2";
_g_dv = (float) ((_xclv_main._getbase().getHeight())/(double)2);
 };
 //BA.debugLineNum = 713;BA.debugLine="g_ad = 0";
_g_ad = (float) (0);
 //BA.debugLineNum = 714;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbase() throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Public Sub getBase As B4XView";
 //BA.debugLineNum = 411;BA.debugLine="Return mBase";
if (true) return _mbase;
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public int  _getcurrentindex() throws Exception{
 //BA.debugLineNum = 602;BA.debugLine="Public Sub getCurrentIndex As Int";
 //BA.debugLineNum = 606;BA.debugLine="Return m_CurrentIndex";
if (true) return _m_currentindex;
 //BA.debugLineNum = 608;BA.debugLine="End Sub";
return 0;
}
public b4a.example3.customlistview  _getcustomlistview() throws Exception{
 //BA.debugLineNum = 637;BA.debugLine="Public Sub getCustomListView As CustomListView";
 //BA.debugLineNum = 638;BA.debugLine="Return xclv_main";
if (true) return _xclv_main;
 //BA.debugLineNum = 639;BA.debugLine="End Sub";
return null;
}
public boolean  _getisscrollenabled() throws Exception{
 //BA.debugLineNum = 555;BA.debugLine="Public Sub getisScrollEnabled As Boolean";
 //BA.debugLineNum = 556;BA.debugLine="Return g_isScrollEnabled";
if (true) return _g_isscrollenabled;
 //BA.debugLineNum = 557;BA.debugLine="End Sub";
return false;
}
public int  _getlazyloadingextrasize() throws Exception{
 //BA.debugLineNum = 542;BA.debugLine="Public Sub getLazyLoadingExtraSize As Int";
 //BA.debugLineNum = 543;BA.debugLine="Return m_LazyLoadingExtraSize";
if (true) return _m_lazyloadingextrasize;
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return 0;
}
public int  _getloadingpanelcolor() throws Exception{
 //BA.debugLineNum = 534;BA.debugLine="Public Sub getLoadingPanelColor As Int";
 //BA.debugLineNum = 535;BA.debugLine="Return m_LoadingPanelColor";
if (true) return _m_loadingpanelcolor;
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getpanel(int _index) throws Exception{
 //BA.debugLineNum = 654;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
 //BA.debugLineNum = 658;BA.debugLine="Return xclv_main.GetPanel(Index)";
if (true) return _xclv_main._getpanel(_index);
 //BA.debugLineNum = 660;BA.debugLine="End Sub";
return null;
}
public int  _getsize() throws Exception{
 //BA.debugLineNum = 628;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 632;BA.debugLine="Return xclv_main.Size";
if (true) return _xclv_main._getsize();
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return 0;
}
public Object  _getvalue(int _index) throws Exception{
 //BA.debugLineNum = 646;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
 //BA.debugLineNum = 650;BA.debugLine="Return xclv_main.GetValue(Index)";
if (true) return _xclv_main._getvalue(_index);
 //BA.debugLineNum = 652;BA.debugLine="End Sub";
return null;
}
public boolean  _handletouch(int _action,float _x,float _y) throws Exception{
b4a.example3.customlistview._clvitem _clvitem1 = null;
double _tst = 0;
int _i = 0;
 //BA.debugLineNum = 716;BA.debugLine="Private Sub HandleTouch(Action As Int,x As Float,y";
 //BA.debugLineNum = 721;BA.debugLine="Select Action";
switch (_action) {
case 2: {
 //BA.debugLineNum = 723;BA.debugLine="TouchBeginEvent";
_touchbeginevent();
 //BA.debugLineNum = 724;BA.debugLine="ismoving = True";
_ismoving = __c.True;
 //BA.debugLineNum = 725;BA.debugLine="If isfirstmove = False Then";
if (_isfirstmove==__c.False) { 
 //BA.debugLineNum = 727;BA.debugLine="ff(X,y)";
_ff(_x,_y);
 }else {
 };
 //BA.debugLineNum = 733;BA.debugLine="If OversizeMode = True Then";
if (_oversizemode==__c.True) { 
 //BA.debugLineNum = 734;BA.debugLine="Dim clvitem1 As CLVItem = xclv_main.GetRawList";
_clvitem1 = _xclv_main._getrawlistitem(_m_currentindex);
 //BA.debugLineNum = 735;BA.debugLine="Dim tst As Double = Min(clvitem1.Offset + clvi";
_tst = __c.Min(_clvitem1.Offset+_clvitem1.Panel.getWidth()-_mbase.getWidth(),_xclv_main._sv.getScrollViewOffsetX());
 //BA.debugLineNum = 737;BA.debugLine="If x < g_x And xclv_main.sv.ScrollViewOffsetX";
if (_x<_g_x && _xclv_main._sv.getScrollViewOffsetX()>=_clvitem1.Offset+_clvitem1.Size) { 
 }else {
 //BA.debugLineNum = 740;BA.debugLine="xclv_main.sv.ScrollViewOffsetX = Min(IIf(x >";
_xclv_main._sv.setScrollViewOffsetX((int) (__c.Min((double)(BA.ObjectToNumber(((_x>_g_x) ? ((Object)(_xclv_main._sv.getScrollViewOffsetX())) : ((Object)(_tst))))),_clvitem1.Offset+_clvitem1.Size)));
 };
 };
 break; }
case 1: {
 //BA.debugLineNum = 753;BA.debugLine="TouchEndEvent";
_touchendevent();
 //BA.debugLineNum = 754;BA.debugLine="ismoving = False";
_ismoving = __c.False;
 //BA.debugLineNum = 755;BA.debugLine="isfirstmove = False";
_isfirstmove = __c.False;
 //BA.debugLineNum = 757;BA.debugLine="If OversizeMode = False Then";
if (_oversizemode==__c.False) { 
 //BA.debugLineNum = 759;BA.debugLine="If m_orientation = \"Horizontal\" Then";
if ((_m_orientation).equals("Horizontal")) { 
 //BA.debugLineNum = 760;BA.debugLine="If ((DateTime.Now-g_ms)<300) And (Abs(X - g_x";
if (((__c.DateTime.getNow()-_g_ms)<300) && (__c.Abs(_x-_g_x)>(__c.DipToCurrent((int) (1))))) { 
 //BA.debugLineNum = 762;BA.debugLine="g_dv =1dip";
_g_dv = (float) (__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 764;BA.debugLine="If X < g_x Then g_ad = 1";
if (_x<_g_x) { 
_g_ad = (float) (1);};
 };
 }else {
 //BA.debugLineNum = 768;BA.debugLine="If ((DateTime.Now-g_ms)<300)  And (Abs(y - g_";
if (((__c.DateTime.getNow()-_g_ms)<300) && (__c.Abs(_y-_g_y)>(__c.DipToCurrent((int) (1))))) { 
 //BA.debugLineNum = 769;BA.debugLine="g_dv =1dip";
_g_dv = (float) (__c.DipToCurrent((int) (1)));
 //BA.debugLineNum = 771;BA.debugLine="If y < g_y Then g_ad = 1";
if (_y<_g_y) { 
_g_ad = (float) (1);};
 };
 };
 //BA.debugLineNum = 776;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step33 = 1;
final int limit33 = (int) (_xclv_main._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit33 ;_i = _i + step33 ) {
 //BA.debugLineNum = 777;BA.debugLine="If m_orientation = \"Horizontal\" Then";
if ((_m_orientation).equals("Horizontal")) { 
 //BA.debugLineNum = 779;BA.debugLine="If (((i+1)*xclv_main.GetBase.Width) - xclv_m";
if ((((_i+1)*_xclv_main._getbase().getWidth())-_xclv_main._sv.getScrollViewOffsetX())>(_g_dv)) { 
 //BA.debugLineNum = 781;BA.debugLine="If (i+g_ad) > (xclv_main.Size -1) Or xclv_m";
if ((_i+_g_ad)>(_xclv_main._getsize()-1) || _xclv_main._sv.getScrollViewOffsetX()<=0) { 
 //BA.debugLineNum = 782;BA.debugLine="CheckCarousel";
_checkcarousel();
 //BA.debugLineNum = 783;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 786;BA.debugLine="If isNumberOneCloserToZero(g_x - x,g_y - y)";
if (_isnumberoneclosertozero((int) (_g_x-_x),(int) (_g_y-_y))==__c.False) { 
 //BA.debugLineNum = 787;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
_xclv_main._scrolltoitem(_m_currentindex);
 //BA.debugLineNum = 788;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 790;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
_xclv_main._scrolltoitem((int) (_i+_g_ad));
 //BA.debugLineNum = 791;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChan";
if (_m_currentindex!=(_i+_g_ad)) { 
_pagechangedevent((int) (_i+_g_ad),__c.True);};
 //BA.debugLineNum = 793;BA.debugLine="Return True";
if (true) return __c.True;
 };
 }else {
 //BA.debugLineNum = 797;BA.debugLine="If (((i+1)*xclv_main.GetBase.Height) - xclv_";
if ((((_i+1)*_xclv_main._getbase().getHeight())-_xclv_main._sv.getScrollViewOffsetY())>(_g_dv)) { 
 //BA.debugLineNum = 799;BA.debugLine="If (i+g_ad) > xclv_main.Size-1 Or  xclv_mai";
if ((_i+_g_ad)>_xclv_main._getsize()-1 || _xclv_main._sv.getScrollViewOffsetY()<=0) { 
 //BA.debugLineNum = 800;BA.debugLine="CheckCarousel";
_checkcarousel();
 //BA.debugLineNum = 801;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 804;BA.debugLine="If isNumberOneCloserToZero(g_y - y,g_x - x)";
if (_isnumberoneclosertozero((int) (_g_y-_y),(int) (_g_x-_x))==__c.False) { 
 //BA.debugLineNum = 805;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
_xclv_main._scrolltoitem(_m_currentindex);
 //BA.debugLineNum = 806;BA.debugLine="Return True";
if (true) return __c.True;
 };
 //BA.debugLineNum = 808;BA.debugLine="xclv_main.ScrollToItem(i+g_ad)";
_xclv_main._scrolltoitem((int) (_i+_g_ad));
 //BA.debugLineNum = 809;BA.debugLine="If m_CurrentIndex <> (i+g_ad) Then PageChan";
if (_m_currentindex!=(_i+_g_ad)) { 
_pagechangedevent((int) (_i+_g_ad),__c.True);};
 //BA.debugLineNum = 811;BA.debugLine="Return True";
if (true) return __c.True;
 };
 };
 }
};
 }else {
 //BA.debugLineNum = 818;BA.debugLine="Dim clvitem1 As CLVItem = xclv_main.GetRawList";
_clvitem1 = _xclv_main._getrawlistitem(_m_currentindex);
 //BA.debugLineNum = 821;BA.debugLine="If x < g_x And xclv_main.sv.ScrollViewOffsetX";
if (_x<_g_x && _xclv_main._sv.getScrollViewOffsetX()>=_clvitem1.Offset+_clvitem1.Panel.getWidth()-_mbase.getWidth()) { 
 //BA.debugLineNum = 822;BA.debugLine="m_CurrentIndex = m_CurrentIndex +1";
_m_currentindex = (int) (_m_currentindex+1);
 //BA.debugLineNum = 823;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
_xclv_main._scrolltoitem(_m_currentindex);
 }else if(_x>_g_x && _xclv_main._sv.getScrollViewOffsetX()<=_clvitem1.Offset && (_m_currentindex-1)>=0) { 
 //BA.debugLineNum = 825;BA.debugLine="m_CurrentIndex = m_CurrentIndex -1";
_m_currentindex = (int) (_m_currentindex-1);
 //BA.debugLineNum = 826;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex)";
_xclv_main._scrolltoitem(_m_currentindex);
 };
 //BA.debugLineNum = 829;BA.debugLine="Return True";
if (true) return __c.True;
 };
 break; }
}
;
 //BA.debugLineNum = 833;BA.debugLine="Return False";
if (true) return __c.False;
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return false;
}
public String  _ini_xclv() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
anywheresoftware.b4a.agraham.reflection.Reflection _objpages = null;
 //BA.debugLineNum = 250;BA.debugLine="Private Sub ini_xclv";
 //BA.debugLineNum = 251;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 252;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
 //BA.debugLineNum = 254;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 255;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
 //BA.debugLineNum = 256;BA.debugLine="tmpmap.Put(\"DividerColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("DividerColor"),(Object)(((int)0x00ffffff)));
 //BA.debugLineNum = 257;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
_tmpmap.Put((Object)("DividerHeight"),(Object)(0));
 //BA.debugLineNum = 258;BA.debugLine="tmpmap.Put(\"PressedColor\",0x00FFFFFF)";
_tmpmap.Put((Object)("PressedColor"),(Object)(((int)0x00ffffff)));
 //BA.debugLineNum = 259;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
_tmpmap.Put((Object)("InsertAnimationDuration"),(Object)(0));
 //BA.debugLineNum = 260;BA.debugLine="tmpmap.Put(\"ListOrientation\",m_Orientation)";
_tmpmap.Put((Object)("ListOrientation"),(Object)(_m_orientation));
 //BA.debugLineNum = 261;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
_tmpmap.Put((Object)("ShowScrollBar"),(Object)(__c.False));
 //BA.debugLineNum = 262;BA.debugLine="xclv_main.Initialize(Me,\"xclv_main\")";
_xclv_main._initialize(ba,this,"xclv_main");
 //BA.debugLineNum = 263;BA.debugLine="xclv_main.DesignerCreateView(mBase,tmplbl,tmpmap)";
_xclv_main._designercreateview((Object)(_mbase.getObject()),_tmplbl,_tmpmap);
 //BA.debugLineNum = 265;BA.debugLine="Private objPages As Reflector";
_objpages = new anywheresoftware.b4a.agraham.reflection.Reflection();
 //BA.debugLineNum = 266;BA.debugLine="objPages.Target = xclv_main.sv";
_objpages.Target = (Object)(_xclv_main._sv.getObject());
 //BA.debugLineNum = 267;BA.debugLine="objPages.SetOnTouchListener(\"xpnl_PageArea2_Touch";
_objpages.SetOnTouchListener(ba,"xpnl_PageArea2_Touch");
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 199;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 200;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 201;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return "";
}
public boolean  _isnumberoneclosertozero(int _numberone,int _numbertwo) throws Exception{
 //BA.debugLineNum = 1062;BA.debugLine="Private Sub isNumberOneCloserToZero (numberOne As";
 //BA.debugLineNum = 1063;BA.debugLine="Return (Abs(numberOne) >= Abs(numberTwo))";
if (true) return (__c.Abs(_numberone)>=__c.Abs(_numbertwo));
 //BA.debugLineNum = 1064;BA.debugLine="End Sub";
return false;
}
public String  _lazyloadingaddcontent(anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _value) throws Exception{
 //BA.debugLineNum = 1014;BA.debugLine="Private Sub LazyLoadingAddContent(Parent As B4XVie";
 //BA.debugLineNum = 1015;BA.debugLine="If isLazyLoadingReady = True And xui.SubExists(mC";
if (_islazyloadingready==__c.True && _xui.SubExists(ba,_mcallback,_meventname+"_LazyLoadingAddContent",(int) (2))) { 
 //BA.debugLineNum = 1016;BA.debugLine="CallSub3(mCallBack, mEventName & \"_LazyLoadingAd";
__c.CallSubNew3(ba,_mcallback,_meventname+"_LazyLoadingAddContent",(Object)(_parent),_value);
 };
 //BA.debugLineNum = 1018;BA.debugLine="End Sub";
return "";
}
public void  _loadingpanelhandling() throws Exception{
ResumableSub_LoadingPanelHandling rsub = new ResumableSub_LoadingPanelHandling(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadingPanelHandling extends BA.ResumableSub {
public ResumableSub_LoadingPanelHandling(com.holydesing.software.wallpaperhq.asviewpager parent) {
this.parent = parent;
}
com.holydesing.software.wallpaperhq.asviewpager parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 387;BA.debugLine="If isHidding = False Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._ishidding==parent.__c.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 388;BA.debugLine="isHidding = True";
parent._ishidding = parent.__c.True;
 //BA.debugLineNum = 390;BA.debugLine="xpnl_Loading.SetVisibleAnimated(500,False)";
parent._xpnl_loading.SetVisibleAnimated((int) (500),parent.__c.False);
 //BA.debugLineNum = 391;BA.debugLine="Sleep(600)";
parent.__c.Sleep(ba,this,(int) (600));
this.state = 5;
return;
case 5:
//C
this.state = 4;
;
 //BA.debugLineNum = 392;BA.debugLine="isHidding = False";
parent._ishidding = parent.__c.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 394;BA.debugLine="Sleep(0)";
parent.__c.Sleep(ba,this,(int) (0));
this.state = 6;
return;
case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 395;BA.debugLine="CheckLoadingPanelVisiblity";
parent._checkloadingpanelvisiblity();
 //BA.debugLineNum = 396;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _nextpage() throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Public Sub NextPage";
 //BA.debugLineNum = 494;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((_m_currentindex+1)<_xclv_main._getsize()) { 
 //BA.debugLineNum = 495;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex +1)";
_xclv_main._scrolltoitem((int) (_m_currentindex+1));
 //BA.debugLineNum = 496;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,True)";
_pagechangedevent((int) (_m_currentindex+1),__c.True);
 }else if(_m_carousel==__c.True) { 
 //BA.debugLineNum = 498;BA.debugLine="CheckCarousel";
_checkcarousel();
 };
 //BA.debugLineNum = 501;BA.debugLine="End Sub";
return "";
}
public String  _nextpage2() throws Exception{
 //BA.debugLineNum = 503;BA.debugLine="Public Sub NextPage2";
 //BA.debugLineNum = 507;BA.debugLine="If (m_CurrentIndex +1) < xclv_main.Size Then";
if ((_m_currentindex+1)<_xclv_main._getsize()) { 
 //BA.debugLineNum = 509;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex +1)";
_xclv_main._jumptoitem((int) (_m_currentindex+1));
 //BA.debugLineNum = 510;BA.debugLine="PageChangedEvent(m_CurrentIndex +1,False)";
_pagechangedevent((int) (_m_currentindex+1),__c.False);
 }else if(_m_carousel==__c.True) { 
 //BA.debugLineNum = 512;BA.debugLine="CheckCarousel";
_checkcarousel();
 };
 //BA.debugLineNum = 515;BA.debugLine="End Sub";
return "";
}
public void  _pagechangedevent(int _index,boolean _delayed) throws Exception{
ResumableSub_PageChangedEvent rsub = new ResumableSub_PageChangedEvent(this,_index,_delayed);
rsub.resume(ba, null);
}
public static class ResumableSub_PageChangedEvent extends BA.ResumableSub {
public ResumableSub_PageChangedEvent(com.holydesing.software.wallpaperhq.asviewpager parent,int _index,boolean _delayed) {
this.parent = parent;
this._index = _index;
this._delayed = _delayed;
}
com.holydesing.software.wallpaperhq.asviewpager parent;
int _index;
boolean _delayed;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 1021;BA.debugLine="If m_CurrentIndex = index Then Return";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._m_currentindex==_index) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 1022;BA.debugLine="m_CurrentIndex = index";
parent._m_currentindex = _index;
 //BA.debugLineNum = 1023;BA.debugLine="If g_ignorepagechangeevent = False And xui.SubExi";
if (true) break;

case 7:
//if
this.state = 10;
if (parent._g_ignorepagechangeevent==parent.__c.False && parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_PageChange",(int) (1))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 1024;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChange\",i";
parent.__c.CallSubNew2(ba,parent._mcallback,parent._meventname+"_PageChange",(Object)(_index));
 if (true) break;
;
 //BA.debugLineNum = 1027;BA.debugLine="If delayed = True Then Sleep(300)";

case 10:
//if
this.state = 15;
if (_delayed==parent.__c.True) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
parent.__c.Sleep(ba,this,(int) (300));
this.state = 20;
return;
case 20:
//C
this.state = 15;
;
if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 1029;BA.debugLine="If g_ignorepagechangedevent = False And xui.SubEx";
if (true) break;

case 16:
//if
this.state = 19;
if (parent._g_ignorepagechangedevent==parent.__c.False && parent._xui.SubExists(ba,parent._mcallback,parent._meventname+"_PageChanged",(int) (1))) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 1030;BA.debugLine="CallSub2(mCallBack, mEventName & \"_PageChanged\",";
parent.__c.CallSubNew2(ba,parent._mcallback,parent._meventname+"_PageChanged",(Object)(_index));
 if (true) break;

case 19:
//C
this.state = -1;
;
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _previouspage() throws Exception{
 //BA.debugLineNum = 463;BA.debugLine="Public Sub PreviousPage";
 //BA.debugLineNum = 467;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((_m_currentindex-1)>-1) { 
 //BA.debugLineNum = 468;BA.debugLine="xclv_main.ScrollToItem(m_CurrentIndex -1)";
_xclv_main._scrolltoitem((int) (_m_currentindex-1));
 //BA.debugLineNum = 470;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,True)";
_pagechangedevent((int) (_m_currentindex-1),__c.True);
 }else if(_m_carousel==__c.True) { 
 //BA.debugLineNum = 472;BA.debugLine="CheckCarousel";
_checkcarousel();
 };
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public String  _previouspage2() throws Exception{
 //BA.debugLineNum = 477;BA.debugLine="Public Sub PreviousPage2";
 //BA.debugLineNum = 481;BA.debugLine="If (m_CurrentIndex -1) > -1 Then";
if ((_m_currentindex-1)>-1) { 
 //BA.debugLineNum = 482;BA.debugLine="xclv_main.JumpToItem(m_CurrentIndex -1)";
_xclv_main._jumptoitem((int) (_m_currentindex-1));
 //BA.debugLineNum = 483;BA.debugLine="PageChangedEvent(m_CurrentIndex -1,False)";
_pagechangedevent((int) (_m_currentindex-1),__c.False);
 }else if(_m_carousel==__c.True) { 
 //BA.debugLineNum = 485;BA.debugLine="CheckCarousel";
_checkcarousel();
 };
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return "";
}
public String  _removepage(int _index) throws Exception{
 //BA.debugLineNum = 450;BA.debugLine="Public Sub RemovePage(index As Int)";
 //BA.debugLineNum = 452;BA.debugLine="xclv_main.RemoveAt(index)";
_xclv_main._removeat(_index);
 //BA.debugLineNum = 453;BA.debugLine="If m_Orientation = \"Horizontal\" Then";
if ((_m_orientation).equals("Horizontal")) { 
 //BA.debugLineNum = 454;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
_m_currentindex = _xclv_main._findindexfromoffset(_xclv_main._sv.getScrollViewOffsetX());
 }else {
 //BA.debugLineNum = 456;BA.debugLine="m_CurrentIndex = xclv_main.FindIndexFromOffset(x";
_m_currentindex = _xclv_main._findindexfromoffset(_xclv_main._sv.getScrollViewOffsetY());
 };
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return "";
}
public String  _resetlazyloadingindex() throws Exception{
 //BA.debugLineNum = 956;BA.debugLine="Public Sub ResetLazyloadingIndex";
 //BA.debugLineNum = 957;BA.debugLine="lazyloading_index = -1";
_lazyloading_index = (int) (-1);
 //BA.debugLineNum = 958;BA.debugLine="End Sub";
return "";
}
public String  _resetlazyloadingpanels() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 677;BA.debugLine="Public Sub ResetLazyLoadingPanels";
 //BA.debugLineNum = 687;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step1 = 1;
final int limit1 = (int) (_xclv_main._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 688;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xclv_main._getpanel(_i);
 //BA.debugLineNum = 690;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 691;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 }
};
 //BA.debugLineNum = 695;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value(String _value) throws Exception{
int _i = 0;
 //BA.debugLineNum = 566;BA.debugLine="Public Sub Scroll2Value(Value As String)";
 //BA.debugLineNum = 575;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (_xclv_main._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 576;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (_xclv_main._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(_xclv_main._getvalue(_i)))) { 
 //BA.debugLineNum = 577;BA.debugLine="setCurrentIndex(i)";
_setcurrentindex(_i);
 //BA.debugLineNum = 578;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return "";
}
public String  _scroll2value2(String _value) throws Exception{
int _i = 0;
 //BA.debugLineNum = 584;BA.debugLine="Public Sub Scroll2Value2(Value As String)";
 //BA.debugLineNum = 593;BA.debugLine="For i = 0 To xclv_main.Size -1";
{
final int step1 = 1;
final int limit1 = (int) (_xclv_main._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 594;BA.debugLine="If xclv_main.GetValue(i) Is String And Value = x";
if (_xclv_main._getvalue(_i) instanceof String && (_value).equals(BA.ObjectToString(_xclv_main._getvalue(_i)))) { 
 //BA.debugLineNum = 595;BA.debugLine="setCurrentIndex2(i)";
_setcurrentindex2(_i);
 //BA.debugLineNum = 596;BA.debugLine="Exit";
if (true) break;
 };
 }
};
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentindex(int _index) throws Exception{
 //BA.debugLineNum = 610;BA.debugLine="Public Sub setCurrentIndex(index As Int)";
 //BA.debugLineNum = 614;BA.debugLine="xclv_main.ScrollToItem(index)";
_xclv_main._scrolltoitem(_index);
 //BA.debugLineNum = 615;BA.debugLine="PageChangedEvent(index,True)";
_pagechangedevent(_index,__c.True);
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return "";
}
public String  _setcurrentindex2(int _index) throws Exception{
 //BA.debugLineNum = 619;BA.debugLine="Public Sub setCurrentIndex2(index As Int)";
 //BA.debugLineNum = 623;BA.debugLine="xclv_main.JumpToItem(index)";
_xclv_main._jumptoitem(_index);
 //BA.debugLineNum = 624;BA.debugLine="PageChangedEvent(index,False)";
_pagechangedevent(_index,__c.False);
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return "";
}
public String  _setignorelazyloading(boolean _ignore) throws Exception{
 //BA.debugLineNum = 960;BA.debugLine="Public Sub setIgnoreLazyLoading(Ignore As Boolean)";
 //BA.debugLineNum = 961;BA.debugLine="m_IgnoreLazyLoading = Ignore";
_m_ignorelazyloading = _ignore;
 //BA.debugLineNum = 962;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangedevent(boolean _ignore) throws Exception{
 //BA.debugLineNum = 559;BA.debugLine="Public Sub setIgnorePageChangedEvent(ignore As Boo";
 //BA.debugLineNum = 560;BA.debugLine="g_ignorepagechangedevent = ignore";
_g_ignorepagechangedevent = _ignore;
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return "";
}
public String  _setignorepagechangeevent(boolean _ignore) throws Exception{
 //BA.debugLineNum = 562;BA.debugLine="Public Sub setIgnorePageChangeEvent(ignore As Bool";
 //BA.debugLineNum = 563;BA.debugLine="g_ignorepagechangeevent = ignore";
_g_ignorepagechangeevent = _ignore;
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
public String  _setlazyloadingextrasize(int _extrasize) throws Exception{
 //BA.debugLineNum = 538;BA.debugLine="Public Sub setLazyLoadingExtraSize(ExtraSize As In";
 //BA.debugLineNum = 539;BA.debugLine="m_LazyLoadingExtraSize = ExtraSize";
_m_lazyloadingextrasize = _extrasize;
 //BA.debugLineNum = 540;BA.debugLine="End Sub";
return "";
}
public String  _setloadingpanelcolor(int _color) throws Exception{
 //BA.debugLineNum = 529;BA.debugLine="Public Sub setLoadingPanelColor(Color As Int)";
 //BA.debugLineNum = 530;BA.debugLine="m_LoadingPanelColor = Color";
_m_loadingpanelcolor = _color;
 //BA.debugLineNum = 531;BA.debugLine="xpnl_Loading.Color = Color";
_xpnl_loading.setColor(_color);
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return "";
}
public String  _setscroll(boolean _enabled) throws Exception{
 //BA.debugLineNum = 547;BA.debugLine="Public Sub setScroll(enabled As Boolean)";
 //BA.debugLineNum = 548;BA.debugLine="g_isScrollEnabled = enabled";
_g_isscrollenabled = _enabled;
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return "";
}
public String  _touchbeginevent() throws Exception{
 //BA.debugLineNum = 1034;BA.debugLine="Private Sub TouchBeginEvent";
 //BA.debugLineNum = 1035;BA.debugLine="If ismoving = False Then";
if (_ismoving==__c.False) { 
 //BA.debugLineNum = 1036;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchB";
if (_xui.SubExists(ba,_mcallback,_meventname+"_TouchBegin",(int) (0))) { 
 //BA.debugLineNum = 1037;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchBegin\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_TouchBegin");
 };
 };
 //BA.debugLineNum = 1040;BA.debugLine="End Sub";
return "";
}
public String  _touchendevent() throws Exception{
 //BA.debugLineNum = 1042;BA.debugLine="Private Sub TouchEndEvent";
 //BA.debugLineNum = 1043;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TouchE";
if (_xui.SubExists(ba,_mcallback,_meventname+"_TouchEnd",(int) (0))) { 
 //BA.debugLineNum = 1044;BA.debugLine="CallSub(mCallBack, mEventName & \"_TouchEnd\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_TouchEnd");
 };
 //BA.debugLineNum = 1046;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 1049;BA.debugLine="Private Sub xclv_main_ItemClick (Index As Int, Val";
 //BA.debugLineNum = 1050;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_PageCl";
if (_xui.SubExists(ba,_mcallback,_meventname+"_PageClick",(int) (2))) { 
 //BA.debugLineNum = 1051;BA.debugLine="CallSub3(mCallBack, mEventName & \"_PageClick\",In";
__c.CallSubNew3(ba,_mcallback,_meventname+"_PageClick",(Object)(_index),_value);
 };
 //BA.debugLineNum = 1053;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_reachend() throws Exception{
 //BA.debugLineNum = 1000;BA.debugLine="Private Sub xclv_main_ReachEnd";
 //BA.debugLineNum = 1001;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_ReachE";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ReachEnd",(int) (0))) { 
 //BA.debugLineNum = 1002;BA.debugLine="CallSub(mCallBack, mEventName & \"_ReachEnd\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_ReachEnd");
 };
 //BA.debugLineNum = 1004;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_scrollchanged(int _offset) throws Exception{
 //BA.debugLineNum = 966;BA.debugLine="Private Sub xclv_main_ScrollChanged (Offset As Int";
 //BA.debugLineNum = 977;BA.debugLine="If xclv_main.FindIndexFromOffset(Offset) <> m_Cur";
if (_xclv_main._findindexfromoffset(_offset)!=_m_currentindex && _offset==(double)(BA.ObjectToNumber((((_m_orientation).equals("Vertical")) ? ((Object)(_mbase.getHeight())) : ((Object)(_mbase.getWidth())))))*_xclv_main._findindexfromoffset(_offset)) { 
 //BA.debugLineNum = 978;BA.debugLine="PageChangedEvent(xclv_main.FindIndexFromOffset(O";
_pagechangedevent(_xclv_main._findindexfromoffset(_offset),__c.False);
 };
 //BA.debugLineNum = 983;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Scroll";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ScrollChanged",(int) (1))) { 
 //BA.debugLineNum = 984;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ScrollChanged";
__c.CallSubNew2(ba,_mcallback,_meventname+"_ScrollChanged",(Object)(_offset));
 };
 //BA.debugLineNum = 986;BA.debugLine="End Sub";
return "";
}
public String  _xclv_main_visiblerangechanged(int _firstindex,int _lastindex) throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
 //BA.debugLineNum = 911;BA.debugLine="Private Sub xclv_main_VisibleRangeChanged (FirstIn";
 //BA.debugLineNum = 922;BA.debugLine="If m_LazyLoading = False Or m_IgnoreLazyLoading =";
if (_m_lazyloading==__c.False || _m_ignorelazyloading==__c.True) { 
if (true) return "";};
 //BA.debugLineNum = 932;BA.debugLine="If lazyloading_index = m_CurrentIndex And xclv_ma";
if (_lazyloading_index==_m_currentindex && _xclv_main._getpanel(_m_currentindex).getNumberOfViews()==0) { 
_lazyloading_index = (int) (-1);};
 //BA.debugLineNum = 934;BA.debugLine="If lazyloading_index <> m_CurrentIndex Then";
if (_lazyloading_index!=_m_currentindex) { 
 //BA.debugLineNum = 936;BA.debugLine="If isLazyLoadingReady = True Then	lazyloading_ind";
if (_islazyloadingready==__c.True) { 
_lazyloading_index = _xclv_main._findindexfromoffset((int)(BA.ObjectToNumber((((_m_orientation).equals("Vertical")) ? ((Object)(_xclv_main._sv.getScrollViewOffsetY())) : ((Object)(_xclv_main._sv.getScrollViewOffsetX()))))));};
 //BA.debugLineNum = 937;BA.debugLine="For i = 0 To xclv_main.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_xclv_main._getsize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
 //BA.debugLineNum = 938;BA.debugLine="Dim p As B4XView = xclv_main.GetPanel(i)";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xclv_main._getpanel(_i);
 //BA.debugLineNum = 939;BA.debugLine="If i > FirstIndex - m_LazyLoadingExtraSize And i";
if (_i>_firstindex-_m_lazyloadingextrasize && _i<_lastindex+_m_lazyloadingextrasize) { 
 //BA.debugLineNum = 941;BA.debugLine="If p.NumberOfViews = 0 Then";
if (_p.getNumberOfViews()==0) { 
 //BA.debugLineNum = 942;BA.debugLine="LazyLoadingAddContent(p,xclv_main.GetValue(i))";
_lazyloadingaddcontent(_p,_xclv_main._getvalue(_i));
 };
 }else {
 //BA.debugLineNum = 946;BA.debugLine="If p.NumberOfViews > 0 Then";
if (_p.getNumberOfViews()>0) { 
 //BA.debugLineNum = 947;BA.debugLine="p.RemoveAllViews '<--- remove the layout";
_p.RemoveAllViews();
 };
 };
 }
};
 };
 //BA.debugLineNum = 952;BA.debugLine="End Sub";
return "";
}
public boolean  _xpnl_pagearea2_touch(Object _viewtag,int _action,float _x,float _y,Object _motionevent) throws Exception{
 //BA.debugLineNum = 851;BA.debugLine="Private Sub xpnl_PageArea2_Touch(ViewTag As Object";
 //BA.debugLineNum = 852;BA.debugLine="If g_isScrollEnabled = False Then Return True";
if (_g_isscrollenabled==__c.False) { 
if (true) return __c.True;};
 //BA.debugLineNum = 853;BA.debugLine="Return HandleTouch(Action,x,y)";
if (true) return _handletouch(_action,_x,_y);
 //BA.debugLineNum = 854;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "GETPANEL"))
	return _getpanel(((Number)args[0]).intValue());
return BA.SubDelegator.SubNotFound;
}
}
