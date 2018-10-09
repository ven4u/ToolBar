# ToolBar
This app is the demo for Standalone, Actionbar and contextualmenu Toolbar.

1.ToolBar
Toolbar supports a more focused feature set than ActionBar. From start to end, a toolbar may contain a combination of the following optional elements:

A navigation button. This may be an Up arrow, navigation menu toggle, close, collapse, done or another glyph of the app's choosing. This button should always be used to access other navigational destinations within the container of the Toolbar and its signified content or otherwise leave the current context signified by the Toolbar. The navigation button is vertically aligned within the Toolbar's minimum height, if set.

A branded logo image. This may extend to the height of the bar and can be arbitrarily wide.

A title and subtitle. The title should be a signpost for the Toolbar's current position in the navigation hierarchy and the content contained there. The subtitle, if present should indicate any extended information about the current content. If an app uses a logo image it should strongly consider omitting a title and subtitle.

One or more custom views. The application may add arbitrary child views to the Toolbar. They will appear at this position within the layout. If a child view's Toolbar.LayoutParams indicates a Gravity value of CENTER_HORIZONTAL the view will attempt to center within the available space remaining in the Toolbar after all other elements have been measured. An action menu. The menu of actions will pin to the end of the Toolbar offering a few frequent, important or typical actions along with an optional overflow menu for additional actions. Action buttons are vertically aligned within the Toolbar's minimum height, if set.

2.Actionbar The action bar is a dedicated piece of real estate at the top of each screen that is generally persistent throughout the app.

It provides several key functions:

Makes important actions prominent and accessible in a predictable way (such as New or Search).

Supports consistent navigation and view switching within apps.

Reduces clutter by providing an action overflow for rarely used actions.

Provides a dedicated space for giving your app an identity.

3.Contextualmenu Toolbar is changing the toolbsr based on the some action in the activity such that it help to navigate to contextualmenu Toolbar
