package pl.koziolekweb.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Grid;
import com.vaadin.ui.Notification;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import pl.koziolekweb.FontIconRenderer;

import javax.servlet.annotation.WebServlet;

@Theme("demo")
@Title("MyComponent Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends UI {

	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = DemoUI.class, widgetset = "pl.koziolekweb.demo.DemoWidgetSet")
	public static class Servlet extends VaadinServlet {
	}

	@Override
	protected void init(VaadinRequest request) {

		// Show it in the middle of the screen
		final VerticalLayout layout = new VerticalLayout();
		layout.setStyleName("demoContentLayout");
		layout.setSizeFull();
		setContent(layout);

		Grid grid = new Grid();

		grid.addColumn("name", String.class).setHeaderCaption("Name");
		grid.addColumn("icon", String.class)
				.setHeaderCaption("icon")
				.setRenderer(new FontIconRenderer(e -> Notification.show(e.toString())));

		grid.getDefaultHeaderRow().join("name", "icon").setText("Brand");

		grid.addRow("Android", FontAwesome.ANDROID.getHtml());
		grid.addRow("Ios", FontAwesome.APPLE.getHtml());
		grid.addRow("Who cares", FontAwesome.WINDOWS.getHtml());
		layout.addComponent(grid);

	}

}
