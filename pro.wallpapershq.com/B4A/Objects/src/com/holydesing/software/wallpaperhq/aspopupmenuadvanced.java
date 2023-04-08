package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class aspopupmenuadvanced extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.aspopupmenuadvanced");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.aspopupmenuadvanced.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _mcallback = null;
public String _meventname = "";
public int _autohidems = 0;
public int _closedurationms = 0;
public int _opendurationms = 0;
public float _m_menuviewgap = 0f;
public b4a.example3.customlistview _xclv = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_background = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_menu = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_triangle = null;
public String _m_orientation = "";
public int _m_radius = 0;
public String _g_orientationvertical = "";
public String _g_orientationhorizontal = "";
public boolean _g_isinspecialcontainer = false;
public int[] _lefttop_root = null;
public boolean _acthasactionbar = false;
public float _max_x = 0f;
public float _max_y = 0f;
public int _max_endlessloop = 0;
public boolean _m_showtriangle = false;
public boolean _m_isopen = false;
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_titlelabelpropertiesadvanced _g_titlelabelproperties = null;
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_separatorpropertiesadvanced _g_separatorpropertiesadvanced = null;
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced _g_trianglepropertiesadvanced = null;
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
public static class _aspm_titlelabelpropertiesadvanced{
public boolean IsInitialized;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public String TextAlignment_Vertical;
public String TextAlignment_Horizontal;
public int BackgroundColor;
public int ItemBackgroundColor;
public float LeftRightPadding;
public float Height;
public void Initialize() {
IsInitialized = true;
TextColor = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextAlignment_Vertical = "";
TextAlignment_Horizontal = "";
BackgroundColor = 0;
ItemBackgroundColor = 0;
LeftRightPadding = 0f;
Height = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _aspm_separatorpropertiesadvanced{
public boolean IsInitialized;
public float Height;
public int BackgroundColor;
public void Initialize() {
IsInitialized = true;
Height = 0f;
BackgroundColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _aspm_trianglepropertiesadvanced{
public boolean IsInitialized;
public int Color;
public float Width;
public float Height;
public float Left;
public float Top;
public void Initialize() {
IsInitialized = true;
Color = 0;
Width = 0f;
Height = 0f;
Left = 0f;
Top = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _additem(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl,Object _value) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Public Sub AddItem(xPnl As B4XView,Value As Object";
 //BA.debugLineNum = 339;BA.debugLine="xclv.Add(xPnl,Value)";
_xclv._add(_xpnl,_value);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return "";
}
public String  _additemat(int _index,anywheresoftware.b4a.objects.B4XViewWrapper _xpnl,Object _value) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Public Sub AddItemAt(Index As Int,xPnl As B4XView,";
 //BA.debugLineNum = 343;BA.debugLine="xclv.InsertAt(Index,xPnl,Value)";
_xclv._insertat(_index,_xpnl,_value);
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return "";
}
public String  _addseparator() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_separator = null;
 //BA.debugLineNum = 369;BA.debugLine="Public Sub AddSeparator";
 //BA.debugLineNum = 370;BA.debugLine="Dim xpnl_Separator As B4XView = xui.CreatePanel(\"";
_xpnl_separator = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_separator = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 371;BA.debugLine="xpnl_Separator.Color = g_SeparatorPropertiesAdvan";
_xpnl_separator.setColor(_g_separatorpropertiesadvanced.BackgroundColor /*int*/ );
 //BA.debugLineNum = 372;BA.debugLine="xclv.Add(xpnl_Separator,\"Separator\")";
_xclv._add(_xpnl_separator,(Object)("Separator"));
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public String  _addtitle(String _text,float _height) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_item_background = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_text = null;
 //BA.debugLineNum = 350;BA.debugLine="Public Sub AddTitle(Text As String, Height As Floa";
 //BA.debugLineNum = 352;BA.debugLine="Dim xpnl_item_background As B4XView = xui.CreateP";
_xpnl_item_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_item_background = _xui.CreatePanel(ba,"item");
 //BA.debugLineNum = 353;BA.debugLine="xpnl_item_background.Tag = \"title\"";
_xpnl_item_background.setTag((Object)("title"));
 //BA.debugLineNum = 354;BA.debugLine="xpnl_item_background.Color = g_TitleLabelProperti";
_xpnl_item_background.setColor(_g_titlelabelproperties.ItemBackgroundColor /*int*/ );
 //BA.debugLineNum = 355;BA.debugLine="Dim xlbl_text As B4XView = CreateLabel(\"\")";
_xlbl_text = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_text = _createlabel("");
 //BA.debugLineNum = 356;BA.debugLine="xlbl_text.TextColor = g_TitleLabelProperties.Text";
_xlbl_text.setTextColor(_g_titlelabelproperties.TextColor /*int*/ );
 //BA.debugLineNum = 357;BA.debugLine="xlbl_text.Font = g_TitleLabelProperties.xFont";
_xlbl_text.setFont(_g_titlelabelproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 358;BA.debugLine="xlbl_text.Text = Text";
_xlbl_text.setText(BA.ObjectToCharSequence(_text));
 //BA.debugLineNum = 359;BA.debugLine="xlbl_text.SetTextAlignment(g_TitleLabelProperties";
_xlbl_text.SetTextAlignment(_g_titlelabelproperties.TextAlignment_Vertical /*String*/ ,_g_titlelabelproperties.TextAlignment_Horizontal /*String*/ );
 //BA.debugLineNum = 360;BA.debugLine="xlbl_text.Color = g_TitleLabelProperties.Backgrou";
_xlbl_text.setColor(_g_titlelabelproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 361;BA.debugLine="xpnl_item_background.Color = g_TitleLabelProperti";
_xpnl_item_background.setColor(_g_titlelabelproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 362;BA.debugLine="xpnl_item_background.AddView(xlbl_text,0,0,0,0)";
_xpnl_item_background.AddView((android.view.View)(_xlbl_text.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 363;BA.debugLine="g_TitleLabelProperties.Height = Height";
_g_titlelabelproperties.Height /*float*/  = _height;
 //BA.debugLineNum = 364;BA.debugLine="xclv.Add(xpnl_item_background,\"Title\")";
_xclv._add(_xpnl_item_background,(Object)("Title"));
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 33;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 34;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
 //BA.debugLineNum = 35;BA.debugLine="Private mEventName As String";
_meventname = "";
 //BA.debugLineNum = 37;BA.debugLine="Public AutoHideMs As Int";
_autohidems = 0;
 //BA.debugLineNum = 38;BA.debugLine="Public CloseDurationMs As Int = 500";
_closedurationms = (int) (500);
 //BA.debugLineNum = 39;BA.debugLine="Public OpenDurationMs As Int = 250";
_opendurationms = (int) (250);
 //BA.debugLineNum = 41;BA.debugLine="Private m_MenuViewGap As Float = 0";
_m_menuviewgap = (float) (0);
 //BA.debugLineNum = 43;BA.debugLine="Private xclv As CustomListView";
_xclv = new b4a.example3.customlistview();
 //BA.debugLineNum = 45;BA.debugLine="Private xpnl_Background As B4XView";
_xpnl_background = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private xpnl_Menu As B4XView";
_xpnl_menu = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private xpnl_Triangle As B4XView";
_xpnl_triangle = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private m_Orientation As String = \"Vertical\"";
_m_orientation = "Vertical";
 //BA.debugLineNum = 50;BA.debugLine="Private m_Radius As Int = 0 'ignore";
_m_radius = (int) (0);
 //BA.debugLineNum = 52;BA.debugLine="Private g_OrientationVertical As String";
_g_orientationvertical = "";
 //BA.debugLineNum = 53;BA.debugLine="Private g_OrientationHorizontal As String";
_g_orientationhorizontal = "";
 //BA.debugLineNum = 54;BA.debugLine="Private g_IsInSpecialContainer As Boolean = False";
_g_isinspecialcontainer = __c.False;
 //BA.debugLineNum = 55;BA.debugLine="Private LeftTop_Root() As Int";
_lefttop_root = new int[(int) (0)];
;
 //BA.debugLineNum = 56;BA.debugLine="Private actHasActionBar As Boolean = False";
_acthasactionbar = __c.False;
 //BA.debugLineNum = 57;BA.debugLine="Private max_x,max_y As Float";
_max_x = 0f;
_max_y = 0f;
 //BA.debugLineNum = 58;BA.debugLine="Private max_endlessloop As Int = 0";
_max_endlessloop = (int) (0);
 //BA.debugLineNum = 59;BA.debugLine="Private m_ShowTriangle As Boolean = False";
_m_showtriangle = __c.False;
 //BA.debugLineNum = 61;BA.debugLine="Private m_isOpen As Boolean = False";
_m_isopen = __c.False;
 //BA.debugLineNum = 63;BA.debugLine="Type ASPM_TitleLabelPropertiesAdvanced(TextColor";
;
 //BA.debugLineNum = 64;BA.debugLine="Type ASPM_SeparatorPropertiesAdvanced(Height As F";
;
 //BA.debugLineNum = 65;BA.debugLine="Type ASPM_TrianglePropertiesAdvanced(Color As Int";
;
 //BA.debugLineNum = 67;BA.debugLine="Private g_TitleLabelProperties As ASPM_TitleLabel";
_g_titlelabelproperties = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_titlelabelpropertiesadvanced();
 //BA.debugLineNum = 68;BA.debugLine="Private g_SeparatorPropertiesAdvanced As ASPM_Sep";
_g_separatorpropertiesadvanced = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_separatorpropertiesadvanced();
 //BA.debugLineNum = 69;BA.debugLine="Private g_TrianglePropertiesAdvanced As ASPM_Tria";
_g_trianglepropertiesadvanced = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 347;BA.debugLine="xclv.Clear";
_xclv._clear();
 //BA.debugLineNum = 348;BA.debugLine="End Sub";
return "";
}
public String  _closemenu() throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Public Sub CloseMenu";
 //BA.debugLineNum = 330;BA.debugLine="xpnl_Background.SetVisibleAnimated(CloseDurationM";
_xpnl_background.SetVisibleAnimated(_closedurationms,__c.False);
 //BA.debugLineNum = 331;BA.debugLine="If xpnl_Triangle.IsInitialized = True Then xpnl_T";
if (_xpnl_triangle.IsInitialized()==__c.True) { 
_xpnl_triangle.setVisible(__c.False);};
 //BA.debugLineNum = 332;BA.debugLine="xpnl_Menu.RemoveViewFromParent";
_xpnl_menu.RemoveViewFromParent();
 //BA.debugLineNum = 333;BA.debugLine="MenuClosed";
_menuclosed();
 //BA.debugLineNum = 334;BA.debugLine="m_isOpen = False";
_m_isopen = __c.False;
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_separatorpropertiesadvanced  _createaspm_separatorpropertiesadvanced(float _height,int _backgroundcolor) throws Exception{
com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_separatorpropertiesadvanced _t1 = null;
 //BA.debugLineNum = 594;BA.debugLine="Public Sub CreateASPM_SeparatorPropertiesAdvanced";
 //BA.debugLineNum = 595;BA.debugLine="Dim t1 As ASPM_SeparatorPropertiesAdvanced";
_t1 = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_separatorpropertiesadvanced();
 //BA.debugLineNum = 596;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 597;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 598;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 599;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_titlelabelpropertiesadvanced  _createaspm_titlelabelpropertiesadvanced(int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,String _textalignment_vertical,String _textalignment_horizontal,int _backgroundcolor,int _itembackgroundcolor,float _leftrightpadding,float _height) throws Exception{
com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_titlelabelpropertiesadvanced _t1 = null;
 //BA.debugLineNum = 580;BA.debugLine="Public Sub CreateASPM_TitleLabelPropertiesAdvanced";
 //BA.debugLineNum = 581;BA.debugLine="Dim t1 As ASPM_TitleLabelPropertiesAdvanced";
_t1 = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_titlelabelpropertiesadvanced();
 //BA.debugLineNum = 582;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 583;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 584;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 585;BA.debugLine="t1.TextAlignment_Vertical = TextAlignment_Vertica";
_t1.TextAlignment_Vertical /*String*/  = _textalignment_vertical;
 //BA.debugLineNum = 586;BA.debugLine="t1.TextAlignment_Horizontal = TextAlignment_Horiz";
_t1.TextAlignment_Horizontal /*String*/  = _textalignment_horizontal;
 //BA.debugLineNum = 587;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 588;BA.debugLine="t1.ItemBackgroundColor = ItemBackgroundColor";
_t1.ItemBackgroundColor /*int*/  = _itembackgroundcolor;
 //BA.debugLineNum = 589;BA.debugLine="t1.LeftRightPadding = LeftRightPadding";
_t1.LeftRightPadding /*float*/  = _leftrightpadding;
 //BA.debugLineNum = 590;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 591;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 592;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced  _createaspm_trianglepropertiesadvanced(int _color,float _width,float _height,float _left,float _top) throws Exception{
com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced _t1 = null;
 //BA.debugLineNum = 602;BA.debugLine="Public Sub CreateASPM_TrianglePropertiesAdvanced (";
 //BA.debugLineNum = 603;BA.debugLine="Dim t1 As ASPM_TrianglePropertiesAdvanced";
_t1 = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced();
 //BA.debugLineNum = 604;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 605;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
 //BA.debugLineNum = 606;BA.debugLine="t1.Width = Width";
_t1.Width /*float*/  = _width;
 //BA.debugLineNum = 607;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 608;BA.debugLine="t1.Left = Left";
_t1.Left /*float*/  = _left;
 //BA.debugLineNum = 609;BA.debugLine="t1.Top = Top";
_t1.Top /*float*/  = _top;
 //BA.debugLineNum = 610;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 611;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _eventname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _tmp_lbl = null;
 //BA.debugLineNum = 477;BA.debugLine="Private Sub CreateLabel(EventName As String) As B4";
 //BA.debugLineNum = 478;BA.debugLine="Dim tmp_lbl As Label";
_tmp_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 479;BA.debugLine="tmp_lbl.Initialize(EventName)";
_tmp_lbl.Initialize(ba,_eventname);
 //BA.debugLineNum = 483;BA.debugLine="Return tmp_lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_tmp_lbl.getObject()));
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getbackgroundpanel() throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Public Sub getBackgroundPanel As B4XView";
 //BA.debugLineNum = 438;BA.debugLine="Return xpnl_Background";
if (true) return _xpnl_background;
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public b4a.example3.customlistview  _getcustomlistview() throws Exception{
 //BA.debugLineNum = 381;BA.debugLine="Public Sub getCustomListView As CustomListView";
 //BA.debugLineNum = 382;BA.debugLine="Return xclv";
if (true) return _xclv;
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return null;
}
public boolean  _getisopen() throws Exception{
 //BA.debugLineNum = 433;BA.debugLine="Public Sub getisOpen As Boolean";
 //BA.debugLineNum = 434;BA.debugLine="Return m_isOpen";
if (true) return _m_isopen;
 //BA.debugLineNum = 435;BA.debugLine="End Sub";
return false;
}
public String  _getorientationhorizontal_left() throws Exception{
 //BA.debugLineNum = 566;BA.debugLine="Public Sub getOrientationHorizontal_LEFT As String";
 //BA.debugLineNum = 567;BA.debugLine="Return \"LEFT\"";
if (true) return "LEFT";
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return "";
}
public String  _getorientationhorizontal_middle() throws Exception{
 //BA.debugLineNum = 570;BA.debugLine="Public Sub getOrientationHorizontal_MIDDLE As Stri";
 //BA.debugLineNum = 571;BA.debugLine="Return \"MIDDLE\"";
if (true) return "MIDDLE";
 //BA.debugLineNum = 572;BA.debugLine="End Sub";
return "";
}
public String  _getorientationhorizontal_right() throws Exception{
 //BA.debugLineNum = 574;BA.debugLine="Public Sub getOrientationHorizontal_RIGHT As Strin";
 //BA.debugLineNum = 575;BA.debugLine="Return \"RIGHT\"";
if (true) return "RIGHT";
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return "";
}
public String  _getorientationvertical_bottom() throws Exception{
 //BA.debugLineNum = 562;BA.debugLine="Public Sub getOrientationVertical_BOTTOM As String";
 //BA.debugLineNum = 563;BA.debugLine="Return \"BOTTOM\"";
if (true) return "BOTTOM";
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return "";
}
public String  _getorientationvertical_top() throws Exception{
 //BA.debugLineNum = 558;BA.debugLine="Public Sub getOrientationVertical_TOP As String";
 //BA.debugLineNum = 559;BA.debugLine="Return \"TOP\"";
if (true) return "TOP";
 //BA.debugLineNum = 560;BA.debugLine="End Sub";
return "";
}
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_separatorpropertiesadvanced  _getseparatorproperties() throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Public Sub getSeparatorProperties As ASPM_Separato";
 //BA.debugLineNum = 393;BA.debugLine="Return g_SeparatorPropertiesAdvanced";
if (true) return _g_separatorpropertiesadvanced;
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_titlelabelpropertiesadvanced  _gettitlelabelproperties() throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Public Sub getTitleLabelProperties As ASPM_TitleLa";
 //BA.debugLineNum = 388;BA.debugLine="Return g_TitleLabelProperties";
if (true) return _g_titlelabelproperties;
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return null;
}
public String  _gettopleft(float _top,float _left,float _width,anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
 //BA.debugLineNum = 505;BA.debugLine="Private Sub GetTopLeft(top As Float,left As Float,";
 //BA.debugLineNum = 507;BA.debugLine="If top < 0 Then";
if (_top<0) { 
 //BA.debugLineNum = 508;BA.debugLine="top = view.Top + view.Height";
_top = (float) (_view.getTop()+_view.getHeight());
 }else if((_top+_xpnl_menu.getHeight())>_max_y) { 
 //BA.debugLineNum = 510;BA.debugLine="top = view.Top - xpnl_Menu.Height";
_top = (float) (_view.getTop()-_xpnl_menu.getHeight());
 }else if(_left<0) { 
 //BA.debugLineNum = 512;BA.debugLine="left = 0";
_left = (float) (0);
 }else if((_left+_width)>_max_x) { 
 //BA.debugLineNum = 514;BA.debugLine="left = max_x - width";
_left = (float) (_max_x-_width);
 }else {
 //BA.debugLineNum = 516;BA.debugLine="CallSubDelayed3(Me,\"lol\",left,top)";
__c.CallSubDelayed3(ba,this,"lol",(Object)(_left),(Object)(_top));
 //BA.debugLineNum = 517;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 519;BA.debugLine="If max_endlessloop = 10 Then";
if (_max_endlessloop==10) { 
 //BA.debugLineNum = 520;BA.debugLine="CallSubDelayed3(Me,\"lol\",left,top)";
__c.CallSubDelayed3(ba,this,"lol",(Object)(_left),(Object)(_top));
 //BA.debugLineNum = 521;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 523;BA.debugLine="max_endlessloop = max_endlessloop +1";
_max_endlessloop = (int) (_max_endlessloop+1);
 //BA.debugLineNum = 524;BA.debugLine="GetTopLeft(top,left,width,view)";
_gettopleft(_top,_left,_width,_view);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return "";
}
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced  _gettriangleproperties() throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Public Sub getTriangleProperties As ASPM_TriangleP";
 //BA.debugLineNum = 398;BA.debugLine="Return g_TrianglePropertiesAdvanced";
if (true) return _g_trianglepropertiesadvanced;
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return null;
}
public String  _ini_xclv() throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _tmplbl = null;
anywheresoftware.b4a.objects.collections.Map _tmpmap = null;
 //BA.debugLineNum = 110;BA.debugLine="Private Sub ini_xclv";
 //BA.debugLineNum = 112;BA.debugLine="Dim tmplbl As Label";
_tmplbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 113;BA.debugLine="tmplbl.Initialize(\"\")";
_tmplbl.Initialize(ba,"");
 //BA.debugLineNum = 115;BA.debugLine="Dim tmpmap As Map";
_tmpmap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 116;BA.debugLine="tmpmap.Initialize";
_tmpmap.Initialize();
 //BA.debugLineNum = 117;BA.debugLine="tmpmap.Put(\"DividerColor\",0)'0xFFD9D7DE)";
_tmpmap.Put((Object)("DividerColor"),(Object)(0));
 //BA.debugLineNum = 118;BA.debugLine="tmpmap.Put(\"DividerHeight\",0)";
_tmpmap.Put((Object)("DividerHeight"),(Object)(0));
 //BA.debugLineNum = 119;BA.debugLine="tmpmap.Put(\"PressedColor\",0x007EB4FA)'0xFF7EB4FA";
_tmpmap.Put((Object)("PressedColor"),(Object)(((int)0x007eb4fa)));
 //BA.debugLineNum = 120;BA.debugLine="tmpmap.Put(\"InsertAnimationDuration\",0)";
_tmpmap.Put((Object)("InsertAnimationDuration"),(Object)(0));
 //BA.debugLineNum = 121;BA.debugLine="tmpmap.Put(\"ListOrientation\",m_Orientation)";
_tmpmap.Put((Object)("ListOrientation"),(Object)(_m_orientation));
 //BA.debugLineNum = 122;BA.debugLine="tmpmap.Put(\"ShowScrollBar\",False)";
_tmpmap.Put((Object)("ShowScrollBar"),(Object)(__c.False));
 //BA.debugLineNum = 124;BA.debugLine="xclv.AnimationDuration = 0";
_xclv._animationduration = (int) (0);
 //BA.debugLineNum = 125;BA.debugLine="xclv.Initialize(Me,\"xclv\")";
_xclv._initialize(ba,this,"xclv");
 //BA.debugLineNum = 126;BA.debugLine="xclv.DesignerCreateView(xpnl_Menu,tmplbl,tmpmap)";
_xclv._designercreateview((Object)(_xpnl_menu.getObject()),_tmplbl,_tmpmap);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _parent,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 77;BA.debugLine="Public Sub Initialize(Parent As B4XView,CallBack A";
 //BA.debugLineNum = 78;BA.debugLine="mCallBack = CallBack";
_mcallback = _callback;
 //BA.debugLineNum = 79;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 81;BA.debugLine="g_OrientationVertical = getOrientationVertical_TO";
_g_orientationvertical = _getorientationvertical_top();
 //BA.debugLineNum = 82;BA.debugLine="g_OrientationHorizontal = getOrientationHorizonta";
_g_orientationhorizontal = _getorientationhorizontal_middle();
 //BA.debugLineNum = 84;BA.debugLine="max_x = Parent.Width";
_max_x = (float) (_parent.getWidth());
 //BA.debugLineNum = 85;BA.debugLine="max_y = Parent.Height";
_max_y = (float) (_parent.getHeight());
 //BA.debugLineNum = 87;BA.debugLine="xpnl_Background = xui.CreatePanel(\"xpnl_Backgroun";
_xpnl_background = _xui.CreatePanel(ba,"xpnl_Background");
 //BA.debugLineNum = 88;BA.debugLine="xpnl_Background.Color = xui.Color_Transparent";
_xpnl_background.setColor(_xui.Color_Transparent);
 //BA.debugLineNum = 89;BA.debugLine="Parent.AddView(xpnl_Background,0,0,Parent.Width,P";
_parent.AddView((android.view.View)(_xpnl_background.getObject()),(int) (0),(int) (0),_parent.getWidth(),_parent.getHeight());
 //BA.debugLineNum = 90;BA.debugLine="xpnl_Background.Visible = False";
_xpnl_background.setVisible(__c.False);
 //BA.debugLineNum = 92;BA.debugLine="xpnl_Background.Color = xui.Color_ARGB(152,0,0,0)";
_xpnl_background.setColor(_xui.Color_ARGB((int) (152),(int) (0),(int) (0),(int) (0)));
 //BA.debugLineNum = 94;BA.debugLine="xpnl_Menu = xui.CreatePanel(\"\")";
_xpnl_menu = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 95;BA.debugLine="xpnl_Menu.Color = xui.Color_ARGB(255,32, 33, 37)";
_xpnl_menu.setColor(_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)));
 //BA.debugLineNum = 97;BA.debugLine="ini_xclv";
_ini_xclv();
 //BA.debugLineNum = 99;BA.debugLine="g_TitleLabelProperties = CreateASPM_TitleLabelPro";
_g_titlelabelproperties = _createaspm_titlelabelpropertiesadvanced(_xui.Color_White,_xui.CreateDefaultBoldFont((float) (18)),"CENTER","CENTER",_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),_xui.Color_ARGB((int) (255),(int) (32),(int) (33),(int) (37)),(float) (__c.DipToCurrent((int) (5))),(float) (__c.DipToCurrent((int) (60))));
 //BA.debugLineNum = 100;BA.debugLine="g_SeparatorPropertiesAdvanced = CreateASPM_Separa";
_g_separatorpropertiesadvanced = _createaspm_separatorpropertiesadvanced((float) (__c.DipToCurrent((int) (2))),_xui.Color_ARGB((int) (255),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 101;BA.debugLine="g_TrianglePropertiesAdvanced = CreateASPM_Triangl";
_g_trianglepropertiesadvanced = _createaspm_trianglepropertiesadvanced(_xui.Color_White,(float) (__c.DipToCurrent((int) (20))),(float) (__c.DipToCurrent((int) (10))),(float) (-1),(float) (-1));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _itemclick(int _index,Object _tag) throws Exception{
 //BA.debugLineNum = 459;BA.debugLine="Private Sub ItemClick(index As Int,tag As Object)";
 //BA.debugLineNum = 460;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemCli";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ItemClick",(int) (2))) { 
 //BA.debugLineNum = 461;BA.debugLine="CallSub3(mCallBack,mEventName & \"_ItemClick\",ind";
__c.CallSubNew3(ba,_mcallback,_meventname+"_ItemClick",(Object)(_index),_tag);
 };
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public String  _itemlongclick(int _index,Object _tag) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Private Sub ItemLongClick(index As Int,tag As Obje";
 //BA.debugLineNum = 466;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_ItemLon";
if (_xui.SubExists(ba,_mcallback,_meventname+"_ItemLongClick",(int) (2))) { 
 //BA.debugLineNum = 467;BA.debugLine="CallSub3(mCallBack,mEventName & \"_ItemLongClick\"";
__c.CallSubNew3(ba,_mcallback,_meventname+"_ItemLongClick",(Object)(_index),_tag);
 };
 //BA.debugLineNum = 469;BA.debugLine="End Sub";
return "";
}
public String  _menuclosed() throws Exception{
 //BA.debugLineNum = 471;BA.debugLine="Private Sub MenuClosed";
 //BA.debugLineNum = 472;BA.debugLine="If xui.SubExists(mCallBack,mEventName & \"_MenuClo";
if (_xui.SubExists(ba,_mcallback,_meventname+"_MenuClosed",(int) (0))) { 
 //BA.debugLineNum = 473;BA.debugLine="CallSub(mCallBack,mEventName & \"_MenuClosed\")";
__c.CallSubNew(ba,_mcallback,_meventname+"_MenuClosed");
 };
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public void  _openmenu(float _width,float _height) throws Exception{
ResumableSub_OpenMenu rsub = new ResumableSub_OpenMenu(this,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenMenu extends BA.ResumableSub {
public ResumableSub_OpenMenu(com.holydesing.software.wallpaperhq.aspopupmenuadvanced parent,float _width,float _height) {
this.parent = parent;
this._width = _width;
this._height = _height;
}
com.holydesing.software.wallpaperhq.aspopupmenuadvanced parent;
float _width;
float _height;
int _i = 0;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 235;BA.debugLine="m_isOpen = True";
parent._m_isopen = parent.__c.True;
 //BA.debugLineNum = 236;BA.debugLine="If xpnl_Menu.Parent.IsInitialized = False Then xp";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._xpnl_menu.getParent().IsInitialized()==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._xpnl_background.AddView((android.view.View)(parent._xpnl_menu.getObject()),(int) (parent._xpnl_background.getWidth()/(double)2-_width/(double)2),(int) (parent._xpnl_background.getHeight()/(double)2-_height/(double)2),(int) (_width),(int) (_height));
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 238;BA.debugLine="xclv.Base_Resize(Width,Height)";
parent._xclv._base_resize(_width,_height);
 //BA.debugLineNum = 239;BA.debugLine="xclv.AsView.SetLayoutAnimated(0,0,0,Width,Height)";
parent._xclv._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 241;BA.debugLine="xpnl_Menu.SetLayoutAnimated(0,xpnl_Background.Wid";
parent._xpnl_menu.SetLayoutAnimated((int) (0),(int) (parent._xpnl_background.getWidth()/(double)2-_width/(double)2),(int) (parent._xpnl_background.getHeight()/(double)2-_height/(double)2),(int) (_width),(int) (_height));
 //BA.debugLineNum = 243;BA.debugLine="For i = 0 To xclv.Size -1";
if (true) break;

case 7:
//for
this.state = 16;
step6 = 1;
limit6 = (int) (parent._xclv._getsize()-1);
_i = (int) (0) ;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 16;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 9;
if (true) break;

case 22:
//C
this.state = 21;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 244;BA.debugLine="If xclv.GetValue(i) Is String And \"Title\" = xclv";
if (true) break;

case 10:
//if
this.state = 15;
if (parent._xclv._getvalue(_i) instanceof String && ("Title").equals(BA.ObjectToString(parent._xclv._getvalue(_i)))) { 
this.state = 12;
}else if(parent._xclv._getvalue(_i) instanceof String && ("Separator").equals(BA.ObjectToString(parent._xclv._getvalue(_i)))) { 
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 245;BA.debugLine="xclv.GetPanel(i).SetLayoutAnimated(0,0,0,Width,";
parent._xclv._getpanel(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 246;BA.debugLine="xclv.GetPanel(i).GetView(0).SetLayoutAnimated(0";
parent._xclv._getpanel(_i).GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 247;BA.debugLine="xclv.ResizeItem(i,g_TitleLabelProperties.Height";
parent._xclv._resizeitem(_i,(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 249;BA.debugLine="xclv.GetPanel(i).SetLayoutAnimated(0,0,0,Width,";
parent._xclv._getpanel(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_separatorpropertiesadvanced.Height /*float*/ ));
 //BA.debugLineNum = 250;BA.debugLine="xclv.ResizeItem(i,g_SeparatorPropertiesAdvanced";
parent._xclv._resizeitem(_i,(int) (parent._g_separatorpropertiesadvanced.Height /*float*/ ));
 if (true) break;

case 15:
//C
this.state = 22;
;
 if (true) break;
if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 258;BA.debugLine="xpnl_Background.SetVisibleAnimated(OpenDurationMs";
parent._xpnl_background.SetVisibleAnimated(parent._opendurationms,parent.__c.True);
 //BA.debugLineNum = 260;BA.debugLine="If AutoHideMs > 0 Then";
if (true) break;

case 17:
//if
this.state = 20;
if (parent._autohidems>0) { 
this.state = 19;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 261;BA.debugLine="Sleep(AutoHideMs)";
parent.__c.Sleep(ba,this,parent._autohidems);
this.state = 23;
return;
case 23:
//C
this.state = 20;
;
 //BA.debugLineNum = 262;BA.debugLine="CloseMenu";
parent._closemenu();
 if (true) break;

case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _openmenuadvanced(float _left,float _top,float _width,float _height) throws Exception{
ResumableSub_OpenMenuAdvanced rsub = new ResumableSub_OpenMenuAdvanced(this,_left,_top,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenMenuAdvanced extends BA.ResumableSub {
public ResumableSub_OpenMenuAdvanced(com.holydesing.software.wallpaperhq.aspopupmenuadvanced parent,float _left,float _top,float _width,float _height) {
this.parent = parent;
this._left = _left;
this._top = _top;
this._width = _width;
this._height = _height;
}
com.holydesing.software.wallpaperhq.aspopupmenuadvanced parent;
float _left;
float _top;
float _width;
float _height;
int _i = 0;
anywheresoftware.b4a.objects.B4XCanvas _xcv = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int step6;
int limit6;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 267;BA.debugLine="m_isOpen = True";
parent._m_isopen = parent.__c.True;
 //BA.debugLineNum = 268;BA.debugLine="If xpnl_Menu.Parent.IsInitialized = False Then xp";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._xpnl_menu.getParent().IsInitialized()==parent.__c.False) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
parent._xpnl_background.AddView((android.view.View)(parent._xpnl_menu.getObject()),(int) (parent._xpnl_background.getWidth()/(double)2-_width/(double)2),(int) (parent._xpnl_background.getHeight()/(double)2-_height/(double)2),(int) (_width),(int) (_height));
if (true) break;

case 6:
//C
this.state = 7;
;
 //BA.debugLineNum = 270;BA.debugLine="xclv.Base_Resize(Width,Height)";
parent._xclv._base_resize(_width,_height);
 //BA.debugLineNum = 271;BA.debugLine="xclv.AsView.SetLayoutAnimated(0,0,0,Width,Height)";
parent._xclv._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 273;BA.debugLine="xpnl_Menu.SetLayoutAnimated(0,Left,Top,Width,Heig";
parent._xpnl_menu.SetLayoutAnimated((int) (0),(int) (_left),(int) (_top),(int) (_width),(int) (_height));
 //BA.debugLineNum = 275;BA.debugLine="For i = 0 To xclv.Size -1";
if (true) break;

case 7:
//for
this.state = 16;
step6 = 1;
limit6 = (int) (parent._xclv._getsize()-1);
_i = (int) (0) ;
this.state = 34;
if (true) break;

case 34:
//C
this.state = 16;
if ((step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6)) this.state = 9;
if (true) break;

case 35:
//C
this.state = 34;
_i = ((int)(0 + _i + step6)) ;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 276;BA.debugLine="If xclv.GetValue(i) Is String And \"Title\" = xclv";
if (true) break;

case 10:
//if
this.state = 15;
if (parent._xclv._getvalue(_i) instanceof String && ("Title").equals(BA.ObjectToString(parent._xclv._getvalue(_i)))) { 
this.state = 12;
}else if(parent._xclv._getvalue(_i) instanceof String && ("Separator").equals(BA.ObjectToString(parent._xclv._getvalue(_i)))) { 
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 //BA.debugLineNum = 277;BA.debugLine="xclv.GetPanel(i).SetLayoutAnimated(0,0,0,Width,";
parent._xclv._getpanel(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 278;BA.debugLine="xclv.GetPanel(i).GetView(0).SetLayoutAnimated(0";
parent._xclv._getpanel(_i).GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 279;BA.debugLine="xclv.ResizeItem(i,g_TitleLabelProperties.Height";
parent._xclv._resizeitem(_i,(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 281;BA.debugLine="xclv.GetPanel(i).SetLayoutAnimated(0,0,0,Width,";
parent._xclv._getpanel(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_separatorpropertiesadvanced.Height /*float*/ ));
 //BA.debugLineNum = 282;BA.debugLine="xclv.ResizeItem(i,g_SeparatorPropertiesAdvanced";
parent._xclv._resizeitem(_i,(int) (parent._g_separatorpropertiesadvanced.Height /*float*/ ));
 if (true) break;

case 15:
//C
this.state = 35;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 286;BA.debugLine="If m_ShowTriangle = True Then";

case 16:
//if
this.state = 29;
if (parent._m_showtriangle==parent.__c.True) { 
this.state = 18;
}if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 287;BA.debugLine="xpnl_Triangle = xui.CreatePanel(\"\")";
parent._xpnl_triangle = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 288;BA.debugLine="xpnl_Triangle.Color = xui.Color_Transparent";
parent._xpnl_triangle.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 289;BA.debugLine="xpnl_Background.AddView(xpnl_Triangle,xpnl_Menu.";
parent._xpnl_background.AddView((android.view.View)(parent._xpnl_triangle.getObject()),(int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Width /*float*/ ),(int) ((double)(BA.ObjectToNumber(((parent._g_trianglepropertiesadvanced.Top /*float*/ ==-1) ? ((Object)(parent._xpnl_menu.getTop())) : ((Object)(parent._g_trianglepropertiesadvanced.Top /*float*/ )))))-parent._g_trianglepropertiesadvanced.Height /*float*/ ),(int) (parent._g_trianglepropertiesadvanced.Width /*float*/ ),(int) (parent._g_trianglepropertiesadvanced.Height /*float*/ ));
 //BA.debugLineNum = 291;BA.debugLine="Dim xCV As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 292;BA.debugLine="xCV.Initialize(xpnl_Triangle)";
_xcv.Initialize(parent._xpnl_triangle);
 //BA.debugLineNum = 294;BA.debugLine="xCV.ClearRect(xCV.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
 //BA.debugLineNum = 295;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 296;BA.debugLine="Select g_OrientationVertical";
if (true) break;

case 19:
//select
this.state = 28;
switch (BA.switchObjectToInt(parent._g_orientationvertical,parent._getorientationvertical_top(),parent._getorientationvertical_bottom(),parent._getorientationhorizontal_right(),parent._getorientationhorizontal_left())) {
case 0: {
this.state = 21;
if (true) break;
}
case 1: {
this.state = 23;
if (true) break;
}
case 2: {
this.state = 25;
if (true) break;
}
case 3: {
this.state = 27;
if (true) break;
}
}
if (true) break;

case 21:
//C
this.state = 28;
 //BA.debugLineNum = 298;BA.debugLine="p.Initialize(0, 0).LineTo(xpnl_Triangle.Width,";
_p.Initialize((float) (0),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()/(double)2),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (0));
 //BA.debugLineNum = 299;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Left /*float*/ ));
 if (true) break;

case 23:
//C
this.state = 28;
 //BA.debugLineNum = 301;BA.debugLine="p.Initialize(xpnl_Triangle.Width / 2, 0).LineT";
_p.Initialize((float) (parent._xpnl_triangle.getWidth()/(double)2),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (parent._xpnl_triangle.getWidth()/(double)2),(float) (0));
 //BA.debugLineNum = 302;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Left /*float*/ ));
 if (true) break;

case 25:
//C
this.state = 28;
 //BA.debugLineNum = 304;BA.debugLine="p.Initialize(xpnl_Triangle.Width, 0).LineTo(xp";
_p.Initialize((float) (parent._xpnl_triangle.getWidth()),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (parent._xpnl_triangle.getHeight()/(double)2)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (0));
 //BA.debugLineNum = 305;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Top /*float*/ ));
 if (true) break;

case 27:
//C
this.state = 28;
 //BA.debugLineNum = 307;BA.debugLine="p.Initialize(0, 0).LineTo(xpnl_Triangle.Width,";
_p.Initialize((float) (0),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (parent._xpnl_triangle.getHeight()/(double)2)).LineTo((float) (0),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (0));
 //BA.debugLineNum = 308;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Top /*float*/ ));
 if (true) break;

case 28:
//C
this.state = 29;
;
 //BA.debugLineNum = 311;BA.debugLine="xCV.DrawPath(p, g_TrianglePropertiesAdvanced.Col";
_xcv.DrawPath(_p,parent._g_trianglepropertiesadvanced.Color /*int*/ ,parent.__c.True,(float) (0));
 //BA.debugLineNum = 312;BA.debugLine="xCV.Invalidate";
_xcv.Invalidate();
 if (true) break;

case 29:
//C
this.state = 30;
;
 //BA.debugLineNum = 320;BA.debugLine="xpnl_Background.SetVisibleAnimated(OpenDurationMs";
parent._xpnl_background.SetVisibleAnimated(parent._opendurationms,parent.__c.True);
 //BA.debugLineNum = 322;BA.debugLine="If AutoHideMs > 0 Then";
if (true) break;

case 30:
//if
this.state = 33;
if (parent._autohidems>0) { 
this.state = 32;
}if (true) break;

case 32:
//C
this.state = 33;
 //BA.debugLineNum = 323;BA.debugLine="Sleep(AutoHideMs)";
parent.__c.Sleep(ba,this,parent._autohidems);
this.state = 36;
return;
case 36:
//C
this.state = 33;
;
 //BA.debugLineNum = 324;BA.debugLine="CloseMenu";
parent._closemenu();
 if (true) break;

case 33:
//C
this.state = -1;
;
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _openmenuonview(anywheresoftware.b4a.objects.B4XViewWrapper _xview,float _width,float _height) throws Exception{
ResumableSub_OpenMenuOnView rsub = new ResumableSub_OpenMenuOnView(this,_xview,_width,_height);
rsub.resume(ba, null);
}
public static class ResumableSub_OpenMenuOnView extends BA.ResumableSub {
public ResumableSub_OpenMenuOnView(com.holydesing.software.wallpaperhq.aspopupmenuadvanced parent,anywheresoftware.b4a.objects.B4XViewWrapper _xview,float _width,float _height) {
this.parent = parent;
this._xview = _xview;
this._width = _width;
this._height = _height;
}
com.holydesing.software.wallpaperhq.aspopupmenuadvanced parent;
anywheresoftware.b4a.objects.B4XViewWrapper _xview;
float _width;
float _height;
int[] _ff = null;
float _top = 0f;
float _left = 0f;
anywheresoftware.b4j.object.JavaObject _j = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XCanvas _xcv = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XPath _p = null;
int step33;
int limit33;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 132;BA.debugLine="m_isOpen = True";
parent._m_isopen = parent.__c.True;
 //BA.debugLineNum = 133;BA.debugLine="Dim ff() As Int = ViewScreenPosition(xView)";
_ff = parent._viewscreenposition(_xview);
 //BA.debugLineNum = 135;BA.debugLine="If g_IsInSpecialContainer = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._g_isinspecialcontainer==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 136;BA.debugLine="Dim top As Float = ff(1) - LeftTop_Root(1)";
_top = (float) (_ff[(int) (1)]-parent._lefttop_root[(int) (1)]);
 //BA.debugLineNum = 137;BA.debugLine="Dim left As Float = ff(0) - LeftTop_Root(0)";
_left = (float) (_ff[(int) (0)]-parent._lefttop_root[(int) (0)]);
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 139;BA.debugLine="Dim top As Float = xView.top";
_top = (float) (_xview.getTop());
 //BA.debugLineNum = 140;BA.debugLine="Dim left As Float = xView.Left";
_left = (float) (_xview.getLeft());
 if (true) break;
;
 //BA.debugLineNum = 142;BA.debugLine="If actHasActionBar = True And g_IsInSpecialContai";

case 6:
//if
this.state = 9;
if (parent._acthasactionbar==parent.__c.True && parent._g_isinspecialcontainer==parent.__c.True) { 
this.state = 8;
}if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 144;BA.debugLine="Dim j As JavaObject : j.InitializeContext";
_j = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 144;BA.debugLine="Dim j As JavaObject : j.InitializeContext";
_j.InitializeContext(ba);
 //BA.debugLineNum = 145;BA.debugLine="top = top - j.RunMethodJO(\"getActionBar\",Null).R";
_top = (float) (_top-(double)(BA.ObjectToNumber(_j.RunMethodJO("getActionBar",(Object[])(parent.__c.Null)).RunMethod("getHeight",(Object[])(parent.__c.Null)))));
 if (true) break;
;
 //BA.debugLineNum = 152;BA.debugLine="If g_OrientationVertical = getOrientationVertical";

case 9:
//if
this.state = 14;
if ((parent._g_orientationvertical).equals(parent._getorientationvertical_top())) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 //BA.debugLineNum = 153;BA.debugLine="top = top - m_MenuViewGap";
_top = (float) (_top-parent._m_menuviewgap);
 if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 155;BA.debugLine="top = top + xView.Height + m_MenuViewGap";
_top = (float) (_top+_xview.getHeight()+parent._m_menuviewgap);
 if (true) break;
;
 //BA.debugLineNum = 158;BA.debugLine="If g_OrientationHorizontal = getOrientationHorizo";

case 14:
//if
this.state = 21;
if ((parent._g_orientationhorizontal).equals(parent._getorientationhorizontal_left())) { 
this.state = 16;
}else if((parent._g_orientationhorizontal).equals(parent._getorientationhorizontal_middle())) { 
this.state = 18;
}else {
this.state = 20;
}if (true) break;

case 16:
//C
this.state = 21;
 if (true) break;

case 18:
//C
this.state = 21;
 //BA.debugLineNum = 161;BA.debugLine="left = left + xView.Width/2 - Width/2";
_left = (float) (_left+_xview.getWidth()/(double)2-_width/(double)2);
 if (true) break;

case 20:
//C
this.state = 21;
 //BA.debugLineNum = 163;BA.debugLine="left = left + xView.Width - Width";
_left = (float) (_left+_xview.getWidth()-_width);
 if (true) break;

case 21:
//C
this.state = 22;
;
 //BA.debugLineNum = 166;BA.debugLine="max_endlessloop = 0";
parent._max_endlessloop = (int) (0);
 //BA.debugLineNum = 167;BA.debugLine="GetTopLeft(top,left,Width,xView)";
parent._gettopleft(_top,_left,_width,_xview);
 //BA.debugLineNum = 168;BA.debugLine="Wait For lol (left As Float,top As Float)";
parent.__c.WaitFor("lol", ba, this, null);
this.state = 55;
return;
case 55:
//C
this.state = 22;
_left = (Float) result[0];
_top = (Float) result[1];
;
 //BA.debugLineNum = 170;BA.debugLine="If xpnl_Menu.Parent.IsInitialized = False Then xp";
if (true) break;

case 22:
//if
this.state = 27;
if (parent._xpnl_menu.getParent().IsInitialized()==parent.__c.False) { 
this.state = 24;
;}if (true) break;

case 24:
//C
this.state = 27;
parent._xpnl_background.AddView((android.view.View)(parent._xpnl_menu.getObject()),(int) (_left),(int) (_top),(int) (_width),(int) (_height));
if (true) break;

case 27:
//C
this.state = 28;
;
 //BA.debugLineNum = 172;BA.debugLine="xclv.Base_Resize(Width,Height)";
parent._xclv._base_resize(_width,_height);
 //BA.debugLineNum = 173;BA.debugLine="xclv.AsView.SetLayoutAnimated(0,0,0,Width,Height)";
parent._xclv._asview().SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 175;BA.debugLine="xpnl_Menu.SetLayoutAnimated(0,left,top,Width,Heig";
parent._xpnl_menu.SetLayoutAnimated((int) (0),(int) (_left),(int) (_top),(int) (_width),(int) (_height));
 //BA.debugLineNum = 178;BA.debugLine="For i = 0 To xclv.Size -1";
if (true) break;

case 28:
//for
this.state = 37;
step33 = 1;
limit33 = (int) (parent._xclv._getsize()-1);
_i = (int) (0) ;
this.state = 56;
if (true) break;

case 56:
//C
this.state = 37;
if ((step33 > 0 && _i <= limit33) || (step33 < 0 && _i >= limit33)) this.state = 30;
if (true) break;

case 57:
//C
this.state = 56;
_i = ((int)(0 + _i + step33)) ;
if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 179;BA.debugLine="If xclv.GetValue(i) Is String And \"Title\" = xclv";
if (true) break;

case 31:
//if
this.state = 36;
if (parent._xclv._getvalue(_i) instanceof String && ("Title").equals(BA.ObjectToString(parent._xclv._getvalue(_i)))) { 
this.state = 33;
}else if(parent._xclv._getvalue(_i) instanceof String && ("Separator").equals(BA.ObjectToString(parent._xclv._getvalue(_i)))) { 
this.state = 35;
}if (true) break;

case 33:
//C
this.state = 36;
 //BA.debugLineNum = 180;BA.debugLine="xclv.GetPanel(i).SetLayoutAnimated(0,0,0,Width,";
parent._xclv._getpanel(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 181;BA.debugLine="xclv.GetPanel(i).GetView(0).SetLayoutAnimated(0";
parent._xclv._getpanel(_i).GetView((int) (0)).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 //BA.debugLineNum = 182;BA.debugLine="xclv.ResizeItem(i,g_TitleLabelProperties.Height";
parent._xclv._resizeitem(_i,(int) (parent._g_titlelabelproperties.Height /*float*/ ));
 if (true) break;

case 35:
//C
this.state = 36;
 //BA.debugLineNum = 184;BA.debugLine="xclv.GetPanel(i).SetLayoutAnimated(0,0,0,Width,";
parent._xclv._getpanel(_i).SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (parent._g_separatorpropertiesadvanced.Height /*float*/ ));
 //BA.debugLineNum = 185;BA.debugLine="xclv.ResizeItem(i,g_SeparatorPropertiesAdvanced";
parent._xclv._resizeitem(_i,(int) (parent._g_separatorpropertiesadvanced.Height /*float*/ ));
 if (true) break;

case 36:
//C
this.state = 57;
;
 if (true) break;
if (true) break;
;
 //BA.debugLineNum = 189;BA.debugLine="If m_ShowTriangle = True Then";

case 37:
//if
this.state = 50;
if (parent._m_showtriangle==parent.__c.True) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 //BA.debugLineNum = 190;BA.debugLine="xpnl_Triangle = xui.CreatePanel(\"\")";
parent._xpnl_triangle = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 191;BA.debugLine="xpnl_Triangle.Color = xui.Color_Transparent";
parent._xpnl_triangle.setColor(parent._xui.Color_Transparent);
 //BA.debugLineNum = 192;BA.debugLine="xpnl_Background.AddView(xpnl_Triangle,xpnl_Menu.";
parent._xpnl_background.AddView((android.view.View)(parent._xpnl_triangle.getObject()),(int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Width /*float*/ ),(int) (parent._xpnl_menu.getTop()-parent._g_trianglepropertiesadvanced.Height /*float*/ ),(int) (parent._g_trianglepropertiesadvanced.Width /*float*/ ),(int) (parent._g_trianglepropertiesadvanced.Height /*float*/ ));
 //BA.debugLineNum = 194;BA.debugLine="Dim xCV As B4XCanvas";
_xcv = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 195;BA.debugLine="xCV.Initialize(xpnl_Triangle)";
_xcv.Initialize(parent._xpnl_triangle);
 //BA.debugLineNum = 197;BA.debugLine="xCV.ClearRect(xCV.TargetRect)";
_xcv.ClearRect(_xcv.getTargetRect());
 //BA.debugLineNum = 198;BA.debugLine="Dim p As B4XPath";
_p = new anywheresoftware.b4a.objects.B4XCanvas.B4XPath();
 //BA.debugLineNum = 199;BA.debugLine="Select g_OrientationVertical";
if (true) break;

case 40:
//select
this.state = 49;
switch (BA.switchObjectToInt(parent._g_orientationvertical,parent._getorientationvertical_top(),parent._getorientationvertical_bottom(),parent._getorientationhorizontal_right(),parent._getorientationhorizontal_left())) {
case 0: {
this.state = 42;
if (true) break;
}
case 1: {
this.state = 44;
if (true) break;
}
case 2: {
this.state = 46;
if (true) break;
}
case 3: {
this.state = 48;
if (true) break;
}
}
if (true) break;

case 42:
//C
this.state = 49;
 //BA.debugLineNum = 201;BA.debugLine="p.Initialize(0, 0).LineTo(xpnl_Triangle.Width,";
_p.Initialize((float) (0),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()/(double)2),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (0));
 //BA.debugLineNum = 202;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Left /*float*/ ));
 if (true) break;

case 44:
//C
this.state = 49;
 //BA.debugLineNum = 204;BA.debugLine="p.Initialize(xpnl_Triangle.Width / 2, 0).LineT";
_p.Initialize((float) (parent._xpnl_triangle.getWidth()/(double)2),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (parent._xpnl_triangle.getWidth()/(double)2),(float) (0));
 //BA.debugLineNum = 205;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Left /*float*/ ));
 if (true) break;

case 46:
//C
this.state = 49;
 //BA.debugLineNum = 207;BA.debugLine="p.Initialize(xpnl_Triangle.Width, 0).LineTo(xp";
_p.Initialize((float) (parent._xpnl_triangle.getWidth()),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (parent._xpnl_triangle.getHeight()/(double)2)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (0));
 //BA.debugLineNum = 208;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Top /*float*/ ));
 if (true) break;

case 48:
//C
this.state = 49;
 //BA.debugLineNum = 210;BA.debugLine="p.Initialize(0, 0).LineTo(xpnl_Triangle.Width,";
_p.Initialize((float) (0),(float) (0)).LineTo((float) (parent._xpnl_triangle.getWidth()),(float) (parent._xpnl_triangle.getHeight()/(double)2)).LineTo((float) (0),(float) (parent._xpnl_triangle.getHeight())).LineTo((float) (0),(float) (0));
 //BA.debugLineNum = 211;BA.debugLine="xpnl_Triangle.Left = xpnl_Menu.Left + g_Triang";
parent._xpnl_triangle.setLeft((int) (parent._xpnl_menu.getLeft()+parent._g_trianglepropertiesadvanced.Top /*float*/ ));
 if (true) break;

case 49:
//C
this.state = 50;
;
 //BA.debugLineNum = 214;BA.debugLine="xCV.DrawPath(p, g_TrianglePropertiesAdvanced.Col";
_xcv.DrawPath(_p,parent._g_trianglepropertiesadvanced.Color /*int*/ ,parent.__c.True,(float) (0));
 //BA.debugLineNum = 215;BA.debugLine="xCV.Invalidate";
_xcv.Invalidate();
 if (true) break;

case 50:
//C
this.state = 51;
;
 //BA.debugLineNum = 223;BA.debugLine="xpnl_Background.SetVisibleAnimated(OpenDurationMs";
parent._xpnl_background.SetVisibleAnimated(parent._opendurationms,parent.__c.True);
 //BA.debugLineNum = 225;BA.debugLine="If AutoHideMs > 0 Then";
if (true) break;

case 51:
//if
this.state = 54;
if (parent._autohidems>0) { 
this.state = 53;
}if (true) break;

case 53:
//C
this.state = 54;
 //BA.debugLineNum = 226;BA.debugLine="Sleep(AutoHideMs)";
parent.__c.Sleep(ba,this,parent._autohidems);
this.state = 58;
return;
case 58:
//C
this.state = 54;
;
 //BA.debugLineNum = 227;BA.debugLine="CloseMenu";
parent._closemenu();
 if (true) break;

case 54:
//C
this.state = -1;
;
 //BA.debugLineNum = 231;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _lol(float _left,float _top) throws Exception{
}
public String  _resize(float _parentwidth,float _parentheight) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub Resize(ParentWidth As Float,ParentHeigh";
 //BA.debugLineNum = 105;BA.debugLine="xpnl_Background.SetLayoutAnimated(0,xpnl_Backgrou";
_xpnl_background.SetLayoutAnimated((int) (0),_xpnl_background.getLeft(),_xpnl_background.getTop(),(int) (_parentwidth),(int) (_parentheight));
 //BA.debugLineNum = 106;BA.debugLine="max_x = ParentWidth";
_max_x = _parentwidth;
 //BA.debugLineNum = 107;BA.debugLine="max_y = ParentHeight";
_max_y = _parentheight;
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return "";
}
public String  _setactivityhasactionbar(boolean _value) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Public Sub setActivityHasActionBar(value As Boolea";
 //BA.debugLineNum = 406;BA.debugLine="actHasActionBar = value";
_acthasactionbar = _value;
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _radius) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 486;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
 //BA.debugLineNum = 500;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
 //BA.debugLineNum = 501;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 503;BA.debugLine="End Sub";
return "";
}
public String  _setcornerradius(int _radius) throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Public Sub setCornerRadius(radius As Int)";
 //BA.debugLineNum = 376;BA.debugLine="m_Radius = radius";
_m_radius = _radius;
 //BA.debugLineNum = 377;BA.debugLine="xpnl_Menu.SetColorAndBorder(xpnl_Menu.Color,0,0,r";
_xpnl_menu.SetColorAndBorder(_xpnl_menu.getColor(),(int) (0),(int) (0),_radius);
 //BA.debugLineNum = 378;BA.debugLine="SetCircleClip(xpnl_Menu,radius)";
_setcircleclip(_xpnl_menu,_radius);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public String  _setdividerheight(int _height) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub setDividerHeight(height As Int)";
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _setisinspecialcontainer(boolean _value) throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Public Sub setIsInSpecialContainer(value As Boolea";
 //BA.debugLineNum = 402;BA.debugLine="g_IsInSpecialContainer = value";
_g_isinspecialcontainer = _value;
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public String  _setmenuviewgap(float _gap) throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Public Sub setMenuViewGap(Gap As Float)";
 //BA.debugLineNum = 426;BA.debugLine="m_MenuViewGap = Gap";
_m_menuviewgap = _gap;
 //BA.debugLineNum = 427;BA.debugLine="End Sub";
return "";
}
public String  _setorientationhorizontal(String _orientation) throws Exception{
 //BA.debugLineNum = 416;BA.debugLine="Public Sub setOrientationHorizontal(orientation As";
 //BA.debugLineNum = 417;BA.debugLine="If orientation = getOrientationHorizontal_LEFT Or";
if ((_orientation).equals(_getorientationhorizontal_left()) || (_orientation).equals(_getorientationhorizontal_right())) { 
 //BA.debugLineNum = 418;BA.debugLine="g_OrientationHorizontal = orientation";
_g_orientationhorizontal = _orientation;
 }else {
 //BA.debugLineNum = 420;BA.debugLine="g_OrientationHorizontal = getOrientationHorizont";
_g_orientationhorizontal = _getorientationhorizontal_middle();
 };
 //BA.debugLineNum = 422;BA.debugLine="End Sub";
return "";
}
public String  _setorientationvertical(String _orientation) throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Public Sub setOrientationVertical(orientation As S";
 //BA.debugLineNum = 410;BA.debugLine="If orientation = getOrientationVertical_BOTTOM Th";
if ((_orientation).equals(_getorientationvertical_bottom())) { 
 //BA.debugLineNum = 411;BA.debugLine="g_OrientationVertical = orientation";
_g_orientationvertical = _orientation;
 }else {
 //BA.debugLineNum = 413;BA.debugLine="g_OrientationVertical = getOrientationVertical_T";
_g_orientationvertical = _getorientationvertical_top();
 };
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return "";
}
public String  _setshowtriangle(boolean _show) throws Exception{
 //BA.debugLineNum = 429;BA.debugLine="Public Sub setShowTriangle(Show As Boolean)";
 //BA.debugLineNum = 430;BA.debugLine="m_ShowTriangle = Show";
_m_showtriangle = _show;
 //BA.debugLineNum = 431;BA.debugLine="End Sub";
return "";
}
public int[]  _viewscreenposition(anywheresoftware.b4a.objects.B4XViewWrapper _view) throws Exception{
int[] _lefttop = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 527;BA.debugLine="Sub ViewScreenPosition (view As B4XView) As Int()";
 //BA.debugLineNum = 529;BA.debugLine="Dim leftTop(2) As Int";
_lefttop = new int[(int) (2)];
;
 //BA.debugLineNum = 531;BA.debugLine="Dim JO As JavaObject = view";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_view.getObject()));
 //BA.debugLineNum = 532;BA.debugLine="JO.RunMethod(\"getLocationOnScreen\", Array As Obje";
_jo.RunMethod("getLocationOnScreen",new Object[]{(Object)(_lefttop)});
 //BA.debugLineNum = 551;BA.debugLine="Return Array As Int(leftTop(0), leftTop(1))";
if (true) return new int[]{_lefttop[(int) (0)],_lefttop[(int) (1)]};
 //BA.debugLineNum = 552;BA.debugLine="End Sub";
return null;
}
public String  _xclv_itemclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Private Sub xclv_ItemClick (Index As Int, Value As";
 //BA.debugLineNum = 442;BA.debugLine="ItemClick(Index,Value)";
_itemclick(_index,_value);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return "";
}
public String  _xclv_itemlongclick(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 445;BA.debugLine="Private Sub xclv_ItemLongClick (Index As Int, Valu";
 //BA.debugLineNum = 446;BA.debugLine="ItemLongClick(Index,Value)";
_itemlongclick(_index,_value);
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_background_click() throws Exception{
 //BA.debugLineNum = 454;BA.debugLine="Private Sub xpnl_Background_Click";
 //BA.debugLineNum = 455;BA.debugLine="CloseMenu";
_closemenu();
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
