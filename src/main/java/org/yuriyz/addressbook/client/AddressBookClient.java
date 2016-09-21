package org.yuriyz.addressbook.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.RootLayoutPanel;

import java.util.logging.Logger;

/**
 * @author yuriyz on 09/21/2016.
 */
public class AddressBookClient implements EntryPoint {

    private static final Logger LOGGER = Logger.getLogger(AddressBookClient.class.getName());

//    private static final EventBus EVENT_BUS = new SimpleEventBus();

    private static final ServiceAsync SERVICE = GWT.create(Service.class);

    @Override
    public void onModuleLoad() {
        LOGGER.info("Started to load module...");

        MainPanelPresenter presenter = new MainPanelPresenter();
        presenter.go(RootLayoutPanel.get());

        LOGGER.info("Finished UI loading.");
    }

    public static ServiceAsync getService() {
        return SERVICE;
    }
}
