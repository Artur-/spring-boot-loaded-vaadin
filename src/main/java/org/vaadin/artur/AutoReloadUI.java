package org.vaadin.artur;

import org.springsource.loaded.ReloadEventProcessorPlugin;
import org.springsource.loaded.agent.SpringLoadedPreProcessor;

import com.vaadin.annotations.Push;
import com.vaadin.ui.UI;
import com.vaadin.ui.UIDetachedException;

@Push
public abstract class AutoReloadUI extends UI implements
        ReloadEventProcessorPlugin {
    {
        SpringLoadedPreProcessor.registerGlobalPlugin(this);
    }

    @Override
    public void reloadEvent(String arg0, Class<?> arg1, String arg2) {
        try {
            access(() -> {
                init(null);
            });
        } catch (UIDetachedException e) {
            SpringLoadedPreProcessor.unregisterGlobalPlugin(this);
        }
    }

    @Override
    public boolean shouldRerunStaticInitializer(String arg0, Class<?> arg1,
            String arg2) {
        return false;
    }

}
