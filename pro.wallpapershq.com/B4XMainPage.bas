﻿B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region


'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	
	Public AS_TabMenuAdvanced1 As AS_TabMenuAdvanced
'	
			#If B4I
	Private xpnl_bottom As B4XView
#End If
	
	Private IsListing As Boolean = False
	
	Private WallHaveAPI As WallHaven
	Private ControlListerEx As ControlLister
	
	Dim PopupMenuAdvanced As ASPopupMenuAdvanced
	Dim PopupMenuWidth As Float = 150dip
	Dim PopupMenuHeight As Float = 250dip
	
	Private MediaManager As SimpleMediaManager
	Public ASViewPager1 As ASViewPager
	
	Private B4XComboBox1 As B4XComboBox
	Public B4XFloatTextField1 As B4XFloatTextField
	
	Private Online_View As ScrollView
	
	
	Private B4XLoadingIndicator1 As B4XLoadingIndicator
	Public PageSelector As B4XFloatTextField
	
	Public ImageViewer As ImageViewerB4X
	
	Private SavedScroll_View As ScrollView
	
	Dim sm As SlideMenu
	Private IME1 As IME
	
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPage")
	
	B4XPages.SetTitle(Me,"WallpapersHQ")
	
	IME1.Initialize("IME1")
	
	WallHaveAPI.Initialize
	MediaManager.Initialize
	ControlListerEx.Initialize
	
	ImageViewer.Initialize
	B4XPages.AddPage("ImageViewBETA", ImageViewer)
	
	#If B4I
	xpnl_bottom = xui.CreatePanel("")
	Root.AddView(xpnl_bottom,0,0,Root.Width,B4XPages.GetNativeParent(Me).SafeAreaInsets.Bottom)
	xpnl_bottom.Color = 0xFF202125
	#End If
	
	DisableStrictMode
	
	CreateUI
'	Log(Main.DownloadedWallpapers)
	'B4XLoadingIndicator1.Show
	
End Sub

Sub DisableStrictMode
	Try
		Dim jo As JavaObject
		jo.InitializeStatic("android.os.Build.VERSION")
		If jo.GetField("SDK_INT") > 9 Then
			Dim policy As JavaObject
			policy = policy.InitializeNewInstance("android.os.StrictMode.ThreadPolicy.Builder", Null)
			policy = policy.RunMethodJO("permitAll", Null).RunMethodJO("build", Null)
			Dim smeX As JavaObject
			smeX.InitializeStatic("android.os.StrictMode").RunMethod("setThreadPolicy", Array(policy))
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub CreateUI
	
	ThemeColors.setTheme("Dracula")
	'PageSelector.Text = 1
	
	AS_TabMenuAdvanced1.AddTab("",xui.LoadBitmap(File.DirAssets,"home_active.png"),xui.LoadBitmap(File.DirAssets,"home_inactive.png"))
	AS_TabMenuAdvanced1.AddTab("",xui.LoadBitmap(File.DirAssets,"Image.png"),xui.LoadBitmap(File.DirAssets,"Image.png"))
	AS_TabMenuAdvanced1.AddTab("",xui.LoadBitmap(File.DirAssets,"About.png"),xui.LoadBitmap(File.DirAssets,"About.png"))
	'AS_TabMenuAdvanced1.AddTab("Maps",xui.LoadBitmap(File.DirAssets,"maps_active.png"),xui.LoadBitmap(File.DirAssets,"maps_inactive.png"))
'	AS_TabMenuAdvanced1.AddTab("More",AS_TabMenuAdvanced1.FontToBitmap(Chr(0xE5D4),True,45,xui.Color_White),AS_TabMenuAdvanced1.FontToBitmap(Chr(0xE5D4),True,45,xui.Color_White))
	AS_TabMenuAdvanced1.Refresh

	Dim Home_View As Panel : Home_View.Initialize("") : Home_View.SetLayoutAnimated(0,0,0,ASViewPager1.Base.Width,ASViewPager1.Base.Height)
	Home_View.LoadLayout("Home")
	'Home_View.Color = Colors.Transparent
	Home_View.Color = xui.Color_ARGB(255,20, 21, 23)
    ASViewPager1.AddPage(Home_View,"")
	
	'PanelSlideContainer.SetLayoutAnimated(0,0,0,200%x,PanelSlideContainer.Height)
	'PanelSlideContainer.LoadLayout("LeftSlide") 
	
	Dim Saved_View As Panel : Saved_View.Initialize("") : Saved_View.SetLayoutAnimated(0,0,0,ASViewPager1.Base.Width,ASViewPager1.Base.Height)
	Saved_View.LoadLayout("Saved")
	Saved_View.Color = xui.Color_ARGB(255,20, 21, 23)
	ASViewPager1.AddPage(Saved_View,"")
	
	Dim Storage_View As Panel : Storage_View.Initialize("") : 	Storage_View.SetLayoutAnimated(0,0,0,ASViewPager1.Base.Width,ASViewPager1.Base.Height)
 	Storage_View.LoadLayout("Storage")
	Storage_View.Color = xui.Color_ARGB(255,20, 21, 23)
	ASViewPager1.AddPage(Storage_View,"")

	'Sleep(3000)
	'AS_TabMenuAdvanced1.GetTab(2).xTab.BadgeValue = 5
	'AS_TabMenuAdvanced1.GetTab(3).xTab.Enabled = False
	'AS_TabMenuAdvanced1.Refresh
	
	PopupMenuAdvanced.Initialize(Root,Me,"PopupMenuAdvanced")
		
	'Adds the items
	For i = 0 To 10 -1
		
		Dim xpnl As B4XView = xui.CreatePanel("")
		xpnl.SetLayoutAnimated(0,0,0,PopupMenuWidth,40dip)
		xpnl.LoadLayout("frm_Item1")
		xpnl.GetView(0).Text = "Test " & i
		
		PopupMenuAdvanced.AddItem(xpnl,"")
		If i <> 9 Then PopupMenuAdvanced.AddSeparator
		
	Next
		
	'Triangle properties
	PopupMenuAdvanced.ShowTriangle = True
	PopupMenuAdvanced.TriangleProperties.Top = AS_TabMenuAdvanced1.mBase.Top
	PopupMenuAdvanced.TriangleProperties.Color = xui.Color_White
	PopupMenuAdvanced.OrientationHorizontal = PopupMenuAdvanced.OrientationHorizontal_RIGHT
	PopupMenuAdvanced.OrientationVertical = PopupMenuAdvanced.OrientationVertical_TOP
	
	'Show the menu
	
	If B4XComboBox1.IsInitialized = True Then
		
		Dim Items As List
		Items.Initialize
		Items.Add("Random")
		Items.Add("Latest")
		Items.Add("Hot")
		Items.Add("Toplist")
		B4XComboBox1.SetItems(Items)
		
		B4XComboBox1.SelectedIndex = 0
		
		B4XComboBox1.cmbBox.DropdownBackgroundColor = Colors.ARGB(255, 40, 42, 54)
		
	End If
	
	If PageSelector.Text = "" Then
		PageSelector.Text = 1
		PageSelector.Update
	End If
	
	
	ThemeColors.setTheme("Dracula")

	sm.Initialize(Root, Me, "SlideMenu", 42dip, 180dip)

	sm.AddItem("Nature", Null, "id:37")
	sm.AddItem("4K", Null, "id:65348")
	sm.AddItem("Landscape", Null, "id:711")
	sm.AddItem("Artwork", Null, "id:323")
	sm.AddItem("Hoshino Ai", Null, "id:143075")
	sm.AddItem("Fantasy art", Null, "id:853")
	sm.AddItem("Cyberpunk", Null, "id:136548")
	sm.AddItem("Cars", Null, "id:314")
	sm.AddItem("Space", Null, "id:32")
	sm.AddItem("Pixel Art", Null, "id:2321")
	sm.AddItem("Abstract", Null, "id:74")
	sm.AddItem("Schoolgirl", Null, "id:3834")
	sm.AddItem("Arknights", Null, "id:85254")
	sm.AddItem("Anime BoysChad", Null, "id:175")
	
	Sleep(3000)
	
	'B4XFloatTextField1.Text = "id:65348"
	
	Search
	
End Sub

Private Sub B4XComboBox1_SelectedIndexChanged (Index As Int)
	B4XFloatTextField1.Text = ""
	PageSelector.Text = 1
	PageSelector.Update
	Search
End Sub

Private Sub B4XFloatTextField1_EnterPressed
	PageSelector.Text = 1
	PageSelector.Update
	Search
End Sub

Private Sub Button1_Click
	PageSelector.Text = 1
	PageSelector.Update
	Search
End Sub

Sub Search
	Try
		IME1.HideKeyboard
		If IsListing = False Then
			IsListing = True
		
			B4XLoadingIndicator1.Show
			Sleep(2000)
			Online_View.Panel.RemoveAllViews
			Online_View.Panel.Invalidate
		
		
			Dim TargetUrl As String 
		
			PageSelector.Update
			
			Dim PageNumber As String = PageSelector.Text
		
			If PageNumber.Length = 0 Then PageSelector.Text = "1"
		
			If PageNumber <= 0 Then
				PageSelector.Text = 1
			End If
		
			Dim Url As String
			
			If B4XFloatTextField1.Text.Length = 0 Then
				Select Case B4XComboBox1.SelectedIndex
					Case 0
						Url = WallHaveAPI.Random
					Case 1
						Url = WallHaveAPI.Latest
					Case 2
						Url = WallHaveAPI.Hot
					Case 3
						Url = WallHaveAPI.Toplist
					Case Else
						Url = WallHaveAPI.Random
				End Select
				
				If PageSelector.Text > 1 Then Url = WallHaveAPI.MakePageUrl(Url, PageSelector.Text)
				
			Else
				'Log("Opening")
				'If B4XFloatTextField1.Text.StartsWith("like:") Then
				'	Url = "https://wallhaven.cc/search?q=" & B4XFloatTextField1.Text.Replace(":", "%3A")
				'	Log(Url)
				'Else
				'''''End If
			
				If B4XFloatTextField1.Text.StartsWith("set:") Then
						
					Url = "https://wallhaven.cc/w/" & B4XFloatTextField1.Text.Replace("set:", "")
					LoadImageEx(Url)
					IsListing = False
					B4XLoadingIndicator1.Hide
					Return
					
				Else
					Url = WallHaveAPI.MakeSearch(B4XFloatTextField1.Text, PageSelector.Text)
				End If
			
			End If
		
			TargetUrl = Url
			
		'	Log("Go to Page " & PageSelector.Text)
		'	Log("Url " & TargetUrl)
	
			Dim ImagesFromServer As List =	WallHaveAPI.GetImages(TargetUrl)
	
			If ImagesFromServer.Size = 0 Then
			
				If WallHaveAPI.ErrorConnection = True Then
					ToastMessageShow("There is no Internet connection!", True)
					Else
					ToastMessageShow("No results found!", True)
				End If
			
				Sleep(1000)
			
			Else
			
				Online_View.ScrollPosition = 0
			
				For i  = 0 To (ImagesFromServer.Size - 1)
		
					Dim ImageServerData As ImageServer = ImagesFromServer.Get(i)
		
					Dim Size_X As Int = 100%x
					Dim Size_Y As Int = 50%y
				
				'	Dim bmp As Bitmap
				'	bmp.Initialize(File.DirAssets, "Loading.png") 'ruta y nombre del archivo de imagen

					'Dim bd As BitmapDrawable
				'	bd.Initialize(bmp)
			
		
		
					Dim ImageViewEx As Panel
					ImageViewEx.Initialize("img")
					'ImageViewEx.Background = bd
					ImageViewEx.Width = Size_X
					ImageViewEx.Height = Size_Y
					ImageViewEx.Color = Colors.ARGB(255,40, 42, 54)
				
					MediaManager.SetMediaWithExtra(ImageViewEx, ImageServerData.MinimizedURL, "", CreateMap(MediaManager.REQUEST_RESIZE_MODE : "FILL_NO_DISTORTIONS"))
				
			
				'	Wait For (ImageViewEx) EventName_MediaReady (Success As Boolean, Media As SMMedia)
					
			
			'		Dim BackGroundEx As BitmapDrawable = ImageViewEx.Background
    	    '       Dim bmpTest As B4XBitmap = BackGroundEx.Bitmap 
			'		ImageViewEx.SetBackgroundImage(Blur(bmpTest))
					
					ImageViewEx.Tag = I
			
					ControlListerEx.Add(Online_View, ImageViewEx, True)
	
				Next
	
				Online_View.Panel.Height = (ImagesFromServer.Size * 50%Y)
			
			End If
		
			IsListing = False
			B4XLoadingIndicator1.Hide

		Else
			
			ToastMessageShow("The server is responding, please wait...", False)
		
		End If
	
	Catch
		IsListing = False
		B4XLoadingIndicator1.Hide
		ToastMessageShow(LastException, False)
	End Try
End Sub

Sub img_Click
	
	Try
		Dim iv As Panel
		iv = Sender
		Dim ImageSelected As ImageServer = WallHaveAPI.ImageURLs.Get(iv.Tag)
		LoadImageEx(ImageSelected.PreviewURL)
	Catch
		Log(LastException)
	End Try
	
End Sub


Sub LoadImageEx(url As String)
	Try
		
		Dim Image4K As String = WallHaveAPI.GetImage4K(url)
	
		If Image4K.Length = 0 Then
			
			ToastMessageShow("No Internet Error!", False)
			
		Else

			B4XPages.ShowPage("ImageViewBETA")
			B4XPages.GetPage("ImageViewBETA").As(ImageViewerB4X).ShowImage(Image4K)
		
		End If
	Catch
		Log(LastException)
	End Try
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


#If B4I
Private Sub B4XPage_Resize (Width As Int, Height As Int)
	xpnl_bottom.SetLayoutAnimated(0,0,Height - B4XPages.GetNativeParent(Me).SafeAreaInsets.Bottom,Width,B4XPages.GetNativeParent(Me).SafeAreaInsets.Bottom)
	AS_TabMenuAdvanced1.mBase.Top = Height - AS_TabMenuAdvanced1.mBase.Height - B4XPages.GetNativeParent(Me).SafeAreaInsets.Bottom
End Sub
#End If

Private Sub ASViewPager1_PageChanged(Index As Int)
	If Index = 1 Then
		If SavedScroll_View.Panel.NumberOfViews = 0 Then
			ListSaved
			Sleep(1000)
		End If
	End If
	AS_TabMenuAdvanced1.Index = Index
	AS_TabMenuAdvanced1.Refresh
End Sub

Private Sub AS_TabMenuAdvanced1_TabClick (Index As Int)
	 If Index = 3 Then
	 	
		Dim xpnl_Tab As B4XView = AS_TabMenuAdvanced1.GetTab(Index).xTabViews.xpnl_TabBackground 'Get the tab
	
		Dim MenuLeft As Float = xpnl_Tab.Left + xpnl_Tab.Width/2 - PopupMenuWidth/2
		
		If MenuLeft + PopupMenuWidth > Root.Width Then MenuLeft = MenuLeft - ((MenuLeft+PopupMenuWidth)-Root.Width)
		PopupMenuAdvanced.TriangleProperties.Left = PopupMenuWidth/2 - PopupMenuAdvanced.TriangleProperties.Width/2 + ((MenuLeft + PopupMenuWidth)-Root.Width)
		
		PopupMenuAdvanced.OpenMenuAdvanced(MenuLeft,AS_TabMenuAdvanced1.mBase.Top - PopupMenuHeight - PopupMenuAdvanced.TriangleProperties.Height,PopupMenuWidth,PopupMenuHeight)
		
		Else
			
		ASViewPager1.CurrentIndex2 = Index
		
	End If
End Sub

Private Sub PageSelector_EnterPressed
	Search
End Sub

Private Sub PageLeft_Home_Click
	If PageSelector.Text > 1 Then
		PageSelector.Text = PageSelector.Text - 1
	End If
	PageSelector.Update

	Search
End Sub

Private Sub PageRight_Home_Click
	If PageSelector.Text >= 1 Then
		PageSelector.Text = PageSelector.Text + 1
	End If
	PageSelector.Update
	
	Search
End Sub


Private Sub Saved_Refresh_Click
	ListSaved
End Sub


Public Sub ListSaved
	Try
		SavedScroll_View.Panel.RemoveAllViews
		SavedScroll_View.Panel.Invalidate
		SavedScroll_View.ScrollPosition = 0
		Dim Files As List = File.ListFiles(Main.DownloadedWallpapers)
		
		For Each FileImg As String In Files
			'Dim ImgFile As Bitmap = LoadBitmap(Main.DownloadedWallpapers,FileImg )
			Try
				
				Log(FileImg) '"ShareEx" & ".jpg"
				
				
				Dim Size_X As Int = 100%x
				Dim Size_Y As Int = 50%y
				
				Dim bmp As Bitmap
				bmp.Initialize(File.DirAssets, "Loading.png") 'ruta y nombre del archivo de imagen

				Dim bd As BitmapDrawable
				bd.Initialize(bmp)
			
				Dim ImageViewEx As Panel
				ImageViewEx.Initialize("img_Local")
				ImageViewEx.Background = bd
				ImageViewEx.Width = Size_X
				ImageViewEx.Height = Size_Y
				ImageViewEx.Color = Colors.ARGB(255,40, 42, 54)
				
				MediaManager.SetMediaFromFile(ImageViewEx, Main.DownloadedWallpapers,FileImg , "image/*", CreateMap(MediaManager.REQUEST_RESIZE_MODE : "FILL_NO_DISTORTIONS"))
			
				ImageViewEx.Tag = FileImg
				
				ControlListerEx.Add(SavedScroll_View, ImageViewEx, True)
				
			Catch
				Log(LastException)
			End Try
			
		Next
		
		SavedScroll_View.Panel.Height = (Files.Size * 50%Y)
		
	Catch
		ToastMessageShow(LastException, False)
	End Try
End Sub


Sub img_Local_Click
	
	Try
		Dim iv As Panel
		iv = Sender
	
		Dim Image4K As String = iv.Tag
		If Image4K.Length = 0 Then
			
			ToastMessageShow("File Corrupted Error!", False)
			
			Else

		B4XPages.ShowPage("ImageViewBETA")
		B4XPages.GetPage("ImageViewBETA").As(ImageViewerB4X).ShowImageFromFile(Image4K)
		
		End If
		
	Catch
		Log(LastException)
	End Try
	
End Sub

Private Sub DonatePaypal_Click
	OpenLink("https://www.paypal.com/paypalme/salvadorKrilewski")
End Sub

Sub OpenLink(link As String)
	Dim intent As Intent
	intent.Initialize(intent.ACTION_VIEW, link)
	StartActivity(intent)
End Sub

Private Sub Blur (bmp As B4XBitmap) As B4XBitmap
	Dim n As Long = DateTime.Now
	Dim bc As BitmapCreator
	Dim ReduceScale As Int = 2
	bc.Initialize(bmp.Width / ReduceScale / bmp.Scale, bmp.Height / ReduceScale / bmp.Scale)
	bc.CopyPixelsFromBitmap(bmp)
	Dim count As Int = 3
	Dim clrs(3) As ARGBColor
	Dim temp As ARGBColor
	Dim m As Int
	For steps = 1 To count
		For y = 0 To bc.mHeight - 1
			For x = 0 To 2
				bc.GetARGB(x, y, clrs(x))
			Next
			SetAvg(bc, 1, y, clrs, temp)
			m = 0
			For x = 2 To bc.mWidth - 2
				bc.GetARGB(x + 1, y, clrs(m))
				m = (m + 1) Mod clrs.Length
				SetAvg(bc, x, y, clrs, temp)
			Next
		Next
		For x = 0 To bc.mWidth - 1
			For y = 0 To 2
				bc.GetARGB(x, y, clrs(y))
			Next
			SetAvg(bc, x, 1, clrs, temp)
			m = 0
			For y = 2 To bc.mHeight - 2
				bc.GetARGB(x, y + 1, clrs(m))
				m = (m + 1) Mod clrs.Length
				SetAvg(bc, x, y, clrs, temp)
			Next
		Next
	Next
	Log(DateTime.Now - n)
	Return bc.Bitmap
End Sub

Private Sub SetAvg(bc As BitmapCreator, x As Int, y As Int, clrs() As ARGBColor, temp As ARGBColor)
	temp.Initialize
	For Each c As ARGBColor In clrs
		temp.r = temp.r + c.r
		temp.g = temp.g + c.g
		temp.b = temp.b + c.b
	Next
	temp.a = 255
	temp.r = temp.r / clrs.Length
	temp.g = temp.g / clrs.Length
	temp.b = temp.b / clrs.Length
	bc.SetARGB(x, y, temp)
End Sub

Private Sub SlideOpenButton_Click
sm.Show
End Sub

'Event sub which is called when an item in the slidemenu is clicked
Sub SlideMenu_Click(Item As Object)
	'ToastMessageShow("Item clicked: " & Item, False)
	
	
	B4XPages.MainPage.B4XFloatTextField1.Text =  Item
	B4XPages.MainPage.B4XFloatTextField1.Update
	B4XPages.MainPage.PageSelector.Text = "1"
	B4XPages.MainPage.PageSelector.Update
	B4XPages.MainPage.Search
	
End Sub