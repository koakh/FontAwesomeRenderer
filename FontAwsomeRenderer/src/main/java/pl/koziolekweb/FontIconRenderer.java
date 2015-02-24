package pl.koziolekweb;

import com.vaadin.ui.renderers.ClickableRenderer;

/**
 * TODO write JAVADOC!!!
 * User: koziolek
 */
public class FontIconRenderer extends ClickableRenderer<String> {

	/**
	 * Creates a new icon renderer.
	 */
	public FontIconRenderer() {
		super(String.class);
	}

	/**
	 * Creates a new icon renderer and adds the given click listener to it.
	 *
	 * @param listener the click listener to register
	 */
	public FontIconRenderer(RendererClickListener listener) {
		this();
		addClickListener(listener);
	}
}