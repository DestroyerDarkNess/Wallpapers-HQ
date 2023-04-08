package com.holydesing.software.wallpaperhq;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "com.holydesing.software.wallpaperhq.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.holydesing.software.wallpaperhq.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public com.holydesing.software.wallpaperhq.as_tabmenuadvanced _as_tabmenuadvanced1 = null;
public boolean _islisting = false;
public com.holydesing.software.wallpaperhq.wallhaven _wallhaveapi = null;
public com.holydesing.software.wallpaperhq.controllister _controllisterex = null;
public com.holydesing.software.wallpaperhq.aspopupmenuadvanced _popupmenuadvanced = null;
public float _popupmenuwidth = 0f;
public float _popupmenuheight = 0f;
public com.holydesing.software.wallpaperhq.simplemediamanager _mediamanager = null;
public com.holydesing.software.wallpaperhq.asviewpager _asviewpager1 = null;
public com.holydesing.software.wallpaperhq.b4xcombobox _b4xcombobox1 = null;
public com.holydesing.software.wallpaperhq.b4xfloattextfield _b4xfloattextfield1 = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _online_view = null;
public com.holydesing.software.wallpaperhq.b4xloadingindicator _b4xloadingindicator1 = null;
public com.holydesing.software.wallpaperhq.b4xfloattextfield _pageselector = null;
public com.holydesing.software.wallpaperhq.imageviewerb4x _imageviewer = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _savedscroll_view = null;
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
public String  _as_tabmenuadvanced1_tabclick(int _index) throws Exception{
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl_tab = null;
float _menuleft = 0f;
 //BA.debugLineNum = 356;BA.debugLine="Private Sub AS_TabMenuAdvanced1_TabClick (Index As";
 //BA.debugLineNum = 357;BA.debugLine="If Index = 3 Then";
if (_index==3) { 
 //BA.debugLineNum = 359;BA.debugLine="Dim xpnl_Tab As B4XView = AS_TabMenuAdvanced1.Ge";
_xpnl_tab = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl_tab = _as_tabmenuadvanced1._gettab /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabintern*/ (_index).xTabViews /*com.holydesing.software.wallpaperhq.as_tabmenuadvanced._astabmenuadvanced_tabviews*/ .xpnl_TabBackground /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ;
 //BA.debugLineNum = 361;BA.debugLine="Dim MenuLeft As Float = xpnl_Tab.Left + xpnl_Tab";
_menuleft = (float) (_xpnl_tab.getLeft()+_xpnl_tab.getWidth()/(double)2-_popupmenuwidth/(double)2);
 //BA.debugLineNum = 363;BA.debugLine="If MenuLeft + PopupMenuWidth > Root.Width Then M";
if (_menuleft+_popupmenuwidth>_root.getWidth()) { 
_menuleft = (float) (_menuleft-((_menuleft+_popupmenuwidth)-_root.getWidth()));};
 //BA.debugLineNum = 364;BA.debugLine="PopupMenuAdvanced.TriangleProperties.Left = Popu";
_popupmenuadvanced._gettriangleproperties /*com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced*/ ().Left /*float*/  = (float) (_popupmenuwidth/(double)2-_popupmenuadvanced._gettriangleproperties /*com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced*/ ().Width /*float*/ /(double)2+((_menuleft+_popupmenuwidth)-_root.getWidth()));
 //BA.debugLineNum = 366;BA.debugLine="PopupMenuAdvanced.OpenMenuAdvanced(MenuLeft,AS_T";
_popupmenuadvanced._openmenuadvanced /*void*/ (_menuleft,(float) (_as_tabmenuadvanced1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop()-_popupmenuheight-_popupmenuadvanced._gettriangleproperties /*com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced*/ ().Height /*float*/ ),_popupmenuwidth,_popupmenuheight);
 }else {
 //BA.debugLineNum = 370;BA.debugLine="ASViewPager1.CurrentIndex2 = Index";
_asviewpager1._setcurrentindex2(_index);
 };
 //BA.debugLineNum = 373;BA.debugLine="End Sub";
return "";
}
public void  _asviewpager1_pagechanged(int _index) throws Exception{
ResumableSub_ASViewPager1_PageChanged rsub = new ResumableSub_ASViewPager1_PageChanged(this,_index);
rsub.resume(ba, null);
}
public static class ResumableSub_ASViewPager1_PageChanged extends BA.ResumableSub {
public ResumableSub_ASViewPager1_PageChanged(com.holydesing.software.wallpaperhq.b4xmainpage parent,int _index) {
this.parent = parent;
this._index = _index;
}
com.holydesing.software.wallpaperhq.b4xmainpage parent;
int _index;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 346;BA.debugLine="If Index = 1 Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_index==1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 347;BA.debugLine="If SavedScroll_View.Panel.NumberOfViews = 0 Then";
if (true) break;

case 4:
//if
this.state = 7;
if (parent._savedscroll_view.getPanel().getNumberOfViews()==0) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 348;BA.debugLine="ListSaved";
parent._listsaved();
 //BA.debugLineNum = 349;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 9;
return;
case 9:
//C
this.state = 7;
;
 if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 //BA.debugLineNum = 352;BA.debugLine="AS_TabMenuAdvanced1.Index = Index";
parent._as_tabmenuadvanced1._setindex /*int*/ (_index);
 //BA.debugLineNum = 353;BA.debugLine="AS_TabMenuAdvanced1.Refresh";
parent._as_tabmenuadvanced1._refresh /*String*/ ();
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _b4xcombobox1_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 183;BA.debugLine="Private Sub B4XComboBox1_SelectedIndexChanged (Ind";
 //BA.debugLineNum = 184;BA.debugLine="B4XFloatTextField1.Text = \"\"";
_b4xfloattextfield1._settext /*String*/ ("");
 //BA.debugLineNum = 185;BA.debugLine="PageSelector.Text = 1";
_pageselector._settext /*String*/ (BA.NumberToString(1));
 //BA.debugLineNum = 186;BA.debugLine="PageSelector.Update";
_pageselector._update /*String*/ ();
 //BA.debugLineNum = 187;BA.debugLine="Search";
_search();
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return "";
}
public String  _b4xfloattextfield1_enterpressed() throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Private Sub B4XFloatTextField1_EnterPressed";
 //BA.debugLineNum = 191;BA.debugLine="Search";
_search();
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 52;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 53;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.SetTitle(Me,\"WallpapersHQ\")";
_b4xpages._settitle /*String*/ (ba,this,(Object)("WallpapersHQ"));
 //BA.debugLineNum = 58;BA.debugLine="WallHaveAPI.Initialize";
_wallhaveapi._initialize /*String*/ (ba);
 //BA.debugLineNum = 59;BA.debugLine="MediaManager.Initialize";
_mediamanager._initialize /*String*/ (ba);
 //BA.debugLineNum = 60;BA.debugLine="ControlListerEx.Initialize";
_controllisterex._initialize /*String*/ (ba);
 //BA.debugLineNum = 62;BA.debugLine="ImageViewer.Initialize";
_imageviewer._initialize /*Object*/ (ba);
 //BA.debugLineNum = 63;BA.debugLine="B4XPages.AddPage(\"ImageViewBETA\", ImageViewer)";
_b4xpages._addpage /*String*/ (ba,"ImageViewBETA",(Object)(_imageviewer));
 //BA.debugLineNum = 71;BA.debugLine="DisableStrictMode";
_disablestrictmode();
 //BA.debugLineNum = 73;BA.debugLine="CreateUI";
_createui();
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 195;BA.debugLine="Search";
_search();
 //BA.debugLineNum = 196;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 13;BA.debugLine="Private AS_TabMenuAdvanced1 As AS_TabMenuAdvanced";
_as_tabmenuadvanced1 = new com.holydesing.software.wallpaperhq.as_tabmenuadvanced();
 //BA.debugLineNum = 19;BA.debugLine="Private IsListing As Boolean = False";
_islisting = __c.False;
 //BA.debugLineNum = 21;BA.debugLine="Private WallHaveAPI As WallHaven";
_wallhaveapi = new com.holydesing.software.wallpaperhq.wallhaven();
 //BA.debugLineNum = 22;BA.debugLine="Private ControlListerEx As ControlLister";
_controllisterex = new com.holydesing.software.wallpaperhq.controllister();
 //BA.debugLineNum = 24;BA.debugLine="Dim PopupMenuAdvanced As ASPopupMenuAdvanced";
_popupmenuadvanced = new com.holydesing.software.wallpaperhq.aspopupmenuadvanced();
 //BA.debugLineNum = 25;BA.debugLine="Dim PopupMenuWidth As Float = 150dip";
_popupmenuwidth = (float) (__c.DipToCurrent((int) (150)));
 //BA.debugLineNum = 26;BA.debugLine="Dim PopupMenuHeight As Float = 250dip";
_popupmenuheight = (float) (__c.DipToCurrent((int) (250)));
 //BA.debugLineNum = 28;BA.debugLine="Private MediaManager As SimpleMediaManager";
_mediamanager = new com.holydesing.software.wallpaperhq.simplemediamanager();
 //BA.debugLineNum = 29;BA.debugLine="Private ASViewPager1 As ASViewPager";
_asviewpager1 = new com.holydesing.software.wallpaperhq.asviewpager();
 //BA.debugLineNum = 31;BA.debugLine="Private B4XComboBox1 As B4XComboBox";
_b4xcombobox1 = new com.holydesing.software.wallpaperhq.b4xcombobox();
 //BA.debugLineNum = 32;BA.debugLine="Private B4XFloatTextField1 As B4XFloatTextField";
_b4xfloattextfield1 = new com.holydesing.software.wallpaperhq.b4xfloattextfield();
 //BA.debugLineNum = 34;BA.debugLine="Private Online_View As ScrollView";
_online_view = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private B4XLoadingIndicator1 As B4XLoadingIndicat";
_b4xloadingindicator1 = new com.holydesing.software.wallpaperhq.b4xloadingindicator();
 //BA.debugLineNum = 38;BA.debugLine="Private PageSelector As B4XFloatTextField";
_pageselector = new com.holydesing.software.wallpaperhq.b4xfloattextfield();
 //BA.debugLineNum = 40;BA.debugLine="Public ImageViewer As ImageViewerB4X";
_imageviewer = new com.holydesing.software.wallpaperhq.imageviewerb4x();
 //BA.debugLineNum = 42;BA.debugLine="Private SavedScroll_View As ScrollView";
_savedscroll_view = new anywheresoftware.b4a.objects.ScrollViewWrapper();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public void  _createui() throws Exception{
ResumableSub_CreateUI rsub = new ResumableSub_CreateUI(this);
rsub.resume(ba, null);
}
public static class ResumableSub_CreateUI extends BA.ResumableSub {
public ResumableSub_CreateUI(com.holydesing.software.wallpaperhq.b4xmainpage parent) {
this.parent = parent;
}
com.holydesing.software.wallpaperhq.b4xmainpage parent;
anywheresoftware.b4a.objects.PanelWrapper _home_view = null;
anywheresoftware.b4a.objects.PanelWrapper _saved_view = null;
anywheresoftware.b4a.objects.PanelWrapper _storage_view = null;
int _i = 0;
anywheresoftware.b4a.objects.B4XViewWrapper _xpnl = null;
anywheresoftware.b4a.objects.collections.List _items = null;
int step25;
int limit25;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 97;BA.debugLine="ThemeColors.setTheme(\"Dracula\")";
parent._themecolors._settheme /*String*/ (ba,"Dracula");
 //BA.debugLineNum = 100;BA.debugLine="AS_TabMenuAdvanced1.AddTab(\"\",xui.LoadBitmap(File";
parent._as_tabmenuadvanced1._addtab /*String*/ ("",parent._xui.LoadBitmap(parent.__c.File.getDirAssets(),"home_active.png"),parent._xui.LoadBitmap(parent.__c.File.getDirAssets(),"home_inactive.png"));
 //BA.debugLineNum = 101;BA.debugLine="AS_TabMenuAdvanced1.AddTab(\"\",xui.LoadBitmap(File";
parent._as_tabmenuadvanced1._addtab /*String*/ ("",parent._xui.LoadBitmap(parent.__c.File.getDirAssets(),"Image.png"),parent._xui.LoadBitmap(parent.__c.File.getDirAssets(),"Image.png"));
 //BA.debugLineNum = 102;BA.debugLine="AS_TabMenuAdvanced1.AddTab(\"\",xui.LoadBitmap(File";
parent._as_tabmenuadvanced1._addtab /*String*/ ("",parent._xui.LoadBitmap(parent.__c.File.getDirAssets(),"About.png"),parent._xui.LoadBitmap(parent.__c.File.getDirAssets(),"About.png"));
 //BA.debugLineNum = 105;BA.debugLine="AS_TabMenuAdvanced1.Refresh";
parent._as_tabmenuadvanced1._refresh /*String*/ ();
 //BA.debugLineNum = 107;BA.debugLine="Dim Home_View As Panel : Home_View.Initialize(\"\")";
_home_view = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 107;BA.debugLine="Dim Home_View As Panel : Home_View.Initialize(\"\")";
_home_view.Initialize(ba,"");
 //BA.debugLineNum = 107;BA.debugLine="Dim Home_View As Panel : Home_View.Initialize(\"\")";
_home_view.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._asviewpager1._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getWidth(),parent._asviewpager1._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getHeight());
 //BA.debugLineNum = 108;BA.debugLine="Home_View.LoadLayout(\"Home\")";
_home_view.LoadLayout("Home",ba);
 //BA.debugLineNum = 110;BA.debugLine="Home_View.Color = xui.Color_ARGB(255,20, 21, 23)";
_home_view.setColor(parent._xui.Color_ARGB((int) (255),(int) (20),(int) (21),(int) (23)));
 //BA.debugLineNum = 111;BA.debugLine="ASViewPager1.AddPage(Home_View,\"\")";
parent._asviewpager1._addpage /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_home_view.getObject())),(Object)(""));
 //BA.debugLineNum = 114;BA.debugLine="Dim Saved_View As Panel : Saved_View.Initialize(\"";
_saved_view = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 114;BA.debugLine="Dim Saved_View As Panel : Saved_View.Initialize(\"";
_saved_view.Initialize(ba,"");
 //BA.debugLineNum = 114;BA.debugLine="Dim Saved_View As Panel : Saved_View.Initialize(\"";
_saved_view.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._asviewpager1._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getWidth(),parent._asviewpager1._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getHeight());
 //BA.debugLineNum = 115;BA.debugLine="Saved_View.LoadLayout(\"Saved\")";
_saved_view.LoadLayout("Saved",ba);
 //BA.debugLineNum = 116;BA.debugLine="Saved_View.Color = xui.Color_ARGB(255,20, 21, 23)";
_saved_view.setColor(parent._xui.Color_ARGB((int) (255),(int) (20),(int) (21),(int) (23)));
 //BA.debugLineNum = 117;BA.debugLine="ASViewPager1.AddPage(Saved_View,\"\")";
parent._asviewpager1._addpage /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_saved_view.getObject())),(Object)(""));
 //BA.debugLineNum = 119;BA.debugLine="Dim Storage_View As Panel : Storage_View.Initiali";
_storage_view = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 119;BA.debugLine="Dim Storage_View As Panel : Storage_View.Initiali";
_storage_view.Initialize(ba,"");
 //BA.debugLineNum = 119;BA.debugLine="Dim Storage_View As Panel : Storage_View.Initiali";
_storage_view.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent._asviewpager1._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getWidth(),parent._asviewpager1._getbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ ().getHeight());
 //BA.debugLineNum = 120;BA.debugLine="Storage_View.LoadLayout(\"Storage\")";
_storage_view.LoadLayout("Storage",ba);
 //BA.debugLineNum = 121;BA.debugLine="Storage_View.Color = xui.Color_ARGB(255,20, 21, 2";
_storage_view.setColor(parent._xui.Color_ARGB((int) (255),(int) (20),(int) (21),(int) (23)));
 //BA.debugLineNum = 122;BA.debugLine="ASViewPager1.AddPage(Storage_View,\"\")";
parent._asviewpager1._addpage /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_storage_view.getObject())),(Object)(""));
 //BA.debugLineNum = 129;BA.debugLine="PopupMenuAdvanced.Initialize(Root,Me,\"PopupMenuAd";
parent._popupmenuadvanced._initialize /*String*/ (ba,parent._root,parent,"PopupMenuAdvanced");
 //BA.debugLineNum = 132;BA.debugLine="For i = 0 To 10 -1";
if (true) break;

case 1:
//for
this.state = 10;
step25 = 1;
limit25 = (int) (10-1);
_i = (int) (0) ;
this.state = 18;
if (true) break;

case 18:
//C
this.state = 10;
if ((step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25)) this.state = 3;
if (true) break;

case 19:
//C
this.state = 18;
_i = ((int)(0 + _i + step25)) ;
if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 134;BA.debugLine="Dim xpnl As B4XView = xui.CreatePanel(\"\")";
_xpnl = new anywheresoftware.b4a.objects.B4XViewWrapper();
_xpnl = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 135;BA.debugLine="xpnl.SetLayoutAnimated(0,0,0,PopupMenuWidth,40di";
_xpnl.SetLayoutAnimated((int) (0),(int) (0),(int) (0),(int) (parent._popupmenuwidth),parent.__c.DipToCurrent((int) (40)));
 //BA.debugLineNum = 136;BA.debugLine="xpnl.LoadLayout(\"frm_Item1\")";
_xpnl.LoadLayout("frm_Item1",ba);
 //BA.debugLineNum = 137;BA.debugLine="xpnl.GetView(0).Text = \"Test \" & i";
_xpnl.GetView((int) (0)).setText(BA.ObjectToCharSequence("Test "+BA.NumberToString(_i)));
 //BA.debugLineNum = 139;BA.debugLine="PopupMenuAdvanced.AddItem(xpnl,\"\")";
parent._popupmenuadvanced._additem /*String*/ (_xpnl,(Object)(""));
 //BA.debugLineNum = 140;BA.debugLine="If i <> 9 Then PopupMenuAdvanced.AddSeparator";
if (true) break;

case 4:
//if
this.state = 9;
if (_i!=9) { 
this.state = 6;
;}if (true) break;

case 6:
//C
this.state = 9;
parent._popupmenuadvanced._addseparator /*String*/ ();
if (true) break;

case 9:
//C
this.state = 19;
;
 if (true) break;
if (true) break;

case 10:
//C
this.state = 11;
;
 //BA.debugLineNum = 145;BA.debugLine="PopupMenuAdvanced.ShowTriangle = True";
parent._popupmenuadvanced._setshowtriangle(parent.__c.True);
 //BA.debugLineNum = 146;BA.debugLine="PopupMenuAdvanced.TriangleProperties.Top = AS_Tab";
parent._popupmenuadvanced._gettriangleproperties /*com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced*/ ().Top /*float*/  = (float) (parent._as_tabmenuadvanced1._mbase /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .getTop());
 //BA.debugLineNum = 147;BA.debugLine="PopupMenuAdvanced.TriangleProperties.Color = xui.";
parent._popupmenuadvanced._gettriangleproperties /*com.holydesing.software.wallpaperhq.aspopupmenuadvanced._aspm_trianglepropertiesadvanced*/ ().Color /*int*/  = parent._xui.Color_White;
 //BA.debugLineNum = 148;BA.debugLine="PopupMenuAdvanced.OrientationHorizontal = PopupMe";
parent._popupmenuadvanced._setorientationhorizontal(parent._popupmenuadvanced._getorientationhorizontal_right /*String*/ ());
 //BA.debugLineNum = 149;BA.debugLine="PopupMenuAdvanced.OrientationVertical = PopupMenu";
parent._popupmenuadvanced._setorientationvertical(parent._popupmenuadvanced._getorientationvertical_top /*String*/ ());
 //BA.debugLineNum = 153;BA.debugLine="If B4XComboBox1.IsInitialized = True Then";
if (true) break;

case 11:
//if
this.state = 14;
if (parent._b4xcombobox1.IsInitialized /*boolean*/ ()==parent.__c.True) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 155;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 156;BA.debugLine="Items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 157;BA.debugLine="Items.Add(\"Random\")";
_items.Add((Object)("Random"));
 //BA.debugLineNum = 158;BA.debugLine="Items.Add(\"Latest\")";
_items.Add((Object)("Latest"));
 //BA.debugLineNum = 159;BA.debugLine="Items.Add(\"Hot\")";
_items.Add((Object)("Hot"));
 //BA.debugLineNum = 160;BA.debugLine="Items.Add(\"Toplist\")";
_items.Add((Object)("Toplist"));
 //BA.debugLineNum = 161;BA.debugLine="B4XComboBox1.SetItems(Items)";
parent._b4xcombobox1._setitems /*String*/ (_items);
 //BA.debugLineNum = 163;BA.debugLine="B4XComboBox1.SelectedIndex = 0";
parent._b4xcombobox1._setselectedindex /*int*/ ((int) (0));
 //BA.debugLineNum = 165;BA.debugLine="B4XComboBox1.cmbBox.DropdownBackgroundColor = Co";
parent._b4xcombobox1._cmbbox /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setDropdownBackgroundColor(parent.__c.Colors.ARGB((int) (255),(int) (40),(int) (42),(int) (54)));
 if (true) break;
;
 //BA.debugLineNum = 169;BA.debugLine="If PageSelector.Text = \"\" Then";

case 14:
//if
this.state = 17;
if ((parent._pageselector._gettext /*String*/ ()).equals("")) { 
this.state = 16;
}if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 170;BA.debugLine="PageSelector.Text = 1";
parent._pageselector._settext /*String*/ (BA.NumberToString(1));
 //BA.debugLineNum = 171;BA.debugLine="PageSelector.Update";
parent._pageselector._update /*String*/ ();
 if (true) break;

case 17:
//C
this.state = -1;
;
 //BA.debugLineNum = 175;BA.debugLine="ThemeColors.setTheme(\"Dracula\")";
parent._themecolors._settheme /*String*/ (ba,"Dracula");
 //BA.debugLineNum = 177;BA.debugLine="Sleep(3000)";
parent.__c.Sleep(ba,this,(int) (3000));
this.state = 20;
return;
case 20:
//C
this.state = -1;
;
 //BA.debugLineNum = 179;BA.debugLine="Search";
parent._search();
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _disablestrictmode() throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
anywheresoftware.b4j.object.JavaObject _policy = null;
anywheresoftware.b4j.object.JavaObject _sm = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub DisableStrictMode";
 //BA.debugLineNum = 80;BA.debugLine="Try";
try { //BA.debugLineNum = 81;BA.debugLine="Dim jo As JavaObject";
_jo = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 82;BA.debugLine="jo.InitializeStatic(\"android.os.Build.VERSION\")";
_jo.InitializeStatic("android.os.Build.VERSION");
 //BA.debugLineNum = 83;BA.debugLine="If jo.GetField(\"SDK_INT\") > 9 Then";
if ((double)(BA.ObjectToNumber(_jo.GetField("SDK_INT")))>9) { 
 //BA.debugLineNum = 84;BA.debugLine="Dim policy As JavaObject";
_policy = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 85;BA.debugLine="policy = policy.InitializeNewInstance(\"android.";
_policy = _policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder",(Object[])(__c.Null));
 //BA.debugLineNum = 86;BA.debugLine="policy = policy.RunMethodJO(\"permitAll\", Null).";
_policy = _policy.RunMethodJO("permitAll",(Object[])(__c.Null)).RunMethodJO("build",(Object[])(__c.Null));
 //BA.debugLineNum = 87;BA.debugLine="Dim sm As JavaObject";
_sm = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 88;BA.debugLine="sm.InitializeStatic(\"android.os.StrictMode\").Ru";
_sm.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy",new Object[]{(Object)(_policy.getObject())});
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 91;BA.debugLine="Log(LastException)";
__c.LogImpl("654591500",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _donatepaypal_click() throws Exception{
 //BA.debugLineNum = 473;BA.debugLine="Private Sub DonatePaypal_Click";
 //BA.debugLineNum = 474;BA.debugLine="OpenLink(\"https://www.paypal.com/paypalme/salvado";
_openlink("https://www.paypal.com/paypalme/salvadorKrilewski");
 //BA.debugLineNum = 475;BA.debugLine="End Sub";
return "";
}
public String  _img_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _iv = null;
com.holydesing.software.wallpaperhq.imageserver _imageselected = null;
String _image4k = "";
 //BA.debugLineNum = 309;BA.debugLine="Sub img_Click";
 //BA.debugLineNum = 311;BA.debugLine="Try";
try { //BA.debugLineNum = 312;BA.debugLine="Dim iv As Panel";
_iv = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 313;BA.debugLine="iv = Sender";
_iv = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 314;BA.debugLine="Dim ImageSelected As ImageServer = WallHaveAPI.I";
_imageselected = (com.holydesing.software.wallpaperhq.imageserver)(_wallhaveapi._imageurls /*anywheresoftware.b4a.objects.collections.List*/ .Get((int)(BA.ObjectToNumber(_iv.getTag()))));
 //BA.debugLineNum = 315;BA.debugLine="Dim Image4K As String = WallHaveAPI.GetImage4K(I";
_image4k = _wallhaveapi._getimage4k /*String*/ (_imageselected._previewurl /*String*/ );
 //BA.debugLineNum = 317;BA.debugLine="If Image4K.Length = 0 Then";
if (_image4k.length()==0) { 
 //BA.debugLineNum = 319;BA.debugLine="ToastMessageShow(\"No Internet Error!\", False)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No Internet Error!"),__c.False);
 }else {
 //BA.debugLineNum = 323;BA.debugLine="B4XPages.ShowPage(\"ImageViewBETA\")";
_b4xpages._showpage /*String*/ (ba,"ImageViewBETA");
 //BA.debugLineNum = 324;BA.debugLine="B4XPages.GetPage(\"ImageViewBETA\").As(ImageViewer";
((com.holydesing.software.wallpaperhq.imageviewerb4x)(_b4xpages._getpage /*Object*/ (ba,"ImageViewBETA")))._showimage /*void*/ (_image4k);
 };
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 329;BA.debugLine="Log(LastException)";
__c.LogImpl("61114132",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public String  _img_local_click() throws Exception{
anywheresoftware.b4a.objects.PanelWrapper _iv = null;
String _image4k = "";
 //BA.debugLineNum = 449;BA.debugLine="Sub img_Local_Click";
 //BA.debugLineNum = 451;BA.debugLine="Try";
try { //BA.debugLineNum = 452;BA.debugLine="Dim iv As Panel";
_iv = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 453;BA.debugLine="iv = Sender";
_iv = (anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(__c.Sender(ba)));
 //BA.debugLineNum = 455;BA.debugLine="Dim Image4K As String = iv.Tag";
_image4k = BA.ObjectToString(_iv.getTag());
 //BA.debugLineNum = 456;BA.debugLine="If Image4K.Length = 0 Then";
if (_image4k.length()==0) { 
 //BA.debugLineNum = 458;BA.debugLine="ToastMessageShow(\"File Corrupted Error!\", False";
__c.ToastMessageShow(BA.ObjectToCharSequence("File Corrupted Error!"),__c.False);
 }else {
 //BA.debugLineNum = 462;BA.debugLine="B4XPages.ShowPage(\"ImageViewBETA\")";
_b4xpages._showpage /*String*/ (ba,"ImageViewBETA");
 //BA.debugLineNum = 463;BA.debugLine="B4XPages.GetPage(\"ImageViewBETA\").As(ImageViewer";
((com.holydesing.software.wallpaperhq.imageviewerb4x)(_b4xpages._getpage /*Object*/ (ba,"ImageViewBETA")))._showimagefromfile /*void*/ (_image4k);
 };
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 468;BA.debugLine="Log(LastException)";
__c.LogImpl("653805075",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 46;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return "";
}
public String  _listsaved() throws Exception{
anywheresoftware.b4a.objects.collections.List _files = null;
String _fileimg = "";
int _size_x = 0;
int _size_y = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.objects.PanelWrapper _imageviewex = null;
 //BA.debugLineNum = 403;BA.debugLine="Public Sub ListSaved";
 //BA.debugLineNum = 404;BA.debugLine="Try";
try { //BA.debugLineNum = 405;BA.debugLine="SavedScroll_View.Panel.RemoveAllViews";
_savedscroll_view.getPanel().RemoveAllViews();
 //BA.debugLineNum = 406;BA.debugLine="SavedScroll_View.Panel.Invalidate";
_savedscroll_view.getPanel().Invalidate();
 //BA.debugLineNum = 407;BA.debugLine="SavedScroll_View.ScrollPosition = 0";
_savedscroll_view.setScrollPosition((int) (0));
 //BA.debugLineNum = 408;BA.debugLine="Dim Files As List = File.ListFiles(Main.Download";
_files = new anywheresoftware.b4a.objects.collections.List();
_files = __c.File.ListFiles(_main._downloadedwallpapers /*String*/ );
 //BA.debugLineNum = 410;BA.debugLine="For Each FileImg As String In Files";
{
final anywheresoftware.b4a.BA.IterableList group6 = _files;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_fileimg = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 412;BA.debugLine="Try";
try { //BA.debugLineNum = 413;BA.debugLine="Dim Size_X As Int = 100%x";
_size_x = __c.PerXToCurrent((float) (100),ba);
 //BA.debugLineNum = 414;BA.debugLine="Dim Size_Y As Int = 50%y";
_size_y = __c.PerYToCurrent((float) (50),ba);
 //BA.debugLineNum = 416;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 417;BA.debugLine="bmp.Initialize(File.DirAssets, \"Loading.png\")";
_bmp.Initialize(__c.File.getDirAssets(),"Loading.png");
 //BA.debugLineNum = 419;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 420;BA.debugLine="bd.Initialize(bmp)";
_bd.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 422;BA.debugLine="Dim ImageViewEx As Panel";
_imageviewex = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 423;BA.debugLine="ImageViewEx.Initialize(\"img_Local\")";
_imageviewex.Initialize(ba,"img_Local");
 //BA.debugLineNum = 424;BA.debugLine="ImageViewEx.Background = bd";
_imageviewex.setBackground((android.graphics.drawable.Drawable)(_bd.getObject()));
 //BA.debugLineNum = 425;BA.debugLine="ImageViewEx.Width = Size_X";
_imageviewex.setWidth(_size_x);
 //BA.debugLineNum = 426;BA.debugLine="ImageViewEx.Height = Size_Y";
_imageviewex.setHeight(_size_y);
 //BA.debugLineNum = 427;BA.debugLine="ImageViewEx.Color = Colors.ARGB(255,40, 42, 54";
_imageviewex.setColor(__c.Colors.ARGB((int) (255),(int) (40),(int) (42),(int) (54)));
 //BA.debugLineNum = 429;BA.debugLine="MediaManager.SetMediaFromFile(ImageViewEx, Mai";
_mediamanager._setmediafromfile /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imageviewex.getObject())),_main._downloadedwallpapers /*String*/ ,_fileimg,"image/*",__c.createMap(new Object[] {(Object)(_mediamanager._request_resize_mode /*String*/ ),(Object)("FILL_NO_DISTORTIONS")}));
 //BA.debugLineNum = 431;BA.debugLine="ImageViewEx.Tag = FileImg";
_imageviewex.setTag((Object)(_fileimg));
 //BA.debugLineNum = 433;BA.debugLine="ControlListerEx.Add(SavedScroll_View, ImageVie";
_controllisterex._add /*String*/ (_savedscroll_view,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_imageviewex.getObject())),__c.True);
 } 
       catch (Exception e24) {
			ba.setLastException(e24); //BA.debugLineNum = 436;BA.debugLine="Log(LastException)";
__c.LogImpl("61572897",BA.ObjectToString(__c.LastException(ba)),0);
 };
 }
};
 //BA.debugLineNum = 441;BA.debugLine="SavedScroll_View.Panel.Height = (Files.Size * 50";
_savedscroll_view.getPanel().setHeight((int) ((_files.getSize()*__c.PerYToCurrent((float) (50),ba))));
 } 
       catch (Exception e29) {
			ba.setLastException(e29); //BA.debugLineNum = 444;BA.debugLine="ToastMessageShow(LastException, False)";
__c.ToastMessageShow(BA.ObjectToCharSequence(__c.LastException(ba).getObject()),__c.False);
 };
 //BA.debugLineNum = 446;BA.debugLine="End Sub";
return "";
}
public String  _openlink(String _link) throws Exception{
anywheresoftware.b4a.objects.IntentWrapper _intent = null;
 //BA.debugLineNum = 477;BA.debugLine="Sub OpenLink(link As String)";
 //BA.debugLineNum = 478;BA.debugLine="Dim intent As Intent";
_intent = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 479;BA.debugLine="intent.Initialize(intent.ACTION_VIEW, link)";
_intent.Initialize(_intent.ACTION_VIEW,_link);
 //BA.debugLineNum = 480;BA.debugLine="StartActivity(intent)";
__c.StartActivity(ba,(Object)(_intent.getObject()));
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public String  _pageleft_home_click() throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Private Sub PageLeft_Home_Click";
 //BA.debugLineNum = 380;BA.debugLine="If PageSelector.Text > 1 Then";
if ((double)(Double.parseDouble(_pageselector._gettext /*String*/ ()))>1) { 
 //BA.debugLineNum = 381;BA.debugLine="PageSelector.Text = PageSelector.Text - 1";
_pageselector._settext /*String*/ (BA.NumberToString((double)(Double.parseDouble(_pageselector._gettext /*String*/ ()))-1));
 };
 //BA.debugLineNum = 383;BA.debugLine="PageSelector.Update";
_pageselector._update /*String*/ ();
 //BA.debugLineNum = 385;BA.debugLine="Search";
_search();
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return "";
}
public String  _pageright_home_click() throws Exception{
 //BA.debugLineNum = 388;BA.debugLine="Private Sub PageRight_Home_Click";
 //BA.debugLineNum = 389;BA.debugLine="If PageSelector.Text >= 1 Then";
if ((double)(Double.parseDouble(_pageselector._gettext /*String*/ ()))>=1) { 
 //BA.debugLineNum = 390;BA.debugLine="PageSelector.Text = PageSelector.Text + 1";
_pageselector._settext /*String*/ (BA.NumberToString((double)(Double.parseDouble(_pageselector._gettext /*String*/ ()))+1));
 };
 //BA.debugLineNum = 392;BA.debugLine="PageSelector.Update";
_pageselector._update /*String*/ ();
 //BA.debugLineNum = 394;BA.debugLine="Search";
_search();
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return "";
}
public String  _pageselector_enterpressed() throws Exception{
 //BA.debugLineNum = 375;BA.debugLine="Private Sub PageSelector_EnterPressed";
 //BA.debugLineNum = 376;BA.debugLine="Search";
_search();
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return "";
}
public String  _saved_refresh_click() throws Exception{
 //BA.debugLineNum = 398;BA.debugLine="Private Sub Saved_Refresh_Click";
 //BA.debugLineNum = 399;BA.debugLine="ListSaved";
_listsaved();
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return "";
}
public void  _search() throws Exception{
ResumableSub_Search rsub = new ResumableSub_Search(this);
rsub.resume(ba, null);
}
public static class ResumableSub_Search extends BA.ResumableSub {
public ResumableSub_Search(com.holydesing.software.wallpaperhq.b4xmainpage parent) {
this.parent = parent;
}
com.holydesing.software.wallpaperhq.b4xmainpage parent;
String _targeturl = "";
String _pagenumber = "";
String _url = "";
anywheresoftware.b4a.objects.collections.List _imagesfromserver = null;
int _i = 0;
com.holydesing.software.wallpaperhq.imageserver _imageserverdata = null;
int _size_x = 0;
int _size_y = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bd = null;
anywheresoftware.b4a.objects.PanelWrapper _imageviewex = null;
int step40;
int limit40;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 199;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 55;
this.catchState = 54;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 54;
 //BA.debugLineNum = 200;BA.debugLine="If IsListing = False Then";
if (true) break;

case 4:
//if
this.state = 52;
if (parent._islisting==parent.__c.False) { 
this.state = 6;
}else {
this.state = 51;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 201;BA.debugLine="IsListing = True";
parent._islisting = parent.__c.True;
 //BA.debugLineNum = 203;BA.debugLine="B4XLoadingIndicator1.Show";
parent._b4xloadingindicator1._show /*String*/ ();
 //BA.debugLineNum = 204;BA.debugLine="Sleep(2000)";
parent.__c.Sleep(ba,this,(int) (2000));
this.state = 56;
return;
case 56:
//C
this.state = 7;
;
 //BA.debugLineNum = 205;BA.debugLine="Online_View.Panel.RemoveAllViews";
parent._online_view.getPanel().RemoveAllViews();
 //BA.debugLineNum = 206;BA.debugLine="Online_View.Panel.Invalidate";
parent._online_view.getPanel().Invalidate();
 //BA.debugLineNum = 209;BA.debugLine="Dim TargetUrl As String";
_targeturl = "";
 //BA.debugLineNum = 211;BA.debugLine="PageSelector.Update";
parent._pageselector._update /*String*/ ();
 //BA.debugLineNum = 213;BA.debugLine="Dim PageNumber As String = PageSelector.Text";
_pagenumber = parent._pageselector._gettext /*String*/ ();
 //BA.debugLineNum = 215;BA.debugLine="If PageNumber.Length = 0 Then PageSelector.Text";
if (true) break;

case 7:
//if
this.state = 12;
if (_pagenumber.length()==0) { 
this.state = 9;
;}if (true) break;

case 9:
//C
this.state = 12;
parent._pageselector._settext /*String*/ ("1");
if (true) break;

case 12:
//C
this.state = 13;
;
 //BA.debugLineNum = 217;BA.debugLine="If PageNumber <= 0 Then";
if (true) break;

case 13:
//if
this.state = 16;
if ((double)(Double.parseDouble(_pagenumber))<=0) { 
this.state = 15;
}if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 218;BA.debugLine="PageSelector.Text = 1";
parent._pageselector._settext /*String*/ (BA.NumberToString(1));
 if (true) break;

case 16:
//C
this.state = 17;
;
 //BA.debugLineNum = 221;BA.debugLine="Dim Url As String";
_url = "";
 //BA.debugLineNum = 223;BA.debugLine="If B4XFloatTextField1.Text.Length = 0 Then";
if (true) break;

case 17:
//if
this.state = 39;
if (parent._b4xfloattextfield1._gettext /*String*/ ().length()==0) { 
this.state = 19;
}else {
this.state = 38;
}if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 224;BA.debugLine="Select Case B4XComboBox1.SelectedIndex";
if (true) break;

case 20:
//select
this.state = 31;
switch (BA.switchObjectToInt(parent._b4xcombobox1._getselectedindex /*int*/ (),(int) (0),(int) (1),(int) (2),(int) (3))) {
case 0: {
this.state = 22;
if (true) break;
}
case 1: {
this.state = 24;
if (true) break;
}
case 2: {
this.state = 26;
if (true) break;
}
case 3: {
this.state = 28;
if (true) break;
}
default: {
this.state = 30;
if (true) break;
}
}
if (true) break;

case 22:
//C
this.state = 31;
 //BA.debugLineNum = 226;BA.debugLine="Url = WallHaveAPI.Random";
_url = parent._wallhaveapi._random /*String*/ ;
 if (true) break;

case 24:
//C
this.state = 31;
 //BA.debugLineNum = 228;BA.debugLine="Url = WallHaveAPI.Latest";
_url = parent._wallhaveapi._latest /*String*/ ;
 if (true) break;

case 26:
//C
this.state = 31;
 //BA.debugLineNum = 230;BA.debugLine="Url = WallHaveAPI.Hot";
_url = parent._wallhaveapi._hot /*String*/ ;
 if (true) break;

case 28:
//C
this.state = 31;
 //BA.debugLineNum = 232;BA.debugLine="Url = WallHaveAPI.Toplist";
_url = parent._wallhaveapi._toplist /*String*/ ;
 if (true) break;

case 30:
//C
this.state = 31;
 //BA.debugLineNum = 234;BA.debugLine="Url = WallHaveAPI.Random";
_url = parent._wallhaveapi._random /*String*/ ;
 if (true) break;
;
 //BA.debugLineNum = 237;BA.debugLine="If PageSelector.Text > 1 Then Url = WallHaveAP";

case 31:
//if
this.state = 36;
if ((double)(Double.parseDouble(parent._pageselector._gettext /*String*/ ()))>1) { 
this.state = 33;
;}if (true) break;

case 33:
//C
this.state = 36;
_url = parent._wallhaveapi._makepageurl /*String*/ (_url,(int)(Double.parseDouble(parent._pageselector._gettext /*String*/ ())));
if (true) break;

case 36:
//C
this.state = 39;
;
 if (true) break;

case 38:
//C
this.state = 39;
 //BA.debugLineNum = 240;BA.debugLine="Url = WallHaveAPI.MakeSearch(B4XFloatTextField1";
_url = parent._wallhaveapi._makesearch /*String*/ (parent._b4xfloattextfield1._gettext /*String*/ (),(int)(Double.parseDouble(parent._pageselector._gettext /*String*/ ())));
 if (true) break;

case 39:
//C
this.state = 40;
;
 //BA.debugLineNum = 243;BA.debugLine="TargetUrl = Url";
_targeturl = _url;
 //BA.debugLineNum = 248;BA.debugLine="Dim ImagesFromServer As List =	WallHaveAPI.GetI";
_imagesfromserver = new anywheresoftware.b4a.objects.collections.List();
_imagesfromserver = parent._wallhaveapi._getimages /*anywheresoftware.b4a.objects.collections.List*/ (_targeturl);
 //BA.debugLineNum = 250;BA.debugLine="If ImagesFromServer.Size = 0 Then";
if (true) break;

case 40:
//if
this.state = 49;
if (_imagesfromserver.getSize()==0) { 
this.state = 42;
}else {
this.state = 44;
}if (true) break;

case 42:
//C
this.state = 49;
 //BA.debugLineNum = 252;BA.debugLine="ToastMessageShow(\"There is no Internet connect";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("There is no Internet connection!"),parent.__c.True);
 //BA.debugLineNum = 253;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 57;
return;
case 57:
//C
this.state = 49;
;
 if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 257;BA.debugLine="Online_View.ScrollPosition = 0";
parent._online_view.setScrollPosition((int) (0));
 //BA.debugLineNum = 259;BA.debugLine="For i  = 0 To (ImagesFromServer.Size - 1)";
if (true) break;

case 45:
//for
this.state = 48;
step40 = 1;
limit40 = (int) ((_imagesfromserver.getSize()-1));
_i = (int) (0) ;
this.state = 58;
if (true) break;

case 58:
//C
this.state = 48;
if ((step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40)) this.state = 47;
if (true) break;

case 59:
//C
this.state = 58;
_i = ((int)(0 + _i + step40)) ;
if (true) break;

case 47:
//C
this.state = 59;
 //BA.debugLineNum = 261;BA.debugLine="Dim ImageServerData As ImageServer = ImagesFr";
_imageserverdata = (com.holydesing.software.wallpaperhq.imageserver)(_imagesfromserver.Get(_i));
 //BA.debugLineNum = 263;BA.debugLine="Dim Size_X As Int = 100%x";
_size_x = parent.__c.PerXToCurrent((float) (100),ba);
 //BA.debugLineNum = 264;BA.debugLine="Dim Size_Y As Int = 50%y";
_size_y = parent.__c.PerYToCurrent((float) (50),ba);
 //BA.debugLineNum = 266;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 267;BA.debugLine="bmp.Initialize(File.DirAssets, \"Loading.png\")";
_bmp.Initialize(parent.__c.File.getDirAssets(),"Loading.png");
 //BA.debugLineNum = 269;BA.debugLine="Dim bd As BitmapDrawable";
_bd = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
 //BA.debugLineNum = 270;BA.debugLine="bd.Initialize(bmp)";
_bd.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 274;BA.debugLine="Dim ImageViewEx As Panel";
_imageviewex = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 275;BA.debugLine="ImageViewEx.Initialize(\"img\")";
_imageviewex.Initialize(ba,"img");
 //BA.debugLineNum = 276;BA.debugLine="ImageViewEx.Background = bd";
_imageviewex.setBackground((android.graphics.drawable.Drawable)(_bd.getObject()));
 //BA.debugLineNum = 277;BA.debugLine="ImageViewEx.Width = Size_X";
_imageviewex.setWidth(_size_x);
 //BA.debugLineNum = 278;BA.debugLine="ImageViewEx.Height = Size_Y";
_imageviewex.setHeight(_size_y);
 //BA.debugLineNum = 279;BA.debugLine="ImageViewEx.Color = Colors.ARGB(255,40, 42, 5";
_imageviewex.setColor(parent.__c.Colors.ARGB((int) (255),(int) (40),(int) (42),(int) (54)));
 //BA.debugLineNum = 281;BA.debugLine="MediaManager.SetMediaWithExtra(ImageViewEx, I";
parent._mediamanager._setmediawithextra /*String*/ ((anywheresoftware.b4a.objects.B4XViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper(), (java.lang.Object)(_imageviewex.getObject())),_imageserverdata._minimizedurl /*String*/ ,"",parent.__c.createMap(new Object[] {(Object)(parent._mediamanager._request_resize_mode /*String*/ ),(Object)("FILL_NO_DISTORTIONS")}));
 //BA.debugLineNum = 283;BA.debugLine="ImageViewEx.Tag = I";
_imageviewex.setTag((Object)(_i));
 //BA.debugLineNum = 285;BA.debugLine="ControlListerEx.Add(Online_View, ImageViewEx,";
parent._controllisterex._add /*String*/ (parent._online_view,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_imageviewex.getObject())),parent.__c.True);
 if (true) break;
if (true) break;

case 48:
//C
this.state = 49;
;
 //BA.debugLineNum = 289;BA.debugLine="Online_View.Panel.Height = (ImagesFromServer.S";
parent._online_view.getPanel().setHeight((int) ((_imagesfromserver.getSize()*parent.__c.PerYToCurrent((float) (50),ba))));
 if (true) break;

case 49:
//C
this.state = 52;
;
 //BA.debugLineNum = 293;BA.debugLine="IsListing = False";
parent._islisting = parent.__c.False;
 //BA.debugLineNum = 294;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 if (true) break;

case 51:
//C
this.state = 52;
 //BA.debugLineNum = 298;BA.debugLine="ToastMessageShow(\"The server is responding, ple";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("The server is responding, please wait..."),parent.__c.False);
 if (true) break;

case 52:
//C
this.state = 55;
;
 if (true) break;

case 54:
//C
this.state = 55;
this.catchState = 0;
 //BA.debugLineNum = 303;BA.debugLine="IsListing = False";
parent._islisting = parent.__c.False;
 //BA.debugLineNum = 304;BA.debugLine="B4XLoadingIndicator1.Hide";
parent._b4xloadingindicator1._hide /*String*/ ();
 //BA.debugLineNum = 305;BA.debugLine="ToastMessageShow(LastException, False)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(parent.__c.LastException(ba).getObject()),parent.__c.False);
 if (true) break;
if (true) break;

case 55:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
