B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=11.2
@EndOfDesignText@

Sub Process_Globals
	Public Background As Int
	Public Foreground As Int
	Public Text As Int
	Public SelectionBackground As Int
	Public SelectionForeground As Int
	Public Buttons As Int
	Public SecondBackground As Int
	Public Disabled As Int
	Public Contrast As Int
	Public Active As Int
	Public Border As Int
	Public Highlight As Int
	Public Tree As Int
	Public Notification As Int
	Public AccentColor As Int
	Public ExcludedFilesColor As Int
	Public GreenColor As Int
	Public YellowColor As Int
	Public BlueColor As Int
	Public RedColor As Int
	Public PurpleColor As Int
	Public OrangeColor As Int
	Public CyanColor As Int
	Public GrayColor As Int
	Public WhiteBlackColor As Int
	Public ErrorColor As Int
	Public CommentsColor As Int
	Public VariablesColor As Int
	Public LinksColor As Int
	Public FunctionsColor As Int
	Public KeywordsColor As Int
	Public TagsColor As Int
	Public StringsColor As Int
	Public OperatorsColor As Int
	Public AttributesColor As Int
	Public NumbersColor As Int
	Public ParametersColor As Int
	Public CurrentTheme As String
End Sub

public Sub setTheme(ThemeName As String)
	CurrentTheme=ThemeName
	Select ThemeName
		Case "Oceanic"
			SetOceanic
		Case "Darker"
			SetDarker
		Case "Lighter"
			SetLighter
		Case "Palenight"
			SetPalenight
		Case "DeepOcean"
			SetDeepOcean
		Case "Forest"
			SetForest
		Case "SykBlue"
			SetSykBlue
		Case "SandyBeach"
			SetSandyBeach
		Case "Volcano"
			SetVolcano
		Case "Monokai"
			SetMonokai
		Case "Dracula"
			SetDracula
		Case "Github"
			SetGithub
		Case "GithubDark"
			SetGithubDark
		Case "ArcDark"
			SetArcDark
		Case "OneDark"
			SetOneDark
		Case "OneLight"
			SetOneLight
		Case "SolarizedDark"
			SetSolarizedDark
		Case "SolarizedLight"
			SetSolarizedLight
		Case "NightOwl"
			SetNightOwl
		Case "LightOwl"
			SetLightOwl
		Case "Moonlight"
			SetMoonlight
		Case "Synthwave84"
			SetSynthwave84
		Case Else
			CurrentTheme=""
	End Select
	
	#if degug
	 LogColors
	#End If
End Sub

Private Sub SetOceanic
	Background  = 0xFF263238
	Foreground  = 0xFFB0BEC5
	Text  = 0xFF607D8B
	SelectionBackground  = 0xFF546E7A
	SelectionForeground  = 0xFFFFFFFF
	Buttons  = 0xFF2E3C43
	SecondBackground  = 0xFF32424A
	Disabled  = 0xFF415967
	Contrast  = 0xFF1E272C
	Active  = 0xFF314549
	Border  = 0xFF2A373E
	Highlight  = 0xFF425B67
	Tree  = 0xFF546E7A70
	Notification  = 0xFF1E272C
	AccentColor  = 0xFF009688
	ExcludedFilesColor  = 0xFF2E3C43
	GreenColor  = 0xFFc3e88d
	YellowColor  = 0xFFffcb6b
	BlueColor  = 0xFF82aaff
	RedColor  = 0xFFf07178
	PurpleColor  = 0xFFc792ea
	OrangeColor  = 0xFFf78c6c
	CyanColor  = 0xFF89ddff
	GrayColor  = 0xFF546e7a
	WhiteBlackColor  = 0xFFeeffff
	ErrorColor  = 0xFFff5370
	CommentsColor  = 0xFF546e7a
	VariablesColor  = 0xFFeeffff
	LinksColor  = 0xFF80cbc4
	FunctionsColor  = 0xFF82aaff
	KeywordsColor  = 0xFFc792ea
	TagsColor  = 0xFFf07178
	StringsColor  = 0xFFc3e88d
	OperatorsColor  = 0xFF89ddff
	AttributesColor  = 0xFFffcb6b
	NumbersColor  = 0xFFf78c6c
	ParametersColor  = 0xFFf78c6c
End Sub

Private Sub SetDarker
	Background= 0xFF212121
	Foreground= 0xFFB0BEC5
	Text= 0xFF727272
	SelectionBackground= 0xFF404040
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF2A2A2A
	SecondBackground= 0xFF292929
	Disabled= 0xFF474747
	Contrast= 0xFF1A1A1A
	Active= 0xFF323232
	Border= 0xFF292929
	Highlight= 0xFF3F3F3F
	Tree= 0xFF323232C0
	Notification= 0xFF1A1A1A
	AccentColor= 0xFFFF9800
	ExcludedFilesColor= 0xFF323232
	GreenColor= 0xFFc3e88d
	YellowColor= 0xFFffcb6b
	BlueColor= 0xFF82aaff
	RedColor= 0xFFf07178
	PurpleColor= 0xFFc792ea
	OrangeColor= 0xFFf78c6c
	CyanColor= 0xFF89ddff
	GrayColor= 0xFF616161
	WhiteBlackColor= 0xFFeeffff
	ErrorColor= 0xFFff5370
	CommentsColor= 0xFF616161
	VariablesColor= 0xFFeeffff
	LinksColor= 0xFF80cbc4
	FunctionsColor= 0xFF82aaff
	KeywordsColor= 0xFFc792ea
	TagsColor= 0xFFf07178
	StringsColor= 0xFFc3e88d
	OperatorsColor= 0xFF89ddff
	AttributesColor= 0xFFffcb6b
	NumbersColor= 0xFFf78c6c
	ParametersColor= 0xFFf78c6c
End Sub

Private Sub SetLighter
	Background= 0xFFFAFAFA
	Foreground= 0xFF546E7A
	Text= 0xFF94A7B0
	SelectionBackground= 0xFF80CBC440
	SelectionForeground= 0xFF546e7a
	Buttons= 0xFFF3F4F5
	SecondBackground= 0xFFFFFFFF
	Disabled= 0xFFD2D4D5
	Contrast= 0xFFEEEEEE
	Active= 0xFFE7E7E8
	Border= 0xFFd3e1e8
	Highlight= 0xFFE7E7E8
	Tree= 0xFF80CBC440
	Notification= 0xFFeae8e8
	AccentColor= 0xFF00BCD4
	ExcludedFilesColor= 0xFFCCD7DA50
	GreenColor= 0xFF91b859
	YellowColor= 0xFFf6a434
	BlueColor= 0xFF6182b8
	RedColor= 0xFFe53935
	PurpleColor= 0xFF7c4dff
	OrangeColor= 0xFFf76d47
	CyanColor= 0xFF39adb5
	GrayColor= 0xFFAABFC9
	WhiteBlackColor= 0xFF272727
	ErrorColor= 0xFFe53935
	CommentsColor= 0xFFAABFC9
	VariablesColor= 0xFF272727
	LinksColor= 0xFF39ADB5
	FunctionsColor= 0xFF6182B8
	KeywordsColor= 0xFF7C4DFF
	TagsColor= 0xFFE53935
	StringsColor= 0xFF91B859
	OperatorsColor= 0xFF39ADB5
	AttributesColor= 0xFFF6A434
	NumbersColor= 0xFFF76D47
	ParametersColor= 0xFFF76D47
End Sub

Private Sub SetPalenight
	Background= 0xFF292D3E
	Foreground= 0xFFA6ACCD
	Text= 0xFF676E95
	SelectionBackground= 0xFF717CB470
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF303348
	SecondBackground= 0xFF34324a
	Disabled= 0xFF515772
	Contrast= 0xFF202331
	Active= 0xFF414863
	Border= 0xFF2b2a3e
	Highlight= 0xFF444267
	Tree= 0xFF676E95
	Notification= 0xFF202331
	AccentColor= 0xFFab47bc
	ExcludedFilesColor= 0xFF2f2e43
	GreenColor= 0xFFc3e88d
	YellowColor= 0xFFffcb6b
	BlueColor= 0xFF82aaff
	RedColor= 0xFFf07178
	PurpleColor= 0xFFc792ea
	OrangeColor= 0xFFf78c6c
	CyanColor= 0xFF89ddff
	GrayColor= 0xFF676E95
	WhiteBlackColor= 0xFFeeffff
	ErrorColor= 0xFFff5370
	CommentsColor= 0xFF676E95
	VariablesColor= 0xFFeeffff
	LinksColor= 0xFF80cbc4
	FunctionsColor= 0xFF82aaff
	KeywordsColor= 0xFFc792ea
	TagsColor= 0xFFf07178
	StringsColor= 0xFFc3e88d
	OperatorsColor= 0xFF89ddff
	AttributesColor= 0xFFffcb6b
	NumbersColor= 0xFFf78c6c
	ParametersColor= 0xFFf78c6c
End Sub

Private Sub SetDeepOcean
	Background= 0xFF0F111A
	Foreground= 0xFF8F93A2
	Text= 0xFF4B526D
	SelectionBackground= 0xFF717CB480
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF191A21
	SecondBackground= 0xFF181A1F
	Disabled= 0xFF464B5D
	Contrast= 0xFF090B10
	Active= 0xFF1A1C25
	Border= 0xFF0F111A
	Highlight= 0xFF1F2233
	Tree= 0xFF717CB430
	Notification= 0xFF090B10
	AccentColor= 0xFF84ffff
	ExcludedFilesColor= 0xFF292D3E
	GreenColor= 0xFFc3e88d
	YellowColor= 0xFFffcb6b
	BlueColor= 0xFF82aaff
	RedColor= 0xFFf07178
	PurpleColor= 0xFFc792ea
	OrangeColor= 0xFFf78c6c
	CyanColor= 0xFF89ddff
	GrayColor= 0xFF717CB4
	WhiteBlackColor= 0xFFeeffff
	ErrorColor= 0xFFff5370
	CommentsColor= 0xFF717CB4
	VariablesColor= 0xFFeeffff
	LinksColor= 0xFF80cbc4
	FunctionsColor= 0xFF82aaff
	KeywordsColor= 0xFFc792ea
	TagsColor= 0xFFf07178
	StringsColor= 0xFFc3e88d
	OperatorsColor= 0xFF89ddff
	AttributesColor= 0xFFffcb6b
	NumbersColor= 0xFFf78c6c
	ParametersColor= 0xFFf78c6c
End Sub

Private Sub SetForest
	Background= 0xFF002626
	Foreground= 0xFFB2C2B0
	Text= 0xFF49694D
	SelectionBackground= 0xFF1E611E
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF003535
	SecondBackground= 0xFF002E2E
	Disabled= 0xFF005454
	Contrast= 0xFF002020
	Active= 0xFF104110
	Border= 0xFF003838
	Highlight= 0xFF003F3F
	Tree= 0xFF32CD3250
	Notification= 0xFF002020
	AccentColor= 0xFFFFCC80
	ExcludedFilesColor= 0xFF113711
	GreenColor= 0xFFc3e88d
	YellowColor= 0xFFffcb6b
	BlueColor= 0xFF82aaff
	RedColor= 0xFFf07178
	PurpleColor= 0xFFc792ea
	OrangeColor= 0xFFf78c6c
	CyanColor= 0xFF89ddff
	GrayColor= 0xFF005454
	WhiteBlackColor= 0xFFeeffff
	ErrorColor= 0xFFff5370
	CommentsColor= 0xFF005454
	VariablesColor= 0xFFeeffff
	LinksColor= 0xFF80cbc4
	FunctionsColor= 0xFF82aaff
	KeywordsColor= 0xFFc792ea
	TagsColor= 0xFFf07178
	StringsColor= 0xFFc3e88d
	OperatorsColor= 0xFF89ddff
	AttributesColor= 0xFFffcb6b
	NumbersColor= 0xFFf78c6c
	ParametersColor= 0xFFf78c6c
End Sub

Private Sub SetSykBlue
	Background= 0xFFF5F5F5
	Foreground= 0xFF005761
	Text= 0xFF01579B
	SelectionBackground= 0xFFade2eb
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFFc9eef2
	SecondBackground= 0xFFe7f2f3
	Disabled= 0xFFe7f2f3
	Contrast= 0xFFE4F2F2
	Active= 0xFFcaedf2
	Border= 0xFFd0edf1
	Highlight= 0xFFd1eafa
	Tree= 0xFFb6e1e780
	Notification= 0xFFe0eff1
	AccentColor= 0xFF00c6e0
	ExcludedFilesColor= 0xFFc1def0
	GreenColor= 0xFF91b859
	YellowColor= 0xFFf6a434
	BlueColor= 0xFF6182b8
	RedColor= 0xFFe53935
	PurpleColor= 0xFF7c4dff
	OrangeColor= 0xFFf76d47
	CyanColor= 0xFF39adb5
	GrayColor= 0xFF01579B
	WhiteBlackColor= 0xFF272727
	ErrorColor= 0xFFe53935
	CommentsColor= 0xFF01579B
	VariablesColor= 0xFF272727
	LinksColor= 0xFF39ADB5
	FunctionsColor= 0xFF6182B8
	KeywordsColor= 0xFF7C4DFF
	TagsColor= 0xFFE53935
	StringsColor= 0xFF91B859
	OperatorsColor= 0xFF39ADB5
	AttributesColor= 0xFFF6A434
	NumbersColor= 0xFFF76D47
	ParametersColor= 0xFFF76D47
End Sub

Private Sub SetSandyBeach
	Background= 0xFFFFF8ED
	Foreground= 0xFF546E7A
	Text= 0xFF888477
	SelectionBackground= 0xFFe7c496
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFFf6d7b0
	SecondBackground= 0xFFf6edda
	Disabled= 0xFFB8B6A5
	Contrast= 0xFFFFF3DB
	Active= 0xFFfef8ec
	Border= 0xFFf2edde
	Highlight= 0xFFfbf1df
	Tree= 0xFFe7c49680
	Notification= 0xFFf6d7b0
	AccentColor= 0xFF53c7f0
	ExcludedFilesColor= 0xFFf2e7ca
	GreenColor= 0xFF91b859
	YellowColor= 0xFFf6a434
	BlueColor= 0xFF6182b8
	RedColor= 0xFFe53935
	PurpleColor= 0xFF7c4dff
	OrangeColor= 0xFFf76d47
	CyanColor= 0xFF39adb5
	GrayColor= 0xFF888477
	WhiteBlackColor= 0xFF272727
	ErrorColor= 0xFFe53935
	CommentsColor= 0xFF888477
	VariablesColor= 0xFF272727
	LinksColor= 0xFF39ADB5
	FunctionsColor= 0xFF6182B8
	KeywordsColor= 0xFF7C4DFF
	TagsColor= 0xFFE53935
	StringsColor= 0xFF91B859
	OperatorsColor= 0xFF39ADB5
	AttributesColor= 0xFFF6A434
	NumbersColor= 0xFFF76D47
	ParametersColor= 0xFFF76D47
End Sub

Private Sub SetVolcano
	Background= 0xFF390000
	Foreground= 0xFFffeaea
	Text= 0xFFffd0aa
	SelectionBackground= 0xFF750000
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF700000
	SecondBackground= 0xFF330000
	Disabled= 0xFF7f3c3c
	Contrast= 0xFF300000
	Active= 0xFF440000
	Border= 0xFF400000
	Highlight= 0xFF550000
	Tree= 0xFF77000050
	Notification= 0xFF300a0a
	AccentColor= 0xFF00bcd4
	ExcludedFilesColor= 0xFF662222
	GreenColor= 0xFFc3e88d
	YellowColor= 0xFFffcb6b
	BlueColor= 0xFF82aaff
	RedColor= 0xFFf07178
	PurpleColor= 0xFFc792ea
	OrangeColor= 0xFFf78c6c
	CyanColor= 0xFF89ddff
	GrayColor= 0xFF7F6451
	WhiteBlackColor= 0xFFeeffff
	ErrorColor= 0xFFff5370
	CommentsColor= 0xFF7F6451
	VariablesColor= 0xFFeeffff
	LinksColor= 0xFF80cbc4
	FunctionsColor= 0xFF82aaff
	KeywordsColor= 0xFFc792ea
	TagsColor= 0xFFf07178
	StringsColor= 0xFFc3e88d
	OperatorsColor= 0xFF89ddff
	AttributesColor= 0xFFffcb6b
	NumbersColor= 0xFFf78c6c
	ParametersColor= 0xFFf78c6c
End Sub

Private Sub SetMonokai
	Background= 0xFF2D2A2E
	Foreground= 0xFFfcfcfa
	Text= 0xFF939293
	SelectionBackground= 0xFF6E6C6F
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF403E41
	SecondBackground= 0xFF403E41
	Disabled= 0xFF5b595c
	Contrast= 0xFF221F22
	Active= 0xFF4A474B
	Border= 0xFF2d2a2e
	Highlight= 0xFF5b595c
	Tree= 0xFF403E41
	Notification= 0xFF363437
	AccentColor= 0xFFffd866
	ExcludedFilesColor= 0xFF3a3a3c
	GreenColor= 0xFFa9dc76
	YellowColor= 0xFFffd866
	BlueColor= 0xFF78dce8
	RedColor= 0xFFff6188
	PurpleColor= 0xFFab9df2
	OrangeColor= 0xFFf59762
	CyanColor= 0xFF78dce8
	GrayColor= 0xFF727072
	WhiteBlackColor= 0xFFfcfcfa
	ErrorColor= 0xFFf65f87
	CommentsColor= 0xFF727072
	VariablesColor= 0xFFFCFCFA
	LinksColor= 0xFF78DCE8
	FunctionsColor= 0xFFA9DC76
	KeywordsColor= 0xFFFF6188
	TagsColor= 0xFFFF6188
	StringsColor= 0xFFFFD866
	OperatorsColor= 0xFFFF6188
	AttributesColor= 0xFF78DCE8
	NumbersColor= 0xFFAB9DF2
	ParametersColor= 0xFFF59762
End Sub

Private Sub SetDracula
	Background= 0xFF282A36
	Foreground= 0xFFF8F8F2
	Text= 0xFF6272A4
	SelectionBackground= 0xFF44475A
	SelectionForeground= 0xFF8BE9FD
	Buttons= 0xFF393C4B
	SecondBackground= 0xFF282A36
	Disabled= 0xFF6272A4
	Contrast= 0xFF191A21
	Active= 0xFF44475A
	Border= 0xFF21222C
	Highlight= 0xFF6272A4
	Tree= 0xFF44475A50
	Notification= 0xFF1D2228
	AccentColor= 0xFFFF79C5
	ExcludedFilesColor= 0xFF313341
	GreenColor= 0xFF8aff80
	YellowColor= 0xFFfeff80
	BlueColor= 0xFF79cbdc
	RedColor= 0xFFf780bf
	PurpleColor= 0xFF9580ff
	OrangeColor= 0xFFf89580
	CyanColor= 0xFF80ffea
	GrayColor= 0xFF6272A4
	WhiteBlackColor= 0xFFF8F8F2
	ErrorColor= 0xFFff5555
	CommentsColor= 0xFF6272A4
	VariablesColor= 0xFFF8F8F2
	LinksColor= 0xFFfeff80
	FunctionsColor= 0xFF8aff80
	KeywordsColor= 0xFFf780bf
	TagsColor= 0xFFf780bf
	StringsColor= 0xFFfeff80
	OperatorsColor= 0xFFf780bf
	AttributesColor= 0xFF8aff80
	NumbersColor= 0xFF9580ff
	ParametersColor= 0xFFf89580
End Sub

Private Sub SetGithub
	Background= 0xFFF7F8FA
	Foreground= 0xFF5B6168
	Text= 0xFF292D31
	SelectionBackground= 0xFF3A66D150
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFFedf1f5
	SecondBackground= 0xFFF3f3f3
	Disabled= 0xFF9ba0a3
	Contrast= 0xFFfafbfc
	Active= 0xFFcce5ff
	Border= 0xFFDFE1E4
	Highlight= 0xFFCCE5FF
	Tree= 0xFF3A66D1
	Notification= 0xFFDFECFE
	AccentColor= 0xFF79CB60
	ExcludedFilesColor= 0xFFdcdcdc
	GreenColor= 0xFF22863a
	YellowColor= 0xFFe36209
	BlueColor= 0xFF005cc5
	RedColor= 0xFFd73a49
	PurpleColor= 0xFF6f42c1
	OrangeColor= 0xFFe36209
	CyanColor= 0xFF032F62
	GrayColor= 0xFF6A737D
	WhiteBlackColor= 0xFF24292E
	ErrorColor= 0xFFd25252
	CommentsColor= 0xFF6A737D
	VariablesColor= 0xFF24292E
	LinksColor= 0xFF005CC5
	FunctionsColor= 0xFF6F42C1
	KeywordsColor= 0xFFD73A49
	TagsColor= 0xFF22863A
	StringsColor= 0xFF032F62
	OperatorsColor= 0xFFD73A49
	AttributesColor= 0xFF6F42C1
	NumbersColor= 0xFF005CC5
	ParametersColor= 0xFFE36209
End Sub

Private Sub SetGithubDark
	Background= 0xFF24292e
	Foreground= 0xFFe1e4e8
	Text= 0xFF959da5
	SelectionBackground= 0xFF3392FF44
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF39414a
	SecondBackground= 0xFF2f363d
	Disabled= 0xFF6a737d
	Contrast= 0xFF1e2428
	Active= 0xFF2b3036
	Border= 0xFF1b1f23
	Highlight= 0xFF444d56
	Tree= 0xFF39414a
	Notification= 0xFF2f363d
	AccentColor= 0xFFf9826c
	ExcludedFilesColor= 0xFF2f363d
	GreenColor= 0xFF85e89d
	YellowColor= 0xFFffab70
	BlueColor= 0xFF79b8ff
	RedColor= 0xFFf97583
	PurpleColor= 0xFFb392f0
	OrangeColor= 0xFFffab70
	CyanColor= 0xFF79b8ff
	GrayColor= 0xFF959da5
	WhiteBlackColor= 0xFFd1d5da
	ErrorColor= 0xFFf97583
	CommentsColor= 0xFF959da5
	VariablesColor= 0xFFd1d5da
	LinksColor= 0xFF79b8ff
	FunctionsColor= 0xFFb392f0
	KeywordsColor= 0xFFf97583
	TagsColor= 0xFF85e89d
	StringsColor= 0xFF79b8ff
	OperatorsColor= 0xFFf97583
	AttributesColor= 0xFFb392f0
	NumbersColor= 0xFF79b8ff
	ParametersColor= 0xFFffab70
End Sub

Private Sub SetArcDark
	Background= 0xFF2f343f
	Foreground= 0xFFD3DAE3
	Text= 0xFF8b9eb5
	SelectionBackground= 0xFF8888FF55
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF383C4A
	SecondBackground= 0xFF393f4c45
	Disabled= 0xFFD3DAE3
	Contrast= 0xFF262b33
	Active= 0xFF41416A
	Border= 0xFF404552
	Highlight= 0xFF393f4c
	Tree= 0xFF09477170
	Notification= 0xFF262a33
	AccentColor= 0xFF42A5F5
	ExcludedFilesColor= 0xFF37373d
	GreenColor= 0xFF8f9d6a
	YellowColor= 0xFFf9ee98
	BlueColor= 0xFF7587a6
	RedColor= 0xFFcf6a4c
	PurpleColor= 0xFF9b859d
	OrangeColor= 0xFFcda869
	CyanColor= 0xFF47bc9b
	GrayColor= 0xFFA7A7A7
	WhiteBlackColor= 0xFFd3dae3
	ErrorColor= 0xFFcf6a4c
	CommentsColor= 0xFF747c84
	VariablesColor= 0xFFCF6A4C
	LinksColor= 0xFF7587A6
	FunctionsColor= 0xFF7587A6
	KeywordsColor= 0xFF9B859D
	TagsColor= 0xFFCF6A4C
	StringsColor= 0xFF8F9D6A
	OperatorsColor= 0xFFA7A7A7
	AttributesColor= 0xFFF9EE98
	NumbersColor= 0xFFCDA869
	ParametersColor= 0xFFCDA869
End Sub

Private Sub SetOneDark
	Background= 0xFF282C34
	Foreground= 0xFF979FAD
	Text= 0xFF979FAD
	SelectionBackground= 0xFF4D515D
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF3A3F4B
	SecondBackground= 0xFF2F333D
	Disabled= 0xFF6B727D
	Contrast= 0xFF21252B
	Active= 0xFF383E49
	Border= 0xFF282C34
	Highlight= 0xFF383D48
	Tree= 0xFF3A3F4B80
	Notification= 0xFF282C34
	AccentColor= 0xFF2979ff
	ExcludedFilesColor= 0xFF3c4150
	GreenColor= 0xFF98c379
	YellowColor= 0xFFe5c17c
	BlueColor= 0xFF61aeef
	RedColor= 0xFFe06c75
	PurpleColor= 0xFFc679dd
	OrangeColor= 0xFFd19a66
	CyanColor= 0xFF57b6c2
	GrayColor= 0xFF59626f
	WhiteBlackColor= 0xFFabb2bf
	ErrorColor= 0xFFe06c75
	CommentsColor= 0xFF59626F
	VariablesColor= 0xFFD19A66
	LinksColor= 0xFF56B6C2
	FunctionsColor= 0xFF61AEEF
	KeywordsColor= 0xFFC679DD
	TagsColor= 0xFFe06c75
	StringsColor= 0xFF98C379
	OperatorsColor= 0xFF61AFEF
	AttributesColor= 0xFFE5C17C
	NumbersColor= 0xFFD19A66
	ParametersColor= 0xFFABB2BF
End Sub

Private Sub SetOneLight
	Background= 0xFFF4F4F4
	Foreground= 0xFF232324
	Text= 0xFF7f7f7f
	SelectionBackground= 0xFFFFFFFF
	SelectionForeground= 0xFF232324
	Buttons= 0xFFDBDBDC
	SecondBackground= 0xFFEAEAEB
	Disabled= 0xFFb8b8b9
	Contrast= 0xFFeaeae
	Active= 0xFFDBDBDC
	Border= 0xFFDBDBDC
	Highlight= 0xFFFFFFFF
	Tree= 0xFFDBDBDC80
	Notification= 0xFFF2F2F2
	AccentColor= 0xFF2979ff
	ExcludedFilesColor= 0xFFCACACB
	GreenColor= 0xFF50a14e
	YellowColor= 0xFFc18401
	BlueColor= 0xFF4078f2
	RedColor= 0xFFe4564a
	PurpleColor= 0xFFa626a4
	OrangeColor= 0xFF986801
	CyanColor= 0xFF0184bc
	GrayColor= 0xFFa0a1a7
	WhiteBlackColor= 0xFF232324
	ErrorColor= 0xFFe4564a
	CommentsColor= 0xFFA0A1A7
	VariablesColor= 0xFF986801
	LinksColor= 0xFF0184BC
	FunctionsColor= 0xFF4078F2
	KeywordsColor= 0xFFA626A4
	TagsColor= 0xFFE4564A
	StringsColor= 0xFF50A14E
	OperatorsColor= 0xFF4078F2
	AttributesColor= 0xFFC18401
	NumbersColor= 0xFF986801
	ParametersColor= 0xFF383A42
End Sub

Private Sub SetSolarizedDark
	Background= 0xFF002B36
	Foreground= 0xFF839496
	Text= 0xFF586e75
	SelectionBackground= 0xFF2E4C52
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF073642
	SecondBackground= 0xFF003745
	Disabled= 0xFF2E5861
	Contrast= 0xFF00252E
	Active= 0xFF003946
	Border= 0xFF0D3640
	Highlight= 0xFF005a6f
	Tree= 0xFF2E4C5280
	Notification= 0xFF2E4C52
	AccentColor= 0xFFd33682
	ExcludedFilesColor= 0xFF083F4D
	GreenColor= 0xFF859900
	YellowColor= 0xFFb58900
	BlueColor= 0xFF268bd2
	RedColor= 0xFFd13684
	PurpleColor= 0xFF6c71c4
	OrangeColor= 0xFFcb4b16
	CyanColor= 0xFF2aa198
	GrayColor= 0xFF657B83
	WhiteBlackColor= 0xFF93A1A1
	ErrorColor= 0xFFdc322f
	CommentsColor= 0xFF657B83
	VariablesColor= 0xFF268BD2
	LinksColor= 0xFF268BD2
	FunctionsColor= 0xFFB58900
	KeywordsColor= 0xFF859900
	TagsColor= 0xFF268BD2
	StringsColor= 0xFF2AA198
	OperatorsColor= 0xFF93A1A1
	AttributesColor= 0xFFB58900
	NumbersColor= 0xFFD33682
	ParametersColor= 0xFF93A1A1
End Sub

Private Sub SetSolarizedLight
	Background= 0xFFfdf6e3
	Foreground= 0xFF586e75
	Text= 0xFF93a1a1
	SelectionBackground= 0xFFe8dcb6
	SelectionForeground= 0xFF002b36
	Buttons= 0xFFd8d4c4
	SecondBackground= 0xFFF6F0DE
	Disabled= 0xFFC9CCC3
	Contrast= 0xFFeee8d5
	Active= 0xFFd1cbb8
	Border= 0xFFedead9
	Highlight= 0xFFd1cbb8
	Tree= 0xFFe8dcb6b0
	Notification= 0xFFEDE8D4
	AccentColor= 0xFFd33682
	ExcludedFilesColor= 0xFFE3DCC9
	GreenColor= 0xFF859900
	YellowColor= 0xFFb58900
	BlueColor= 0xFF268bd2
	RedColor= 0xFFd13684
	PurpleColor= 0xFF6c71c4
	OrangeColor= 0xFFcb4b16
	CyanColor= 0xFF2aa198
	GrayColor= 0xFF93A1A1
	WhiteBlackColor= 0xFF657b83
	ErrorColor= 0xFFdc322f
	CommentsColor= 0xFF93A1A1
	VariablesColor= 0xFF268BD2
	LinksColor= 0xFF268BD2
	FunctionsColor= 0xFFB58900
	KeywordsColor= 0xFF859900
	TagsColor= 0xFF268BD2
	StringsColor= 0xFF2AA198
	OperatorsColor= 0xFF657B83
	AttributesColor= 0xFF657B83
	NumbersColor= 0xFFD33682
	ParametersColor= 0xFF657B83
End Sub

Private Sub SetNightOwl
	Background= 0xFF011627
	Foreground= 0xFFd6deeb
	Text= 0xFF5f7e97
	SelectionBackground= 0xFF5f7e9790
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF0b253a
	SecondBackground= 0xFF0b2942
	Disabled= 0xFF697098
	Contrast= 0xFF010e1a
	Active= 0xFF13344f
	Border= 0xFF122d42
	Highlight= 0xFF084d81
	Tree= 0xFF13344f50
	Notification= 0xFF01111d
	AccentColor= 0xFF7e57c2
	ExcludedFilesColor= 0xFF0e293f
	GreenColor= 0xFFaddb67
	YellowColor= 0xFFecc48d
	BlueColor= 0xFF82aaff
	RedColor= 0xFFff6363
	PurpleColor= 0xFFc792ea
	OrangeColor= 0xFFf78c6c
	CyanColor= 0xFF7fdbca
	GrayColor= 0xFF637777
	WhiteBlackColor= 0xFFd6deeb
	ErrorColor= 0xFFef5350
	CommentsColor= 0xFF637777
	VariablesColor= 0xFFaddb67
	LinksColor= 0xFFecc48d
	FunctionsColor= 0xFF82aaff
	KeywordsColor= 0xFFc792ea
	TagsColor= 0xFF7fdbca
	StringsColor= 0xFFecc48d
	OperatorsColor= 0xFFc792ea
	AttributesColor= 0xFFaddb67
	NumbersColor= 0xFFf78c6c
	ParametersColor= 0xFFd6deeb
End Sub

Private Sub SetLightOwl
	Background= 0xFFF0F0F0
	Foreground= 0xFF403f53
	Text= 0xFF90A7B2
	SelectionBackground= 0xFFd3e8f8
	SelectionForeground= 0xFF403f53
	Buttons= 0xFFd9d9d9
	SecondBackground= 0xFFFBFBFB
	Disabled= 0xFF93A1A1
	Contrast= 0xFFf0f0f0
	Active= 0xFFd3e8f8
	Border= 0xFFd9d9d9
	Highlight= 0xFFCCCCCC
	Tree= 0xFFd3e8f87c
	Notification= 0xFFF0F0F0
	AccentColor= 0xFF2AA298
	ExcludedFilesColor= 0xFFE0E7EA
	GreenColor= 0xFF56b6c2
	YellowColor= 0xFFe0af02
	BlueColor= 0xFF4876d6
	RedColor= 0xFFaa0982
	PurpleColor= 0xFF994cc3
	OrangeColor= 0xFFc96765
	CyanColor= 0xFF0c969b
	GrayColor= 0xFF989fb1
	WhiteBlackColor= 0xFF111111
	ErrorColor= 0xFFde3d3b
	CommentsColor= 0xFF989fb1
	VariablesColor= 0xFF4876d6
	LinksColor= 0xFFff869a
	FunctionsColor= 0xFF4876d6
	KeywordsColor= 0xFF994cc3
	TagsColor= 0xFF994cc3
	StringsColor= 0xFFc96765
	OperatorsColor= 0xFF994cc3
	AttributesColor= 0xFF0c969b
	NumbersColor= 0xFFaa0982
	ParametersColor= 0xFF0c969b
End Sub

Private Sub SetMoonlight
	Background= 0xFF222436
	Foreground= 0xFFc8d3f5
	Text= 0xFFa9b8e8
	SelectionBackground= 0xFF444a73
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF444a73
	SecondBackground= 0xFF2f334d
	Disabled= 0xFF828bb8
	Contrast= 0xFF191a2a
	Active= 0xFF2f334d
	Border= 0xFF222436
	Highlight= 0xFF444a73
	Tree= 0xFF444a7370
	Notification= 0xFF191a2a
	AccentColor= 0xFF74a0f1
	ExcludedFilesColor= 0xFF2f334d
	GreenColor= 0xFF7af8ca
	YellowColor= 0xFFffdb8e
	BlueColor= 0xFF70b0ff
	RedColor= 0xFFf3c1ff
	PurpleColor= 0xFFbaacff
	OrangeColor= 0xFFff9668
	CyanColor= 0xFF34d3fb
	GrayColor= 0xFF7e8eda
	WhiteBlackColor= 0xFFc8d3f5
	ErrorColor= 0xFFff5370
	CommentsColor= 0xFF7e8eda
	VariablesColor= 0xFFc8d3f5
	LinksColor= 0xFF34d3fb
	FunctionsColor= 0xFF70b0ff
	KeywordsColor= 0xFFbaacff
	TagsColor= 0xFFff757f
	StringsColor= 0xFF7af8ca
	OperatorsColor= 0xFFbaacff
	AttributesColor= 0xFFffbd76
	NumbersColor= 0xFFff9668
	ParametersColor= 0xFFf3c1ff
End Sub

Private Sub SetSynthwave84
	Background= 0xFF2a2139
	Foreground= 0xFFffffff
	Text= 0xFF999999
	SelectionBackground= 0xFF463465
	SelectionForeground= 0xFFFFFFFF
	Buttons= 0xFF382C4D
	SecondBackground= 0xFF2a2139
	Disabled= 0xFF848bbd
	Contrast= 0xFF241b2f
	Active= 0xFF34294f
	Border= 0xFF34294f
	Highlight= 0xFF463564
	Tree= 0xFF42384b70
	Notification= 0xFF191621
	AccentColor= 0xFFf92aad
	ExcludedFilesColor= 0xFF463564
	GreenColor= 0xFF72f1b8
	YellowColor= 0xFFfede5d
	BlueColor= 0xFF34d3fb
	RedColor= 0xFFfe4450
	PurpleColor= 0xFFff7edb
	OrangeColor= 0xFFf97e72
	CyanColor= 0xFF36f9f6
	GrayColor= 0xFF848bbd
	WhiteBlackColor= 0xFFb6b1b1
	ErrorColor= 0xFFfe4450
	CommentsColor= 0xFF848bbd
	VariablesColor= 0xFFb6b1b1
	LinksColor= 0xFFff7edb
	FunctionsColor= 0xFF36f9f6
	KeywordsColor= 0xFFfede5d
	TagsColor= 0xFF72f1b8
	StringsColor= 0xFFff8b39
	OperatorsColor= 0xFFfede5d
	AttributesColor= 0xFFfede5d
	NumbersColor= 0xFFf97e72
	ParametersColor= 0xFFff7edb
End Sub

Private Sub LogColors
	Log("-----" & CurrentTheme & " Theme colors-----")
	LogColor("Background",Background)
	LogColor("Foreground",Foreground)
	LogColor("Text",Text)
	LogColor("SelectionBackground",SelectionBackground)
	LogColor("SelectionForeground",SelectionForeground)
	LogColor("Buttons",Buttons)
	LogColor("SecondBackground",SecondBackground)
	LogColor("Disabled",Disabled)
	LogColor("Contrast",Contrast)
	LogColor("Active",Active)
	LogColor("Border",Border)
	LogColor("Highlight",Highlight)
	LogColor("Tree",Tree)
	LogColor("Notification",Notification)
	LogColor("AccentColor",AccentColor)
	LogColor("ExcludedFilesColor",ExcludedFilesColor)
	LogColor("GreenColor",GreenColor)
	LogColor("YellowColor",YellowColor)
	LogColor("BlueColor",BlueColor)
	LogColor("RedColor",RedColor)
	LogColor("PurpleColor",PurpleColor)
	LogColor("OrangeColor",OrangeColor)
	LogColor("CyanColor",CyanColor)
	LogColor("GrayColor",GrayColor)
	LogColor("WhiteBlackColor",WhiteBlackColor)
	LogColor("ErrorColor",ErrorColor)
	LogColor("CommentsColor",CommentsColor)
	LogColor("VariablesColor",VariablesColor)
	LogColor("LinksColor",LinksColor)
	LogColor("FunctionsColor",FunctionsColor)
	LogColor("KeywordsColor",KeywordsColor)
	LogColor("TagsColor",TagsColor)
	LogColor("StringsColor",StringsColor)
	LogColor("OperatorsColor",OperatorsColor)
	LogColor("AttributesColor",AttributesColor)
	LogColor("NumbersColor",NumbersColor)
	LogColor("ParametersColor",ParametersColor)
	Log("------------------")
End Sub