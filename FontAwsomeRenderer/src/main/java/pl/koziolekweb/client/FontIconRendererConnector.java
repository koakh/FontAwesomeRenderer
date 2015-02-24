package pl.koziolekweb.client;

import com.google.web.bindery.event.shared.HandlerRegistration;
import com.vaadin.client.connectors.ClickableRendererConnector;
import com.vaadin.client.renderers.ClickableRenderer;
import com.vaadin.shared.ui.Connect;
import elemental.json.JsonObject;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
@Connect(pl.koziolekweb.FontIconRenderer.class)
public class FontIconRendererConnector extends ClickableRendererConnector<String> {

	@Override
	public FontIconRenderer getRenderer() {
		return (FontIconRenderer) super.getRenderer();
	}

	@Override
	protected HandlerRegistration addClickHandler(
			ClickableRenderer.RendererClickHandler<JsonObject> handler) {
		return getRenderer().addClickHandler(handler);
	}
}
