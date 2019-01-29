package org.fenxui.samples.simple.viewmodel.pages;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.fenxui.annotation.AppPage;
import org.fenxui.annotation.CheckBoxValue;
import org.fenxui.annotation.FormField;

import static org.fenxui.api.prototype.OOTBFieldPrototypes.CHECKBOX_FIELD;

@AppPage("Tab A")
public class SimpleTabPageA  {
	private final TabbedSettings tabbedSettings;

	@FormField(label = "Enable", factory=CHECKBOX_FIELD)
	@CheckBoxValue(checked="true", unchecked="false")
	private final StringProperty enable = new SimpleStringProperty("false");

	public SimpleTabPageA(TabbedSettings tabbedSettings) {
		this.tabbedSettings = tabbedSettings;
	}

	public String getEnable() {
		return enable.get();
	}

	public StringProperty enableProperty() {
		return enable;
	}

	public void setEnable(String enable) {
		this.enable.set(enable);
	}
}
