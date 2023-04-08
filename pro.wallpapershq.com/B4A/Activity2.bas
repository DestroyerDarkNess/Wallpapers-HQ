Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=2.71
@EndOfDesignText@
#Region Module Attributes
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	Private mBmp As Bitmap
	Public ImageData As String
	
End Sub

Sub Globals
	Private MediaManager As SimpleMediaManager
	Private Button1 As Button
	Private Button2 As Button
	Private PanelImageView As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Activity.LoadLayout("ImageViewer.bal")
	
	MediaManager.Initialize
	
	If mBmp.IsInitialized Then
		 Activity.SetBackgroundImage(mBmp)
	End If
	
End Sub

Sub ShowImage(ImgDat As String)
	ImageData = ImgDat
	'Activity.SetBackgroundImage(mBmp)
	
	SetZoomImageViewMedia(PanelImageView, ImgDat, Colors.ARGB(255,40, 42, 54))
End Sub

Private Sub Button1_Click
	If mBmp.IsInitialized Then
		SetWallPaper(mBmp)
	End If
End Sub

Private Sub SetZoomImageViewMedia(Panel As B4XView, Url As String, BackgroundColor As Int)
	Try
		MediaManager.SetMediaWithExtra(Panel, Url, "", CreateMap(MediaManager.REQUEST_RESIZE_MODE : "FILL_NO_DISTORTIONS", MediaManager.REQUEST_CALLBACK: Me, MediaManager.REQUEST_ZOOMIMAGEVIEW: True, _
        MediaManager.REQUEST_BACKGROUND: BackgroundColor))
		Wait For (Panel) SMM_MediaReady (Success As Boolean, Media As SMMedia)
		If Success Then
			Dim zv As ZoomImageView = Panel.GetView(0).Tag
			zv.pnlBackground.Color = BackgroundColor
			zv.mBase.Color = BackgroundColor
		End If
	Catch
		Log(LastException)
	End Try
End Sub

Sub SetWallPaper(Bmp As Bitmap)
	Try
		Dim r As Reflector
		r.Target = r.RunStaticMethod("android.app.WallpaperManager", "getInstance", _
      Array As Object(r.GetContext), Array As String("android.content.Context"))
		r.RunMethod4("setBitmap", Array As Object(Bmp), Array As String("android.graphics.Bitmap"))
		ToastMessageShow("The wallpaper has been set Successfully.", True)
		Sleep(500)
	   Activity.Finish()
	Catch
		Dim Exeption As String =LastException
		Log(Exeption)
		ToastMessageShow(Exeption, True)
	End Try
End Sub

Private Sub Button2_Click
	If mBmp.IsInitialized Then
		Button2.visible = False
		SaveBitmapToFile(mBmp, "Wallp")
	End If
End Sub

Sub SaveBitmapToFile(bitmap As Bitmap, filename As String)
	Try
		
		ToastMessageShow("Wallpaper Has been saved!", False)
		'Crear directorios de necesitar
		
		If File.Exists(Main.DownloadedWallpapers, "") = False Then
			File.MakeDir(Main.DownloadedWallpapers, "")
		End If
		
		Dim num As Long 
		num = Rnd(100, 1000000)
		
		'Crear el archivo y escribir el bitmap
		Dim out As OutputStream = File.OpenOutput(Main.DownloadedWallpapers, filename & num, False)
		bitmap.WriteToStream(out, 100, "PNG")
		out.Close
		
	Catch
		Dim Exeption As String =LastException
		Log(Exeption)
		ToastMessageShow(Exeption, True)
		Button2.visible = True
	End Try
End Sub
