B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@




Sub Class_Globals
		
	Private js As jSoup
	
	Private HomeUrl As String = "https://wallhaven.cc/"
	Public Latest As String = HomeUrl & "latest"
	Public Hot As String = HomeUrl & "hot"
	Public Toplist As String = HomeUrl & "toplist"
	Public Random As String = HomeUrl & "random"
	
	Public  ImageURLs As List
End Sub

'Initializes the object. You can add parameters to this method if needed.
Public Sub Initialize
	
	ImageURLs.Initialize
	
End Sub

Public Sub OpenImageView
	StartActivity(Viewer)
End Sub

Public Sub MakeSearch( Text As String, Page As Int ) As String
	Return HomeUrl & "search?q=" & Text.Replace(" ", "+") & "&page=" & Page
End Sub

Public Sub MakePageUrl(BaseUrl As String,   Page As Int) As String
	Return BaseUrl & "?page=" & Page
End Sub

public Sub GetImage4K(URL) As String
	Try
		Dim Html_Source As String = js.connect(URL)
				
		Dim WallElement As String = js.getElementByID(Html_Source, "wallpaper")
						
		Dim WallpaperURL As String = js.selectorElementAttr(WallElement,"img[src]", "src").Get(0)
		Return  WallpaperURL
	Catch
		Log(LastException)
	End Try
End Sub


Public Sub GetImages(URL) As  List
	
	ImageURLs.Clear
	
	Try
		Dim Html_Main_Source As String =  js.connect(URL)
		If  Html_Main_Source.Length > 0 Then
			Dim ElementList As List =  js.getElementsByTag(Html_Main_Source, "li")
		
			For Each PreElement As String In  ElementList
				Try
					
					Dim PreviewUrlList As List = js.getElementsByTag(PreElement,"a")
					Dim Minimized As List = js.getElementsByTag(PreElement,"img")
					
					
					If Not (PreviewUrlList.size = 0) Then
						
						Dim PreviewUrlTag As String =PreviewUrlList.Get(0)
						
						If PreviewUrlTag.StartsWith("<a class=""preview"" ") Then
						
							Dim MinimizedIMGTag As String = Minimized.Get(0)
							Dim MinimizedIMG As String = js.selectorElementAttr(MinimizedIMGTag,"img[data-src]", "data-src").Get(0)
						
							Dim PreviewUrl As String = js.selectorElementAttr(PreviewUrlTag,"a[href]", "href").Get(0)
					
							'	Log(PreviewUrl & "   " & MinimizedIMG )
						
							Dim ImgClass As ImageServer
							ImgClass.Initialize(PreviewUrl , MinimizedIMG)
							ImageURLs.Add(ImgClass)
						
						End If
						
					End If
						
					
				Catch
					Log(LastException)
				End Try
			Next
		
		Else
			Log("Error In Request!")
		End If
	Catch
		Log(LastException)
		ToastMessageShow(LastException, True)
	End Try
	
	Return ImageURLs
	
End Sub


