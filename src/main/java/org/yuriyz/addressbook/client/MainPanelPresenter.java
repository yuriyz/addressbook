package org.yuriyz.addressbook.client;

import com.google.gwt.user.client.ui.HasWidgets;

/**
 * @author yuriyz on 09/21/2016.
 */
public class MainPanelPresenter {

    private final MainPanel view = new MainPanel();

    public MainPanelPresenter() {
    }

    public void go(HasWidgets.ForIsWidget container) {

        container.clear();

        container.add(view);
        // todo
    }

}
