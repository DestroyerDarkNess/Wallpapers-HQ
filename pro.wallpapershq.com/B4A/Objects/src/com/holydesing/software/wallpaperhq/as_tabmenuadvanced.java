package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class as_tabmenuadvanced extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.as_tabmenuadvanced");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.as_tabmenuadvanced.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _mbase = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public Object _tag = null;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _g_tabproperties = null;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties _g_badgeproperties = null;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_indicatorproperties _g_indicatorproperties = null;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_middlebuttonproperties _g_middlebuttonproperties = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabbackground = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_indicator = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_middlebutton = null;
public int _m_index = 0;
public anywheresoftware.b4a.objects.collections.List _m_tablist = null;
public int _m_selectedbackgroundcoloranimationduration = 0;
public boolean _m_badgewithouttext = false;
public boolean _m_haloeffect = false;
public int _m_halocolor = 0;
public float _m_cornerradius = 0f;
public boolean _m_middlebutton = false;
public boolean _m_indicatorvisible = false;
public boolean _m_coloricons = false;
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
public static class _astabmenuadvanced_tabproperties{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public int BackgroundColor;
public int SelectedColor;
public int UnselectedColor;
public int DisabledColor;
public float TextIconPadding;
public void Initialize() {
IsInitialized = true;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
BackgroundColor = 0;
SelectedColor = 0;
UnselectedColor = 0;
DisabledColor = 0;
TextIconPadding = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _astabmenuadvanced_tab{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper IconSelected;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper IconUnselected;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper IconDisabled;
public boolean Enabled;
public String BadgeValue;
public Object Tag;
public void Initialize() {
IsInitialized = true;
Text = "";
IconSelected = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
IconUnselected = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
IconDisabled = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
Enabled = false;
BadgeValue = "";
Tag = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _astabmenuadvanced_badgeproperties{
public boolean IsInitialized;
public int TextColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont TextFont;
public float Height;
public float TextPadding;
public float LeftPadding;
public int BackgroundColor;
public void Initialize() {
IsInitialized = true;
TextColor = 0;
TextFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
Height = 0f;
TextPadding = 0f;
LeftPadding = 0f;
BackgroundColor = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _astabmenuadvanced_tabviews{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.B4XViewWrapper xpnl_TabBackground;
public anywheresoftware.b4a.objects.B4XViewWrapper xlbl_TabText;
public anywheresoftware.b4a.objects.B4XViewWrapper xiv_TabIcon;
public anywheresoftware.b4a.objects.B4XViewWrapper xlbl_Badge;
public void Initialize() {
IsInitialized = true;
xpnl_TabBackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
xlbl_TabText = new anywheresoftware.b4a.objects.B4XViewWrapper();
xiv_TabIcon = new anywheresoftware.b4a.objects.B4XViewWrapper();
xlbl_Badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _astabmenuadvanced_tabintern{
public boolean IsInitialized;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab xTab;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties xTabProperties;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties xBadgeProperties;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews xTabViews;
public void Initialize() {
IsInitialized = true;
xTab = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab();
xTabProperties = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties();
xBadgeProperties = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties();
xTabViews = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _astabmenuadvanced_indicatorproperties{
public boolean IsInitialized;
public float Height;
public int Color;
public float CornerRadius;
public long Duration;
public float SafeGap;
public void Initialize() {
IsInitialized = true;
Height = 0f;
Color = 0;
CornerRadius = 0f;
Duration = 0L;
SafeGap = 0f;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _astabmenuadvanced_middlebuttonproperties{
public boolean IsInitialized;
public float CustomWidth;
public int BackgroundColor;
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont xFont;
public int TextColor;
public boolean Visible;
public void Initialize() {
IsInitialized = true;
CustomWidth = 0f;
BackgroundColor = 0;
xFont = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
TextColor = 0;
Visible = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _addtab(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _iconselected,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _iconunselected) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _xtab = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _xtabproperties = null;
 //BA.debugLineNum = 325;BA.debugLine="Public Sub AddTab(Text As String,IconSelected As B";
 //BA.debugLineNum = 326;BA.debugLine="Dim xTab As ASTabMenuAdvanced_Tab = CreateASTabMe";
_xtab = _createastabmenuadvanced_tab(_text,_iconselected,_iconunselected);
 //BA.debugLineNum = 327;BA.debugLine="If IconSelected.IsInitialized = True Or IconUnsel";
if (_iconselected.IsInitialized()==__c.True || _iconunselected.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 328;BA.debugLine="xTab.IconDisabled = IIf(IconUnselected.IsInitial";
_xtab.IconDisabled /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(((_iconunselected.IsInitialized()==__c.True) ? ((Object)(_iconunselected.getObject())) : ((Object)(_iconselected.getObject())))));
 };
 //BA.debugLineNum = 331;BA.debugLine="Dim xTabProperties As ASTabMenuAdvanced_TabProper";
_xtabproperties = _createastabmenuadvanced_tabproperties(_g_tabproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_g_tabproperties.BackgroundColor /*int*/ ,_g_tabproperties.SelectedColor /*int*/ ,_g_tabproperties.UnselectedColor /*int*/ ,_g_tabproperties.DisabledColor /*int*/ ,_g_tabproperties.TextIconPadding /*float*/ );
 //BA.debugLineNum = 332;BA.debugLine="CreateTab(xTab,xTabProperties)";
_createtab(_xtab,_xtabproperties);
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public String  _addtabadvanced(com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _xtab,com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _xtabproperties) throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Public Sub AddTabAdvanced(xTab As ASTabMenuAdvance";
 //BA.debugLineNum = 340;BA.debugLine="CreateTab(xTab,xTabProperties)";
_createtab(_xtab,_xtabproperties);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return "";
}
public String  _base_resize(double _width,double _height) throws Exception{
float _middlebuttongap = 0f;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_tabtext = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_tabicon = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern _tabintern = null;
float _tabwidth = 0f;
float _tabheight = 0f;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_halobackground = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _xtab = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _xtabproperties = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties _xbadgeproperties = null;
boolean _haveicon = false;
float _widthheight = 0f;
float _badgewidth = 0f;
 //BA.debugLineNum = 164;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 165;BA.debugLine="SetCircleClip(mBase,m_CornerRadius)";
_setcircleclip(_mbase,(int) (_m_cornerradius));
 //BA.debugLineNum = 166;BA.debugLine="xpnl_TabBackground.SetLayoutAnimated(0,0,0,Width,";
_xpnl_tabbackground.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_width),(int) (_height));
 //BA.debugLineNum = 168;BA.debugLine="Dim MiddleButtonGap As Float = IIf(m_MiddleButton";
_middlebuttongap = (float)(BA.ObjectToNumber(((_m_middlebutton==__c.True) ? (((_g_middlebuttonproperties.CustomWidth /*float*/ ==0) ? ((Object)(_height)) : ((Object)(_g_middlebuttonproperties.CustomWidth /*float*/ )))) : ((Object)(0)))));
 //BA.debugLineNum = 169;BA.debugLine="xlbl_MiddleButton.Visible = m_MiddleButton And g_";
_xlbl_middlebutton.setVisible(_m_middlebutton && _g_middlebuttonproperties.Visible /*boolean*/ );
 //BA.debugLineNum = 170;BA.debugLine="xlbl_MiddleButton.SetLayoutAnimated(0,Width/2 - M";
_xlbl_middlebutton.SetLayoutAnimated((int) (0),(int) (_width/(double)2-_middlebuttongap/(double)2),(int) (0),(int) (_middlebuttongap),(int) (_middlebuttongap));
 //BA.debugLineNum = 171;BA.debugLine="xlbl_MiddleButton.SetColorAndBorder(xlbl_MiddleBu";
_xlbl_middlebutton.SetColorAndBorder(_xlbl_middlebutton.getColor(),(int) (0),(int) (0),(int) (_middlebuttongap/(double)2));
 //BA.debugLineNum = 174;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step7 = 1;
final int limit7 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 176;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _xpnl_tabbackground.GetView(_i);
 //BA.debugLineNum = 178;BA.debugLine="Dim xlbl_TabText As B4XView = xpnl_Tab.GetView(1";
_xlbl_tabtext = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_tabtext = _xpnl_tab.GetView((int) (1));
 //BA.debugLineNum = 179;BA.debugLine="Dim xiv_TabIcon As B4XView = xpnl_Tab.GetView(2)";
_xiv_tabicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_tabicon = _xpnl_tab.GetView((int) (2));
 //BA.debugLineNum = 180;BA.debugLine="Dim xlbl_Badge As B4XView = xpnl_Tab.GetView(3)";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = _xpnl_tab.GetView((int) (3));
 //BA.debugLineNum = 182;BA.debugLine="Dim TabIntern As ASTabMenuAdvanced_TabIntern = m";
_tabintern = (com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern)(_m_tablist.Get(_i));
 //BA.debugLineNum = 184;BA.debugLine="Dim TabWidth As Float = (Width - MiddleButtonGap";
_tabwidth = (float) ((_width-_middlebuttongap)/(double)_m_tablist.getSize());
 //BA.debugLineNum = 186;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,TabWidth*i + IIf(i";
_xpnl_tab.SetLayoutAnimated((int) (0),(int) (_tabwidth*_i+(double)(BA.ObjectToNumber(((_i>=(_m_tablist.getSize()/(double)2)) ? ((Object)(_middlebuttongap)) : ((Object)(0)))))),(int) (0),(int) (_tabwidth),(int) (_height));
 //BA.debugLineNum = 188;BA.debugLine="Dim TabHeight As Float = Height - IIf(m_Indicato";
_tabheight = (float) (_height-(double)(BA.ObjectToNumber(((_m_indicatorvisible==__c.True) ? ((Object)(_g_indicatorproperties.Height /*float*/ +_g_indicatorproperties.SafeGap /*float*/ )) : ((Object)(0))))));
 //BA.debugLineNum = 190;BA.debugLine="Dim xpnl_HaloBackground As B4XView = xpnl_Tab.Ge";
_xpnl_halobackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_halobackground = _xpnl_tab.GetView((int) (0));
 //BA.debugLineNum = 191;BA.debugLine="xpnl_HaloBackground.SetLayoutAnimated(0,0,0,TabW";
_xpnl_halobackground.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_tabwidth),_mbase.getHeight());
 //BA.debugLineNum = 193;BA.debugLine="Dim xTab As ASTabMenuAdvanced_Tab = TabIntern.xT";
_xtab = _tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ ;
 //BA.debugLineNum = 194;BA.debugLine="Dim xTabProperties As ASTabMenuAdvanced_TabPrope";
_xtabproperties = _tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ ;
 //BA.debugLineNum = 195;BA.debugLine="Dim xBadgeProperties As ASTabMenuAdvanced_BadgeP";
_xbadgeproperties = _tabintern.xBadgeProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties*/ ;
 //BA.debugLineNum = 197;BA.debugLine="Dim HaveIcon As Boolean = True";
_haveicon = __c.True;
 //BA.debugLineNum = 198;BA.debugLine="If xTab.Text = \"\" Then";
if ((_xtab.Text /*String*/ ).equals("")) { 
 //BA.debugLineNum = 199;BA.debugLine="Dim widthheight As Float = TabHeight*50/100";
_widthheight = (float) (_tabheight*50/(double)100);
 //BA.debugLineNum = 200;BA.debugLine="xiv_TabIcon.SetLayoutAnimated(0,xpnl_Tab.Width/";
_xiv_tabicon.SetLayoutAnimated((int) (0),(int) (_xpnl_tab.getWidth()/(double)2-_widthheight/(double)2),(int) (_tabheight/(double)2-_widthheight/(double)2),(int) (_widthheight),(int) (_widthheight));
 }else if((_xtab.Text /*String*/ ).equals("") == false && (_xtab.IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True || _xtab.IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True)) { 
 //BA.debugLineNum = 202;BA.debugLine="Dim widthheight As Float = TabHeight*40/100";
_widthheight = (float) (_tabheight*40/(double)100);
 //BA.debugLineNum = 203;BA.debugLine="xiv_TabIcon.SetLayoutAnimated(0,xpnl_Tab.Width/";
_xiv_tabicon.SetLayoutAnimated((int) (0),(int) (_xpnl_tab.getWidth()/(double)2-_widthheight/(double)2),(int) ((_tabheight/(double)2)/(double)2-(_widthheight/(double)2)/(double)2-_xtabproperties.TextIconPadding /*float*/ ),(int) (_widthheight),(int) (_widthheight));
 //BA.debugLineNum = 204;BA.debugLine="xlbl_TabText.SetLayoutAnimated(0,0,TabHeight/2";
_xlbl_tabtext.SetLayoutAnimated((int) (0),(int) (0),(int) (_tabheight/(double)2+(_widthheight/(double)2)/(double)2),_xpnl_tab.getWidth(),(int) (_widthheight));
 }else {
 //BA.debugLineNum = 206;BA.debugLine="HaveIcon = False";
_haveicon = __c.False;
 //BA.debugLineNum = 207;BA.debugLine="xlbl_TabText.SetLayoutAnimated(0,0,0,xpnl_Tab.W";
_xlbl_tabtext.SetLayoutAnimated((int) (0),(int) (0),(int) (0),_xpnl_tab.getWidth(),(int) (_tabheight));
 };
 //BA.debugLineNum = 210;BA.debugLine="xlbl_Badge.Visible = IIf(xTab.BadgeValue = 0 Or";
_xlbl_badge.setVisible(BA.ObjectToBoolean((((_xtab.BadgeValue /*String*/ ).equals(BA.NumberToString(0)) || (_xtab.BadgeValue /*String*/ ).equals("")) ? ((Object)(__c.False)) : ((Object)(__c.True)))));
 //BA.debugLineNum = 211;BA.debugLine="xlbl_Badge.Font = xBadgeProperties.TextFont";
_xlbl_badge.setFont(_xbadgeproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 212;BA.debugLine="xlbl_Badge.TextColor = xBadgeProperties.TextColo";
_xlbl_badge.setTextColor(_xbadgeproperties.TextColor /*int*/ );
 //BA.debugLineNum = 213;BA.debugLine="xlbl_Badge.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_badge.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 214;BA.debugLine="xlbl_Badge.Text = IIf(m_BadgeWithoutText = True,";
_xlbl_badge.setText(BA.ObjectToCharSequence(((_m_badgewithouttext==__c.True) ? ((Object)("")) : ((Object)(_xtab.BadgeValue /*String*/ )))));
 //BA.debugLineNum = 216;BA.debugLine="Dim BadgeWidth As Float = IIf(m_BadgeWithoutText";
_badgewidth = (float)(BA.ObjectToNumber(((_m_badgewithouttext==__c.True) ? ((Object)(_xbadgeproperties.Height /*float*/ )) : ((Object)(_measuretextwidth(_xlbl_badge.getText(),_xlbl_badge.getFont())+_xbadgeproperties.TextPadding /*float*/ )))));
 //BA.debugLineNum = 217;BA.debugLine="If BadgeWidth < xBadgeProperties.Height Then Bad";
if (_badgewidth<_xbadgeproperties.Height /*float*/ ) { 
_badgewidth = _xbadgeproperties.Height /*float*/ ;};
 //BA.debugLineNum = 219;BA.debugLine="If HaveIcon = True Then";
if (_haveicon==__c.True) { 
 //BA.debugLineNum = 220;BA.debugLine="xlbl_Badge.SetLayoutAnimated(0,xiv_TabIcon.Left";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xiv_tabicon.getLeft()+_xiv_tabicon.getWidth()+__c.DipToCurrent((int) (5))+_xbadgeproperties.LeftPadding /*float*/ ),(int) (_xiv_tabicon.getTop()-__c.DipToCurrent((int) (5))),(int) (_badgewidth),(int) (_badgewidth));
 }else {
 //BA.debugLineNum = 222;BA.debugLine="xlbl_Badge.SetLayoutAnimated(0,xpnl_Tab.Width/2";
_xlbl_badge.SetLayoutAnimated((int) (0),(int) (_xpnl_tab.getWidth()/(double)2+_measuretextwidth(_xtab.Text /*String*/ ,_xtabproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ )/(double)2+_xbadgeproperties.LeftPadding /*float*/ ),(int) (_xpnl_tab.getHeight()/(double)2-_badgewidth),(int) (_badgewidth),(int) (_badgewidth));
 };
 //BA.debugLineNum = 225;BA.debugLine="xlbl_Badge.SetColorAndBorder(xBadgeProperties.Ba";
_xlbl_badge.SetColorAndBorder(_xbadgeproperties.BackgroundColor /*int*/ ,(int) (0),(int) (0),(int) (_badgewidth/(double)2));
 //BA.debugLineNum = 227;BA.debugLine="If xTab.Enabled = True Then";
if (_xtab.Enabled /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 228;BA.debugLine="If i = m_Index Then";
if (_i==_m_index) { 
 //BA.debugLineNum = 229;BA.debugLine="xlbl_TabText.TextColor = xTabProperties.Select";
_xlbl_tabtext.setTextColor(_xtabproperties.SelectedColor /*int*/ );
 }else {
 //BA.debugLineNum = 231;BA.debugLine="xlbl_TabText.TextColor = xTabProperties.Unsele";
_xlbl_tabtext.setTextColor(_xtabproperties.UnselectedColor /*int*/ );
 };
 }else {
 //BA.debugLineNum = 234;BA.debugLine="xlbl_TabText.TextColor = xTabProperties.Disable";
_xlbl_tabtext.setTextColor(_xtabproperties.DisabledColor /*int*/ );
 };
 //BA.debugLineNum = 237;BA.debugLine="xpnl_Tab.Color = xTabProperties.BackgroundColor";
_xpnl_tab.setColor(_xtabproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 238;BA.debugLine="xlbl_TabText.SetTextAlignment(\"CENTER\",\"CENTER\")";
_xlbl_tabtext.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 239;BA.debugLine="xlbl_TabText.Font = xTabProperties.TextFont";
_xlbl_tabtext.setFont(_xtabproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 240;BA.debugLine="xlbl_TabText.Text = xTab.Text";
_xlbl_tabtext.setText(BA.ObjectToCharSequence(_xtab.Text /*String*/ ));
 //BA.debugLineNum = 242;BA.debugLine="xpnl_Indicator.Visible = m_IndicatorVisible";
_xpnl_indicator.setVisible(_m_indicatorvisible);
 //BA.debugLineNum = 244;BA.debugLine="If m_IndicatorVisible = True And i = m_Index The";
if (_m_indicatorvisible==__c.True && _i==_m_index) { 
 //BA.debugLineNum = 245;BA.debugLine="xpnl_Indicator.SetLayoutAnimated(0,xpnl_Tab.Lef";
_xpnl_indicator.SetLayoutAnimated((int) (0),_xpnl_tab.getLeft(),(int) (_mbase.getHeight()-_g_indicatorproperties.Height /*float*/ ),_xpnl_tab.getWidth(),(int) (_g_indicatorproperties.Height /*float*/ ));
 //BA.debugLineNum = 246;BA.debugLine="xpnl_Indicator.SetColorAndBorder(g_IndicatorPro";
_xpnl_indicator.SetColorAndBorder(_g_indicatorproperties.Color /*int*/ ,(int) (0),(int) (0),(int) (_g_indicatorproperties.CornerRadius /*float*/ ));
 };
 //BA.debugLineNum = 249;BA.debugLine="CustomDrawTab(i,m_TabList.Get(i))";
_customdrawtab(_i,(com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern)(_m_tablist.Get(_i)));
 }
};
 //BA.debugLineNum = 253;BA.debugLine="xlbl_MiddleButton.Color = g_MiddleButtonPropertie";
_xlbl_middlebutton.setColor(_g_middlebuttonproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 254;BA.debugLine="xlbl_MiddleButton.TextColor = g_MiddleButtonPrope";
_xlbl_middlebutton.setTextColor(_g_middlebuttonproperties.TextColor /*int*/ );
 //BA.debugLineNum = 255;BA.debugLine="xlbl_MiddleButton.Font = g_MiddleButtonProperties";
_xlbl_middlebutton.setFont(_g_middlebuttonproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 70;BA.debugLine="Type ASTabMenuAdvanced_TabProperties(TextFont As";
;
 //BA.debugLineNum = 71;BA.debugLine="Type ASTabMenuAdvanced_Tab(Text As String,IconSel";
;
 //BA.debugLineNum = 72;BA.debugLine="Type ASTabMenuAdvanced_BadgeProperties(TextColor";
;
 //BA.debugLineNum = 73;BA.debugLine="Type ASTabMenuAdvanced_TabViews(xpnl_TabBackgroun";
;
 //BA.debugLineNum = 74;BA.debugLine="Type ASTabMenuAdvanced_TabIntern(xTab As ASTabMen";
;
 //BA.debugLineNum = 75;BA.debugLine="Type ASTabMenuAdvanced_IndicatorProperties(Height";
;
 //BA.debugLineNum = 76;BA.debugLine="Type ASTabMenuAdvanced_MiddleButtonProperties(Cus";
;
 //BA.debugLineNum = 78;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
 //BA.debugLineNum = 79;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
 //BA.debugLineNum = 80;BA.debugLine="Public mBase As B4XView";
_mbase = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 81;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 82;BA.debugLine="Public Tag As Object";
_tag = new Object();
 //BA.debugLineNum = 84;BA.debugLine="Private g_TabProperties As ASTabMenuAdvanced_TabP";
_g_tabproperties = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties();
 //BA.debugLineNum = 85;BA.debugLine="Private g_BadgeProperties As ASTabMenuAdvanced_Ba";
_g_badgeproperties = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties();
 //BA.debugLineNum = 86;BA.debugLine="Private g_IndicatorProperties As ASTabMenuAdvance";
_g_indicatorproperties = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_indicatorproperties();
 //BA.debugLineNum = 87;BA.debugLine="Private g_MiddleButtonProperties As ASTabMenuAdva";
_g_middlebuttonproperties = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_middlebuttonproperties();
 //BA.debugLineNum = 89;BA.debugLine="Private xpnl_TabBackground As B4XView";
_xpnl_tabbackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 90;BA.debugLine="Private xpnl_Indicator As B4XView";
_xpnl_indicator = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 91;BA.debugLine="Private xlbl_MiddleButton As B4XView";
_xlbl_middlebutton = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 93;BA.debugLine="Private m_Index As Int = -1";
_m_index = (int) (-1);
 //BA.debugLineNum = 94;BA.debugLine="Private m_TabList As List";
_m_tablist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 95;BA.debugLine="Private m_SelectedBackgroundColorAnimationDuratio";
_m_selectedbackgroundcoloranimationduration = (int) (750);
 //BA.debugLineNum = 97;BA.debugLine="Private m_BadgeWithoutText As Boolean = False";
_m_badgewithouttext = __c.False;
 //BA.debugLineNum = 98;BA.debugLine="Private m_HaloEffect As Boolean = True";
_m_haloeffect = __c.True;
 //BA.debugLineNum = 99;BA.debugLine="Private m_HaloColor As Int";
_m_halocolor = 0;
 //BA.debugLineNum = 100;BA.debugLine="Private m_CornerRadius As Float";
_m_cornerradius = 0f;
 //BA.debugLineNum = 102;BA.debugLine="Private m_MiddleButton As Boolean";
_m_middlebutton = false;
 //BA.debugLineNum = 103;BA.debugLine="Private m_IndicatorVisible As Boolean = False";
_m_indicatorvisible = __c.False;
 //BA.debugLineNum = 104;BA.debugLine="Private m_ColorIcons As Boolean = True";
_m_coloricons = __c.True;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties  _createastabmenuadvanced_badgeproperties(int _textcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _textfont,float _height,float _textpadding,float _leftpadding,int _backgroundcolor) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties _t1 = null;
 //BA.debugLineNum = 803;BA.debugLine="Public Sub CreateASTabMenuAdvanced_BadgeProperties";
 //BA.debugLineNum = 804;BA.debugLine="Dim t1 As ASTabMenuAdvanced_BadgeProperties";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties();
 //BA.debugLineNum = 805;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 806;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 807;BA.debugLine="t1.TextFont = TextFont";
_t1.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _textfont;
 //BA.debugLineNum = 808;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 809;BA.debugLine="t1.TextPadding = TextPadding";
_t1.TextPadding /*float*/  = _textpadding;
 //BA.debugLineNum = 810;BA.debugLine="t1.LeftPadding = LeftPadding";
_t1.LeftPadding /*float*/  = _leftpadding;
 //BA.debugLineNum = 811;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 812;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_indicatorproperties  _createastabmenuadvanced_indicatorproperties(float _height,int _color,float _cornerradius,long _duration,float _safegap) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_indicatorproperties _t1 = null;
 //BA.debugLineNum = 825;BA.debugLine="Public Sub CreateASTabMenuAdvanced_IndicatorProper";
 //BA.debugLineNum = 826;BA.debugLine="Dim t1 As ASTabMenuAdvanced_IndicatorProperties";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_indicatorproperties();
 //BA.debugLineNum = 827;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 828;BA.debugLine="t1.Height = Height";
_t1.Height /*float*/  = _height;
 //BA.debugLineNum = 829;BA.debugLine="t1.Color = Color";
_t1.Color /*int*/  = _color;
 //BA.debugLineNum = 830;BA.debugLine="t1.CornerRadius = CornerRadius";
_t1.CornerRadius /*float*/  = _cornerradius;
 //BA.debugLineNum = 831;BA.debugLine="t1.Duration = Duration";
_t1.Duration /*long*/  = _duration;
 //BA.debugLineNum = 832;BA.debugLine="t1.SafeGap = SafeGap";
_t1.SafeGap /*float*/  = _safegap;
 //BA.debugLineNum = 833;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 834;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_middlebuttonproperties  _createastabmenuadvanced_middlebuttonproperties(float _customwidth,int _backgroundcolor,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _xfont,int _textcolor,boolean _visible) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_middlebuttonproperties _t1 = null;
 //BA.debugLineNum = 838;BA.debugLine="Public Sub CreateASTabMenuAdvanced_MiddleButtonPro";
 //BA.debugLineNum = 839;BA.debugLine="Dim t1 As ASTabMenuAdvanced_MiddleButtonPropertie";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_middlebuttonproperties();
 //BA.debugLineNum = 840;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 841;BA.debugLine="t1.CustomWidth = CustomWidth";
_t1.CustomWidth /*float*/  = _customwidth;
 //BA.debugLineNum = 842;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 843;BA.debugLine="t1.xFont = xFont";
_t1.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _xfont;
 //BA.debugLineNum = 844;BA.debugLine="t1.TextColor = TextColor";
_t1.TextColor /*int*/  = _textcolor;
 //BA.debugLineNum = 845;BA.debugLine="t1.Visible = Visible";
_t1.Visible /*boolean*/  = _visible;
 //BA.debugLineNum = 846;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 847;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab  _createastabmenuadvanced_tab(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _iconselected,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _iconunselected) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _t1 = null;
 //BA.debugLineNum = 769;BA.debugLine="Public Sub CreateASTabMenuAdvanced_Tab (Text As St";
 //BA.debugLineNum = 770;BA.debugLine="Dim t1 As ASTabMenuAdvanced_Tab";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab();
 //BA.debugLineNum = 771;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 772;BA.debugLine="t1.Text = Text";
_t1.Text /*String*/  = _text;
 //BA.debugLineNum = 773;BA.debugLine="t1.IconSelected = IconSelected";
_t1.IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _iconselected;
 //BA.debugLineNum = 774;BA.debugLine="t1.IconUnselected = IconUnselected";
_t1.IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/  = _iconunselected;
 //BA.debugLineNum = 776;BA.debugLine="t1.Enabled = True";
_t1.Enabled /*boolean*/  = __c.True;
 //BA.debugLineNum = 777;BA.debugLine="t1.BadgeValue = 0";
_t1.BadgeValue /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 778;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 779;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern  _createastabmenuadvanced_tabintern(com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _xtab,com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _xtabproperties,com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties _xbadgeproperties,com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews _xtabviews) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern _t1 = null;
 //BA.debugLineNum = 781;BA.debugLine="Public Sub CreateASTabMenuAdvanced_TabIntern (xTab";
 //BA.debugLineNum = 782;BA.debugLine="Dim t1 As ASTabMenuAdvanced_TabIntern";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern();
 //BA.debugLineNum = 783;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 784;BA.debugLine="t1.xTab = xTab";
_t1.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/  = _xtab;
 //BA.debugLineNum = 785;BA.debugLine="t1.xTabProperties = xTabProperties";
_t1.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/  = _xtabproperties;
 //BA.debugLineNum = 786;BA.debugLine="t1.xBadgeProperties = xBadgeProperties";
_t1.xBadgeProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties*/  = _xbadgeproperties;
 //BA.debugLineNum = 787;BA.debugLine="t1.xTabViews = xTabViews";
_t1.xTabViews /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews*/  = _xtabviews;
 //BA.debugLineNum = 788;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties  _createastabmenuadvanced_tabproperties(anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _textfont,int _backgroundcolor,int _selectedcolor,int _unselectedcolor,int _disabledcolor,float _texticonpadding) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _t1 = null;
 //BA.debugLineNum = 791;BA.debugLine="Public Sub CreateASTabMenuAdvanced_TabProperties (";
 //BA.debugLineNum = 792;BA.debugLine="Dim t1 As ASTabMenuAdvanced_TabProperties";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties();
 //BA.debugLineNum = 793;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 794;BA.debugLine="t1.TextFont = TextFont";
_t1.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = _textfont;
 //BA.debugLineNum = 795;BA.debugLine="t1.BackgroundColor = BackgroundColor";
_t1.BackgroundColor /*int*/  = _backgroundcolor;
 //BA.debugLineNum = 796;BA.debugLine="t1.SelectedColor = SelectedColor";
_t1.SelectedColor /*int*/  = _selectedcolor;
 //BA.debugLineNum = 797;BA.debugLine="t1.UnselectedColor = UnselectedColor";
_t1.UnselectedColor /*int*/  = _unselectedcolor;
 //BA.debugLineNum = 798;BA.debugLine="t1.DisabledColor = DisabledColor";
_t1.DisabledColor /*int*/  = _disabledcolor;
 //BA.debugLineNum = 799;BA.debugLine="t1.TextIconPadding = TextIconPadding";
_t1.TextIconPadding /*float*/  = _texticonpadding;
 //BA.debugLineNum = 800;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 801;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews  _createastabmenuadvanced_tabviews(anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_tabtext,anywheresoftware.b4a.objects.B4XViewWrapper _xiv_tabicon,anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews _t1 = null;
 //BA.debugLineNum = 815;BA.debugLine="Public Sub CreateASTabMenuAdvanced_TabViews (xpnl_";
 //BA.debugLineNum = 816;BA.debugLine="Dim t1 As ASTabMenuAdvanced_TabViews";
_t1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews();
 //BA.debugLineNum = 817;BA.debugLine="t1.Initialize";
_t1.Initialize();
 //BA.debugLineNum = 818;BA.debugLine="t1.xpnl_TabBackground = xpnl_Tab";
_t1.xpnl_TabBackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xpnl_tab;
 //BA.debugLineNum = 819;BA.debugLine="t1.xlbl_TabText = xlbl_TabText";
_t1.xlbl_TabText /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xlbl_tabtext;
 //BA.debugLineNum = 820;BA.debugLine="t1.xiv_TabIcon = xiv_TabIcon";
_t1.xiv_TabIcon /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xiv_tabicon;
 //BA.debugLineNum = 821;BA.debugLine="t1.xlbl_Badge = xlbl_Badge";
_t1.xlbl_Badge /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _xlbl_badge;
 //BA.debugLineNum = 822;BA.debugLine="Return t1";
if (true) return _t1;
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return null;
}
public void  _createhaloeffect(anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _x,int _y,int _clr) throws Exception{
ResumableSub_CreateHaloEffect rsub = new ResumableSub_CreateHaloEffect(this,_parent,_x,_y,_clr);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateHaloEffect extends BA.ResumableSub {
public ResumableSub_CreateHaloEffect(com.holydesing.software.wallpaperhq.as_tabmenuadvanced parent,anywheresoftware.b4a.objects.B4XViewWrapper _parent,int _x,int _y,int _clr) {
this.parent = parent;
this._parent = _parent;
this._x = _x;
this._y = _y;
this._clr = _clr;
}
com.holydesing.software.wallpaperhq.as_tabmenuadvanced parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
int _x;
int _y;
int _clr;
anywheresoftware.b4a.objects.B4XCanvas _cvs = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _radius = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 681;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 682;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 683;BA.debugLine="Dim radius As Int = 150dip";
_radius = parent.__c.DipToCurrent((int) (150));
 //BA.debugLineNum = 684;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, radius * 2, radius *";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (_radius*2),(int) (_radius*2));
 //BA.debugLineNum = 685;BA.debugLine="cvs.Initialize(p)";
_cvs.Initialize(_p);
 //BA.debugLineNum = 686;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Target";
_cvs.DrawCircle(_cvs.getTargetRect().getCenterX(),_cvs.getTargetRect().getCenterY(),(float) (_cvs.getTargetRect().getWidth()/(double)2),_clr,parent.__c.True,(float) (0));
 //BA.debugLineNum = 687;BA.debugLine="Dim bmp As B4XBitmap = cvs.CreateBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = _cvs.CreateBitmap();
 //BA.debugLineNum = 688;BA.debugLine="CreateHaloEffectHelper(Parent,bmp, x, y, radius)";
parent._createhaloeffecthelper(_parent,_bmp,_x,_y,_radius);
 //BA.debugLineNum = 689;BA.debugLine="Sleep(800)";
parent.__c.Sleep(ba,this,(int) (800));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 690;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _createhaloeffecthelper(anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _x,int _y,int _radius) throws Exception{
ResumableSub_CreateHaloEffectHelper rsub = new ResumableSub_CreateHaloEffectHelper(this,_parent,_bmp,_x,_y,_radius);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateHaloEffectHelper extends BA.ResumableSub {
public ResumableSub_CreateHaloEffectHelper(com.holydesing.software.wallpaperhq.as_tabmenuadvanced parent,anywheresoftware.b4a.objects.B4XViewWrapper _parent,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp,int _x,int _y,int _radius) {
this.parent = parent;
this._parent = _parent;
this._bmp = _bmp;
this._x = _x;
this._y = _y;
this._radius = _radius;
}
com.holydesing.software.wallpaperhq.as_tabmenuadvanced parent;
anywheresoftware.b4a.objects.B4XViewWrapper _parent;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp;
int _x;
int _y;
int _radius;
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
 //BA.debugLineNum = 693;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 694;BA.debugLine="iv.Initialize(\"\")";
_iv.Initialize(ba,"");
 //BA.debugLineNum = 695;BA.debugLine="Dim p As B4XView = iv";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 696;BA.debugLine="p.SetBitmap(bmp)";
_p.SetBitmap((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 698;BA.debugLine="Parent.AddView(p, x, y, 0, 0)";
_parent.AddView((android.view.View)(_p.getObject()),_x,_y,(int) (0),(int) (0));
 //BA.debugLineNum = 700;BA.debugLine="p.SetLayoutAnimated(m_SelectedBackgroundColorAnim";
_p.SetLayoutAnimated(parent._m_selectedbackgroundcoloranimationduration,(int) (_x-_radius),(int) (_y-_radius),(int) (2*_radius),(int) (2*_radius));
 //BA.debugLineNum = 701;BA.debugLine="p.SetVisibleAnimated(m_SelectedBackgroundColorAni";
_p.SetVisibleAnimated(parent._m_selectedbackgroundcoloranimationduration,parent.__c.False);
 //BA.debugLineNum = 702;BA.debugLine="Sleep(m_SelectedBackgroundColorAnimationDuration)";
parent.__c.Sleep(ba,this,parent._m_selectedbackgroundcoloranimationduration);
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 //BA.debugLineNum = 703;BA.debugLine="p.RemoveViewFromParent";
_p.RemoveViewFromParent();
 //BA.debugLineNum = 704;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createimageview(String _eventname) throws Exception{
anywheresoftware.b4a.objects.ImageViewWrapper _iv = null;
 //BA.debugLineNum = 592;BA.debugLine="Public Sub CreateImageView(EventName As String) As";
 //BA.debugLineNum = 593;BA.debugLine="Dim iv As ImageView";
_iv = new anywheresoftware.b4a.objects.ImageViewWrapper();
 //BA.debugLineNum = 594;BA.debugLine="iv.Initialize(EventName)";
_iv.Initialize(ba,_eventname);
 //BA.debugLineNum = 595;BA.debugLine="Return iv";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_iv.getObject()));
 //BA.debugLineNum = 596;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _createlabel(String _eventname) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 586;BA.debugLine="Public Sub CreateLabel(EventName As String) As B4X";
 //BA.debugLineNum = 587;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 588;BA.debugLine="lbl.Initialize(EventName)";
_lbl.Initialize(ba,_eventname);
 //BA.debugLineNum = 589;BA.debugLine="Return lbl";
if (true) return (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_lbl.getObject()));
 //BA.debugLineNum = 590;BA.debugLine="End Sub";
return null;
}
public String  _createtab(com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _xtab,com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _xtabproperties) throws Exception{
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties _xbadgeproperties = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_halobackground = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_tabtext = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_tabicon = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_badge = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews _xtabviews = null;
 //BA.debugLineNum = 356;BA.debugLine="Private Sub CreateTab(xTab As ASTabMenuAdvanced_Ta";
 //BA.debugLineNum = 358;BA.debugLine="Dim xBadgeProperties As ASTabMenuAdvanced_BadgePr";
_xbadgeproperties = _createastabmenuadvanced_badgeproperties(_g_badgeproperties.TextColor /*int*/ ,_g_badgeproperties.TextFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ ,_g_badgeproperties.Height /*float*/ ,_g_badgeproperties.TextPadding /*float*/ ,_g_badgeproperties.LeftPadding /*float*/ ,_g_badgeproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 360;BA.debugLine="Dim xpnl_Tab As B4XView = xui.CreatePanel(\"xpnl_T";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _xui.CreatePanel(ba,"xpnl_Tab");
 //BA.debugLineNum = 362;BA.debugLine="Dim xpnl_HaloBackground As B4XView = xui.CreatePa";
_xpnl_halobackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_halobackground = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 363;BA.debugLine="xpnl_Tab.AddView(xpnl_HaloBackground,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xpnl_halobackground.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 365;BA.debugLine="Dim xlbl_TabText As B4XView = CreateLabel(\"\")";
_xlbl_tabtext = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_tabtext = _createlabel("");
 //BA.debugLineNum = 366;BA.debugLine="Dim xiv_TabIcon As B4XView = CreateImageView(\"\")";
_xiv_tabicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_tabicon = _createimageview("");
 //BA.debugLineNum = 367;BA.debugLine="Dim xlbl_Badge As B4XView = CreateLabel(\"\")";
_xlbl_badge = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_badge = _createlabel("");
 //BA.debugLineNum = 369;BA.debugLine="xpnl_Tab.SetLayoutAnimated(0,0,0,0,0)";
_xpnl_tab.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 371;BA.debugLine="xpnl_Tab.AddView(xlbl_TabText,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xlbl_tabtext.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 372;BA.debugLine="xpnl_Tab.AddView(xiv_TabIcon,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xiv_tabicon.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 373;BA.debugLine="xpnl_Tab.AddView(xlbl_Badge,0,0,0,0)";
_xpnl_tab.AddView((android.view.View)(_xlbl_badge.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 375;BA.debugLine="Dim xTabViews As ASTabMenuAdvanced_TabViews = Cre";
_xtabviews = _createastabmenuadvanced_tabviews(_xpnl_tab,_xlbl_tabtext,_xiv_tabicon,_xlbl_badge);
 //BA.debugLineNum = 377;BA.debugLine="m_TabList.Add(CreateASTabMenuAdvanced_TabIntern(x";
_m_tablist.Add((Object)(_createastabmenuadvanced_tabintern(_xtab,_xtabproperties,_xbadgeproperties,_xtabviews)));
 //BA.debugLineNum = 379;BA.debugLine="xpnl_TabBackground.AddView(xpnl_Tab,0,0,0,0)";
_xpnl_tabbackground.AddView((android.view.View)(_xpnl_tab.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 381;BA.debugLine="End Sub";
return "";
}
public String  _customdrawtab(int _index,com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern _tabitem) throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Private Sub CustomDrawTab(Index As Int, TabItem As";
 //BA.debugLineNum = 474;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Custom";
if (_xui.SubExists(ba,_mcallback,_meventname+"_CustomDrawTab",(int) (2))) { 
 //BA.debugLineNum = 475;BA.debugLine="CallSub3(mCallBack, mEventName & \"_CustomDrawTab";
__c.CallSubNew3(ba,_mcallback,_meventname+"_CustomDrawTab",(Object)(_index),(Object)(_tabitem));
 };
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Object _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 116;BA.debugLine="mBase = Base";
_mbase = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_base));
 //BA.debugLineNum = 117;BA.debugLine="Tag = mBase.Tag";
_tag = _mbase.getTag();
 //BA.debugLineNum = 118;BA.debugLine="mBase.Tag = Me";
_mbase.setTag(this);
 //BA.debugLineNum = 119;BA.debugLine="IniProps(Props)";
_iniprops(_props);
 //BA.debugLineNum = 121;BA.debugLine="xpnl_TabBackground = xui.CreatePanel(\"\")";
_xpnl_tabbackground = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 122;BA.debugLine="mBase.AddView(xpnl_TabBackground,0,0,mBase.Width,";
_mbase.AddView((android.view.View)(_xpnl_tabbackground.getObject()),(int) (0),(int) (0),_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 123;BA.debugLine="xpnl_TabBackground.Color = g_TabProperties.Backgr";
_xpnl_tabbackground.setColor(_g_tabproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 125;BA.debugLine="xpnl_Indicator = xui.CreatePanel(\"\")";
_xpnl_indicator = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 126;BA.debugLine="mBase.AddView(xpnl_Indicator,0,0,0,0)";
_mbase.AddView((android.view.View)(_xpnl_indicator.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 128;BA.debugLine="xlbl_MiddleButton = CreateLabel(\"xlbl_MiddleButto";
_xlbl_middlebutton = _createlabel("xlbl_MiddleButton");
 //BA.debugLineNum = 129;BA.debugLine="mBase.AddView(xlbl_MiddleButton,0,0,0,0)";
_mbase.AddView((android.view.View)(_xlbl_middlebutton.getObject()),(int) (0),(int) (0),(int) (0),(int) (0));
 //BA.debugLineNum = 131;BA.debugLine="xlbl_MiddleButton.Color = g_MiddleButtonPropertie";
_xlbl_middlebutton.setColor(_g_middlebuttonproperties.BackgroundColor /*int*/ );
 //BA.debugLineNum = 132;BA.debugLine="xlbl_MiddleButton.TextColor = g_MiddleButtonPrope";
_xlbl_middlebutton.setTextColor(_g_middlebuttonproperties.TextColor /*int*/ );
 //BA.debugLineNum = 133;BA.debugLine="xlbl_MiddleButton.SetTextAlignment(\"CENTER\",\"CENT";
_xlbl_middlebutton.SetTextAlignment("CENTER","CENTER");
 //BA.debugLineNum = 134;BA.debugLine="xlbl_MiddleButton.Font = g_MiddleButtonProperties";
_xlbl_middlebutton.setFont(_g_middlebuttonproperties.xFont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/ );
 //BA.debugLineNum = 135;BA.debugLine="xlbl_MiddleButton.Text = Chr(0xE145)";
_xlbl_middlebutton.setText(BA.ObjectToCharSequence(__c.Chr(((int)0xe145))));
 //BA.debugLineNum = 138;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper  _fonttobitmap(String _text,boolean _ismaterialicons,float _fontsize,int _color) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
anywheresoftware.b4a.objects.B4XCanvas _cvs1 = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _fnt = null;
anywheresoftware.b4a.objects.B4XCanvas.B4XRect _r = null;
int _baseline = 0;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _b = null;
 //BA.debugLineNum = 707;BA.debugLine="Public Sub FontToBitmap (text As String, IsMateria";
 //BA.debugLineNum = 708;BA.debugLine="Dim xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 709;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = _xui.CreatePanel(ba,"");
 //BA.debugLineNum = 710;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 32dip, 32dip)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),__c.DipToCurrent((int) (32)),__c.DipToCurrent((int) (32)));
 //BA.debugLineNum = 711;BA.debugLine="Dim cvs1 As B4XCanvas";
_cvs1 = new anywheresoftware.b4a.objects.B4XCanvas();
 //BA.debugLineNum = 712;BA.debugLine="cvs1.Initialize(p)";
_cvs1.Initialize(_p);
 //BA.debugLineNum = 713;BA.debugLine="Dim fnt As B4XFont";
_fnt = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont();
 //BA.debugLineNum = 714;BA.debugLine="If IsMaterialIcons Then fnt = xui.CreateMaterialI";
if (_ismaterialicons) { 
_fnt = _xui.CreateMaterialIcons(_fontsize);}
else {
_fnt = _xui.CreateFontAwesome(_fontsize);};
 //BA.debugLineNum = 715;BA.debugLine="Dim r As B4XRect = cvs1.MeasureText(text, fnt)";
_r = _cvs1.MeasureText(_text,_fnt);
 //BA.debugLineNum = 716;BA.debugLine="Dim BaseLine As Int = cvs1.TargetRect.CenterY - r";
_baseline = (int) (_cvs1.getTargetRect().getCenterY()-_r.getHeight()/(double)2-_r.getTop());
 //BA.debugLineNum = 717;BA.debugLine="cvs1.DrawText(text, cvs1.TargetRect.CenterX, Base";
_cvs1.DrawText(ba,_text,_cvs1.getTargetRect().getCenterX(),(float) (_baseline),_fnt,_color,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 //BA.debugLineNum = 718;BA.debugLine="Dim b As B4XBitmap = cvs1.CreateBitmap";
_b = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_b = _cvs1.CreateBitmap();
 //BA.debugLineNum = 719;BA.debugLine="cvs1.Release";
_cvs1.Release();
 //BA.debugLineNum = 720;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 721;BA.debugLine="End Sub";
return null;
}
public int[]  _getargb(int _color) throws Exception{
int[] _res = null;
 //BA.debugLineNum = 671;BA.debugLine="Private Sub GetARGB(Color As Int) As Int()'ignore";
 //BA.debugLineNum = 672;BA.debugLine="Private res(4) As Int";
_res = new int[(int) (4)];
;
 //BA.debugLineNum = 673;BA.debugLine="res(0) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (0)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff000000)),(int) (24));
 //BA.debugLineNum = 674;BA.debugLine="res(1) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (1)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff0000)),(int) (16));
 //BA.debugLineNum = 675;BA.debugLine="res(2) = Bit.UnsignedShiftRight(Bit.And(Color, 0x";
_res[(int) (2)] = __c.Bit.UnsignedShiftRight(__c.Bit.And(_color,((int)0xff00)),(int) (8));
 //BA.debugLineNum = 676;BA.debugLine="res(3) = Bit.And(Color, 0xff)";
_res[(int) (3)] = __c.Bit.And(_color,((int)0xff));
 //BA.debugLineNum = 677;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 678;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_badgeproperties  _getbadgeproperties() throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Public Sub getBadgeProperties As ASTabMenuAdvanced";
 //BA.debugLineNum = 431;BA.debugLine="Return g_BadgeProperties";
if (true) return _g_badgeproperties;
 //BA.debugLineNum = 432;BA.debugLine="End Sub";
return null;
}
public boolean  _getbadgewithouttext() throws Exception{
 //BA.debugLineNum = 385;BA.debugLine="Public Sub getBadgeWithoutText As Boolean";
 //BA.debugLineNum = 386;BA.debugLine="Return m_BadgeWithoutText";
if (true) return _m_badgewithouttext;
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return false;
}
public float  _getcornerradius() throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Public Sub getCornerRadius As Float";
 //BA.debugLineNum = 419;BA.debugLine="Return m_CornerRadius";
if (true) return _m_cornerradius;
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return 0f;
}
public int  _getindex() throws Exception{
 //BA.debugLineNum = 461;BA.debugLine="Public Sub getIndex As Int";
 //BA.debugLineNum = 462;BA.debugLine="Return m_Index";
if (true) return _m_index;
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return 0;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_indicatorproperties  _getindicatorproperties() throws Exception{
 //BA.debugLineNum = 426;BA.debugLine="Public Sub getIndicatorProperties As ASTabMenuAdva";
 //BA.debugLineNum = 427;BA.debugLine="Return g_IndicatorProperties";
if (true) return _g_indicatorproperties;
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public boolean  _getindicatorvisible() throws Exception{
 //BA.debugLineNum = 409;BA.debugLine="Public Sub getIndicatorVisible As Boolean";
 //BA.debugLineNum = 410;BA.debugLine="Return m_IndicatorVisible";
if (true) return _m_indicatorvisible;
 //BA.debugLineNum = 411;BA.debugLine="End Sub";
return false;
}
public boolean  _getmiddlebutton() throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Public Sub getMiddleButton As Boolean";
 //BA.debugLineNum = 398;BA.debugLine="Return m_MiddleButton";
if (true) return _m_middlebutton;
 //BA.debugLineNum = 399;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.B4XViewWrapper  _getmiddlebuttonlabel() throws Exception{
 //BA.debugLineNum = 401;BA.debugLine="Public Sub getMiddleButtonLabel As B4XView";
 //BA.debugLineNum = 402;BA.debugLine="Return xlbl_MiddleButton";
if (true) return _xlbl_middlebutton;
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_middlebuttonproperties  _getmiddlebuttonproperties() throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Public Sub getMiddleButtonProperties As ASTabMenuA";
 //BA.debugLineNum = 423;BA.debugLine="Return g_MiddleButtonProperties";
if (true) return _g_middlebuttonproperties;
 //BA.debugLineNum = 424;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern  _gettab(int _index) throws Exception{
 //BA.debugLineNum = 449;BA.debugLine="Public Sub GetTab(Index As Int) As ASTabMenuAdvanc";
 //BA.debugLineNum = 450;BA.debugLine="Return m_TabList.Get(Index)";
if (true) return (com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern)(_m_tablist.Get(_index));
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return null;
}
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties  _gettabproperties() throws Exception{
 //BA.debugLineNum = 437;BA.debugLine="Public Sub getTabProperties As ASTabMenuAdvanced_T";
 //BA.debugLineNum = 438;BA.debugLine="Return g_TabProperties";
if (true) return _g_tabproperties;
 //BA.debugLineNum = 439;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _gettabs() throws Exception{
 //BA.debugLineNum = 457;BA.debugLine="Public Sub GetTabs As List";
 //BA.debugLineNum = 458;BA.debugLine="Return m_TabList";
if (true) return _m_tablist;
 //BA.debugLineNum = 459;BA.debugLine="End Sub";
return null;
}
public String  _iniprops(anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Private Sub IniProps(Props As Map)";
 //BA.debugLineNum = 145;BA.debugLine="m_BadgeWithoutText= Props.GetDefault(\"BadgeWithou";
_m_badgewithouttext = BA.ObjectToBoolean(_props.GetDefault((Object)("BadgeWithoutText"),(Object)(__c.False)));
 //BA.debugLineNum = 146;BA.debugLine="m_MiddleButton = Props.GetDefault(\"MiddleButton\",";
_m_middlebutton = BA.ObjectToBoolean(_props.GetDefault((Object)("MiddleButton"),(Object)(__c.False)));
 //BA.debugLineNum = 147;BA.debugLine="m_IndicatorVisible = Props.GetDefault(\"Indicator\"";
_m_indicatorvisible = BA.ObjectToBoolean(_props.GetDefault((Object)("Indicator"),(Object)(__c.False)));
 //BA.debugLineNum = 148;BA.debugLine="m_HaloEffect = Props.Get(\"HaloEffect\")";
_m_haloeffect = BA.ObjectToBoolean(_props.Get((Object)("HaloEffect")));
 //BA.debugLineNum = 149;BA.debugLine="m_ColorIcons = Props.GetDefault(\"ColorIcons\",True";
_m_coloricons = BA.ObjectToBoolean(_props.GetDefault((Object)("ColorIcons"),(Object)(__c.True)));
 //BA.debugLineNum = 150;BA.debugLine="m_HaloColor = xui.PaintOrColorToColor(Props.Get(\"";
_m_halocolor = _xui.PaintOrColorToColor(_props.Get((Object)("HaloColor")));
 //BA.debugLineNum = 152;BA.debugLine="If Props.Get(\"FirstTabSelected\").As(Boolean) = Tr";
if ((BA.ObjectToBoolean(_props.Get((Object)("FirstTabSelected"))))==__c.True) { 
 //BA.debugLineNum = 153;BA.debugLine="m_Index = 0";
_m_index = (int) (0);
 }else {
 //BA.debugLineNum = 155;BA.debugLine="m_Index = -1";
_m_index = (int) (-1);
 };
 //BA.debugLineNum = 158;BA.debugLine="g_TabProperties = CreateASTabMenuAdvanced_TabProp";
_g_tabproperties = _createastabmenuadvanced_tabproperties(_xui.CreateDefaultFont((float) (15)),_xui.PaintOrColorToColor(_props.Get((Object)("BackgroundColor"))),_xui.PaintOrColorToColor(_props.Get((Object)("SelectedColor"))),_xui.PaintOrColorToColor(_props.Get((Object)("UnselectedColor"))),_xui.PaintOrColorToColor(_props.Get((Object)("DisabledColor"))),(float) (0));
 //BA.debugLineNum = 159;BA.debugLine="g_BadgeProperties = CreateASTabMenuAdvanced_Badge";
_g_badgeproperties = _createastabmenuadvanced_badgeproperties(_xui.Color_White,_xui.CreateDefaultBoldFont((float) (11)),(float) (__c.DipToCurrent((int) (15))),(float) (__c.DipToCurrent((int) (11))),(float) (0),_xui.Color_ARGB((int) (255),(int) (73),(int) (98),(int) (164)));
 //BA.debugLineNum = 160;BA.debugLine="g_IndicatorProperties = CreateASTabMenuAdvanced_I";
_g_indicatorproperties = _createastabmenuadvanced_indicatorproperties((float) (__c.DipToCurrent((int) (2))),_xui.Color_White,(float) (__c.DipToCurrent((int) (2))/(double)2),(long) (250),(float) (__c.DipToCurrent((int) (4))));
 //BA.debugLineNum = 161;BA.debugLine="g_MiddleButtonProperties = CreateASTabMenuAdvance";
_g_middlebuttonproperties = _createastabmenuadvanced_middlebuttonproperties((float) (0),_xui.Color_White,_xui.CreateMaterialIcons((float)(BA.ObjectToNumber(((_xui.getIsB4J()) ? ((Object)(30)) : ((Object)(25)))))),_xui.Color_Black,__c.True);
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 108;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 109;BA.debugLine="mEventName = EventName";
_meventname = _eventname;
 //BA.debugLineNum = 110;BA.debugLine="mCallBack = Callback";
_mcallback = _callback;
 //BA.debugLineNum = 111;BA.debugLine="m_TabList.Initialize";
_m_tablist.Initialize();
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public int  _measuretextwidth(String _text,anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont _font1) throws Exception{
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
 //BA.debugLineNum = 745;BA.debugLine="Private Sub MeasureTextWidth(Text As String, Font1";
 //BA.debugLineNum = 747;BA.debugLine="Private bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 748;BA.debugLine="bmp.InitializeMutable(2dip, 2dip)";
_bmp.InitializeMutable(__c.DipToCurrent((int) (2)),__c.DipToCurrent((int) (2)));
 //BA.debugLineNum = 749;BA.debugLine="Private cvs As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
 //BA.debugLineNum = 750;BA.debugLine="cvs.Initialize2(bmp)";
_cvs.Initialize2((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 751;BA.debugLine="Return cvs.MeasureStringWidth(Text, Font1.ToNa";
if (true) return (int) (_cvs.MeasureStringWidth(_text,(android.graphics.Typeface)(_font1.ToNativeFont().getObject()),_font1.getSize()));
 //BA.debugLineNum = 763;BA.debugLine="End Sub";
return 0;
}
public String  _refresh() throws Exception{
 //BA.debugLineNum = 351;BA.debugLine="Public Sub Refresh";
 //BA.debugLineNum = 352;BA.debugLine="Base_Resize(mBase.Width,mBase.Height)";
_base_resize(_mbase.getWidth(),_mbase.getHeight());
 //BA.debugLineNum = 353;BA.debugLine="RefreshIcons";
_refreshicons();
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return "";
}
public String  _refreshicons() throws Exception{
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_tabicon = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern _tabintern = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab _xtab = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _xtabproperties = null;
boolean _haveimage = false;
float _scale = 0f;
 //BA.debugLineNum = 259;BA.debugLine="Private Sub RefreshIcons";
 //BA.debugLineNum = 260;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step1 = 1;
final int limit1 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 262;BA.debugLine="Dim xpnl_Tab As B4XView = xpnl_TabBackground.Get";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _xpnl_tabbackground.GetView(_i);
 //BA.debugLineNum = 263;BA.debugLine="Dim xiv_TabIcon As B4XView = xpnl_Tab.GetView(2)";
_xiv_tabicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_tabicon = _xpnl_tab.GetView((int) (2));
 //BA.debugLineNum = 266;BA.debugLine="Dim TabIntern As ASTabMenuAdvanced_TabIntern = m";
_tabintern = (com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern)(_m_tablist.Get(_i));
 //BA.debugLineNum = 267;BA.debugLine="Dim xTab As ASTabMenuAdvanced_Tab = TabIntern.xT";
_xtab = _tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ ;
 //BA.debugLineNum = 268;BA.debugLine="Dim xTabProperties As ASTabMenuAdvanced_TabPrope";
_xtabproperties = _tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ ;
 //BA.debugLineNum = 271;BA.debugLine="Dim HaveImage As Boolean = False";
_haveimage = __c.False;
 //BA.debugLineNum = 272;BA.debugLine="If xTab.Text = \"\" Then";
if ((_xtab.Text /*String*/ ).equals("")) { 
 //BA.debugLineNum = 273;BA.debugLine="HaveImage = True";
_haveimage = __c.True;
 }else if((_xtab.Text /*String*/ ).equals("") == false && (_xtab.IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True || _xtab.IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True)) { 
 //BA.debugLineNum = 275;BA.debugLine="HaveImage = True";
_haveimage = __c.True;
 };
 //BA.debugLineNum = 278;BA.debugLine="Dim scale As Float = 1";
_scale = (float) (1);
 //BA.debugLineNum = 283;BA.debugLine="If HaveImage = True Then";
if (_haveimage==__c.True) { 
 //BA.debugLineNum = 284;BA.debugLine="If m_Index > -1 And i = m_Index Then";
if (_m_index>-1 && _i==_m_index) { 
 //BA.debugLineNum = 285;BA.debugLine="xiv_TabIcon.SetBitmap(xTab.IconSelected.Resize";
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_xtab.IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));
 }else {
 //BA.debugLineNum = 287;BA.debugLine="xiv_TabIcon.SetBitmap(xTab.IconUnselected.Resi";
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_xtab.IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));
 };
 //BA.debugLineNum = 290;BA.debugLine="If xTab.Enabled = True Then";
if (_xtab.Enabled /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 291;BA.debugLine="If  i = m_Index Then";
if (_i==_m_index) { 
 //BA.debugLineNum = 295;BA.debugLine="If TabIntern.xTab.IconSelected.IsInitialized =";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));};
 //BA.debugLineNum = 296;BA.debugLine="If xiv_TabIcon.GetBitmap.IsInitialized = True T";
if (_xiv_tabicon.GetBitmap().IsInitialized()==__c.True) { 
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_tabicon.getObject())),_xtabproperties.SelectedColor /*int*/ );};
 }else {
 //BA.debugLineNum = 302;BA.debugLine="If TabIntern.xTab.IconUnselected.IsInitialized";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));};
 //BA.debugLineNum = 303;BA.debugLine="If xiv_TabIcon.GetBitmap.IsInitialized = True T";
if (_xiv_tabicon.GetBitmap().IsInitialized()==__c.True) { 
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_tabicon.getObject())),_xtabproperties.UnselectedColor /*int*/ );};
 };
 }else {
 //BA.debugLineNum = 310;BA.debugLine="If TabIntern.xTab.IconDisabled.IsInitialized =";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconDisabled /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconDisabled /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));};
 //BA.debugLineNum = 311;BA.debugLine="If xiv_TabIcon.GetBitmap.IsInitialized = True T";
if (_xiv_tabicon.GetBitmap().IsInitialized()==__c.True) { 
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_tabicon.getObject())),_xtabproperties.DisabledColor /*int*/ );};
 };
 };
 }
};
 //BA.debugLineNum = 318;BA.debugLine="End Sub";
return "";
}
public String  _removetabat(int _index) throws Exception{
 //BA.debugLineNum = 346;BA.debugLine="Public Sub RemoveTabAt(Index As Int)";
 //BA.debugLineNum = 347;BA.debugLine="m_TabList.RemoveAt(Index)";
_m_tablist.RemoveAt(_index);
 //BA.debugLineNum = 348;BA.debugLine="xpnl_TabBackground.GetView(Index).RemoveViewFromP";
_xpnl_tabbackground.GetView(_index).RemoveViewFromParent();
 //BA.debugLineNum = 349;BA.debugLine="End Sub";
return "";
}
public String  _setbadgewithouttext(boolean _withouttext) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Public Sub setBadgeWithoutText(WithoutText As Bool";
 //BA.debugLineNum = 390;BA.debugLine="m_BadgeWithoutText = WithoutText";
_m_badgewithouttext = _withouttext;
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return "";
}
public String  _setcircleclip(anywheresoftware.b4a.objects.B4XViewWrapper _pnl,int _radius) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 723;BA.debugLine="Private Sub SetCircleClip (pnl As B4XView,radius A";
 //BA.debugLineNum = 737;BA.debugLine="Dim jo As JavaObject = pnl";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_pnl.getObject()));
 //BA.debugLineNum = 738;BA.debugLine="jo.RunMethod(\"setClipToOutline\", Array(True))";
_jo.RunMethod("setClipToOutline",new Object[]{(Object)(__c.True)});
 //BA.debugLineNum = 739;BA.debugLine="mBase.SetColorAndBorder(mBase.Color,0,0,m_CornerR";
_mbase.SetColorAndBorder(_mbase.getColor(),(int) (0),(int) (0),(int) (_m_cornerradius));
 //BA.debugLineNum = 743;BA.debugLine="End Sub";
return "";
}
public String  _setcornerradius(float _cornerradius) throws Exception{
 //BA.debugLineNum = 413;BA.debugLine="Public Sub setCornerRadius(CornerRadius As Float)";
 //BA.debugLineNum = 414;BA.debugLine="m_CornerRadius = CornerRadius";
_m_cornerradius = _cornerradius;
 //BA.debugLineNum = 415;BA.debugLine="SetCircleClip(mBase,m_CornerRadius)";
_setcircleclip(_mbase,(int) (_m_cornerradius));
 //BA.debugLineNum = 416;BA.debugLine="End Sub";
return "";
}
public String  _setindex(int _index) throws Exception{
 //BA.debugLineNum = 465;BA.debugLine="Public Sub setIndex(Index As Int)";
 //BA.debugLineNum = 466;BA.debugLine="m_Index = Index";
_m_index = _index;
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return "";
}
public String  _setindicatorvisible(boolean _visible) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Public Sub setIndicatorVisible(Visible As Boolean)";
 //BA.debugLineNum = 406;BA.debugLine="m_IndicatorVisible = Visible";
_m_indicatorvisible = _visible;
 //BA.debugLineNum = 407;BA.debugLine="End Sub";
return "";
}
public String  _setmiddlebutton(boolean _visible) throws Exception{
 //BA.debugLineNum = 393;BA.debugLine="Public Sub setMiddleButton(Visible As Boolean)";
 //BA.debugLineNum = 394;BA.debugLine="m_MiddleButton = Visible";
_m_middlebutton = _visible;
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public String  _settabproperties(com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties _tabproperties) throws Exception{
 //BA.debugLineNum = 441;BA.debugLine="Public Sub setTabProperties(TabProperties As ASTab";
 //BA.debugLineNum = 442;BA.debugLine="TabProperties = g_TabProperties";
_tabproperties = _g_tabproperties;
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return "";
}
public String  _tabclickevent(int _index) throws Exception{
 //BA.debugLineNum = 479;BA.debugLine="Private Sub TabClickEvent(index As Int)";
 //BA.debugLineNum = 480;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TabCli";
if (_xui.SubExists(ba,_mcallback,_meventname+"_TabClick",(int) (1))) { 
 //BA.debugLineNum = 481;BA.debugLine="CallSub2(mCallBack, mEventName & \"_TabClick\",ind";
__c.CallSubNew2(ba,_mcallback,_meventname+"_TabClick",(Object)(_index));
 };
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return "";
}
public String  _tintbmp(anywheresoftware.b4a.objects.ImageViewWrapper _img,int _color) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 599;BA.debugLine="Private Sub TintBmp(img As ImageView, color As Int";
 //BA.debugLineNum = 600;BA.debugLine="If m_ColorIcons = True Then";
if (_m_coloricons==__c.True) { 
 //BA.debugLineNum = 626;BA.debugLine="Dim jo As JavaObject=img";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_img.getObject()));
 //BA.debugLineNum = 627;BA.debugLine="jo.RunMethod(\"setImageBitmap\",Array(img.Bitmap))";
_jo.RunMethod("setImageBitmap",new Object[]{(Object)(_img.getBitmap())});
 //BA.debugLineNum = 629;BA.debugLine="jo.RunMethod(\"setColorFilter\",Array(Colors.rgb(G";
_jo.RunMethod("setColorFilter",new Object[]{(Object)(__c.Colors.RGB(_getargb(_color)[(int) (1)],_getargb(_color)[(int) (2)],_getargb(_color)[(int) (3)]))});
 };
 //BA.debugLineNum = 634;BA.debugLine="End Sub";
return "";
}
public String  _xlbl_middlebutton_click() throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Private Sub xlbl_MiddleButton_Click";
 //BA.debugLineNum = 493;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_Middle";
if (_xui.SubExists(ba,_mcallback,_meventname+"_MiddleButtonClick",(int) (0))) { 
 //BA.debugLineNum = 494;BA.debugLine="CallSub(mCallBack, mEventName & \"_MiddleButtonCl";
__c.CallSubNew(ba,_mcallback,_meventname+"_MiddleButtonClick");
 };
 //BA.debugLineNum = 496;BA.debugLine="End Sub";
return "";
}
public String  _xpnl_tab_click() throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tabtmp = null;
com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern _tabintern = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_halobackground = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xlbl_tabtext = null;
anywheresoftware.b4a.objects.B4XViewWrapper _xiv_tabicon = null;
float _scale = 0f;
 //BA.debugLineNum = 501;BA.debugLine="Private Sub xpnl_Tab_Click";
 //BA.debugLineNum = 504;BA.debugLine="Dim xpnl_Tab As B4XView = Sender";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = (anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(__c.Sender(ba)));
 //BA.debugLineNum = 508;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step2 = 1;
final int limit2 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 509;BA.debugLine="Dim xpnl_TabTmp As B4XView = xpnl_TabBackground.";
_xpnl_tabtmp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tabtmp = _xpnl_tabbackground.GetView(_i);
 //BA.debugLineNum = 510;BA.debugLine="If xpnl_TabTmp = xpnl_Tab Then";
if ((_xpnl_tabtmp).equals(_xpnl_tab)) { 
 //BA.debugLineNum = 511;BA.debugLine="Dim TabIntern As ASTabMenuAdvanced_TabIntern =";
_tabintern = (com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern)(_m_tablist.Get(_i));
 //BA.debugLineNum = 512;BA.debugLine="If TabIntern.xTab.Enabled = False Then Return";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .Enabled /*boolean*/ ==__c.False) { 
if (true) return "";};
 };
 }
};
 //BA.debugLineNum = 517;BA.debugLine="For i = 0 To xpnl_TabBackground.NumberOfViews -1";
{
final int step9 = 1;
final int limit9 = (int) (_xpnl_tabbackground.getNumberOfViews()-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 519;BA.debugLine="Dim xpnl_TabTmp As B4XView = xpnl_TabBackground.";
_xpnl_tabtmp = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tabtmp = _xpnl_tabbackground.GetView(_i);
 //BA.debugLineNum = 521;BA.debugLine="Dim xpnl_HaloBackground As B4XView = xpnl_Tab.Ge";
_xpnl_halobackground = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_halobackground = _xpnl_tab.GetView((int) (0));
 //BA.debugLineNum = 523;BA.debugLine="Dim xlbl_TabText As B4XView = xpnl_TabTmp.GetVie";
_xlbl_tabtext = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xlbl_tabtext = _xpnl_tabtmp.GetView((int) (1));
 //BA.debugLineNum = 524;BA.debugLine="Dim xiv_TabIcon As B4XView = xpnl_TabTmp.GetView";
_xiv_tabicon = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xiv_tabicon = _xpnl_tabtmp.GetView((int) (2));
 //BA.debugLineNum = 526;BA.debugLine="Dim TabIntern As ASTabMenuAdvanced_TabIntern = m";
_tabintern = (com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern)(_m_tablist.Get(_i));
 //BA.debugLineNum = 528;BA.debugLine="Dim scale As Float = 1";
_scale = (float) (1);
 //BA.debugLineNum = 533;BA.debugLine="If xpnl_TabTmp = xpnl_Tab Then";
if ((_xpnl_tabtmp).equals(_xpnl_tab)) { 
 //BA.debugLineNum = 534;BA.debugLine="If TabIntern.xTab.Enabled = True Then";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .Enabled /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 535;BA.debugLine="m_Index = i";
_m_index = _i;
 //BA.debugLineNum = 536;BA.debugLine="xlbl_TabText.TextColor = TabIntern.xTabPropert";
_xlbl_tabtext.setTextColor(_tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ .SelectedColor /*int*/ );
 //BA.debugLineNum = 541;BA.debugLine="If TabIntern.xTab.IconSelected.IsInitialized =";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconSelected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));};
 //BA.debugLineNum = 542;BA.debugLine="If xiv_TabIcon.GetBitmap.IsInitialized = True T";
if (_xiv_tabicon.GetBitmap().IsInitialized()==__c.True) { 
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_tabicon.getObject())),_tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ .SelectedColor /*int*/ );};
 //BA.debugLineNum = 545;BA.debugLine="xpnl_Indicator.SetLayoutAnimated(g_IndicatorPr";
_xpnl_indicator.SetLayoutAnimated((int) (_g_indicatorproperties.Duration /*long*/ ),_xpnl_tab.getLeft(),(int) (_mbase.getHeight()-_g_indicatorproperties.Height /*float*/ ),_xpnl_tab.getWidth(),(int) (_g_indicatorproperties.Height /*float*/ ));
 };
 }else {
 //BA.debugLineNum = 549;BA.debugLine="If TabIntern.xTab.Enabled = True Then";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .Enabled /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 550;BA.debugLine="xlbl_TabText.TextColor = TabIntern.xTabPropert";
_xlbl_tabtext.setTextColor(_tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ .UnselectedColor /*int*/ );
 //BA.debugLineNum = 555;BA.debugLine="If TabIntern.xTab.IconUnselected.IsInitialized";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconUnselected /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));};
 //BA.debugLineNum = 556;BA.debugLine="If xiv_TabIcon.GetBitmap.IsInitialized = True T";
if (_xiv_tabicon.GetBitmap().IsInitialized()==__c.True) { 
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_tabicon.getObject())),_tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ .UnselectedColor /*int*/ );};
 }else {
 //BA.debugLineNum = 559;BA.debugLine="xlbl_TabText.TextColor = TabIntern.xTabPropert";
_xlbl_tabtext.setTextColor(_tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ .DisabledColor /*int*/ );
 //BA.debugLineNum = 564;BA.debugLine="If TabIntern.xTab.IconDisabled.IsInitialized =";
if (_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconDisabled /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .IsInitialized()==__c.True) { 
_xiv_tabicon.SetBitmap((android.graphics.Bitmap)(_tabintern.xTab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tab*/ .IconDisabled /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ .Resize((int) (_xiv_tabicon.getWidth()*_scale),(int) (_xiv_tabicon.getHeight()*_scale),__c.True).getObject()));};
 //BA.debugLineNum = 565;BA.debugLine="If xiv_TabIcon.GetBitmap.IsInitialized = True T";
if (_xiv_tabicon.GetBitmap().IsInitialized()==__c.True) { 
_tintbmp((anywheresoftware.b4a.objects.ImageViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ImageViewWrapper(), (android.widget.ImageView)(_xiv_tabicon.getObject())),_tabintern.xTabProperties /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabproperties*/ .DisabledColor /*int*/ );};
 };
 };
 }
};
 //BA.debugLineNum = 572;BA.debugLine="If m_HaloEffect = True Then";
if (_m_haloeffect==__c.True) { 
 //BA.debugLineNum = 573;BA.debugLine="CreateHaloEffect(xpnl_HaloBackground,xpnl_HaloBa";
_createhaloeffect(_xpnl_halobackground,(int) (_xpnl_halobackground.getWidth()/(double)2),(int) (_xpnl_halobackground.getHeight()/(double)2),_m_halocolor);
 };
 //BA.debugLineNum = 577;BA.debugLine="TabClickEvent(m_Index)";
_tabclickevent(_m_index);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}