package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mypopup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.mypopup");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.mypopup.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public Object _callback = null;
public String _event = "";
public anywheresoftware.b4a.objects.collections.List _btnlist = null;
public anywheresoftware.b4a.objects.ConcreteViewWrapper _anchorview = null;
public int _maxwidth = 0;
public int _maxheight = 0;
public int _borderwidth = 0;
public int _btnpadding = 0;
public int _btnspacing = 0;
public int _btnbordercolour = 0;
public anywheresoftware.b4a.objects.PanelWrapper _pnl = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _sv = null;
public int _maxx = 0;
public int _maxy = 0;
public int _anchor_bottommiddle = 0;
public int _anchor_topleft = 0;
public boolean _showingmenu = false;
public int _btntextcolour = 0;
public int _btnheight = 0;
public int _btnradius = 0;
public anywheresoftware.b4a.objects.B4XViewWrapper _myactivity = null;
public int _btnbackgroundcolour = 0;
public float _btnfontsize = 0f;
public int _animtime = 0;
public anywheresoftware.b4a.keywords.constants.TypefaceWrapper _usethistypeface = null;
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
public String  _btn_click() throws Exception{
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
String _txt = "";
 //BA.debugLineNum = 252;BA.debugLine="Private Sub Btn_Click";
 //BA.debugLineNum = 253;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(__c.Sender(ba)));
 //BA.debugLineNum = 254;BA.debugLine="Dim txt As String = b.Text";
_txt = _b.getText();
 //BA.debugLineNum = 260;BA.debugLine="If SubExists(Callback, Event & \"_BtnClick\") Then";
if (__c.SubExists(ba,_callback,_event+"_BtnClick")) { 
 //BA.debugLineNum = 261;BA.debugLine="CallSub2(Callback, Event & \"_BtnClick\", txt )";
__c.CallSubNew2(ba,_callback,_event+"_BtnClick",(Object)(_txt));
 };
 //BA.debugLineNum = 264;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private Callback As Object";
_callback = new Object();
 //BA.debugLineNum = 8;BA.debugLine="Private Event As String";
_event = "";
 //BA.debugLineNum = 9;BA.debugLine="Private btnList As List";
_btnlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private anchorView As View";
_anchorview = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private maxWidth, maxHeight As Int = 0";
_maxwidth = 0;
_maxheight = (int) (0);
 //BA.debugLineNum = 12;BA.debugLine="Dim borderWidth As Int = 1";
_borderwidth = (int) (1);
 //BA.debugLineNum = 13;BA.debugLine="Dim btnPadding As Int = 5dip";
_btnpadding = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 14;BA.debugLine="Dim btnSpacing As Int = 3dip";
_btnspacing = __c.DipToCurrent((int) (3));
 //BA.debugLineNum = 15;BA.debugLine="Dim btnBorderColour As Int = Colors.white";
_btnbordercolour = __c.Colors.White;
 //BA.debugLineNum = 16;BA.debugLine="Private pnl As Panel";
_pnl = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private sv As ScrollView";
_sv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private maxX, maxY As Int";
_maxx = 0;
_maxy = 0;
 //BA.debugLineNum = 19;BA.debugLine="Private const ANCHOR_BOTTOMMIDDLE As Int = 1";
_anchor_bottommiddle = (int) (1);
 //BA.debugLineNum = 20;BA.debugLine="Private const ANCHOR_TOPLEFT As Int = 2";
_anchor_topleft = (int) (2);
 //BA.debugLineNum = 21;BA.debugLine="Private showingMenu As Boolean";
_showingmenu = false;
 //BA.debugLineNum = 22;BA.debugLine="Dim btnTextColour As Int = Colors.white";
_btntextcolour = __c.Colors.White;
 //BA.debugLineNum = 23;BA.debugLine="Private btnHeight As Int = 45dip";
_btnheight = __c.DipToCurrent((int) (45));
 //BA.debugLineNum = 24;BA.debugLine="Private btnRadius As Int = 5dip";
_btnradius = __c.DipToCurrent((int) (5));
 //BA.debugLineNum = 31;BA.debugLine="Dim myActivity As B4XView";
_myactivity = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Dim btnBackgroundColour As Int = Colors.ARGB(255,";
_btnbackgroundcolour = __c.Colors.ARGB((int) (255),(int) (34),(int) (34),(int) (34));
 //BA.debugLineNum = 33;BA.debugLine="Dim btnFontSize As Float = 18.0";
_btnfontsize = (float) (18.0);
 //BA.debugLineNum = 34;BA.debugLine="Private const animTime As Int = 300";
_animtime = (int) (300);
 //BA.debugLineNum = 35;BA.debugLine="Dim useThisTypeFace As Typeface";
_usethistypeface = new anywheresoftware.b4a.keywords.constants.TypefaceWrapper();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public float[]  _getpageleftandtop(anywheresoftware.b4a.objects.ConcreteViewWrapper _v) throws Exception{
int[] _lefttop = null;
anywheresoftware.b4j.object.JavaObject _jo = null;
float[] _ret = null;
 //BA.debugLineNum = 295;BA.debugLine="Sub GetPageLeftAndTop(v As View) As Float()";
 //BA.debugLineNum = 318;BA.debugLine="Dim leftTop(2) As Int";
_lefttop = new int[(int) (2)];
;
 //BA.debugLineNum = 319;BA.debugLine="Dim JO As JavaObject = v";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_v.getObject()));
 //BA.debugLineNum = 320;BA.debugLine="JO.RunMethod(\"getLocationOnScreen\", Array As Obje";
_jo.RunMethod("getLocationOnScreen",new Object[]{(Object)(_lefttop)});
 //BA.debugLineNum = 321;BA.debugLine="Dim ret(2) As Float";
_ret = new float[(int) (2)];
;
 //BA.debugLineNum = 322;BA.debugLine="ret(0) = leftTop(0)";
_ret[(int) (0)] = (float) (_lefttop[(int) (0)]);
 //BA.debugLineNum = 323;BA.debugLine="ret(1) = leftTop(1)";
_ret[(int) (1)] = (float) (_lefttop[(int) (1)]);
 //BA.debugLineNum = 324;BA.debugLine="Return ret";
if (true) return _ret;
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 243;BA.debugLine="public Sub Hide";
 //BA.debugLineNum = 244;BA.debugLine="pnl.SendToBack";
_pnl.SendToBack();
 //BA.debugLineNum = 245;BA.debugLine="pnl.RemoveAllViews";
_pnl.RemoveAllViews();
 //BA.debugLineNum = 247;BA.debugLine="pnl.RemoveView";
_pnl.RemoveView();
 //BA.debugLineNum = 249;BA.debugLine="showingMenu = False";
_showingmenu = __c.False;
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.B4XViewWrapper _anactivity,Object _callbackmodule,String _eventname,anywheresoftware.b4a.objects.collections.List _btntext,int _mx,int _my,anywheresoftware.b4a.keywords.constants.TypefaceWrapper _thetypeface) throws Exception{
innerInitialize(_ba);
String _s = "";
anywheresoftware.b4a.objects.ButtonWrapper _abtn = null;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
int _curry = 0;
 //BA.debugLineNum = 44;BA.debugLine="Public Sub Initialize( anActivity As B4XView, Call";
 //BA.debugLineNum = 45;BA.debugLine="useThisTypeFace = theTypeface";
_usethistypeface = _thetypeface;
 //BA.debugLineNum = 48;BA.debugLine="maxX = mX";
_maxx = _mx;
 //BA.debugLineNum = 49;BA.debugLine="maxY = my";
_maxy = _my;
 //BA.debugLineNum = 50;BA.debugLine="Callback = CallbackModule";
_callback = _callbackmodule;
 //BA.debugLineNum = 51;BA.debugLine="Event = EventName";
_event = _eventname;
 //BA.debugLineNum = 56;BA.debugLine="myActivity = anActivity";
_myactivity = _anactivity;
 //BA.debugLineNum = 59;BA.debugLine="btnList.Initialize";
_btnlist.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="pnl.Initialize(\"Pnl\")";
_pnl.Initialize(ba,"Pnl");
 //BA.debugLineNum = 61;BA.debugLine="pnl.Color = Colors.Transparent";
_pnl.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 66;BA.debugLine="sv.Initialize(1)";
_sv.Initialize(ba,(int) (1));
 //BA.debugLineNum = 69;BA.debugLine="sv.Color = Colors.Transparent";
_sv.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 71;BA.debugLine="For Each s As String In btnText";
{
final anywheresoftware.b4a.BA.IterableList group12 = _btntext;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_s = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 72;BA.debugLine="Dim aBtn As Button";
_abtn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 83;BA.debugLine="aBtn.Initialize(\"Btn\")";
_abtn.Initialize(ba,"Btn");
 //BA.debugLineNum = 84;BA.debugLine="setBorder(aBtn, borderWidth, btnRadius, btnBorde";
_setborder((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_abtn.getObject())),_borderwidth,_btnradius,_btnbordercolour,_btnbackgroundcolour);
 //BA.debugLineNum = 85;BA.debugLine="aBtn.TextSize = btnFontSize";
_abtn.setTextSize(_btnfontsize);
 //BA.debugLineNum = 86;BA.debugLine="aBtn.SingleLine = True";
_abtn.setSingleLine(__c.True);
 //BA.debugLineNum = 87;BA.debugLine="aBtn.Ellipsize = \"END\"";
_abtn.setEllipsize("END");
 //BA.debugLineNum = 88;BA.debugLine="aBtn.Gravity = Gravity.CENTER_VERTICAL";
_abtn.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 89;BA.debugLine="aBtn.Padding = Array As Int (btnPadding, btnPadd";
_abtn.setPadding(new int[]{_btnpadding,_btnpadding,_btnpadding,_btnpadding});
 //BA.debugLineNum = 90;BA.debugLine="aBtn.Typeface = theTypeface";
_abtn.setTypeface((android.graphics.Typeface)(_thetypeface.getObject()));
 //BA.debugLineNum = 91;BA.debugLine="SetButtonTextColor(aBtn, btnTextColour )";
_setbuttontextcolor(_abtn,_btntextcolour);
 //BA.debugLineNum = 92;BA.debugLine="aBtn.Text = s";
_abtn.setText(BA.ObjectToCharSequence(_s));
 //BA.debugLineNum = 93;BA.debugLine="sv.Panel.AddView( aBtn, 0,0,1,btnHeight)";
_sv.getPanel().AddView((android.view.View)(_abtn.getObject()),(int) (0),(int) (0),(int) (1),_btnheight);
 //BA.debugLineNum = 94;BA.debugLine="setButtonWidth( aBtn )";
_setbuttonwidth(_abtn);
 //BA.debugLineNum = 96;BA.debugLine="If aBtn.Width + (btnPadding*2) > maxWidth Then m";
if (_abtn.getWidth()+(_btnpadding*2)>_maxwidth) { 
_maxwidth = (int) (_abtn.getWidth()+(_btnpadding*2));};
 //BA.debugLineNum = 97;BA.debugLine="If aBtn.Height + (btnPadding*2) > maxHeight Then";
if (_abtn.getHeight()+(_btnpadding*2)>_maxheight) { 
_maxheight = (int) (_abtn.getHeight()+(_btnpadding*2));};
 //BA.debugLineNum = 98;BA.debugLine="btnList.Add(aBtn)";
_btnlist.Add((Object)(_abtn.getObject()));
 }
};
 //BA.debugLineNum = 108;BA.debugLine="For Each b As Button In btnList";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
{
final anywheresoftware.b4a.BA.IterableList group30 = _btnlist;
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(group30.Get(index30)));
 //BA.debugLineNum = 109;BA.debugLine="If b.Width < maxWidth Then b.Width = maxWidth";
if (_b.getWidth()<_maxwidth) { 
_b.setWidth(_maxwidth);};
 //BA.debugLineNum = 110;BA.debugLine="If b.Height < maxHeight Then b.Height = maxHeigh";
if (_b.getHeight()<_maxheight) { 
_b.setHeight(_maxheight);};
 }
};
 //BA.debugLineNum = 113;BA.debugLine="Dim currY As Int = 0";
_curry = (int) (0);
 //BA.debugLineNum = 114;BA.debugLine="For Each b As Button In btnList";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
{
final anywheresoftware.b4a.BA.IterableList group35 = _btnlist;
final int groupLen35 = group35.getSize()
;int index35 = 0;
;
for (; index35 < groupLen35;index35++){
_b = (anywheresoftware.b4a.objects.ButtonWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ButtonWrapper(), (android.widget.Button)(group35.Get(index35)));
 //BA.debugLineNum = 115;BA.debugLine="b.Left = btnSpacing";
_b.setLeft(_btnspacing);
 //BA.debugLineNum = 116;BA.debugLine="b.Width = maxWidth";
_b.setWidth(_maxwidth);
 //BA.debugLineNum = 118;BA.debugLine="currY = currY + btnSpacing";
_curry = (int) (_curry+_btnspacing);
 //BA.debugLineNum = 119;BA.debugLine="b.Top = currY";
_b.setTop(_curry);
 //BA.debugLineNum = 120;BA.debugLine="b.Height = maxHeight";
_b.setHeight(_maxheight);
 //BA.debugLineNum = 121;BA.debugLine="currY = currY + maxHeight";
_curry = (int) (_curry+_maxheight);
 }
};
 //BA.debugLineNum = 123;BA.debugLine="currY = currY + btnSpacing";
_curry = (int) (_curry+_btnspacing);
 //BA.debugLineNum = 129;BA.debugLine="sv.panel.Height = currY";
_sv.getPanel().setHeight(_curry);
 //BA.debugLineNum = 130;BA.debugLine="sv.panel.Width = maxWidth + 2*btnSpacing";
_sv.getPanel().setWidth((int) (_maxwidth+2*_btnspacing));
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _pnl_click() throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="private Sub Pnl_Click";
 //BA.debugLineNum = 268;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _resize(int _screenx,int _screeny) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="public Sub Resize(screenX As Int, screenY As Int)";
 //BA.debugLineNum = 137;BA.debugLine="maxX = screenX";
_maxx = _screenx;
 //BA.debugLineNum = 138;BA.debugLine="maxY = screenY";
_maxy = _screeny;
 //BA.debugLineNum = 139;BA.debugLine="pnl.Width = maxX";
_pnl.setWidth(_maxx);
 //BA.debugLineNum = 140;BA.debugLine="pnl.Height = maxY";
_pnl.setHeight(_maxy);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public String  _setborder(anywheresoftware.b4a.objects.ConcreteViewWrapper _v,int _width,int _cornerradius,int _bordercolor,int _backgroundcolor) throws Exception{
anywheresoftware.b4a.objects.drawable.ColorDrawable _c = null;
 //BA.debugLineNum = 329;BA.debugLine="Sub setBorder(v As View, width As Int, cornerRadiu";
 //BA.debugLineNum = 330;BA.debugLine="Dim c As ColorDrawable";
_c = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
 //BA.debugLineNum = 331;BA.debugLine="c.Initialize2(backgroundColor,cornerRadius,width,";
_c.Initialize2(_backgroundcolor,_cornerradius,_width,_bordercolor);
 //BA.debugLineNum = 332;BA.debugLine="v.Background = c";
_v.setBackground((android.graphics.drawable.Drawable)(_c.getObject()));
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _setbuttontextcolor(anywheresoftware.b4a.objects.ButtonWrapper _btn,int _clr) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="private Sub SetButtonTextColor(btn As Button, clr";
 //BA.debugLineNum = 276;BA.debugLine="btn.TextColor = clr";
_btn.setTextColor(_clr);
 //BA.debugLineNum = 278;BA.debugLine="End Sub";
return "";
}
public String  _setbuttonwidth(anywheresoftware.b4a.objects.ButtonWrapper _btn) throws Exception{
int _w = 0;
int _wmargin = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmptest = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvstest = null;
 //BA.debugLineNum = 283;BA.debugLine="private Sub setButtonWidth(btn As Button)";
 //BA.debugLineNum = 284;BA.debugLine="Dim w As Int";
_w = 0;
 //BA.debugLineNum = 285;BA.debugLine="Dim wMargin As Int = Max( btn.Width * 0.1, 10 ) '";
_wmargin = (int) (__c.Max(_btn.getWidth()*0.1,10));
 //BA.debugLineNum = 286;BA.debugLine="Dim bmpTest As Bitmap";
_bmptest = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 287;BA.debugLine="bmpTest.InitializeMutable(1, 1)";
_bmptest.InitializeMutable((int) (1),(int) (1));
 //BA.debugLineNum = 288;BA.debugLine="Dim cvsTest As Canvas";
_cvstest = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 289;BA.debugLine="cvsTest.Initialize2(bmpTest)";
_cvstest.Initialize2((android.graphics.Bitmap)(_bmptest.getObject()));
 //BA.debugLineNum = 290;BA.debugLine="w = cvsTest.MeasureStringWidth(btn.Text, useThisT";
_w = (int) (_cvstest.MeasureStringWidth(_btn.getText(),(android.graphics.Typeface)(_usethistypeface.getObject()),_btn.getTextSize()));
 //BA.debugLineNum = 291;BA.debugLine="btn.Width = w + 2* wMargin";
_btn.setWidth((int) (_w+2*_wmargin));
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return "";
}
public String  _show(anywheresoftware.b4a.objects.ConcreteViewWrapper _parent) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="public Sub Show(parent As View )";
 //BA.debugLineNum = 146;BA.debugLine="showPopup(parent, ANCHOR_BOTTOMMIDDLE)";
_showpopup(_parent,_anchor_bottommiddle);
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public String  _show2(anywheresoftware.b4a.objects.ConcreteViewWrapper _parent) throws Exception{
 //BA.debugLineNum = 151;BA.debugLine="Public Sub Show2(parent As View)";
 //BA.debugLineNum = 152;BA.debugLine="showPopup(parent, ANCHOR_TOPLEFT)";
_showpopup(_parent,_anchor_topleft);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _showpopup(anywheresoftware.b4a.objects.ConcreteViewWrapper _parent,int _anchorpoint) throws Exception{
int _anchorviewtop = 0;
int _anchorviewleft = 0;
int _anchorviewheight = 0;
int _anchorviewwidth = 0;
float[] _lefttop = null;
float[] _lefttop2 = null;
int _left = 0;
int _top = 0;
 //BA.debugLineNum = 155;BA.debugLine="private Sub showPopup(parent As View, anchorPoint";
 //BA.debugLineNum = 156;BA.debugLine="If showingMenu Then";
if (_showingmenu) { 
 //BA.debugLineNum = 157;BA.debugLine="Hide";
_hide();
 //BA.debugLineNum = 158;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 161;BA.debugLine="anchorView = parent";
_anchorview = _parent;
 //BA.debugLineNum = 162;BA.debugLine="Dim anchorViewTop, anchorViewLeft, anchorViewHeig";
_anchorviewtop = 0;
_anchorviewleft = 0;
_anchorviewheight = 0;
_anchorviewwidth = 0;
 //BA.debugLineNum = 164;BA.debugLine="anchorViewHeight = anchorView.Height 'Take a copy";
_anchorviewheight = _anchorview.getHeight();
 //BA.debugLineNum = 165;BA.debugLine="anchorViewWidth = anchorView.Width";
_anchorviewwidth = _anchorview.getWidth();
 //BA.debugLineNum = 166;BA.debugLine="Dim leftTop() As Float = GetPageLeftAndTop( ancho";
_lefttop = _getpageleftandtop(_anchorview);
 //BA.debugLineNum = 170;BA.debugLine="Dim leftTop2() As Float = GetPageLeftAndTop( myAc";
_lefttop2 = _getpageleftandtop((anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_myactivity.getObject())));
 //BA.debugLineNum = 172;BA.debugLine="anchorViewLeft = leftTop(0) - leftTop2(0)";
_anchorviewleft = (int) (_lefttop[(int) (0)]-_lefttop2[(int) (0)]);
 //BA.debugLineNum = 173;BA.debugLine="anchorViewTop = leftTop(1) - leftTop2(1)";
_anchorviewtop = (int) (_lefttop[(int) (1)]-_lefttop2[(int) (1)]);
 //BA.debugLineNum = 175;BA.debugLine="Dim left, top As Int";
_left = 0;
_top = 0;
 //BA.debugLineNum = 176;BA.debugLine="Select anchorPoint";
switch (BA.switchObjectToInt(_anchorpoint,_anchor_bottommiddle,_anchor_topleft)) {
case 0: {
 //BA.debugLineNum = 178;BA.debugLine="left = anchorViewLeft + (anchorViewWidth / 2)";
_left = (int) (_anchorviewleft+(_anchorviewwidth/(double)2));
 //BA.debugLineNum = 179;BA.debugLine="If left + maxWidth + 2*btnSpacing > maxX Then l";
if (_left+_maxwidth+2*_btnspacing>_maxx) { 
_left = (int) (_maxx-_maxwidth-2*_btnspacing);};
 //BA.debugLineNum = 181;BA.debugLine="If anchorViewTop > 0.5*maxY Then";
if (_anchorviewtop>0.5*_maxy) { 
 //BA.debugLineNum = 185;BA.debugLine="top = anchorViewTop - sv.panel.Height";
_top = (int) (_anchorviewtop-_sv.getPanel().getHeight());
 //BA.debugLineNum = 187;BA.debugLine="If top < 0 Then top = 0";
if (_top<0) { 
_top = (int) (0);};
 }else {
 //BA.debugLineNum = 189;BA.debugLine="top = anchorViewTop + anchorViewHeight";
_top = (int) (_anchorviewtop+_anchorviewheight);
 //BA.debugLineNum = 190;BA.debugLine="If top + maxHeight > maxY Then top = Max(maxY";
if (_top+_maxheight>_maxy) { 
_top = (int) (__c.Max(_maxy-_maxheight,0));};
 };
 break; }
case 1: {
 //BA.debugLineNum = 193;BA.debugLine="left = anchorViewLeft";
_left = _anchorviewleft;
 //BA.debugLineNum = 194;BA.debugLine="If left + maxWidth > maxX Then left = maxX - ma";
if (_left+_maxwidth>_maxx) { 
_left = (int) (_maxx-_maxwidth);};
 //BA.debugLineNum = 196;BA.debugLine="If anchorViewTop > 0.5*maxY Then";
if (_anchorviewtop>0.5*_maxy) { 
 //BA.debugLineNum = 200;BA.debugLine="top = anchorViewTop - sv.panel.Height";
_top = (int) (_anchorviewtop-_sv.getPanel().getHeight());
 //BA.debugLineNum = 202;BA.debugLine="If top < 0 Then top = 0";
if (_top<0) { 
_top = (int) (0);};
 }else {
 //BA.debugLineNum = 204;BA.debugLine="top = anchorViewTop + anchorViewHeight";
_top = (int) (_anchorviewtop+_anchorviewheight);
 //BA.debugLineNum = 205;BA.debugLine="If top + maxHeight > maxY Then top = Max(maxY";
if (_top+_maxheight>_maxy) { 
_top = (int) (__c.Max(_maxy-_maxheight,0));};
 };
 break; }
}
;
 //BA.debugLineNum = 211;BA.debugLine="pnl.RemoveView";
_pnl.RemoveView();
 //BA.debugLineNum = 212;BA.debugLine="myActivity.AddView(pnl, 0, 0, maxX, maxY)";
_myactivity.AddView((android.view.View)(_pnl.getObject()),(int) (0),(int) (0),_maxx,_maxy);
 //BA.debugLineNum = 213;BA.debugLine="pnl.Elevation = 99.0";
_pnl.setElevation((float) (99.0));
 //BA.debugLineNum = 216;BA.debugLine="pnl.BringToFront";
_pnl.BringToFront();
 //BA.debugLineNum = 217;BA.debugLine="pnl.Color = Colors.ARGB(80,255,255,255)";
_pnl.setColor(__c.Colors.ARGB((int) (80),(int) (255),(int) (255),(int) (255)));
 //BA.debugLineNum = 220;BA.debugLine="pnl.AddView(sv, anchorViewLeft, anchorViewTop, 1,";
_pnl.AddView((android.view.View)(_sv.getObject()),_anchorviewleft,_anchorviewtop,(int) (1),(int) (1));
 //BA.debugLineNum = 221;BA.debugLine="pnl.Visible = True";
_pnl.setVisible(__c.True);
 //BA.debugLineNum = 222;BA.debugLine="sv.Visible = True";
_sv.setVisible(__c.True);
 //BA.debugLineNum = 223;BA.debugLine="sv.Color = Colors.Transparent";
_sv.setColor(__c.Colors.Transparent);
 //BA.debugLineNum = 232;BA.debugLine="If top + sv.panel.Height <= maxY Then";
if (_top+_sv.getPanel().getHeight()<=_maxy) { 
 //BA.debugLineNum = 233;BA.debugLine="sv.SetLayoutAnimated(animTime,  left, top, sv.pa";
_sv.SetLayoutAnimated(_animtime,_left,_top,_sv.getPanel().getWidth(),_sv.getPanel().getHeight());
 }else {
 //BA.debugLineNum = 235;BA.debugLine="sv.SetLayoutAnimated(animTime, left, top, sv.pan";
_sv.SetLayoutAnimated(_animtime,_left,_top,_sv.getPanel().getWidth(),(int) (_maxy-_top));
 };
 //BA.debugLineNum = 237;BA.debugLine="sv.BringToFront";
_sv.BringToFront();
 //BA.debugLineNum = 239;BA.debugLine="showingMenu = True";
_showingmenu = __c.True;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "SHOW"))
	return _show((anywheresoftware.b4a.objects.ConcreteViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
